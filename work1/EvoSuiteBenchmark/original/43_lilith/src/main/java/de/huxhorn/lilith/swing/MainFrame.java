/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithBuffer;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.appender.InternalLilithAppender;
import de.huxhorn.lilith.consumers.AlarmSoundAccessEventConsumer;
import de.huxhorn.lilith.consumers.AlarmSoundLoggingEventConsumer;
import de.huxhorn.lilith.consumers.FileDumpEventConsumer;
import de.huxhorn.lilith.consumers.FileSplitterEventConsumer;
import de.huxhorn.lilith.consumers.RrdLoggingEventConsumer;
import de.huxhorn.lilith.data.access.AccessEvent;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.engine.AccessFileBufferFactory;
import de.huxhorn.lilith.engine.EventConsumer;
import de.huxhorn.lilith.engine.EventSource;
import de.huxhorn.lilith.engine.EventSourceListener;
import de.huxhorn.lilith.engine.FileBufferFactory;
import de.huxhorn.lilith.engine.FileConstants;
import de.huxhorn.lilith.engine.LogFileFactory;
import de.huxhorn.lilith.engine.LoggingFileBufferFactory;
import de.huxhorn.lilith.engine.SourceManager;
import de.huxhorn.lilith.engine.impl.EventSourceImpl;
import de.huxhorn.lilith.engine.impl.LogFileFactoryImpl;
import de.huxhorn.lilith.engine.impl.sourcemanager.SourceManagerImpl;
import de.huxhorn.lilith.engine.impl.sourceproducer.AccessEventProtobufServerSocketEventSourceProducer;
import de.huxhorn.lilith.engine.impl.sourceproducer.LoggingEventProtobufServerSocketEventSourceProducer;
import de.huxhorn.lilith.engine.xml.sourceproducer.LilithXmlMessageLoggingServerSocketEventSourceProducer;
import de.huxhorn.lilith.engine.xml.sourceproducer.LilithXmlStreamLoggingServerSocketEventSourceProducer;
import de.huxhorn.lilith.jul.xml.JulImportCallable;
import de.huxhorn.lilith.log4j.xml.Log4jImportCallable;
import de.huxhorn.lilith.logback.appender.AccessMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ClassicMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ClassicXmlMultiplexSocketAppender;
import de.huxhorn.lilith.logback.appender.ZeroDelimitedClassicXmlMultiplexSocketAppender;
import de.huxhorn.lilith.logback.producer.LogbackAccessServerSocketEventSourceProducer;
import de.huxhorn.lilith.logback.producer.LogbackLoggingServerSocketEventSourceProducer;
import de.huxhorn.lilith.services.gotosrc.GoToSourceService;
import de.huxhorn.lilith.services.sender.EventSender;
import de.huxhorn.lilith.services.sender.SenderService;
import de.huxhorn.lilith.swing.callables.CleanAllInactiveCallable;
import de.huxhorn.lilith.swing.callables.CleanObsoleteCallable;
import de.huxhorn.lilith.swing.callables.IndexingCallable;
import de.huxhorn.lilith.swing.debug.DebugDialog;
import de.huxhorn.lilith.swing.filefilters.DirectoryFilter;
import de.huxhorn.lilith.swing.filefilters.LilithFileFilter;
import de.huxhorn.lilith.swing.filefilters.LogFileFilter;
import de.huxhorn.lilith.swing.filefilters.RrdFileFilter;
import de.huxhorn.lilith.swing.filefilters.XmlImportFileFilter;
import de.huxhorn.lilith.swing.preferences.PreferencesDialog;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.Colors;
import de.huxhorn.lilith.swing.taskmanager.TaskManagerInternalFrame;
import de.huxhorn.lilith.swing.transfer.MainFrameTransferHandler;
import de.huxhorn.lilith.swing.transfer.MainFrameTransferHandler16;
import de.huxhorn.sulky.buffers.AppendOperation;
import de.huxhorn.sulky.buffers.BlockingCircularBuffer;
import de.huxhorn.sulky.buffers.Buffer;
import de.huxhorn.sulky.buffers.FileBuffer;
import de.huxhorn.sulky.codec.filebuffer.CodecFileBuffer;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.MetaData;
import de.huxhorn.sulky.conditions.Condition;
import de.huxhorn.sulky.formatting.SimpleXml;
import de.huxhorn.sulky.sounds.Sounds;
import de.huxhorn.sulky.swing.MemoryStatus;
import de.huxhorn.sulky.swing.Windows;
import de.huxhorn.sulky.tasks.Task;
import de.huxhorn.sulky.tasks.TaskListener;
import de.huxhorn.sulky.tasks.TaskManager;
import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.io.IOUtils;
import org.simplericity.macify.eawt.Application;
import org.simplericity.macify.eawt.ApplicationEvent;
import org.simplericity.macify.eawt.ApplicationListener;
import org.simplericity.macify.eawt.DefaultApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;


public class MainFrame
		extends JFrame
{
	private final Logger logger = LoggerFactory.getLogger(MainFrame.class);

	private final File startupApplicationPath;


	private GoToSourceService gotoSource;
	private LogFileFactory loggingFileFactory;
	private SourceManager<LoggingEvent> loggingEventSourceManager;
	private FileBufferFactory<LoggingEvent> loggingFileBufferFactory;
	private EventSourceListener<LoggingEvent> loggingSourceListener;
	private LoggingEventViewManager loggingEventViewManager;

	private LogFileFactory accessFileFactory;
	private SourceManager<AccessEvent> accessEventSourceManager;
	private FileBufferFactory<AccessEvent> accessFileBufferFactory;
	private EventSourceListener<AccessEvent> accessSourceListener;
	private AccessEventViewManager accessEventViewManager;

	private Sounds sounds;
	private JDesktopPane desktop;

	private PreferencesDialog preferencesDialog;
	private JDialog aboutDialog;
	private JLabel statusLabel;
	private ApplicationPreferences applicationPreferences;
	private DebugDialog debugDialog;
	private RrdFileFilter rrdFileFilter;
	private StatisticsDialog statisticsDialog;
	private TaskManager<Long> longTaskManager;
	private ViewActions viewActions;
	private OpenPreviousDialog openInactiveLogsDialog;
	private HelpFrame helpFrame;
	private Application application;
	private int activeCounter;
	private List<AutostartRunnable> autostartProcesses;
	private URL helpUrl;
	private SenderService senderService;
	private boolean enableBonjour;
	private final boolean isMac;
	private final boolean isWindows;
	private List<SavedCondition> activeConditions;
	private Map<LoggingEvent.Level, Colors> levelColors;
	private Map<HttpStatus.Type, Colors> statusColors;
	private SplashScreen splashScreen;
	private TaskManagerInternalFrame taskManagerFrame;
	private JLabel taskStatusLabel;
	private int previousNumberOfTasks;
	private ImageIcon smallProgressIcon;
	public static final String LOGS_SUBDIRECTORY = "logs";
	public static final String LOGGING_FILE_SUBDIRECTORY = LOGS_SUBDIRECTORY + "/logging";
	public static final String ACCESS_FILE_SUBDIRECTORY = LOGS_SUBDIRECTORY + "/access";
	private JFileChooser openFileChooser;
	private JFileChooser importFileChooser;
	private boolean coloringWholeRow;
	/*
	 * Need to use ConcurrentMap because it's accessed by both the EventDispatchThread and the CleanupThread.
	 */
	//private ConcurrentMap<EventIdentifier, SoftColorsReference> colorsCache;
	//private ReferenceQueue<Colors> colorsReferenceQueue;

	public String[] getAllConditionScriptFiles()
	{
		return applicationPreferences.getAllConditionScriptFiles();
	}

	public File resolveConditionScriptFile(String input)
	{
		return applicationPreferences.resolveConditionScriptFile(input);
	}

	public AccessEventViewManager getAccessEventViewManager()
	{
		return accessEventViewManager;
	}

	public LoggingEventViewManager getLoggingEventViewManager()
	{
		return loggingEventViewManager;
	}

	public PreferencesDialog getPreferencesDialog()
	{
		return preferencesDialog;
	}

	public ViewActions getViewActions()
	{
		return viewActions;
	}

	public JDesktopPane getDesktop()
	{
		return desktop;
	}

	public MainFrame(ApplicationPreferences applicationPreferences, SplashScreen splashScreen, String appName, boolean enableBonjour)
	{
		super(appName);
		this.applicationPreferences = applicationPreferences;
		this.coloringWholeRow = this.applicationPreferences.isColoringWholeRow();
		this.splashScreen = splashScreen;
		setSplashStatusText("Creating main frame.");
		smallProgressIcon = new ImageIcon(MainFrame.class.getResource("/otherGraphics/Progress16.gif"));
		ImageIcon frameIcon = new ImageIcon(MainFrame.class.getResource("/otherGraphics/Lilith16.jpg"));
		setIconImage(frameIcon.getImage());
		//colorsReferenceQueue=new ReferenceQueue<Colors>();
		//colorsCache=new ConcurrentHashMap<EventIdentifier, SoftColorsReference>();
		application = new DefaultApplication();
		isMac = application.isMac();
		if (!isMac)
		{
			String osName = System.getProperty("os.name").toLowerCase();
			isWindows = osName.startsWith("windows");
		}
		else
		{
			isWindows = false;
		}
		autostartProcesses = new ArrayList<AutostartRunnable>();

		addWindowListener(new MainWindowListener());
		Runtime runtime = Runtime.getRuntime();
		Thread shutdownHook = new Thread(new ShutdownRunnable());
		runtime.addShutdownHook(shutdownHook);

		senderService = new SenderService(this);
		this.enableBonjour = enableBonjour;
		/*
		if(application.isMac())
		{
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		}
		else
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
        */

		longTaskManager = new TaskManager<Long>();
		longTaskManager.setUsingEventQueue(true);
		longTaskManager.startUp();
		longTaskManager.addTaskListener(new MainTaskListener());

		startupApplicationPath = this.applicationPreferences.getStartupApplicationPath();

		loggingFileFactory = new LogFileFactoryImpl(new File(startupApplicationPath, LOGGING_FILE_SUBDIRECTORY));
		accessFileFactory = new LogFileFactoryImpl(new File(startupApplicationPath, ACCESS_FILE_SUBDIRECTORY));

		Map<String, String> loggingMetaData = new HashMap<String, String>();
		loggingMetaData.put(FileConstants.CONTENT_TYPE_KEY, FileConstants.CONTENT_TYPE_VALUE_LOGGING);
		loggingMetaData.put(FileConstants.CONTENT_FORMAT_KEY, FileConstants.CONTENT_FORMAT_VALUE_PROTOBUF);
		loggingMetaData.put(FileConstants.COMPRESSION_KEY, FileConstants.COMPRESSION_VALUE_GZIP);
		// TODO: configurable format and compressed

		loggingFileBufferFactory = new LoggingFileBufferFactory(loggingFileFactory, loggingMetaData);

		Map<String, String> accessMetaData = new HashMap<String, String>();
		accessMetaData.put(FileConstants.CONTENT_TYPE_KEY, FileConstants.CONTENT_TYPE_VALUE_ACCESS);
		accessMetaData.put(FileConstants.CONTENT_FORMAT_KEY, FileConstants.CONTENT_FORMAT_VALUE_PROTOBUF);
		accessMetaData.put(FileConstants.COMPRESSION_KEY, FileConstants.COMPRESSION_VALUE_GZIP);
		// TODO: configurable format and compressed

		accessFileBufferFactory = new AccessFileBufferFactory(accessFileFactory, accessMetaData);

		rrdFileFilter = new RrdFileFilter();

		loggingEventViewManager = new LoggingEventViewManager(this);
		accessEventViewManager = new AccessEventViewManager(this);
		this.applicationPreferences.addPropertyChangeListener(new PreferencesChangeListener());
		loggingSourceListener = new LoggingEventSourceListener();
		accessSourceListener = new AccessEventSourceListener();
		// this.cleanupWindowChangeListener = new CleanupWindowChangeListener();
		desktop = new JDesktopPane();
		JPanel statusBar = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		statusLabel = new JLabel();
		statusLabel.setText("Starting...");

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(0, 5, 0, 0);

		statusBar.add(statusLabel, gbc);

		taskStatusLabel = new JLabel();
		taskStatusLabel.setText("");
		taskStatusLabel.setForeground(Color.BLUE);
		taskStatusLabel.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent mouseEvent)
			{
				showTaskManager();
			}

			@Override
			public void mouseEntered(MouseEvent mouseEvent)
			{
				taskStatusLabel.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent mouseEvent)
			{
				taskStatusLabel.setForeground(Color.BLUE);
			}
		});
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(0, 5, 0, 0);
		statusBar.add(taskStatusLabel, gbc);


		MemoryStatus memoryStatus = new MemoryStatus();
		memoryStatus.setBackground(Color.WHITE);
		memoryStatus.setOpaque(true);
		memoryStatus.setUsingBinaryUnits(true);
		memoryStatus.setUsingTotal(false);
		memoryStatus.setBorder(new EtchedBorder(EtchedBorder.LOWERED));

		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(0, 0, 0, 0);

		statusBar.add(memoryStatus, gbc);
		add(desktop, BorderLayout.CENTER);
		add(statusBar, BorderLayout.SOUTH);

		setSplashStatusText("Creating statistics dialog.");
		if (logger.isDebugEnabled()) logger.debug("Before creation of statistics-dialog...");
		statisticsDialog = new StatisticsDialog(this);
		if (logger.isDebugEnabled()) logger.debug("After creation of statistics-dialog...");

		setSplashStatusText("Creating about dialog.");
		aboutDialog = new AboutDialog(this, "About " + appName + "...", appName);

		setSplashStatusText("Creating debug dialog.");
		debugDialog = new DebugDialog(this, this);

		setSplashStatusText("Creating preferences dialog.");
		if (logger.isDebugEnabled()) logger.debug("Before creation of preferences-dialog...");
		preferencesDialog = new PreferencesDialog(this);
		if (logger.isDebugEnabled()) logger.debug("After creation of preferences-dialog...");

		setSplashStatusText("Creating \"Open inactive\" dialog.");
		openInactiveLogsDialog = new OpenPreviousDialog(MainFrame.this);

		setSplashStatusText("Creating help frame.");
		helpFrame = new HelpFrame(this);
		helpFrame.setTitle("Help Topics");

		openFileChooser = new JFileChooser();
		openFileChooser.setFileFilter(new LilithFileFilter());
		openFileChooser.setFileHidingEnabled(false);
		openFileChooser.setCurrentDirectory(this.applicationPreferences.getPreviousOpenPath());

		importFileChooser = new JFileChooser();
		importFileChooser.setFileFilter(new XmlImportFileFilter());
		importFileChooser.setFileHidingEnabled(false);
		importFileChooser.setCurrentDirectory(this.applicationPreferences.getPreviousImportPath());

		setSplashStatusText("Creating task manager frame.");
		taskManagerFrame = new TaskManagerInternalFrame(this);
		taskManagerFrame.setTitle("Task Manager");
		taskManagerFrame.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
		taskManagerFrame.setBounds(0, 0, 320, 240);

		desktop.add(taskManagerFrame);
		desktop.validate();

		// the following code must be executed after desktop has been initialized...
		try
		{
			// try to use the 1.6 transfer handler...
			new MainFrameTransferHandler16(this).attach();
		}
		catch (Throwable t)
		{
			// ... and use the basic 1.5 transfer handler if this fails.
			new MainFrameTransferHandler(this).attach();
		}

		helpUrl = MainFrame.class.getResource("/help/index.xhtml");
	}

	/**
	 * To be called after setVisible(true)...
	 */
	public void startUp()
	{
		//Thread referenceCollection=new Thread(new ColorsCollectionRunnable(), "ColorCacheCleanupThread");
		//referenceCollection.setDaemon(true);
		//referenceCollection.start();

		setSplashStatusText("Executing autostart items.");
		// Autostart
		{
			File autostartDir = new File(startupApplicationPath, "autostart");
			if (autostartDir.mkdirs())
			{
				if (logger.isDebugEnabled()) logger.debug("Created '{}'.", autostartDir.getAbsolutePath());
			}
			File[] autoFiles = autostartDir.listFiles(new FileFilter()
			{
				public boolean accept(File file)
				{
					return file.isFile();
				}
			});

			if (autoFiles != null && autoFiles.length > 0)
			{
				Arrays.sort(autoFiles, new Comparator<File>()
				{
					public int compare(File o1, File o2)
					{
						return o1.getAbsolutePath().compareTo(o2.getAbsolutePath());
					}
				});
				for (File current : autoFiles)
				{
					AutostartRunnable r = new AutostartRunnable(current);
					autostartProcesses.add(r);
					Thread t = new Thread(r, current.getAbsolutePath());
					t.setDaemon(true);
					t.start();
				}
			}
			else
			{
				if (logger.isInfoEnabled())
				{
					logger.info("No autostart files defined in '{}'.", autostartDir.getAbsolutePath());
				}
			}
		}

		// go to source
		{
			gotoSource = new GoToSourceService();
			//gotoSource.start() started when needed...
		}

		setSplashStatusText("Creating global views.");
		SourceIdentifier globalSourceIdentifier = new SourceIdentifier("global", null);

		FileDumpEventConsumer<LoggingEvent> loggingFileDump = new FileDumpEventConsumer<LoggingEvent>(globalSourceIdentifier, loggingFileBufferFactory);

		FileDumpEventConsumer<AccessEvent> accessFileDump = new FileDumpEventConsumer<AccessEvent>(globalSourceIdentifier, accessFileBufferFactory);

		BlockingCircularBuffer<EventWrapper<LoggingEvent>> loggingEventQueue = new LilithBuffer<LoggingEvent>(applicationPreferences, 1000);
		BlockingCircularBuffer<EventWrapper<AccessEvent>> accessEventQueue = new LilithBuffer<AccessEvent>(applicationPreferences, 1000);

		SourceManagerImpl<LoggingEvent> lsm = new SourceManagerImpl<LoggingEvent>(loggingEventQueue);
		// add global view
		EventSource<LoggingEvent> globalLoggingEventSource = new EventSourceImpl<LoggingEvent>(globalSourceIdentifier, loggingFileDump.getBuffer(), true);
		lsm.addSource(globalLoggingEventSource);

		setSplashStatusText("Creating internal view.");
		// add internal lilith logging
		EventSource<LoggingEvent> lilithLoggingEventSource = new EventSourceImpl<LoggingEvent>(InternalLilithAppender.getSourceIdentifier(), InternalLilithAppender.getBuffer(), false);
		lsm.addSource(lilithLoggingEventSource);

		setLoggingEventSourceManager(lsm);

		SourceManagerImpl<AccessEvent> asm = new SourceManagerImpl<AccessEvent>(accessEventQueue);
		// add global view
		EventSource<AccessEvent> globalAccessEventSource = new EventSourceImpl<AccessEvent>(globalSourceIdentifier, accessFileDump.getBuffer(), true);
		asm.addSource(globalAccessEventSource);
		setAccessEventSourceManager(asm);

		try
		{
			loggingEventSourceManager.addEventSourceProducer(new LogbackLoggingServerSocketEventSourceProducer(4560));
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}

		setSplashStatusText("Starting event receivers.");
		try
		{
			LoggingEventProtobufServerSocketEventSourceProducer producer
					= new LoggingEventProtobufServerSocketEventSourceProducer
					(ClassicMultiplexSocketAppender.COMRESSED_DEFAULT_PORT, true);

			loggingEventSourceManager.addEventSourceProducer(producer);
			// TODO: senderService.addLoggingProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}

		try
		{
			LoggingEventProtobufServerSocketEventSourceProducer producer
					= new LoggingEventProtobufServerSocketEventSourceProducer
					(ClassicMultiplexSocketAppender.UNCOMRESSED_DEFAULT_PORT, false);

			loggingEventSourceManager.addEventSourceProducer(producer);
			// TODO: senderService.addLoggingProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}


		try
		{
			LilithXmlMessageLoggingServerSocketEventSourceProducer producer
					= new LilithXmlMessageLoggingServerSocketEventSourceProducer
					(ClassicXmlMultiplexSocketAppender.UNCOMRESSED_DEFAULT_PORT, false);

			loggingEventSourceManager.addEventSourceProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}

		try
		{
			LilithXmlMessageLoggingServerSocketEventSourceProducer producer
					= new LilithXmlMessageLoggingServerSocketEventSourceProducer
					(ClassicXmlMultiplexSocketAppender.COMRESSED_DEFAULT_PORT, true);

			loggingEventSourceManager.addEventSourceProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}
//
		try
		{
			LilithXmlStreamLoggingServerSocketEventSourceProducer producer
					= new LilithXmlStreamLoggingServerSocketEventSourceProducer
					(ZeroDelimitedClassicXmlMultiplexSocketAppender.DEFAULT_PORT);

			loggingEventSourceManager.addEventSourceProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}

		try
		{
			accessEventSourceManager.addEventSourceProducer(new LogbackAccessServerSocketEventSourceProducer(4570));
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}
		try
		{
			AccessEventProtobufServerSocketEventSourceProducer producer
					= new AccessEventProtobufServerSocketEventSourceProducer
					(AccessMultiplexSocketAppender.COMRESSED_DEFAULT_PORT, true);

			accessEventSourceManager.addEventSourceProducer(producer);
			// TODO: senderService.addAccessProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}

		try
		{
			AccessEventProtobufServerSocketEventSourceProducer producer
					= new AccessEventProtobufServerSocketEventSourceProducer
					(AccessMultiplexSocketAppender.UNCOMPRESSED_DEFAULT_PORT, false);

			accessEventSourceManager.addEventSourceProducer(producer);
			// TODO: senderService.addAccessProducer(producer);
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating event producer!", ex);
		}
		viewActions = new ViewActions(this, null);
		viewActions.getPopupMenu(); // initialize popup once in main frame only.

		setSplashStatusText("Setting up event consumers.");

		RrdLoggingEventConsumer rrdDb = new RrdLoggingEventConsumer();
		rrdDb.setBasePath(new File(startupApplicationPath, "statistics"));
		AlarmSoundLoggingEventConsumer loggingEventAlarmSound = new AlarmSoundLoggingEventConsumer();
		loggingEventAlarmSound.setSounds(sounds);

		FileSplitterEventConsumer<LoggingEvent> fileSplitterLoggingEventConsumer =
				new FileSplitterEventConsumer<LoggingEvent>(/*applicationPreferences, */loggingFileBufferFactory, loggingEventSourceManager);

		List<EventConsumer<LoggingEvent>> loggingConsumers = new ArrayList<EventConsumer<LoggingEvent>>();

		loggingConsumers.add(rrdDb);
		loggingConsumers.add(loggingEventAlarmSound);
		loggingConsumers.add(fileSplitterLoggingEventConsumer);
		loggingConsumers.add(loggingFileDump);

		// crashs the app using j2se 6
		//if(application.isMac())
		//{
		//	UserNotificationLoggingEventConsumer notification = new UserNotificationLoggingEventConsumer(application);
		//	loggingConsumers.add(notification);
		//}
		loggingEventSourceManager.setEventConsumers(loggingConsumers);
		loggingEventSourceManager.start();

		List<EventConsumer<AccessEvent>> accessConsumers = new ArrayList<EventConsumer<AccessEvent>>();

		FileSplitterEventConsumer<AccessEvent> fileSplitterAccessEventConsumer =
				new FileSplitterEventConsumer<AccessEvent>(/*applicationPreferences, */accessFileBufferFactory, accessEventSourceManager);
		AlarmSoundAccessEventConsumer accessEventAlarmSound = new AlarmSoundAccessEventConsumer();
		accessEventAlarmSound.setSounds(sounds);
		accessConsumers.add(accessEventAlarmSound);
		accessConsumers.add(fileSplitterAccessEventConsumer);
		accessConsumers.add(accessFileDump);

		// crashs the app using j2se 6
		//if(application.isMac())
		//{
		//	UserNotificationAccessEventConsumer notification = new UserNotificationAccessEventConsumer(application);
		//	accessConsumers.add(notification);
		//}

		accessEventSourceManager.setEventConsumers(accessConsumers);
		accessEventSourceManager.start();

		JMenuBar menuBar = viewActions.getMenuBar();
		JToolBar toolbar = viewActions.getToolbar();
		add(toolbar, BorderLayout.NORTH);
		setJMenuBar(menuBar);
		viewActions.updateWindowMenu();
		application.setEnabledAboutMenu(true);
		application.setEnabledPreferencesMenu(true);
		application.addApplicationListener(new MyApplicationListener());

		if (enableBonjour)
		{
			senderService.start();
		}
		if (applicationPreferences.isCheckingForUpdate())
		{
			checkForUpdate(false);
		}
		updateConditions(); // to initialize active conditions.
		setSplashStatusText("Finished.");
		cleanObsoleteFiles();
	}

	private void updateTaskStatus()
	{
		int numberOfTasks = longTaskManager.getNumberOfTasks();
		if (numberOfTasks != previousNumberOfTasks)
		{
			previousNumberOfTasks = numberOfTasks;
			String text = "";
			Icon icon = null;
			if (numberOfTasks == 1)
			{
				text = "1 active task.";
				icon = smallProgressIcon;
			}
			else if (numberOfTasks > 1)
			{
				text = "" + numberOfTasks + " active tasks.";
				icon = smallProgressIcon;
			}
			taskStatusLabel.setText(text);
			taskStatusLabel.setIcon(icon);
		}
	}

	private void setSplashStatusText(String text)
	{
		if (splashScreen != null)
		{
			splashScreen.setStatusText(text);
		}
	}

	public Application getApplication()
	{
		return application;
	}

//	/**
//	 * Returns a sorted map containing resolved source name mapped to sender. If there is both a compressed
//	 * and uncompressed sender the compressed one will be used.
//	 * @param senders a map of all senders
//	 * @return a  map of senders.
//	 */
//	private <T extends Serializable> Map<String, EventSender<T>> getEventSenders(Map<String, EventSender<T>> senders)
//	{
//		Map<String, EventSender<T>> serviceNameSenderMapping;
//		synchronized(senders)
//		{
//			serviceNameSenderMapping =new HashMap<String, EventSender<T>>(senders);
//		}
//
//		SortedMap<String, EventSender<T>> result=new TreeMap<String, EventSender<T>>();
//		for(Map.Entry<String, EventSender<T>> current: serviceNameSenderMapping.entrySet())
//		{
//			EventSender<T> value = current.getValue();
//			String hostName = value.getHostAddress();
//			hostName = getPrimarySourceTitle(hostName);
//			EventSender<T> prevValue = result.get(hostName);
//			if(prevValue == null)
//			{
//				result.put(hostName, value);
//			}
//			else
//			{
//				if(value instanceof AbstractEventSender)
//				{
//					AbstractEventSender aes = (AbstractEventSender) value;
//					if(aes.isCompressing())
//					{
//						result.put(hostName, value);
//						if(logger.isDebugEnabled()) logger.debug("Replaced previous sender with compressing one.");
//					}
//				}
//			}
//		}
//		if(logger.isDebugEnabled()) logger.debug("EventSenders: {}", result);
//		return result;
//	}

	public Map<String, EventSender<LoggingEvent>> getLoggingEventSenders()
	{
		return senderService.getLoggingEventSenders();//getEventSenders(loggingEventSenders);
	}

	public Map<String, EventSender<AccessEvent>> getAccessEventSenders()
	{
		return senderService.getAccessEventSenders();//getEventSenders(accessEventSenders);
	}

	public void updateWindowMenus()
	{
		viewActions.updateWindowMenu();
		// update other frames
		Map<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> loggingViews = loggingEventViewManager.getViews();
		for (Map.Entry<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> current : loggingViews.entrySet())
		{
			ViewContainer<LoggingEvent> value = current.getValue();
			ViewWindow window = value.resolveViewWindow();
			if (window instanceof JFrame)
			{
				window.getViewActions().updateWindowMenu();
			}
		}
		Map<EventSource<AccessEvent>, ViewContainer<AccessEvent>> accessViews = accessEventViewManager.getViews();
		for (Map.Entry<EventSource<AccessEvent>, ViewContainer<AccessEvent>> current : accessViews.entrySet())
		{
			ViewContainer<AccessEvent> value = current.getValue();
			ViewWindow window = value.resolveViewWindow();
			if (window instanceof JFrame)
			{
				window.getViewActions().updateWindowMenu();
			}
		}
	}


	public void closeLoggingConnection(SourceIdentifier id)
	{
		loggingEventSourceManager.removeEventProducer(id);
	}

	public void closeAccessConnection(SourceIdentifier id)
	{
		accessEventSourceManager.removeEventProducer(id);
	}

	public void goToSource(StackTraceElement ste)
	{
		/*
		String className=ste.getClassName();
		int dollarIndex = className.indexOf("$");
		if(dollarIndex>=0)
		{
			String parentClassName=className.substring(0, dollarIndex);
			if(logger.isWarnEnabled()) logger.warn("parentClassName: {}", parentClassName);
		}
        */
		if (gotoSource != null)
		{
			gotoSource.goToSource(ste);
		}
	}

	public void setActiveConnectionsCounter(int activeCounter)
	{
		this.activeCounter = activeCounter;
		updateStatus();
	}

	public void copyHtml(String html)
	{
		Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable transferableText = new HtmlTransferable(html);
		systemClipboard.setContents(transferableText, null);
	}

	public void checkForUpdate(boolean showAlways)
	{
		Thread t = new Thread(new CheckForUpdateRunnable(showAlways));
		t.start();
	}

	public void showPopup(Component component, Point p)
	{
		if (logger.isDebugEnabled()) logger.debug("Show popup at {}.", p);
		JPopupMenu popup = viewActions.getPopupMenu();
		popup.show(component, p.x, p.y);
	}

	public Colors getColors(HttpStatus.Type status)
	{
		if (statusColors == null)
		{
			initStatusColors();
		}
		return statusColors.get(status);
	}

	public Colors getColors(LoggingEvent.Level level)
	{
		if (levelColors == null)
		{
			initLevelColors();
		}
		return levelColors.get(level);
	}

	public Colors getColors(EventWrapper eventWrapper)
	{
		if (!SwingUtilities.isEventDispatchThread())
		{
			if (logger.isErrorEnabled()) logger.error("Not on EventDispatchThread!");
		}
		if (activeConditions != null)
		{
			for (SavedCondition current : activeConditions)
			{
				Condition condition = current.getCondition();
				if (condition != null && condition.isTrue(eventWrapper))
				{
					return new Colors(current.getColorScheme());
				}
			}
		}

		if (coloringWholeRow)
		{
			Object eventObj = eventWrapper.getEvent();
			if (eventObj instanceof LoggingEvent)
			{
				return getColors(((LoggingEvent) eventObj).getLevel());
			}
			if (eventObj instanceof AccessEvent)
			{
				return getColors(HttpStatus.getType(((AccessEvent) eventObj).getStatusCode()));
			}
		}
		return null;
	}

	public void open()
	{
		int returnVal = openFileChooser.showOpenDialog(this);

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			open(openFileChooser.getSelectedFile());
		}
	}

	public void importFile()
	{
		int returnVal = importFileChooser.showOpenDialog(this);

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File importFile = importFileChooser.getSelectedFile();
			String fileName = importFile.getAbsolutePath();
			if (fileName.toLowerCase().endsWith(FileConstants.FILE_EXTENSION))
			{
				open(importFile);
				return;
			}
			importFile(importFile);
		}
	}

	public void open(File dataFile)
	{
		if (logger.isInfoEnabled()) logger.info("Open file: {}", dataFile.getAbsolutePath());
		ViewContainer<?> viewContainer = resolveViewContainer(dataFile);
		if (viewContainer != null)
		{
			showView(viewContainer);
			String message = "File '" + dataFile.getAbsolutePath() + "' is already open.";
			JOptionPane.showMessageDialog(this, message, "File is already open...", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		String fileName = dataFile.getAbsolutePath();
		String indexFileName;
		if (fileName.toLowerCase().endsWith(FileConstants.FILE_EXTENSION))
		{
			indexFileName = fileName.substring(0, fileName.length() - FileConstants.FILE_EXTENSION.length());
		}
		else
		{
			indexFileName = fileName;
		}
		indexFileName = indexFileName + FileConstants.INDEX_FILE_EXTENSION;

		File indexFile = new File(indexFileName);
		if (!indexFile.isFile())
		{
			// ask if it should be indexed.
			String dialogTitle = "Index file?";
			String message = "Index file does not exist!\nIndex data file right now?";
			int result = JOptionPane.showConfirmDialog(this, message, dialogTitle,
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.OK_OPTION != result)
			{
				return;
			}
			String name = "Indexing Lilith file";
			String description = "Indexing '" + dataFile.getAbsolutePath() + "'...";
			Task<Long> task = longTaskManager.startTask(new IndexingCallable(dataFile, indexFile), name, description);
			if (logger.isInfoEnabled()) logger.info("Task-Name: {}", task.getName());
		}
		else
		{
			createViewFor(dataFile, indexFile);
		}
	}

	public void importFile(File importFile)
	{
		if (logger.isInfoEnabled()) logger.info("Import file: {}", importFile.getAbsolutePath());

		File parentFile = importFile.getParentFile();
		String inputName = importFile.getName();

		File dataFile = new File(parentFile, inputName + FileConstants.FILE_EXTENSION);
		File indexFile = new File(parentFile, inputName + FileConstants.INDEX_FILE_EXTENSION);

		// check if file exists and warn in that case
		if (dataFile.isFile())
		{
			// check if file is already open
			ViewContainer<?> viewContainer = resolveViewContainer(dataFile);
			if (viewContainer != null)
			{
				showView(viewContainer);
				String message = "File '" + dataFile.getAbsolutePath() + "' is already open.";
				JOptionPane
						.showMessageDialog(this, message, "File is already open...", JOptionPane.INFORMATION_MESSAGE);
				// TODO: Offer option to reimport anyway. Close view beforehand in tht case.
				return;
			}
			String dialogTitle = "Reimport file?";
			String message = "Data file does already exist!\nReimport data file right now?";
			int result = JOptionPane.showConfirmDialog(this, message, dialogTitle,
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.OK_OPTION != result)
			{
				return;
			}

			if (dataFile.delete())
			{
				if (logger.isInfoEnabled()) logger.info("Deleted file '{}'.", dataFile.getAbsolutePath());
			}
		}
		if (indexFile.isFile())
		{
			if (indexFile.delete())
			{
				if (logger.isInfoEnabled()) logger.info("Deleted file '{}'.", indexFile.getAbsolutePath());
			}
		}

		Map<String, String> metaData = new HashMap<String, String>();
		metaData.put(FileConstants.CONTENT_FORMAT_KEY, FileConstants.CONTENT_FORMAT_VALUE_PROTOBUF);
		metaData.put(FileConstants.CONTENT_TYPE_KEY, FileConstants.CONTENT_TYPE_VALUE_LOGGING);
		metaData.put(FileConstants.COMPRESSION_KEY, FileConstants.COMPRESSION_VALUE_GZIP);

		FileBuffer<EventWrapper<LoggingEvent>> buffer =
				loggingFileBufferFactory.createBuffer(dataFile, indexFile, metaData);

		ImportType type = resolveType(importFile);
		if (type == ImportType.LOG4J)
		{
			String name = "Importing Log4J XML file";
			String description = "Importing Log4J XML file '" + importFile.getAbsolutePath() + "'...";
			Task<Long> task = longTaskManager.startTask(new Log4jImportCallable(importFile, buffer), name, description);
			if (logger.isInfoEnabled()) logger.info("Task-Name: {}", task.getName());
			return;
		}
		if (type == ImportType.JUL)
		{
			String name = "Importing java.util.logging XML file";
			String description = "Importing java.util.logging XML file '" + importFile.getAbsolutePath() + "'...";
			Task<Long> task = longTaskManager.startTask(new JulImportCallable(importFile, buffer), name, description);
			if (logger.isInfoEnabled()) logger.info("Task-Name: {}", task.getName());
			return;
		}

		// show warning "Unknown type"
		String message = "Couldn't detect type of file '" + importFile.getAbsolutePath() + "'.\nFile is unsupported.";
		JOptionPane.showMessageDialog(this, message, "Unknown file type...", JOptionPane.WARNING_MESSAGE);
	}

	private ImportType resolveType(File importFile)
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(importFile));
			for (int i = 0; i < 5; i++)
			{
				String line = br.readLine();
				if (line == null)
				{
					break;
				}
				if (line.contains("<log4j:"))
				{
					return ImportType.LOG4J;
				}
				if (line.contains("<log>") || line.contains("<record>"))
				{
					return ImportType.JUL;
				}
			}
		}
		catch (IOException ex)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while resolving type of file!", ex);
		}
		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}
				catch (IOException e)
				{
					// ignore
				}
			}
		}
		return null;
	}

	public enum ImportType
	{
		LOG4J, JUL
	}

	public ViewContainer<?> resolveViewContainer(File dataFile)
	{
		{ // logging
			Map<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> views = loggingEventViewManager.getViews();
			for (Map.Entry<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> current : views.entrySet())
			{

				ViewContainer<LoggingEvent> view = current.getValue();
				EventWrapperViewPanel<LoggingEvent> defaultView = view.getDefaultView();
				EventSource<LoggingEvent> es = defaultView.getEventSource();
				if (es != null)
				{
					Buffer<EventWrapper<LoggingEvent>> buffer = es.getBuffer();
					if (buffer instanceof CodecFileBuffer)
					{
						CodecFileBuffer cfb = (CodecFileBuffer) buffer;
						if (dataFile.equals(cfb.getDataFile()))
						{
							return view;
						}
					}
				}
			}
		}

		{ // access
			Map<EventSource<AccessEvent>, ViewContainer<AccessEvent>> views = accessEventViewManager.getViews();
			for (Map.Entry<EventSource<AccessEvent>, ViewContainer<AccessEvent>> current : views.entrySet())
			{

				ViewContainer<AccessEvent> view = current.getValue();
				EventWrapperViewPanel<AccessEvent> defaultView = view.getDefaultView();
				EventSource<AccessEvent> es = defaultView.getEventSource();
				if (es != null)
				{
					Buffer<EventWrapper<AccessEvent>> buffer = es.getBuffer();
					if (buffer instanceof CodecFileBuffer)
					{
						CodecFileBuffer cfb = (CodecFileBuffer) buffer;
						if (dataFile.equals(cfb.getDataFile()))
						{
							return view;
						}
					}
				}
			}
		}

		return null;
	}

	private void createViewFor(File dataFile, File indexFile)
	{
		// create view for dataFile and indexFile.
		if (logger.isInfoEnabled())
		{
			logger
					.info("Create view for dataFile '{}' and indexFile '{}'.", dataFile.getAbsolutePath(), indexFile.getAbsolutePath());
		}

		FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
		try
		{
			FileHeader header = fileHeaderStrategy.readFileHeader(dataFile);
			if (header == null)
			{
				if (logger.isWarnEnabled())
				{
					logger.warn("Couldn't read file header from '{}'!", dataFile.getAbsolutePath());
				}
				return;
			}
			if (header.getMagicValue() != FileConstants.MAGIC_VALUE)
			{
				if (logger.isWarnEnabled())
				{
					logger.warn("Invalid magic value! ", Integer.toHexString(header.getMagicValue()));
				}
				return;
			}
			MetaData metaData = header.getMetaData();
			if (metaData == null || metaData.getData() == null)
			{
				if (logger.isWarnEnabled())
				{
					logger.warn("Couldn't read meta data from '{}'!", dataFile.getAbsolutePath());
				}
				return;
			}
			Map<String, String> data = metaData.getData();
			String contentType = data.get(FileConstants.CONTENT_TYPE_KEY);
			Map<String, String> usedMetaData = new HashMap<String, String>();
			SourceIdentifier si = new SourceIdentifier(dataFile.getAbsolutePath());

			if (FileConstants.CONTENT_TYPE_VALUE_LOGGING.equals(contentType))
			{
				FileBuffer<EventWrapper<LoggingEvent>> buffer =
						loggingFileBufferFactory.createBuffer(dataFile, indexFile, usedMetaData);
				EventSource<LoggingEvent> eventSource = new EventSourceImpl<LoggingEvent>(si, buffer, false);
				ViewContainer<LoggingEvent> viewContainer = loggingEventViewManager.retrieveViewContainer(eventSource);
				EventWrapperViewPanel<LoggingEvent> panel = viewContainer.getDefaultView();
				panel.setState(LoggingViewState.INACTIVE);
				showLoggingView(eventSource);
			}
			else if (FileConstants.CONTENT_TYPE_VALUE_ACCESS.equals(contentType))
			{
				FileBuffer<EventWrapper<AccessEvent>> buffer =
						accessFileBufferFactory.createBuffer(dataFile, indexFile, usedMetaData);
				EventSource<AccessEvent> eventSource = new EventSourceImpl<AccessEvent>(si, buffer, false);
				ViewContainer<AccessEvent> viewContainer = accessEventViewManager.retrieveViewContainer(eventSource);
				EventWrapperViewPanel<AccessEvent> panel = viewContainer.getDefaultView();
				panel.setState(LoggingViewState.INACTIVE);
				showAccessView(eventSource);
			}
			else
			{
				if (logger.isWarnEnabled()) logger.warn("Unexpected content type {}.", contentType);
			}
		}
		catch (IOException e)
		{
			if (logger.isWarnEnabled()) logger.warn("Exception while creating view form file!", e);
		}
	}


	/*
	// implement cache?
	private static class SoftColorsReference
		extends SoftReference<Colors>
	{
		private static final Colors NULL_COLORS = new Colors();

		private EventIdentifier id;

		public SoftColorsReference(EventIdentifier id, Colors o, ReferenceQueue<Colors> referenceQueue)
		{
			super(o != null ? o : new Colors(), referenceQueue);
			this.id = id;
		}

		public EventIdentifier getId()
		{
			return id;
		}

		public Colors getColors()
		{
			Colors result = get();
			if(NULL_COLORS.equals(result))
			{
				return null;
			}
			return result;
		}
	}
    */


	private void initStatusColors()
	{
		Map<HttpStatus.Type, ColorScheme> prefValue = applicationPreferences.getStatusColors();
		Map<HttpStatus.Type, Colors> colors = new HashMap<HttpStatus.Type, Colors>();
		for (Map.Entry<HttpStatus.Type, ColorScheme> current : prefValue.entrySet())
		{
			colors.put(current.getKey(), new Colors(current.getValue()));
		}
		statusColors = colors;
	}


	private void initLevelColors()
	{
		Map<LoggingEvent.Level, ColorScheme> prefValue = applicationPreferences.getLevelColors();
		Map<LoggingEvent.Level, Colors> colors = new HashMap<LoggingEvent.Level, Colors>();
		for (Map.Entry<LoggingEvent.Level, ColorScheme> current : prefValue.entrySet())
		{
			colors.put(current.getKey(), new Colors(current.getValue()));
		}
		levelColors = colors;
	}

	public class MyApplicationListener
			implements ApplicationListener
	{

		public void handleAbout(ApplicationEvent event)
		{
			//application.requestUserAttention(Application.REQUEST_USER_ATTENTION_TYPE_INFORMATIONAL);
			viewActions.getAboutAction().actionPerformed(null);
			event.setHandled(true);
		}

		public void handleOpenApplication(ApplicationEvent applicationEvent)
		{
			if (logger.isInfoEnabled()) logger.info("Open Application: {}", applicationEvent);
		}

		public void handleOpenFile(ApplicationEvent applicationEvent)
		{
			if (logger.isInfoEnabled()) logger.info("Open File: {}", applicationEvent);
		}

		public void handlePreferences(ApplicationEvent applicationEvent)
		{
			viewActions.getPreferencesAction().actionPerformed(null);
		}

		public void handlePrintFile(ApplicationEvent applicationEvent)
		{
			if (logger.isInfoEnabled()) logger.info("Print: {}", applicationEvent);
		}

		public void handleQuit(ApplicationEvent applicationEvent)
		{
			exit();
		}

		public void handleReopenApplication(ApplicationEvent applicationEvent)
		{
			if (logger.isInfoEnabled()) logger.info("Reopen Application: {}", applicationEvent);
			setVisible(true);
		}
	}

	private void setLoggingEventSourceManager(SourceManager<LoggingEvent> loggingEventSourceManager)
	{
		if (this.loggingEventSourceManager != null)
		{
			this.loggingEventSourceManager.removeEventSourceListener(loggingSourceListener);
		}
		this.loggingEventSourceManager = loggingEventSourceManager;
		if (this.loggingEventSourceManager != null)
		{
			this.loggingEventSourceManager.addEventSourceListener(loggingSourceListener);

			List<EventSource<LoggingEvent>> sources = this.loggingEventSourceManager.getSources();
			for (EventSource<LoggingEvent> source : sources)
			{
				loggingEventViewManager.retrieveViewContainer(source);
			}
		}
	}

	public SourceManager<LoggingEvent> getLoggingEventSourceManager()
	{
		return loggingEventSourceManager;
	}

	private void setAccessEventSourceManager(SourceManager<AccessEvent> accessEventSourceManager)
	{
		if (this.accessEventSourceManager != null)
		{
			this.accessEventSourceManager.removeEventSourceListener(accessSourceListener);
		}
		this.accessEventSourceManager = accessEventSourceManager;
		if (this.accessEventSourceManager != null)
		{
			this.accessEventSourceManager.addEventSourceListener(accessSourceListener);

			List<EventSource<AccessEvent>> sources = this.accessEventSourceManager.getSources();
			for (EventSource<AccessEvent> source : sources)
			{
				accessEventViewManager.retrieveViewContainer(source);
			}
		}
	}

	public SourceManager<AccessEvent> getAccessEventSourceManager()
	{
		return accessEventSourceManager;
	}

	public Sounds getSounds()
	{
		return sounds;
	}

	public void setSounds(Sounds sounds)
	{
		if (sounds != null)
		{
			sounds.setSoundLocations(applicationPreferences.getSoundLocations());
			sounds.setMute(applicationPreferences.isMute());
		}
		this.sounds = sounds;
	}

	private ViewContainer<LoggingEvent> retrieveLoggingViewContainer(EventSource<LoggingEvent> eventSource)
	{
		return loggingEventViewManager.retrieveViewContainer(eventSource);
	}

	private ViewContainer<AccessEvent> retrieveAccessViewContainer(EventSource<AccessEvent> eventSource)
	{
		return accessEventViewManager.retrieveViewContainer(eventSource);
	}

	public ApplicationPreferences getApplicationPreferences()
	{
		return applicationPreferences;
	}

	/*
	public EventWrapperViewPanel<LoggingEvent> createLoggingViewPanel(EventSource<LoggingEvent> eventSource)
	{
		EventWrapperViewPanel<LoggingEvent> result = new LoggingEventViewPanel(this, eventSource);
		result.setScrollingToBottom(applicationPreferences.isScrollingToBottom());
		return result;
	}
    */

	public SortedMap<String, SourceIdentifier> getAvailableStatistics()
	{
		File statisticsPath = new File(applicationPreferences.getStartupApplicationPath(), "statistics");
		File[] files = statisticsPath.listFiles(rrdFileFilter);
		SortedMap<String, SourceIdentifier> sources = new TreeMap<String, SourceIdentifier>();
		if (files != null)
		{
			for (File f : files)
			{
				String name = f.getName();
				name = name.substring(0, name.length() - 4); // we are sure about .rrd here...
				if (!name.equalsIgnoreCase("global"))
				{
					SourceIdentifier si = new SourceIdentifier(name);
					sources.put(getSourceTitle(si), si);
				}
			}
		}
		return sources;
	}

	public void showStatistics(SourceIdentifier sourceIdentifier)
	{
		statisticsDialog.setSourceIdentifier(sourceIdentifier);
		Windows.showWindow(statisticsDialog, MainFrame.this, true);
	}

	public TaskManager<Long> getLongWorkManager()
	{
		return longTaskManager;
	}

	public LogFileFactory getAccessFileFactory()
	{
		return accessFileFactory;
	}

	public LogFileFactory getLoggingFileFactory()
	{
		return loggingFileFactory;
	}

	public void showLoggingView(EventSource<LoggingEvent> eventSource)
	{
		ViewContainer<LoggingEvent> container = retrieveLoggingViewContainer(eventSource);
		showView(container);
	}

	public void showAccessView(EventSource<AccessEvent> eventSource)
	{
		ViewContainer<AccessEvent> container = retrieveAccessViewContainer(eventSource);
		showView(container);
	}

	public void showView(ViewContainer<?> container)
	{
		// we need this since this method might also be called by a different thread
		ShowViewRunnable runnable = new ShowViewRunnable(container);
		if (SwingUtilities.isEventDispatchThread())
		{
			runnable.run();
		}
		else
		{
			SwingUtilities.invokeLater(runnable);
		}
	}

	public void openPreviousLogging(SourceIdentifier si)
	{
		FileBuffer<EventWrapper<LoggingEvent>> buffer = loggingFileBufferFactory.createBuffer(si);
		EventSource<LoggingEvent> eventSource = new EventSourceImpl<LoggingEvent>(si, buffer, false);

		ViewContainer<LoggingEvent> container = retrieveLoggingViewContainer(eventSource);
		EventWrapperViewPanel<LoggingEvent> panel = container.getDefaultView();
		panel.setState(LoggingViewState.INACTIVE);
		showLoggingView(eventSource);
	}

	public void openPreviousAccess(SourceIdentifier si)
	{
		FileBuffer<EventWrapper<AccessEvent>> buffer = accessFileBufferFactory.createBuffer(si);
		EventSource<AccessEvent> eventSource = new EventSourceImpl<AccessEvent>(si, buffer, false);

		ViewContainer<AccessEvent> container = retrieveAccessViewContainer(eventSource);
		EventWrapperViewPanel<AccessEvent> panel = container.getDefaultView();
		panel.setState(LoggingViewState.INACTIVE);
		showAccessView(eventSource);
	}

	public void updateStatus()
	{
		StringBuilder statusText = new StringBuilder();

		ApplicationPreferences.SourceFiltering filtering = applicationPreferences.getSourceFiltering();
		switch (filtering)
		{
			case BLACKLIST:
				statusText.append("Blacklisting on '");
				statusText.append(applicationPreferences.getBlackListName());
				statusText.append("'.  ");
				break;
			case WHITELIST:
				statusText.append("Whitelisting on '");
				statusText.append(applicationPreferences.getWhiteListName());
				statusText.append("'.  ");
				break;
		}

		if (activeCounter == 0)
		{
			statusText.append("No active connections.");
		}
		else if (activeCounter == 1)
		{
			statusText.append("One active connection.");
		}
		else if (activeCounter > 1)
		{
			statusText.append(activeCounter).append(" active connections.");
		}
		statusLabel.setText(statusText.toString());
	}

	private long lastScriptRefresh = 0;
	private long previousScriptFileTimestamp = 0;
	private Script detailsViewScript;
	private static final int SCRIPT_REFRESH_INTERVAL = 5000;

	private void initDetailsViewScript()
	{
		long current = System.currentTimeMillis();
		if (detailsViewScript != null && current - lastScriptRefresh < SCRIPT_REFRESH_INTERVAL)
		{
			return;
		}

		lastScriptRefresh = current;

		File detailsViewRoot = getApplicationPreferences().getDetailsViewRoot();
		File scriptFile = new File(detailsViewRoot, ApplicationPreferences.DETAILS_VIEW_GROOVY_FILENAME);
		long scriptFileTimestamp = scriptFile.lastModified();
		if (detailsViewScript == null || previousScriptFileTimestamp != scriptFileTimestamp)
		{
			if (!scriptFile.isFile())
			{
				if (logger.isWarnEnabled()) logger.warn("Scriptfile '{}' is not a file!", scriptFile.getAbsolutePath());
			}
			GroovyClassLoader gcl = new GroovyClassLoader();
			gcl.setShouldRecompile(true);
			try
			{
				Class clazz = gcl.parseClass(scriptFile);
				Object instance = clazz.newInstance();
				if (instance instanceof Script)
				{
					detailsViewScript = (Script) instance;
					previousScriptFileTimestamp = scriptFileTimestamp;
				}
			}
			catch (Throwable e)
			{
				if (logger.isWarnEnabled())
				{
					logger
							.warn("Exception while instanciating groovy condition '" + scriptFile
									.getAbsolutePath() + "'!", e);
				}
				detailsViewScript = null;
			}
		}
	}


	public String createMessage(EventWrapper wrapper)
	{
		initDetailsViewScript();
		String message = "<html><body>detailsView Script returned null!</body></html>";
//		if(wrapper!=null)
//		{
		//message=messageFormatter.createMessage(wrapper, true);
		if (detailsViewScript == null)
		{
			message = "<html><body>detailsView Script is broken!</body></html>";
		}
		else
		{
			try
			{
				Binding binding = new Binding();
				binding.setVariable("eventWrapper", wrapper);
				binding.setVariable("logger", logger);
				binding.setVariable("completeCallStack", applicationPreferences.isShowingFullCallstack());
				binding.setVariable("showStackTrace", applicationPreferences.isShowingStackTrace());

				detailsViewScript.setBinding(binding);
				Object result = detailsViewScript.run();
				if (result instanceof String)
				{
					message = (String) result;
				}
				else if (result != null)
				{
					message = result.toString();
				}
			}
			catch (Throwable t)
			{
				message = "<html><body>Exception while executing detailsView Script!</body></html>";
				if (logger.isWarnEnabled()) logger.warn("Exception while executing detailsView Script!", t);
			}
		}
		//}
		if (logger.isDebugEnabled()) logger.debug("Message:\n{}", message);
		// I'm not sure who is to blame for the following line of code...
		// One could argue that it's a bug in the application logging the event but I think
		// that it shouldn't be possible to cause a problem logging something weird.
		// One could also argue that logback should prevent/fix logging events that contain a zero
		// byte but this would result in a serious performance impact even though the problem is rather rare.
		// On the other hand, zero bytes can cause all kind of weird followup problems, e.g. cut off log files or,
		// as in this case, a malformed XML.
		// The third and last one to blame is the groovy XML builder. It shouldn't be possible to write a malformed
		// XML document using the builder but what would be an acceptable behaviour? Throwing an exception
		// would be a bad idea, imho. It would probably be best to replace the zero byte with a space.
		// This is very acceptable in my special case but I'm not sure if this is a general use case...
		//
		// http://cse-mjmcl.cse.bris.ac.uk/blog/2007/02/14/1171465494443.html
		message = SimpleXml.replaceNonValidXMLCharacters(message, ' ');
		return message;
	}

	public SortedMap<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> getSortedLoggingViews()
	{
		EventSourceComparator<LoggingEvent> loggingComparator = new EventSourceComparator<LoggingEvent>();
		SortedMap<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> sortedLoggingViews;
		sortedLoggingViews = new TreeMap<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>>(loggingComparator);
		sortedLoggingViews.putAll(loggingEventViewManager.getViews());
		return sortedLoggingViews;
	}

	public SortedMap<EventSource<AccessEvent>, ViewContainer<AccessEvent>> getSortedAccessViews()
	{
		EventSourceComparator<AccessEvent> accessComparator = new EventSourceComparator<AccessEvent>();
		SortedMap<EventSource<AccessEvent>, ViewContainer<AccessEvent>> sortedAccessViews;
		sortedAccessViews = new TreeMap<EventSource<AccessEvent>, ViewContainer<AccessEvent>>(accessComparator);
		sortedAccessViews.putAll(accessEventViewManager.getViews());
		return sortedAccessViews;
	}

	public void closeAllViews(ViewContainer beside)
	{
		{
			/*List<ViewContainer<LoggingEvent>> closed = */
			loggingEventViewManager.closeAllViews(beside);
		}

		{
			/*List<ViewContainer<AccessEvent>> closed = */
			accessEventViewManager.closeAllViews(beside);
		}
	}

	public void minimizeAllViews(ViewContainer beside)
	{
		{
			/*List<ViewContainer<LoggingEvent>> closed = */
			loggingEventViewManager.minimizeAllViews(beside);
		}

		{
			/*List<ViewContainer<AccessEvent>> closed = */
			accessEventViewManager.minimizeAllViews(beside);
		}
	}

	public void removeInactiveViews(boolean onlyClosed, boolean clean)
	{
		{
			List<ViewContainer<LoggingEvent>> removed = loggingEventViewManager.removeInactiveViews(onlyClosed);
			if (clean)
			{
				for (ViewContainer current : removed)
				{
					EventWrapperViewPanel panel = current.getDefaultView();
					panel.clear();
				}
			}
		}

		{
			List<ViewContainer<AccessEvent>> removed = accessEventViewManager.removeInactiveViews(onlyClosed);
			if (clean)
			{
				for (ViewContainer current : removed)
				{
					EventWrapperViewPanel panel = current.getDefaultView();
					panel.clear();
				}
			}
		}
	}

	public void openInactiveLogs()
	{
		if (logger.isInfoEnabled()) logger.info("Open inactive log...");
		Windows.showWindow(openInactiveLogsDialog, this, true);

	}

	public void showDebugDialog()
	{
		Windows.showWindow(debugDialog, MainFrame.this, true);
	}

	public void showPreferencesDialog()
	{
		Windows.showWindow(preferencesDialog, MainFrame.this, true);
	}

	public void showHelp()
	{
		if (helpUrl != null)
		{
			helpFrame.setHelpUrl(helpUrl);
		}
		Windows.showWindow(helpFrame, MainFrame.this, false);
	}

	public void showAboutDialog()
	{
		Windows.showWindow(aboutDialog, MainFrame.this, true);

		if (!applicationPreferences.isMute() && sounds != null)
		{
			//sounds.play(LilithSounds.ABOUT_SOUND);
		}
	}

	public void cleanAllInactiveLogs()
	{
		loggingEventViewManager.removeInactiveViews(false);
		accessEventViewManager.removeInactiveViews(false);
		longTaskManager.startTask(new CleanAllInactiveCallable(this), "Clean all inactive...");
		updateWindowMenus();
	}

	class LoggingEventSourceListener
			implements EventSourceListener<LoggingEvent>
	{
		public void eventSourceAdded(EventSource<LoggingEvent> eventSource)
		{
			SwingUtilities.invokeLater(new LoggingSourceAddedRunnable(eventSource));
		}

		public void eventSourceRemoved(EventSource<LoggingEvent> eventSource)
		{
			SwingUtilities.invokeLater(new LoggingSourceRemovedRunnable(eventSource));
		}

		private class LoggingSourceAddedRunnable
				implements Runnable
		{
			EventSource<LoggingEvent> eventSource;

			public LoggingSourceAddedRunnable(EventSource<LoggingEvent> eventSource)
			{
				this.eventSource = eventSource;
			}

			public void run()
			{
				ViewContainer<LoggingEvent> container = retrieveLoggingViewContainer(eventSource);
				EventWrapperViewPanel<LoggingEvent> panel = container.getDefaultView();
				panel.setState(LoggingViewState.ACTIVE);
				if (!applicationPreferences.isMute() && sounds != null)
				{
					sounds.play(LilithSounds.SOURCE_ADDED);
				}
				String primary = eventSource.getSourceIdentifier().getIdentifier();
				Map<String, String> sourceNames = applicationPreferences.getSourceNames();

				if (!sourceNames.containsKey(primary))
				{
					sourceNames = new HashMap<String, String>(sourceNames);
					sourceNames.put(primary, primary);
					applicationPreferences.setSourceNames(sourceNames);
				}

				if (applicationPreferences.isAutoOpening())
				{
					showLoggingView(eventSource);
				}
			}
		}

		private class LoggingSourceRemovedRunnable
				implements Runnable
		{
			EventSource<LoggingEvent> eventSource;

			public LoggingSourceRemovedRunnable(EventSource<LoggingEvent> eventSource)
			{
				this.eventSource = eventSource;
			}

			public void run()
			{
				ViewContainer<LoggingEvent> container = retrieveLoggingViewContainer(eventSource);
				EventWrapperViewPanel<LoggingEvent> panel = container.getDefaultView();
				panel.setState(LoggingViewState.INACTIVE);
				if (!applicationPreferences.isMute() && sounds != null)
				{
					sounds.play(LilithSounds.SOURCE_REMOVED);
				}
				if (applicationPreferences.isAutoClosing())
				{
					loggingEventViewManager.closeViewContainer(container);
				}
				loggingEventSourceManager.removeEventProducer(eventSource.getSourceIdentifier());
				updateWindowMenus();
			}
		}
	}

	class AccessEventSourceListener
			implements EventSourceListener<AccessEvent>
	{
		public void eventSourceAdded(EventSource<AccessEvent> eventSource)
		{
			SwingUtilities.invokeLater(new AccessSourceAddedRunnable(eventSource));
		}

		public void eventSourceRemoved(EventSource<AccessEvent> eventSource)
		{
			SwingUtilities.invokeLater(new AccessSourceRemovedRunnable(eventSource));
		}

		private class AccessSourceAddedRunnable
				implements Runnable
		{
			EventSource<AccessEvent> eventSource;

			public AccessSourceAddedRunnable(EventSource<AccessEvent> eventSource)
			{
				this.eventSource = eventSource;
			}

			public void run()
			{
				ViewContainer<AccessEvent> container = retrieveAccessViewContainer(eventSource);
				EventWrapperViewPanel<AccessEvent> panel = container.getDefaultView();
				panel.setState(LoggingViewState.ACTIVE);
				if (!applicationPreferences.isMute() && sounds != null)
				{
					sounds.play(LilithSounds.SOURCE_ADDED);
				}

				String primary = eventSource.getSourceIdentifier().getIdentifier();
				Map<String, String> sourceNames = applicationPreferences.getSourceNames();

				if (!sourceNames.containsKey(primary))
				{
					sourceNames = new HashMap<String, String>(sourceNames);
					sourceNames.put(primary, primary);
					applicationPreferences.setSourceNames(sourceNames);
				}

				if (applicationPreferences.isAutoOpening())
				{
					showAccessView(eventSource);
				}
			}
		}

		private class AccessSourceRemovedRunnable
				implements Runnable
		{
			EventSource<AccessEvent> eventSource;

			public AccessSourceRemovedRunnable(EventSource<AccessEvent> eventSource)
			{
				this.eventSource = eventSource;
			}

			public void run()
			{
				ViewContainer<AccessEvent> container = retrieveAccessViewContainer(eventSource);
				EventWrapperViewPanel<AccessEvent> panel = container.getDefaultView();
				panel.setState(LoggingViewState.INACTIVE);
				if (!applicationPreferences.isMute() && sounds != null)
				{
					sounds.play(LilithSounds.SOURCE_REMOVED);
				}
				if (applicationPreferences.isAutoClosing())
				{
					accessEventViewManager.closeViewContainer(container);
				}
				accessEventSourceManager.removeEventProducer(eventSource.getSourceIdentifier());
				updateWindowMenus();
			}
		}
	}

	public String getPrimarySourceTitle(String primary)
	{
		if (primary == null)
		{
			return null;
		}
		Map<String, String> sourceNames = applicationPreferences.getSourceNames();
		String resolvedName = sourceNames.get(primary);
		if (resolvedName != null && !resolvedName.equals(primary))
		{
			if (applicationPreferences.isShowingIdentifier())
			{
				return resolvedName + " [" + primary + "]";
			}
			else
			{
				return resolvedName;
			}
		}
		return primary;
	}

	public String getPrimarySourceTitle(SourceIdentifier identifier)
	{
		return getPrimarySourceTitle(identifier.getIdentifier());
	}

	public String getSourceTitle(SourceIdentifier identifier)
	{
		String primary = getPrimarySourceTitle(identifier);
		String secondary = identifier.getSecondaryIdentifier();
		if (secondary == null)
		{
			return primary;
		}
		return primary + " - " + secondary;
	}

	public String getLoggingSourceTitle(SourceIdentifier identifier)
	{
		return getSourceTitle(identifier) + " (Logging)";
	}

	public String getAccessSourceTitle(SourceIdentifier identifier)
	{
		return getSourceTitle(identifier) + " (Access)";
	}

	String resolveSourceTitle(ViewContainer container)
	{
		EventSource eventSource = container.getDefaultView().getEventSource();
		SourceIdentifier si = eventSource.getSourceIdentifier();

		Class clazz = container.getWrappedClass();
		String title;
		if (clazz == LoggingEvent.class)
		{
			title = getLoggingSourceTitle(si);
		}
		else
		{
			title = getAccessSourceTitle(si);
		}
		return title;
	}

	public void openUrl(URL url)
	{
		if (logger.isInfoEnabled()) logger.info("Opening URL {}. ", url);
		Runtime runtime = Runtime.getRuntime();
		String[] cmdArray = getOpenUrlCommandArray(url);
		if (cmdArray != null)
		{
			try
			{
				Process process = runtime.exec(cmdArray);
				ProcessConsumerRunnable consumer = new ProcessConsumerRunnable(process);
				Thread t = new Thread(consumer, "Open URL: " + url);
				t.setDaemon(true);
				t.start();
			}
			catch (IOException e)
			{
				if (logger.isWarnEnabled()) logger.warn("Exception while trying to open URL " + url + "!", e);
			}
		}
		else
		{
			if (logger.isInfoEnabled())
			{
				logger.info("Can't open url {} because no command is defined for the current system.", url);
			}
		}
	}

	// Windows: cmd /C start http://www.heise.de
	// Mac: open http://www.heise.de

	private static final String[] MAC_OPEN_URL_ARRAY =
			{
					"open",
					null
			};

	private static final String[] WINDOWS_OPEN_URL_ARRAY =
			{
					"cmd",
					"/C",
					"start",
					null
			};

	private String[] getOpenUrlCommandArray(URL url)
	{
		String[] result = null;
		if (isWindows)
		{
			result = new String[WINDOWS_OPEN_URL_ARRAY.length];
			System.arraycopy(WINDOWS_OPEN_URL_ARRAY, 0, result, 0, WINDOWS_OPEN_URL_ARRAY.length);
		}
		else if (isMac)
		{
			result = new String[MAC_OPEN_URL_ARRAY.length];
			System.arraycopy(MAC_OPEN_URL_ARRAY, 0, result, 0, MAC_OPEN_URL_ARRAY.length);
		}

		if (result != null)
		{
			String urlStr = url.toString();
			for (int i = 0; i < result.length; i++)
			{
				if (result[i] == null)
				{
					result[i] = urlStr;
				}
			}
		}
		return result;
	}

	void showFrame(ViewContainer container)
	{
		String title = resolveSourceTitle(container);
		ViewContainerFrame frame = new ViewContainerFrame(this, container);
		frame.setTitle(title);
		frame.setSize(800, 600);

		Windows.showWindow(frame, null, false);
		executeScrollToBottom(frame);
	}

	void showInternalFrame(ViewContainer container)
	{
		String title = resolveSourceTitle(container);
		ViewContainerInternalFrame frame = new ViewContainerInternalFrame(this, container);
		frame.setTitle(title);

		int count = desktop.getComponentCount();
		final int titleBarHeight = resolveInternalTitlebarHeight(/*frame*/);
		frame.setBounds(titleBarHeight * (count % 10), titleBarHeight * (count % 10), 640, 480);

		desktop.add(frame);

		frame.setVisible(true);
		executeScrollToBottom(frame);
	}

	public void showTaskManager()
	{
		// don't add twice
		if (taskManagerFrame.isClosed())
		{
			desktop.add(taskManagerFrame);
			desktop.validate();
		}
		if (taskManagerFrame.isIcon())
		{
			try
			{
				taskManagerFrame.setIcon(false);
			}
			catch (PropertyVetoException e)
			{
				// ignore
			}
		}
		if (!taskManagerFrame.isVisible())
		{
			taskManagerFrame.setVisible(true);
		}
		taskManagerFrame.moveToFront();
		try
		{
			taskManagerFrame.setSelected(true);
		}
		catch (PropertyVetoException e)
		{
			// ignore
		}
	}

	/**
	 * Initial scroll to bottom must be executed slightly after making it visible so
	 * it's using invokeLater, now.
	 *
	 * @param window the window that should scrollt to bottom is configured that way.
	 */
	private void executeScrollToBottom(ViewWindow window)
	{
		if (window != null)
		{
			ScrollToBottomRunnable runnable = new ScrollToBottomRunnable(window);
			SwingUtilities.invokeLater(runnable);
		}
	}

	private static class ScrollToBottomRunnable
			implements Runnable
	{
		private ViewWindow window;

		private ScrollToBottomRunnable(ViewWindow window)
		{
			this.window = window;
		}

		public void run()
		{
			ViewContainer viewContainer = window.getViewContainer();
			if (viewContainer != null)
			{
				viewContainer.scrollToEvent();
			}
		}
	}

	/**
	 * This is only a heuristic and probably won't be correct for non-metal l&f...
	 *
	 * @return the height of the internal frames titlebar...
	 */
	private int resolveInternalTitlebarHeight(/*JInternalFrame frame*/)
	{
		int result = 24;
		/*
		InternalFrameUI ui = frame.getUI();
		if(ui instanceof BasicInternalFrameUI)
		{
			BasicInternalFrameUI bui=(BasicInternalFrameUI) ui;
			result=bui.getNorthPane().getPreferredSize().height;
			if(logger.isDebugEnabled()) logger.debug("Resolved height of titlebar: {}", result);
		}
        */
		if (logger.isDebugEnabled()) logger.debug("Height of titlebar: {}", result);
		return result;
	}

	private void showApplicationPathChangedDialog()
	{
		if (logger.isInfoEnabled()) logger.info("showApplicationPathChangedDialog()");
		final Object[] options = {"Exit", "Cancel"};
		Icon icon = null;
		{
			URL url = MainFrame.class.getResource("/tango/32x32/status/dialog-warning.png");
			if (url != null)
			{
				icon = new ImageIcon(url);
			}
		}
		int result = JOptionPane.showOptionDialog(this,
				"You have changed the application path.\n" +
						"You need to restart for this change to take effect.\n\n" +
						"Exit now?",
				"Exit now?",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				icon,
				options,
				options[0]);
		if (result == 0)
		{
			exit();
		}
	}

	private void showLookAndFeelChangedDialog()
	{
		if (logger.isInfoEnabled()) logger.info("showLookAndFeelChangedDialog()");
		final Object[] options = {"Exit", "Cancel"};
		Icon icon = null;
		{
			URL url = MainFrame.class.getResource("/tango/32x32/status/dialog-warning.png");
			if (url != null)
			{
				icon = new ImageIcon(url);
			}
		}
		int result = JOptionPane.showOptionDialog(this,
				"You have changed the look & feel.\n" +
						"You need to restart for this change to take effect.\n\n" +
						"Exit now?",
				"Exit now?",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE,
				icon,
				options,
				options[0]);
		if (result == 0)
		{
			exit();
		}
	}

	public void exit()
	{
		if (applicationPreferences.isAskingBeforeQuit())
		{
			// yes, I hate apps that ask this question...
			String dialogTitle = "Exit now?";
			String message = "Are you really 100% sure that you want to quit?\nPlease do yourself a favour and think about it before you answer...\nExit now?";
			int result = JOptionPane.showConfirmDialog(this, message, dialogTitle,
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.OK_OPTION != result)
			{
				return;
			}
		}
		if (logger.isInfoEnabled()) logger.info("Exiting...");
		// this probably isn't necessary since jmdns registers a shutdown hook.
		if (senderService != null)
		{
			senderService.stop();
//			if(logger.isInfoEnabled()) logger.info("Unregistering services...");
//			// this can't be done in the shutdown hook...
//			jmDns.unregisterAllServices();
		}
		if (applicationPreferences.isCleaningLogsOnExit())
		{
			deleteInactiveLogs();
		}
		applicationPreferences.setPreviousImportPath(importFileChooser.getCurrentDirectory());
		applicationPreferences.setPreviousOpenPath(openFileChooser.getCurrentDirectory());
		applicationPreferences.flush();
		longTaskManager.shutDown();
		System.exit(0);
	}

	class ShowViewRunnable
			implements Runnable
	{
		private ViewContainer<?> container;

		public ShowViewRunnable(ViewContainer<?> container)
		{
			this.container = container;
		}

		public void run()
		{
			boolean isNew = false;
			boolean isInternal = false;
			if (container.getParent() == null)
			{
				isNew = true;
				if (!applicationPreferences.isUsingInternalFrames())
				{
					showFrame(container);
				}
				else
				{
					showInternalFrame(container);
				}
			}
			updateWindowMenus();
			ViewWindow window = container.resolveViewWindow();
			if (window instanceof ViewContainerInternalFrame)
			{
				isInternal = true;
			}

			if (isNew)
			{
				if (applicationPreferences.isAutoFocusingWindow())
				{
					window.focusWindow();
					if (isInternal)
					{
						// move mainframe to front.
						if ((getState() & Frame.ICONIFIED) != 0)
						{
							setState(Frame.NORMAL);
						}
						toFront();
					}
				}
			}
			else
			{
				// reselected existing views should *always* be focused!
				window.focusWindow();
				if (isInternal)
				{
					// move mainframe to front.
					toFront();
				}
			}
		}
	}


	private class PreferencesChangeListener
			implements PropertyChangeListener
	{

		@SuppressWarnings({"unchecked"})
		public void propertyChange(PropertyChangeEvent evt)
		{
			String propName = evt.getPropertyName();

			if (ApplicationPreferences.SOUND_LOCATIONS_PROPERTY.equals(propName))
			{
				if (sounds != null)
				{
					sounds.setSoundLocations((Map<String, String>) evt.getNewValue());
				}
				return;
			}

			if (ApplicationPreferences.SOURCE_NAMES_PROPERTY.equals(propName)
					|| ApplicationPreferences.SHOWING_IDENTIFIER_PROPERTY.equals(propName))
			{
				updateSourceTitles();
				return;
			}

			if (ApplicationPreferences.SOURCE_FILTERING_PROPERTY.equals(propName))
			{
				updateStatus();
				return;
			}

			if (ApplicationPreferences.MUTE_PROPERTY.equals(propName))
			{
				if (sounds != null)
				{
					sounds.setMute((Boolean) evt.getNewValue());
				}
				return;
			}

			if (ApplicationPreferences.APPLICATION_PATH_PROPERTY.equals(propName))
			{
				File newPath = (File) evt.getNewValue();
				File oldPath = applicationPreferences.getStartupApplicationPath();
				if (oldPath != null)
				{
					File previousApplicationPathFile = new File(newPath, ApplicationPreferences.PREVIOUS_APPLICATION_PATH_FILENAME);
					FileWriter writer = null;
					try
					{
						writer = new FileWriter(previousApplicationPathFile);
						writer.append(oldPath.getAbsolutePath());
					}
					catch (IOException ex)
					{
						if (logger.isWarnEnabled())
						{
							logger
									.warn("Exception while writing previous application path to file '" + previousApplicationPathFile
											.getAbsolutePath() + "'!", ex);
						}
					}
					finally
					{
						IOUtils.closeQuietly(writer);
					}
				}
				showApplicationPathChangedDialog();
				return;
			}

			if (ApplicationPreferences.LOOK_AND_FEEL_PROPERTY.equals(propName))
			{
				showLookAndFeelChangedDialog();
				return;
			}

			if (ApplicationPreferences.CONDITIONS_PROPERTY.equals(propName))
			{
				updateConditions();
				return;
			}

			if (ApplicationPreferences.LEVEL_COLORS_PROPERTY.equals(propName))
			{
				levelColors = null;
				updateLoggingViews();
				return;
			}

			if (ApplicationPreferences.STATUS_COLORS_PROPERTY.equals(propName))
			{
				statusColors = null;
				updateAccessViews();
				return;
			}

			if (ApplicationPreferences.SHOWING_FULL_CALLSTACK_PROPERTY.equals(propName))
			{
				updateLoggingViews();
				return;
			}

			if (ApplicationPreferences.SHOWING_STACKTRACE_PROPERTY.equals(propName))
			{
				updateLoggingViews();
				//return;
			}

			if (ApplicationPreferences.COLORING_WHOLE_ROW_PROPERTY.equals(propName))
			{
				coloringWholeRow = applicationPreferences.isColoringWholeRow();
				updateLoggingViews();
				//return;
			}
		}

		private void updateSourceTitles()
		{
			updateWindowMenus();
			Map<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> loggingViews = loggingEventViewManager
					.getViews();
			for (Map.Entry<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> current : loggingViews.entrySet())
			{
				ViewContainer<LoggingEvent> value = current.getValue();
				ViewWindow window = value.resolveViewWindow();
				if (window != null)
				{
					String title = resolveSourceTitle(value);
					window.setTitle(title);
				}
			}
			Map<EventSource<AccessEvent>, ViewContainer<AccessEvent>> accessViews = accessEventViewManager.getViews();
			for (Map.Entry<EventSource<AccessEvent>, ViewContainer<AccessEvent>> current : accessViews.entrySet())
			{
				ViewContainer<AccessEvent> value = current.getValue();
				ViewWindow window = value.resolveViewWindow();
				if (window != null)
				{
					String title = resolveSourceTitle(value);
					window.setTitle(title);
				}
			}
		}
	}

	private void updateConditions()
	{
		List<SavedCondition> conditions = applicationPreferences.getConditions();
		List<SavedCondition> active = new ArrayList<SavedCondition>();
		if (conditions != null)
		{
			for (SavedCondition current : conditions)
			{
				if (current.isActive())
				{
					active.add(current);
				}
			}
		}
		activeConditions = active;
		//flushCachedConditionResults();

		updateAllViews();
	}

	private void updateLoggingViews()
	{
		Map<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> loggingViews = loggingEventViewManager.getViews();
		for (Map.Entry<EventSource<LoggingEvent>, ViewContainer<LoggingEvent>> current : loggingViews.entrySet())
		{
			ViewContainer<LoggingEvent> value = current.getValue();
			value.updateViews();
		}
	}

	private void updateAccessViews()
	{
		Map<EventSource<AccessEvent>, ViewContainer<AccessEvent>> accessViews = accessEventViewManager.getViews();
		for (Map.Entry<EventSource<AccessEvent>, ViewContainer<AccessEvent>> current : accessViews.entrySet())
		{
			ViewContainer<AccessEvent> value = current.getValue();
			value.updateViews();
		}
	}

	private void updateAllViews()
	{
		updateLoggingViews();
		updateAccessViews();
	}

	/*
	 private void flushCachedConditionResults()
	 {
		 colorsCache.clear();
	 }
 */
	public void cleanObsoleteFiles()
	{
		File obsoleteDir = new File(startupApplicationPath, "sources");
		if (obsoleteDir.isDirectory())
		{
			longTaskManager
					.startTask(new CleanObsoleteCallable(obsoleteDir), "Clean obsolete files", "Deletes the directory '" + obsoleteDir
							.getAbsolutePath() + "' recursively.");
		}
	}

	public void deleteInactiveLogs()
	{
		deleteInactiveLogs(loggingFileFactory);
		deleteInactiveLogs(accessFileFactory);
	}

	protected void deleteInactiveLogs(LogFileFactory fileFactory)
	{
		List<SourceIdentifier> inactives = collectInactiveLogs(fileFactory);
		for (SourceIdentifier si : inactives)
		{
			File dataFile = fileFactory.getDataFile(si);
			File indexFile = fileFactory.getIndexFile(si);
			if (dataFile.delete())
			{
				if (logger.isInfoEnabled()) logger.info("Deleted {}", dataFile);
			}
			if (indexFile.delete())
			{
				if (logger.isInfoEnabled()) logger.info("Deleted {}", indexFile);
			}
		}
	}

	public List<SourceIdentifier> collectInactiveLogs(LogFileFactory fileFactory)
	{
		List<SourceIdentifier> result = new ArrayList<SourceIdentifier>();
		File logsRoot = fileFactory.getBaseDir();
		File[] sources = logsRoot.listFiles(new DirectoryFilter());
		if (sources != null)
		{
			for (File f : sources)
			{
				collectInactiveLogs(fileFactory, f, result);
			}
			if (logger.isDebugEnabled()) logger.debug("Inactive logs: {}", result);
		}
		return result;
	}

	private void collectInactiveLogs(LogFileFactory fileFactory, File sourceDir, List<SourceIdentifier> inactiveLogs)
	{
		String primary = sourceDir.getName();

		File[] logs = sourceDir.listFiles(new LogFileFilter(fileFactory));
		String extension = fileFactory.getDataFileExtension();
		for (File f : logs)
		{
			String abs = f.getAbsolutePath();
			abs = abs.substring(0, abs.length() - extension.length());
			File active = new File(abs + FileConstants.ACTIVE_FILE_EXTENSION);
			if (!active.isFile())
			{
				String secondary = f.getName();
				secondary = secondary.substring(0, secondary.length() - extension.length());
				inactiveLogs.add(new SourceIdentifier(primary, secondary));
			}
		}
	}

	public void copyText(String text)
	{
		Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable transferableText = new StringSelection(text);
		systemClipboard.setContents(transferableText, null);
	}

	public class EventSourceComparator<T extends Serializable>
			implements Comparator<EventSource<T>>
	{
		public int compare(EventSource<T> o1, EventSource<T> o2)
		{
			if (o1 == o2)
			{
				return 0;
			}
			if (o1 == null)
			{
				return -1;
			}
			if (o2 == null)
			{
				return 1;
			}
			SourceIdentifier si1 = o1.getSourceIdentifier();
			SourceIdentifier si2 = o2.getSourceIdentifier();
			if (si1 == si2)
			{
				return 0;
			}
			if (si1 == null)
			{
				return -1;
			}
			if (si2 == null)
			{
				return 1;
			}

			String primary1 = getPrimarySourceTitle(si1);
			String primary2 = getPrimarySourceTitle(si2);
			if (primary1 != null && primary2 != null)
			{
				int compare = primary1.compareTo(primary2);
				if (compare != 0)
				{
					return compare;
				}
			}
			return o1.compareTo(o2);
		}
	}

	private class MainWindowListener
			extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent e)
		{
			exit();
		}
	}

	private class ShutdownRunnable
			implements Runnable
	{
		public void run()
		{
			if (logger.isInfoEnabled()) logger.info("Executing shutdown hook...");
			if (gotoSource != null)
			{
				gotoSource.stop();
				gotoSource = null;
			}
			for (AutostartRunnable current : autostartProcesses)
			{
				current.destroyProcess();
			}
			if (logger.isInfoEnabled()) logger.info("Finished executing shutdown hook...");
		}
	}


	public static class AutostartRunnable
			implements Runnable
	{
		private final Logger logger = LoggerFactory.getLogger(MainFrame.class);

		private File file;
		private Process process;

		public AutostartRunnable(File file)
		{
			this.file = file;
		}

		public void destroyProcess()
		{
			if (process != null)
			{
				process.destroy();
			}
		}

		public void run()
		{
			try
			{
				if (logger.isInfoEnabled()) logger.info("Starting '{}'.", file.getAbsolutePath());
				process = Runtime.getRuntime().exec(file.getAbsolutePath());

				Thread errThread = new Thread(new ErrorConsumerRunnable(process.getErrorStream()));
				errThread.setDaemon(true);
				errThread.start();

				Thread outThread = new Thread(new OutConsumerRunnable(process.getInputStream()));
				outThread.setDaemon(true);
				outThread.start();

				int exitCode = process.waitFor();
				if (logger.isInfoEnabled())
				{
					logger.info("Execution of '{}' finished with exitCode {}.", file.getAbsolutePath(), exitCode);
				}
			}
			catch (IOException e)
			{
				if (logger.isWarnEnabled())
				{
					logger.warn("Exception while executing '" + file.getAbsolutePath() + "'!", e);
				}
			}
			catch (InterruptedException e)
			{
				if (logger.isDebugEnabled())
				{
					logger.debug("Execution of '" + file.getAbsolutePath() + "' was interrupted.", e);
				}
			}
		}

		abstract class AbstractOutputConsumerRunnable
				implements Runnable
		{
			private BufferedReader inputReader;

			public AbstractOutputConsumerRunnable(InputStream input)
			{
				inputReader = new BufferedReader(new InputStreamReader(input));
			}

			public void run()
			{
				try
				{

					for (; ;)
					{
						String line = inputReader.readLine();
						if (line == null)
						{
							break;
						}
						processLine(line);
					}

				}
				catch (IOException e)
				{
					if (logger.isDebugEnabled())
					{
						logger.debug("Exception while reading from process '" + file.getAbsolutePath() + "'.", e);
					}
				}
			}

			public abstract void processLine(String line);
		}

		private class OutConsumerRunnable
				extends AbstractOutputConsumerRunnable
		{
			public OutConsumerRunnable(InputStream input)
			{
				super(input);
			}

			public void processLine(String line)
			{
				if (logger.isInfoEnabled()) logger.info("{}: {}", file.getAbsolutePath(), line);
			}
		}

		private class ErrorConsumerRunnable
				extends AbstractOutputConsumerRunnable
		{
			public ErrorConsumerRunnable(InputStream input)
			{
				super(input);
			}

			public void processLine(String line)
			{
				System.err.println(file.getAbsolutePath() + ": " + line);
			}
		}

	}

	public static class ProcessConsumerRunnable
			implements Runnable
	{
		private final Logger logger = LoggerFactory.getLogger(MainFrame.class);

		private Process process;

		public ProcessConsumerRunnable(Process process)
		{
			this.process = process;
		}

		public void destroyProcess()
		{
			if (process != null)
			{
				process.destroy();
			}
		}

		public void run()
		{
			try
			{
				Thread errThread = new Thread(new ErrorConsumerRunnable(process.getErrorStream()));
				errThread.setDaemon(true);
				errThread.start();

				Thread outThread = new Thread(new OutConsumerRunnable(process.getInputStream()));
				outThread.setDaemon(true);
				outThread.start();

				int exitCode = process.waitFor();
				if (logger.isDebugEnabled()) logger.debug("Execution finished with exitCode {}.", exitCode);
			}
			catch (InterruptedException e)
			{
				if (logger.isDebugEnabled()) logger.debug("Execution of openUrl process was interrupted.", e);
			}
		}

		abstract class AbstractOutputConsumerRunnable
				implements Runnable
		{
			private BufferedReader inputReader;

			public AbstractOutputConsumerRunnable(InputStream input)
			{
				inputReader = new BufferedReader(new InputStreamReader(input));
			}

			public void run()
			{
				try
				{

					for (; ;)
					{
						String line = inputReader.readLine();
						if (line == null)
						{
							break;
						}
						processLine(line);
					}

				}
				catch (IOException e)
				{
					if (logger.isDebugEnabled()) logger.debug("Exception while reading from openUrl process.", e);
				}
			}

			public abstract void processLine(String line);
		}

		private class OutConsumerRunnable
				extends AbstractOutputConsumerRunnable
		{
			public OutConsumerRunnable(InputStream input)
			{
				super(input);
			}

			public void processLine(String line)
			{
				if (logger.isDebugEnabled()) logger.debug("{}", line);
			}
		}

		private class ErrorConsumerRunnable
				extends AbstractOutputConsumerRunnable
		{
			public ErrorConsumerRunnable(InputStream input)
			{
				super(input);
			}

			public void processLine(String line)
			{
				System.err.println("openUrl: " + line);
			}
		}

	}

	private class CheckForUpdateRunnable
			implements Runnable
	{
		private boolean showAlways;

		public CheckForUpdateRunnable(boolean showAlways)
		{
			this.showAlways = showAlways;
		}

		public void run()
		{
			final String url = "http://lilith.huxhorn.de/current-version.txt";
			// Create an instance of HttpClient.
			HttpClient client = new HttpClient();

			// Create a method instance.
			GetMethod method = new GetMethod(url);

			// Provide custom retry handler is necessary
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
					new DefaultHttpMethodRetryHandler(3, false));

			String currentVersion = null;
			try
			{
				// Execute the method.
				int statusCode = client.executeMethod(method);

				// lets use our HttpStatus instead...
				if (statusCode != HttpStatus.OK.getCode())
				{
					System.err.println("Method failed: " + method.getStatusLine());
				}

				// Read the response body.
				byte[] responseBody = method.getResponseBody();
				String charSet = method.getResponseCharSet();

				currentVersion = new String(responseBody, charSet);
			}
			catch (Throwable e)
			{
				if (logger.isInfoEnabled()) logger.info("Exception while checking current version!", e);
			}
			finally
			{
				// Release the connection.
				method.releaseConnection();
			}

			String message;
			boolean newVersion = false;
			if (currentVersion == null)
			{
				message = "Couldn't retrieve current version!";
			}
			else
			{
				currentVersion = currentVersion.trim();
				if (!currentVersion.equals(Lilith.APP_VERSION))
				{
					message = "New version is available: " + currentVersion;
					newVersion = true;
				}
				else
				{
					message = "Your version is up to date.";
				}
			}
			if (logger.isInfoEnabled()) logger.info("Message: {}, newVersion: {}", message, newVersion);
			if (newVersion || showAlways)
			{
				SwingUtilities.invokeLater(new ShowUpdateDialog(message));
			}
		}
	}

	private class ShowUpdateDialog
			implements Runnable
	{
		private String message;

		public ShowUpdateDialog(String message)
		{
			this.message = message;
		}

		public void run()
		{
			MainFrame.this.showUpdateDialog(message);
		}
	}

	private void showUpdateDialog(String message)
	{
		JOptionPane.showMessageDialog(this, message, "Check for update...", JOptionPane.INFORMATION_MESSAGE);
		// TODO: Improve update available dialog

	}

	/*
		private class ColorsCollectionRunnable
			implements Runnable
		{
			private final Logger logger = LoggerFactory.getLogger(ColorsCollectionRunnable.class);

			public void run()
			{
				for(;;)
				{
					try
					{
						SoftColorsReference ref= (SoftColorsReference) colorsReferenceQueue.remove();
						EventIdentifier id = ref.getId();
						colorsCache.remove(id);
						if(logger.isDebugEnabled()) logger.debug("Removed cached color for {}.", id);
					}
					catch (InterruptedException e)
					{
						break;
					}
				}
			}
		}
		*/
	private class MainTaskListener
			implements TaskListener<Long>
	{
		public void taskCreated(Task<Long> longTask)
		{
			updateTaskStatus();
		}

		public void executionFailed(Task<Long> longTask, ExecutionException exception)
		{
			updateTaskStatus();
		}

		public void executionFinished(Task<Long> longTask, Long result)
		{
			updateTaskStatus();
			Callable<Long> callable = longTask.getCallable();

			if (callable instanceof IndexingCallable)
			{
				IndexingCallable iCallable = (IndexingCallable) callable;
				File dataFile = iCallable.getDataFile();
				File indexFile = iCallable.getIndexFile();
				createViewFor(dataFile, indexFile);
				return;
			}
			if (callable instanceof Log4jImportCallable)
			{
				Log4jImportCallable iCallable = (Log4jImportCallable) callable;
				AppendOperation<EventWrapper<LoggingEvent>> buffer = iCallable.getBuffer();
				if (buffer instanceof CodecFileBuffer)
				{
					CodecFileBuffer cfb = (CodecFileBuffer) buffer;
					File dataFile = cfb.getDataFile();
					File indexFile = cfb.getIndexFile();
					cfb.dispose();
					createViewFor(dataFile, indexFile);
				}
				return;
			}
			if (callable instanceof JulImportCallable)
			{
				JulImportCallable iCallable = (JulImportCallable) callable;
				AppendOperation<EventWrapper<LoggingEvent>> buffer = iCallable.getBuffer();
				if (buffer instanceof CodecFileBuffer)
				{
					CodecFileBuffer cfb = (CodecFileBuffer) buffer;
					File dataFile = cfb.getDataFile();
					File indexFile = cfb.getIndexFile();
					cfb.dispose();
					createViewFor(dataFile, indexFile);
				}
			}
		}

		public void executionCanceled(Task<Long> longTask)
		{
			updateTaskStatus();
		}

		public void progressUpdated(Task<Long> longTask, int progress)
		{
			updateTaskStatus();
		}
	}
}
