package gume;

/**
 * Klasa koja predstavlja jednu gumu
 * @author Maja Jankovic
 * @version 1.0.0
 *
 */
public class AutoGuma {
	/**
	 * Atribut koji predstavlja marku i model jedne gume
	 */
	private String markaModel = null;
	/** 
	 * Atribut koji predstavlja precnik jedne gume
	 */
	private int precnik = 0;
	/**
	 * Atribut koji predstavlja sirinu jedne gume
	 */
	private int sirina = 0;
	/**
	 * Atribut koji predstavlja visinu jedne gume
	 */
	private int visina = 0;
	
	/**
	 * Metoda koja vraca vrednost atributa markaModel
	 * @return tip povratne vrednosti je String vrednost marke i modela gume
	 *
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Metoda koja postavlja vrednost atributa markaModel
	 * @param markaModel koji predstavlja novu vrednost marke i modela
	 * @throws java.lang.RuntimeException u slucaju nedozvoljenih vrednosti(null || markaModel.length()<3)
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Metoda koja vraca vrednost atributa precnik
	 * @return tip povratne vrednosti je ceo broj- integer vrednost precnika
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Metoda koja postavlja vrednost atributa precnik
	 * @param precnik koja predstavlja novu vrednost precnika
	 * @throws java.lang.RuntimeException u slucaju unosa nedozvoljenih vrednosti(<13 || >22)
	 * 
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Metoda koja vraca vrednost atributa sirina
	 * @return tip povratne vrednosti je ceo broj-integer vrednost sirine
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Metoda koja postavlja vrednost atributa sirina
	 * @param sirina koji predstavlja novu vrednost atributa sirina
	 * @throws java.lang.RuntimeException u slucaju unosa nedozvoljenih vrednosti(<135 || >355)
	 * 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Metoda koja vraca vrednost atributa visina
	 * @return tip povratne vrednosti je ceo broj-integer vrednost visine
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Metoda koja postavlja vrednost atributa visina
	 * @param visina koji predstavlja novu vrednost atributa visina
	 * @throws java.lang.RuntimeException u slucaju unosa nedozvoljenih vrednosti(<25 || >95)
	 * 
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**Metoda koja vraca String koji prikazuje vrednosti svih prethodno navedenih atributa 
	 * @return String o  svim informacijama koje su vezane za marku i model, precnik, sirinu i visinu gume
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Metoda koja vraca boolean vrednost u zavisnosti od toga da li su neke dve gume jednake po svim svojim atributima
	 * @param obj koji predstavlja objekat klase Object sa kojim se guma poredi
	 * @return tip povratne vrednosti je boolean da li su gume iste po svim atributima ili ne 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		}else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
	

}
