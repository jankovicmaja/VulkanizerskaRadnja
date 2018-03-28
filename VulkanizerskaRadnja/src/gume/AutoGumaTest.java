package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	
	private AutoGuma ag;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ag=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		ag=null;
	}

	@Test
	public void testSetMarkaModelPrviScenario() {
		ag.setMarkaModel("nekaVrednostMarkaModel");
		assertEquals("nekaVrednostMarkaModel", ag.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelDrugiScenarioKraciString() {
		ag.setMarkaModel("mm");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelTreciScenarioNull() {
		ag.setMarkaModel(null);
	}

	@Test
	public void testSetPrecnikPrviScenario() {
		ag.setPrecnik(20);
		assertEquals(20, ag.getPrecnik());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikDrugiScenarioManjiOdTrinaest() {
		ag.setPrecnik(1);		//u klasi AutoGuma izmenjen uslov- umesto && napisano ||
								//inace metoda nikad nece bacati izuzetak, a trebalo bi
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikTreciScenarioVeciOdDvadesetDva() {
		ag.setPrecnik(24);		//isto se odnosi i na ovu test metodu
	}

	@Test
	public void testSetSirinaPrviScenario() {
		ag.setSirina(200);
		assertEquals(200, ag.getSirina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaDrugiScenarioManjiOdStoTridesetPet() {
		ag.setSirina(130);		//ista mana kao i u prethodnoj metodi-umesto && pisem ||
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaTreciScenarioVeciOdTristaPedesetPet() {
		ag.setSirina(500);		//ista mana kao i u prethodnoj metodi-umesto && pisem ||
	}


	@Test
	public void testSetVisinaPrviScenario() {
		ag.setVisina(55);
		assertEquals(55, ag.getVisina());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaDrugiScenarioManjiOdDvadesetPet() {
		ag.setVisina(13);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaTreciScenarioVeciOdDevedesetPet() {
		ag.setVisina(100);
	}
	
	@Test
	public void testToString() {
		ag.setMarkaModel("Mini_Cooper");
		ag.setPrecnik(13);
		ag.setSirina(300);
		ag.setVisina(70);
		assertEquals("AutoGuma [markaModel=Mini_Cooper, precnik=13, sirina=300, visina=70]", ag.toString());
	}

	@Test
	public void testEqualsObject() {
		ag.setMarkaModel("Mini_Cooper");
		ag.setPrecnik(15);
		ag.setVisina(75);
		ag.setSirina(305);
		AutoGuma guma = new AutoGuma();
		guma.setMarkaModel("Mini_Cooper");
		guma.setPrecnik(15);
		guma.setVisina(75);
		guma.setSirina(313);
		assertFalse(ag.equals(guma));
	}

	@Test
	public void testEqualsObject1() {
		ag.setMarkaModel("Mini_Cooper");
		ag.setPrecnik(15);
		ag.setVisina(75);
		ag.setSirina(305);
		AutoGuma guma = new AutoGuma();
		guma.setMarkaModel("Mini_Cooper");
		guma.setPrecnik(15);
		guma.setVisina(75);
		guma.setSirina(305);
		assertTrue(ag.equals(guma));
	}

}
