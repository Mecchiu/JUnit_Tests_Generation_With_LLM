// ModifyCatalogQueueEntryActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.FileLocator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyCatalogQueueEntryAction}.
* It contains one unit test case for the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyCatalogQueueEntryActionTest {
		public final String fileSource = "file";
		public final String sourceLocation = "sourceLocation";

		public final String destinationLocation = "destinationLocation";
		public final String fileName = "fileName";


		/////////////////////////////////////////////////////////////////
		// Method: action RequiresLogin
		//
		/**
		 * @return <code>false</code>
		 * @see org.heal.servlet.cataloger.ModifyCatalogQueueEntryAction.actionRequiresLogin()
		*/
		@Test
		public boolean actionRequiresLogin() {
			return true;
		}

		/////////////////////////////////////////////////////////////////
		// Method: perform
		//
		@Test
		public void performTest() throws SQLException, IOException, FileNotFoundException {

			AuthenticationTools tools = new AuthenticationTools(AuthenticationTools.DEFAULT_USER_NAME);
			tools.insertTo(MetadataDAO.class);
			tools.insertTo(QueueDAO.class);

			// The "fileSource" parameter is used to retrieve the temporary destination location for the file.
			String destLocation = FileLocator.getTempFile("catalogQueue", fileName);

			// We are going to use the first "sourceLocation" to construct, i.e. the location of the file we want to create.
			String sSourceLocation = SourceLocation.class.getDeclaredMethod("getFileSource", String.class).invoke(SourceLocation.class, sourceLocation);

			// We are going to use the second "destLocation" which contains the file we want to add
			String sDestLocation = FileLocator.getTempFile(destinationLocation, fileSource);

			// We are going to use the third "sDestLocation"
			String sDestName = FileLocator.getTempFile(DestinationLocation.class.getDeclaredMethod("getFileName").invoke(DestinationLocation.class), destinationLocation.concat("_3").concat(destinationLocation));


			// The sourceLocation is specified in the config file
			String destFilename = destLocation.concat(fileName);
			String sDestFilename = null;

			// The destinationLocation is specified in the config file
			String destFileName = destDescription.concat(fileName) + ".";

			File dest = new File(destLocation);

			File destCopy = new File(destLocation);

			long lastAccessTime = getLastAccessTime(dest);

			// copy the file
			FileChannel srcFileChannel = new FileInputStream(sSourceLocation).getChannel();
			FileChannel destFileChannel = new FileOutputStream(destDestination).getChannel();

			//copy the file
			copyFile(srcFileChannel, destFileChannel);

			// set the last access time
			setLastAccessTime(dest, lastAccessTime);

			// set the file name
			destFileName = destDescription.concat(fileName);

			// add a new version of the file
			ShortMetadataBean newMetadata = shortMetadataDAO.create(destFilename);
			QueueDAO queueDAO = new QueueDAO();
			queueDAO.updateQueue(newMetadata);

			// set the new description
			setDescription(destFileName, newMetadata.getDescription());

			//setLastUpdate(sourceLocation, lastAccessTime);

			// Set the new name of the file.
			newMetadata.setName(newMetadata.getName()
				.concat(destFileName)
				.concat(destDescription.concat(fileName).concat(destDescription.concat(destDescrption).concat(destFilename))));

			queueDAO.updateQueue(newMetadata);

			// Set the file size
			destDescrption = FileLocator.getTempFile(destDescription.concat("newFile" + destFilename).concat(destFilename)
				.concat(destDescription.concat(fileName).concat(destDescription.concat(destFilename))), destFilename);

            File destNewFile;
            long newFileSize;
            try {
                destNewFile = new File(destFilename);
                newFileSize = destNewFile.length();
                queueDAO.updateQueue(newQueueBean(destFilename, newFileSize));
            } catch (IOException ioException) {
                ioException.printStackTrace();
                System.exit(1);
                return;
            }

            // Move the file to the next location
            dest = dest.getParentFile();
            FileChannel destChannel = new FileInputStream(dest).getChannel();
            destFile = dest.getParentFile();

            // Move the file to the next location
            if (dest!= dest.getParentFile()) {
                dest = dest.getParentFile();
            }
            destChannel = new FileInputStream(dest).getChannel();
            destDir = dest.getParentFile();

            boolean result = false;
            boolean deleted = true;

            for (int i = 0; i < 100; i++) {
                result = dest.delete();
                destChannel.close();
                destFileChannel.close();
                destDir.delete();

                if (result) {
                    break;
                }
                deleted = false;
            }

}
}