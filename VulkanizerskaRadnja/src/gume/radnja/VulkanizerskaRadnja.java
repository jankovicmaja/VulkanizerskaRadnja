package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja jednu vulkanizersku radnju
 * @author Maja Jankovic
 * @version 2.0.0
 *
 */
public class VulkanizerskaRadnja {
	/*
	 * Atribut koji prestavlja listu guma klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume =
			new LinkedList<AutoGuma>();
	/**
	 * Metoda koja dodaje novu gumu u postojecu listu gume
	 * @param guma a koju treba dodati u datu listu
	 * @throws baca se izuzetak java.lang.NullPointerException u slucaju null vrednosti
	 * @throws baca se izuzetak java.lang.RuntimeException ako guma a vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
			if (a == null)
				throw new NullPointerException("Guma ne sme biti null");
			if (gume.contains(a))
				throw new RuntimeException("Guma vec postoji");
			gume.addFirst(a);
		}
	/**
	 * Metoda koja na osnovu ulaznog parametra pronalazi istu takvu gumu u postojecoj listi
	 * @param markaModel gume koju treba pronaci u listi
	 * @return vraca se novaLista lista objekata AutoGuma koja predstavlja listu svih guma koji imaju datu marku i model
	 * @return vraca se null ukoliko je kao parametar prosledjena null vrednost
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
			if (markaModel == null)
				return null;
			LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			for(int i=0;i<gume.size();i++)
				if (gume.get(i).getMarkaModel().equals(markaModel))
					novaLista.add(gume.get(i));
			return novaLista;
		}
}
