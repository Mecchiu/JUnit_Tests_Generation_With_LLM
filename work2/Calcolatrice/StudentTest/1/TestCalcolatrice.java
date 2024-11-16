import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

//scrivere al posto di "Classe" il nome della classe da testare
public class TestCalcolatrice {
	
	public Calcolatrice c;
	
@BeforeClass
public static void setUpClass() {
    // Eseguito una volta prima dell'inizio dei test nella classe
    // Inizializza risorse condivise o esegui altre operazioni di setup
}
                
@AfterClass
public static void tearDownClass() {
    // Eseguito una volta alla fine di tutti i test nella classe
    // Effettua la pulizia delle risorse condivise o esegui altre operazioni di teardown
}
                
@Before
public void setUp() {
    // Eseguito prima di ogni metodo di test
    // Preparazione dei dati di input specifici per il test
	c= new Calcolatrice();
}
                
@After
public void tearDown() {
    // Eseguito dopo ogni metodo di test
    // Pulizia delle risorse o ripristino dello stato iniziale
}
                
@Test
public void testAddPlusPlus() {
	int x=c.add(12, 30);
	assertEquals(42,x);
}

@Test
public void testAddPlusMinus() {
	int x=c.add(12, -30);
	assertEquals(-18,x);
}

@Test
public void testAddMinusPlus() {
	int x=c.add(-12, 30);
	assertEquals(18,x);
}

@Test
public void testAddMInusMinus() {
	int x=c.add(-12, -30);
	assertEquals(-42,x);
}

@Test
public void testDividePositivePositive() {
	double d=c.divide(3.0, 2.0);
	double delta=0.001;
	double res=1.5;
	assertEquals(res,d,0.001);
}

@Test
public void testDividePositiveNegative() {
	double d=c.divide(3.0, -2.0);
	double delta=0.001;
	double res=-1.5;
	assertEquals(res,d,0.001);
}

@Test
public void testDivideZero() {
	Exception exception = assertThrows(Exception.class, () -> c.divide(7.0,0.0));
	assertEquals("Division by zero is not allowed", exception.getMessage());
}

@Test
public void testDivideZeroZero() {
	Exception exception = assertThrows(Exception.class, () -> c.divide(0.0,0.0));
	assertEquals("Division by zero is not allowed", exception.getMessage());
}

@Test
public void testFactorialZero() {
	assertEquals(1,c.factorial(0));
}

@Test
public void testFactorialOne() {
	assertEquals(1,c.factorial(1));
}

@Test
public void testFactorialFive() {
	assertEquals(120,c.factorial(5));
}

@Test
public void testFactorialNegative() {
	Exception exception = assertThrows(Exception.class, () -> c.factorial(-1));
	assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
}


// Aggiungi altri metodi di test se necessario
}