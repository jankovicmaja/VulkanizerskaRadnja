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
		vr=new VulkanizerskaRadnja();
		ag=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr=null;
		ag=null;
	}

	@Test
	public void testDodajGumuPrviScenario() {
		ag.setMarkaModel("nekaMarkaIModel");
		vr.dodajGumu(ag);
		assertEquals(1, vr.pronadjiGumu(ag.getMarkaModel()).size());
		//nadjena je greska u for petlji u if-u u metodi pronadjiGumu(): porede se celi objekti, a trebalo bi da se porede 
		//po atributu markaModel-ispravljeno
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDrugiScenarioVecPostoji() {
		ag.setMarkaModel("markaModel1");
		vr.dodajGumu(ag);
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("markaModel1");
		vr.dodajGumu(ag1);
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuTreciScenarioNullVrednost() {
		vr.dodajGumu(null);
	}
	
	@Test
	public void testPronadjiGumuPrviScenario() {
		ag.setMarkaModel("nekaMarkaIModel");
		vr.dodajGumu(ag);
		assertEquals(1, vr.pronadjiGumu(ag.getMarkaModel()).size());
	}
	
	@Test
	public void testPronadjiGumuDrugiScenarioNemaGuma() {
		ag.setMarkaModel("markaModel1");
		vr.dodajGumu(ag);
		assertEquals(vr.pronadjiGumu("markaModel2").size(),0);
		
	}
	
	@Test
	public void testPronadjiGumuTreciScenarioNull() {
		assertEquals(vr.pronadjiGumu(null), null);
	}
	
	@Test
	public void testPronadjiGumuCetvrtiScenarioViseGuma() {
		ag.setMarkaModel("markaModel");
		ag.setPrecnik(21);
		ag.setSirina(223);
		ag.setVisina(35);
		vr.dodajGumu(ag);
		AutoGuma ag1 = new AutoGuma();
		ag1.setMarkaModel("markaModel");
		ag1.setPrecnik(14);
		ag1.setSirina(222);
		ag1.setVisina(33);
		vr.dodajGumu(ag1);
		assertEquals(vr.pronadjiGumu(ag.getMarkaModel()).size(),2);
		
	}
}
