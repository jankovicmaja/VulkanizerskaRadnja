package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	VulkanizerskaRadnja vr;
	AutoGuma ag;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		vr= new VulkanizerskaRadnja();
		ag = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		ag = null;
	}
	
	@Test
	public void testDodajGumuPrviScenario() {
		ag.setMarkaModel("modelMarka");
		vr.dodajGumu(ag);
		assertEquals(1,vr.pronadjiGumu(ag.getMarkaModel()).size());
	}
	
	//postoji greska u metodi pronadji gumu: ne moze da se poredi objekat sa stringom
	// i zbog toga metoda uvek vraca praznu listu, odnosno,scenario kao da nije nasla ni jednu gumu. 
	// Greska ispravljena
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuDrugiScenarioNull() {
		vr.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		ag.setMarkaModel("modelMarka");
		vr.dodajGumu(ag);
		
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("modelMarka");
		vr.dodajGumu(ag1);	
	}
	
	@Test
	public void testPronadjiGumuPrviScenario() {
		ag.setMarkaModel("modelMarka");
		vr.dodajGumu(ag);
		assertEquals(1, vr.pronadjiGumu(ag.getMarkaModel()).size()); 
	}

	@Test
	public void testPronadjiGumuDrugiScenarioNull() {
		assertEquals(vr.pronadjiGumu(null), null);
		
	}
	
	@Test
	public void testPronadjiGumuTreciScenarioNemaGume() {
		ag.setMarkaModel("modelMarka1");
		vr.dodajGumu(ag);
		assertEquals(vr.pronadjiGumu("modelMarka").size(),0);
		
	}

	@Test
	public void testPronadjiGumuViseGuma() {

		ag.setMarkaModel("guma1");
		ag.setPrecnik(19);
		ag.setSirina(204);
		ag.setVisina(31);
		vr.dodajGumu(ag);
		
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("guma1");
		ag1.setPrecnik(20);
		ag1.setSirina(200);
		ag1.setVisina(30);
		vr.dodajGumu(ag1);
		
		
		assertEquals(vr.pronadjiGumu(ag.getMarkaModel()).size(),2);
		
	}
}



