// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

		private final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' does not exist.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_1() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is not a file.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_2() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_3() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_4() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_5() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_6() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_7() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_8() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_9() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_10() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
}

// IndexingTask.java
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
package de.huxhorn.lilith.swing.taskmanager;

import de.huxhorn.lilith.swing.taskmanager.TaskStatus.State;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import de.huxhorn.sulky.tasks.Task;
import de.huxhorn.sulky.tasks.TaskListener;
import de.huxhorn.sulky.tasks.TaskManager;
import de.huxhorn.sulky.tasks.TaskProgressListener;
import de.huxhorn.sulky.tasks.TaskSchedule;
import de.huxhorn.sulky.tasks.TaskStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Task that wraps a Callable.
 *
 * @param &lt;V&gt; the result type of method {@code call}
 */
public class IndexingTask&lt;V&gt;
		implements Task&lt;V&gt;
{
	private final Logger logger = LoggerFactory.getLogger(IndexingTask.class);

	private final TaskManager taskManager;
	private final Callable&lt;V&gt; callable;
	private final TaskStatus status;
	private final TaskSchedule schedule;
	private final TaskListener taskListener;
	private final TaskProgressListener progressListener;

	public IndexingTask(TaskManager taskManager, Callable&lt;V&gt; callable, TaskSchedule schedule)
	{
		this.taskManager = taskManager;
		this.callable = callable;
		this.schedule = schedule;
		this.status = new TaskStatus();
		this.taskListener = new TaskListener()
		{
			public void statusChanged(TaskStatus newStatus)
			{
				status.setState(newStatus.getState());
				status.setException(newStatus.getException());
				status.setResult(newStatus.getResult());
				status.setProgress(newStatus.getProgress());
				status.setProgressMax(newStatus.getProgressMax());
				status.setProgressMessage(newStatus.getProgressMessage());
				status.setProgressNote(newStatus.getProgressNote());
				status.setProgressPercent(newStatus.getProgressPercent());
				status.setProgressWeight(newStatus.getProgressWeight());
				status.setStartTime(newStatus.getStartTime());
				status.setStopTime(newStatus.getStopTime());
				status.setDescription(newStatus.getDescription());
				status.setName(newStatus.getName());
				status.setSchedule(newStatus.getSchedule());
				status.setTask(newStatus.getTask());
				status.setTaskManager(newStatus.getTaskManager());
			}
		};
		this.progressListener = new TaskProgressListener()
		{
			public void progressChanged(TaskStatus newStatus)
			{
				status.setProgress(newStatus.getProgress());
				status.setProgressMax(newStatus.getProgressMax());
				status.setProgressMessage(newStatus.getProgressMessage());
				status.setProgressNote(newStatus.getProgressNote());
				status.setProgressPercent(newStatus.getProgressPercent());
				status.setProgressWeight(newStatus.getProgressWeight());
			}
		};
	}

	public TaskStatus getStatus()
	{
		return status;
	}

	public TaskSchedule getSchedule()
	{
		return schedule;
	}

	public TaskManager getTaskManager()
	{
		return taskManager;
	}

	public void cancel()
	{
		taskManager.cancel(this);
	}

	public void execute()
	{
		taskManager.execute(this);
	}

	public void execute(TaskListener listener)
	{
		taskManager.execute(this, listener);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener)
	{
		taskManager.execute(this, listener, progressListener);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately)
	{
		taskManager.execute(this, listener, progressListener, startImmediately);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause, boolean autoResume)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause, autoResume);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause, boolean autoResume, boolean autoSuspend)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause, autoResume, autoSuspend);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause, boolean autoResume, boolean autoSuspend, boolean autoStop)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause, autoResume, autoSuspend, autoStop);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause, boolean autoResume, boolean autoSuspend, boolean autoStop, boolean autoStart)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause, autoResume, autoSuspend, autoStop, autoStart);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener, boolean startImmediately, boolean autoRemove, boolean autoDispose, boolean autoCancel, boolean autoRestart, boolean autoPause, boolean autoResume, boolean autoSuspend, boolean autoStop, boolean autoStart, boolean autoIndex)
	{
		taskManager.execute(this, listener, progressListener, startImmediately, autoRemove, autoDispose, autoCancel, autoRestart, autoPause, autoResume, autoSuspend, autoStop, autoStart, autoIndex);
	}

	public void execute(TaskListener listener, TaskProgressListener progressListener