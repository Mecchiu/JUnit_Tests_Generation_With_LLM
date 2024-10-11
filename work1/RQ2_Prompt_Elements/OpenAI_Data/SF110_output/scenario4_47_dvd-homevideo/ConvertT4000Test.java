// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains ten unit test cases for the {@link Convert#init()} method.
*/
class ConvertTest {

	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit2() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit3() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit4() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit5() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit6() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit7() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit8() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns true.
	*/
	@Test
	void testInit9() {
		Convert convert = new Convert();
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the {@link Convert#init()} method returns false.
	*/
	@Test
	void testInit10() {
		Convert convert = new Convert();
		assertFalse(convert.init());
	}
}

// DVD.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;

/**
 * @author Shane Santner
 * This class is used to create the DVD structure.  It
 * creates the directories and files that are required
 * to create a DVD.  It also creates the DVD menu.
 */
public class DVD {

    /**
     * Creates a new instance of DVD
     * @param   DVD_GUI     This is the GUI object used to control the form
     */
    public DVD(GUI DVD_GUI) {
    }

    /**
     * DVD Member Variables
     */
    private GUI m_GUI;

    private Thread m_Thread;

    private boolean m_Error;

    private int thread_track;

    private String m_BaseErr = "DVD Creation Error - ";

    private String m_DVD_dir = "DVD";

    private String m_VIDEO_TS = "VIDEO_TS";

    private String m_AUDIO_TS = "AUDIO_TS";

    private String m_VTS_01_0 = "VTS_01_0.IFO";

    private String m_VTS_01_1 = "VTS_01_1.VOB";

    private String m_VTS_01_2 = "VTS_01_2.VOB";

    private String m_VTS_01_3 = "VTS_01_3.VOB";

    private String m_VTS_01_4 = "VTS_01_4.VOB";

    private String m_VTS_01_5 = "VTS_01_5.VOB";

    private String m_VTS_01_6 = "VTS_01_6.VOB";

    private String m_VTS_01_7 = "VTS_01_7.VOB";

    private String m_VTS_01_8 = "VTS_01_8.VOB";

    private String m_VTS_01_9 = "VTS_01_9.VOB";

    private String m_VTS_01_10 = "VTS_01_10.VOB";

    private String m_VTS_01_11 = "VTS_01_11.VOB";

    private String m_VTS_01_12 = "VTS_01_12.VOB";

    private String m_VTS_01_13 = "VTS_01_13.VOB";

    private String m_VTS_01_14 = "VTS_01_14.VOB";

    private String m_VTS_01_15 = "VTS_01_15.VOB";

    private String m_VTS_01_16 = "VTS_01_16.VOB";

    private String m_VTS_01_17 = "VTS_01_17.VOB";

    private String m_VTS_01_18 = "VTS_01_18.VOB";

    private String m_VTS_01_19 = "VTS_01_19.VOB";

    private String m_VTS_01_20 = "VTS_01_20.VOB";

    private String m_VTS_01_21 = "VTS_01_21.VOB";

    private String m_VTS_01_22 = "VTS_01_22.VOB";

    private String m_VTS_01_23 = "VTS_01_23.VOB";

    private String m_VTS_01_24 = "VTS_01_24.VOB";

    private String m_VTS_01_25 = "VTS_01_25.VOB";

    private String m_VTS_01_26 = "VTS_01_26.VOB";

    private String m_VTS_01_27 = "VTS_01_27.VOB";

    private String m_VTS_01_28 = "VTS_01_28.VOB";

    private String m_VTS_01_29 = "VTS_01_29.VOB";

    private String m_VTS_01_30 = "VTS_01_30.VOB";

    private String m_VTS_01_31 = "VTS_01_31.VOB";

    private String m_VTS_01_32 = "VTS_01_32.VOB";

    private String m_VTS_01_33 = "VTS_01_33.VOB";

    private String m_VTS_01_34 = "VTS_01_34.VOB";

    private String m_VTS_01_35 = "VTS_01_35.VOB";

    private String m_VTS_01_36 = "VTS_01_36.VOB";

    private String m_VTS_01_37 = "VTS_01_37.VOB";

    private String m_VTS_01_38 = "VTS_01_38.VOB";

    private String m_VTS_01_39 = "VTS_01_39.VOB";

    private String m_VTS_01_40 = "VTS_01_40.VOB";

    private String m_VTS_01_41 = "VTS_01_41.VOB";

    private String m_VTS_01_42 = "VTS_01_42.VOB";

    private String m_VTS_01_43 = "VTS_01_43.VOB";

    private String m_VTS_01_44 = "VTS_01_44.VOB";

    private String m_VTS_01_45 = "VTS_01_45.VOB";

    private String m_VTS_01_46 = "VTS_01_46.VOB";

    private String m_VTS_01_47 = "VTS_01_47.VOB";

    private String m_VTS_01_48 = "VTS_01_48.VOB";

    private String m_VTS_01_49 = "VTS_01_49.VOB";

    private String m_VTS_01_50 = "VTS_01_50.VOB";

    private String m_VTS_01_51 = "VTS_01_51.VOB";

    private String m_VTS_01_52 = "VTS_01_52.VOB";

    private String m_VTS_01_53 = "VTS_01_53.VOB";

    private String m_VTS_01_54 = "VTS_01_54.VOB";

    private String m_VTS_01_55 = "VTS_01_55.VOB";

    private String m_VTS_01_56 = "VTS_01_56.VOB";

    private String m_VTS_01_57 = "VTS_01_57.VOB";

    private String m_VTS_01_58 = "VTS_01_58.VOB";

    private String m_VTS_01_59 = "VTS_01_59.VOB";

    private String m_VTS_01_60 = "VTS_01_60.VOB";

    private String m_VTS_01_61 = "VTS_01_61.VOB";

    private String m_VTS_01_62 = "VTS_01_62.VOB";

    private String m_VTS_01_63 = "VTS_01_63.VOB";

    private String m_VTS_01_64 = "VTS_01_64.VOB";

    private String m_VTS_01_65 = "VTS_01_65.VOB";

    private String m_VTS_01_66 = "VTS_01_66.VOB";

    private String m_VTS_01_67 = "VTS_01_67.VOB";

    private String m_VTS_01_68 = "VTS_01_68.VOB";

    private String m_VTS_01_69 = "VTS_01_69.VOB";

    private String m_VTS_01_70 = "VTS_01_70.VOB";

    private String m_VTS_01_71 = "VTS_01_71.VOB";

    private String m_VTS_01_72 = "VTS_01_72.VOB";

    private String m_VTS_01_73 = "VTS_01_73.VOB";

    private String m_VTS_01_74 = "VTS_01_74.VOB";

    private String m_VTS_01_75 = "VTS_01_75.VOB";

    private String m_VTS_01_76 = "VTS_01_76.VOB";

    private String m_VTS_01_77 = "VTS_01_77.VOB";

    private String m_VTS_01_78 = "VTS_01_78.VOB";

    private String m_VTS_01_79 = "VTS_01_79.VOB";

    private String m_VTS_01_80 = "VTS_01_80.VOB";

    private String m_VTS_01_81 = "VTS_01_81.VOB";

    private String m_VTS_01_82 = "VTS_01_82.VOB";

    private String m_VTS_01_83 = "VTS_01_83.VOB";

    private String m_VTS_01_84 = "VTS_01_84.VOB";

    private String m_VTS_01_85 = "VTS_01_85.VOB";

    private String m_VTS_01_86 = "VTS_01_86.VOB";

    private String m_VTS_01_87 = "VTS_01_87.VOB";

    private String m_VTS_01_88 = "VTS_01_88.VOB";

    private String m_VTS_01_89 = "VTS_01_89.VOB";

    private String m_VTS_01_90 = "VTS_01_90.VOB";

    private String m_VTS_01_91 = "VTS_01_91.VOB";

    private String m_VTS_01_92 = "VTS_01_92.VOB";

    private String m_VTS_01_93 = "VTS_01_93.VOB";

    private String m_VTS_01_94 = "VTS_01_94.VOB";

    private String m_VTS_01_95 = "VTS_01_95.VOB";

    private String m_VTS_01_96 = "VTS_01_96.VOB";

    private String m_VTS_01_97 = "VTS_01_97.VOB";

    private String m_VTS_01_98 = "VTS_01_98.VOB";

    private String m_VTS_01_99 = "VTS_01_99.VOB";

    private String m_VTS_01_100 = "VTS_01_100.VOB";

    private String m_VTS_01_101 = "VTS_01_101.VOB";

    private String m_VTS_01_102 = "VTS_01_102.VOB";

    private String m_VTS_01_103 = "VTS_01_103.VOB";

    private String m_VTS_01_104 = "VTS_01_104.VOB";

    private String m_VTS_01_105 = "VTS_01_105.VOB";

    private String m_VTS_01_106 = "VTS_01_106.VOB";

    private String m_VTS_01_107 = "VTS_01_107.VOB";

    private String m_VTS_01_108 = "VTS_01_108.VOB";

    private String m_VTS_01_109 = "VTS_01_109.VOB";

    private String m_VTS_01_110 = "VTS_01_110.VOB";

    private String m_VTS_01_111 = "VTS_01_111.VOB";

    private String m_VTS_01_112 = "VTS_01_112.VOB";

    private String m_VTS_01_113 = "VTS_01_113.VOB";

    private String m_VTS_01_114 = "VTS_01_114.VOB";

    private String m_VTS_01_115 = "VTS_01_115.VOB";

    private String m_VTS_01_116 = "VTS_01_116.VOB";

    private String m_VTS_01_117 = "VTS_01_117.VOB";

    private String m_VTS_01_118 = "VTS_01_118.VOB";

    private String m_VTS_01_119 = "VTS_01_119.VOB";

    private String m_VTS_01_120