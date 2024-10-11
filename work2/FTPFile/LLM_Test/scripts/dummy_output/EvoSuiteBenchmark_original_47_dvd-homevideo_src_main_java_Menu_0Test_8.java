// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#init()} method.
*/
class Menu_0Test {
		boolean test = true;
	public void initMenu() {
		MenuTest();
	}
	public void MenuTest() {
		boolean result=true;
		if(!test) {
			System.out.println("\n\nPlease Run the following...");
			System.out
			.println((result?"Congratulations! You will be successful in the entire menu in the console."
				   :"Not successful yet. Please retry after you make a new menu"));
		}

}
}