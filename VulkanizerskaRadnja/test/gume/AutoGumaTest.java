package gume;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {

	private AutoGuma guma; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test
	public void testSetMarkaModelPrviScenario() {
		guma.setMarkaModel("nekaMarkaNekiModel");
		assertEquals("nekaMarkaNekiModel", guma.getMarkaModel());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelDrugiScenarioNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelTreciScenarioKratakString() {
		guma.setMarkaModel("n1");
		}

	@Test 
	public void testSetPrecnikPrviScenario() { 
		guma.setPrecnik(18);
		assertEquals(18, guma.getPrecnik());
	}
		
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetDrugiScenarioGreskaUKodu() { 
		guma.setPrecnik(1313);		//	ovo je test koji pokazuje da metoda setPrecnik ima gresku u kodu
									//	tj. da nikada nece baciti izuzetak. Promenila sam u if-u && u ||
									
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikTreciScenarioManjaVrednost() { 
		guma.setPrecnik(4);
		
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikCetvrtiScenarioVecaVrednost() { 
		guma.setPrecnik(27);
		
	}

	@Test
	public void testSetSirinaPrviScenario() {
		guma.setSirina(305);
		assertEquals(305, guma.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaDrugiScenarioGreskaUKodu() {
		
		guma.setSirina(9999);			// ova metoda ima gresku u if-u istu kao i prethodna, pa sam promenila u if-u && u ||
										
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaTreciScenarioManjaVrednost() {
		
		guma.setSirina(134);	
		
	}
	
	@Test
	public void testSetVisinaPrviScenario() {
		guma.setVisina(74);
		assertEquals(74, guma.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaDrugiScenarioManjaVrednost() {
		guma.setVisina(18);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaTreciScenarioVecaVrednost() {
		guma.setVisina(1313);
		
	}

	@Test
	public void testToString() {
		guma.setMarkaModel("markaModel");
		guma.setPrecnik(15);
		guma.setVisina(74);
		guma.setSirina(303);
		assertEquals("AutoGuma [markaModel=markaModel, precnik=15, sirina=303, visina=74]", guma.toString());
	}

	@Test
	public void testEquals() {
		guma.setMarkaModel("markaModel");
		guma.setPrecnik(15);
		guma.setVisina(74);
		guma.setSirina(303);
		
		AutoGuma g = new AutoGuma();
		g.setMarkaModel("mmmm3");
		g.setPrecnik(16);
		g.setVisina(74);
		g.setSirina(303);
		
		assertFalse(guma.equals(g));
		
	}

}
