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
public BurnTest() {
		}
void BurnTest() {    

        }
    @Test
    void BurnToDVD1() {
        BURN_TO_DVD(true);
    }

    @Test
    void BurnToDVD1b() {
        BURN_TO_DVD(true);
    }
    
	private void BEFORE_TEST() {

                System.out.println("BEFORE_TEST");
        m_Burn = false;
                System.out.println("Before test begin");
        System.out.println(m_BaseErr);
        }

    @Test
    void BurnToDVD8() {
        m_Burn = false;
		BEFORE_TEST();


        System.out.println("BEFORE_test 8");
        
        // This is the test for a user-friendly error message when the file and DVD don't exist.
		String test1 = "Burned Test 8 - DVD not found - Test error message";
		try {
	} catch(IOException e) {
	}

		BEFORE_TEST(test1);
        System.out.println("BEFORE_TEST: " + test1);

        // This is the test for a user-friendly error message when the file is read and does nothing.
		String test2 = "Burned Test 8 - BurnError - No read error";
		assertTrue(false);
		BEFORE_TEST(test2);

        System.out.println("BEFORE_TEST: ");
        String test3 = "Burned Test 8 - BurnError - No burn error";
		assertFalse(false);
		BEFORE_TEST(test3);

        BEFORE_TEST();
        assertTrue(m_Burn);

	}


    @Test
    void BurnToDVD4() {
        m_Burn = false;
		BEFORE_TEST();

        System.out.println("BEFORE_test 4");
        
        // This is the test for a user-friendly error message when the file is read and does nothing.
		String test1 = "Burned Test 4 - BurnError - Burn Error";
		assertTrue(false);
		BEFORE_TEST(test1);

        System.out.println("BEFORE_TEST: ");
        String test2 = "Burned Test 4 - BurnError - No burn error";
		assertFalse(false);
		BEFORE_TEST(test2);

        BEFORE_TEST();
        assertTrue(m_Burn);

	}

/** Run the burn test. */
	public void BurnTest() {

		be_TEST();
                System.out.println("BEFORE_TEST: ");    
    }


    private void be_TEST() {

                System.out.println("be test");
        m_Burn = false;
                System.out.println("BEFORE_TEST: ");    
    }
	
	private void beBeforeTest() {

                System.out.println("BEFORE_TEST");
        m_Burn = false;
                System.out.println("BEFORE_test: ");    

        }
	
	private void be_test() {
			
		}

		private void beAfterTest() {

                System.out.println("ABORT : BE test");
                //m_Burn = true;
                System.out.println("BEFORE_TEST: ");    
                
                }

	}


	//  File tests
	/**
	 * Before the first try
	*/
	public void beforeTest() {


		BEFORE_TEST();

        System.out.println("BEFORE_TEST: ");    
    }

	/**
	 * After the first try
	 */
	public void beforeTest() {


		BEFORE_TEST();

		assertTrue("Initialisation Failed",
				m_Burn);

        System.out.println("BEFORE_TEST: ");    
    }

	/**
	 * Test for the ability to burn to a DVD using Growisosfs
	 */
	public void testBurnToDVD() {

		BEFORE_TEST();
		assertTrue("BurnToDVD 1", Burn.BurnToDVD(true));
                BEFORE_TEST();
		assertTrue("BurnToDVD 4", Burn.BurnToDVD(false));
                BEFORE_TEST();
                BEFORE_TEST();
                assertFalse("Unexpect BurnToDVD 4 ", Feeder.getBurnToDVD(false));
		BEFORE_TEST();
        BEFORE_TEST();

        System.out.println("BEFORE_TEST: ");    
    }

	/**
	 * Test for the ability to burn to a DVD using growisofs
	 */
	public void testBurnToDVD() {

		BEFORE_TEST();
		assertTrue("BurnToDVD 1", Burn.BurnToDVD(true));
                BEFORE_TEST();
		assertTrue("BurnToDVD 4", Burn.BurnToDVD(false));
                BEFORE_TEST();
                BEFORE_TEST();
                assertTrue("BurnToDVD 4", Burn.BurnToDVD(false));
		BEFORE_TEST();

        System.out.println("BEFORE_TEST: ");    
    }

	/**
	 * Test for the ability to burn to a DVD using Growisofs
	 */
	public void testBurnToDVD() {

		BEFORE_TEST();
		assertTrue("BurnToDVD 1", Burn.BurnToDVD(true));
                BEFORE_TEST();
		assertTrue("BurnToDVD 4", Burn.BurnToDVD(false));
                BEFORE_TEST();
                BEFORE_TEST();
                assertTrue("BurnToDVD 4", Burn.BurnToDVD(false));
		BEFORE_TEST();

                System.out.println("BEFORE_TEST: ");    
    }




}

