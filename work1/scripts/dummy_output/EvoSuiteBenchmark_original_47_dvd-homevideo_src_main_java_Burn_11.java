// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		private boolean testSuccess = true;
		private BufferedReader reader = null;
		private BufferedWriter writer = null;
		private GUIDVD_GUIDVD DVD;
		private File baseDir = null;
		private String[] args = null;
	
	public BurnTest() {

		System.out.println("BurnTest()");
		
		this.DVD = new GUIDVDFile();
		DVD.setTitle("BurnTest");
		
		this.DVD.setName("test_DVD");
		System.out.println("BurnTest title: "+DVD.title);
		this.DVD.setIcon(ImageUtilities.getImage(ImageUtilities.TRAKNOE));
		System.out.println("BurnTestIcon: "+ DVD.icon);
		
		this.DVD.setHomepath("D:\\t");
		System.out.println("BurnTest Homepath: "+ DVD.homepath);

		baseDir = new File("temp");
		testSuccess = this.DVD.burnToDVD();
		
		
		args = DVD.getBurnArgs();
		
		this.DVD.setBurnArgs(args);
		this.DVD.saveToFile("dvd-dvd");
		this.DVD.saveToFile("dvd-dvdup");
		this.DVD.saveToFile("D:\\test\\dvd.temp");
		this.DVD.saveToFile("D:\\test\\dvdup\\");
		args = this.DVD.getBurnArgsArray();
	}

	public boolean burnToDVD() {
		int k = 0;
		if(this.DVD.getBurnCount() > 0) {
			k = 0;
			while(k < DVD.getBurnCount() && this.DVD.temp[k] == '/') k++;	
		}
		this.testSuccess = (k == 0);
		
		if(!runDVDFROM(DVD, 0))
			assertTrue(false);
		
		return this.testSuccess;
	}
	
	
	public String runDVDFROM(GUIDVD_GUIDVD DVD) {
		String[] args = DVD.getBurnArgs();
	 	DVD.setBurnArgs(args);
	 	
	 	
	 	File burner = new File("temp");	 	
	 	
	 	if (!burner.mkdir()) {
	 		System.out.println("BurnTest: dir not created");
	 	}
	 	
	 	
	 	args = args.clone();
}
}