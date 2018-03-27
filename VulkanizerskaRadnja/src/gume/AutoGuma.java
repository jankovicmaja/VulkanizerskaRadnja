package gume;

/**
 * 
 * @author Maja Jankovic
 * @version Prva verzija ove klase od strane autora Maja Jankovic
 *
 */
public class AutoGuma {
	private String markaModel = null;
	private int precnik = 0;
	private int sirina = 0;
	private int visina = 0;
	
	/**
	 * @return tip povratne vrednosti je String vrednost; ova metoda vraca vrednost atributa markaModel
	 *
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * 
	 * @param markaModel ne sme biti null vrednost i njegova duzina ne sme biti manja od 3, u suprotnom se baca izuzetak; njegova vrednost se dodeljuje istoimenom atributu
	 * @throws baca se izuzetak klase {@link RuntimeException} u slucaju nedozvoljenih vrednosti
	 *
	 *
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * 
	 * @return tip povratne vrednosti je ceo broj- integer vrednost; ova metoda vraca vrednost atributa precnik
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * 
	 * @param precnik ne sme biti kraci od 13, a duzi od 22 jer se u tom slucaju baca izuzetak; njegova vrednost se dodaje istoimenom atributu
	 * @throws baca se izuzetak klase {@link RuntimeException} u slucaju unosa nedozvoljenih vrednosti
	 * 
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * 
	 * @return tip povratne vrednosti je ceo broj-integer vrednost; vraca se vrednost atributa sirina
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * 
	 * @param sirina ne sme biti manja od 135 i veca od 355, jer se u suprotnom baca izuzetak; njegova vrednost se dodeljuje istoimenom atributu
	 * @throws baca se izuzetak klase {@link RuntimeException} u slucaju unosa nedozvoljenih vrednosti
	 * 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * 
	 * @return tip povratne vrednosti je ceo broj-integer vrednost; ova metoda vraca vrednost atributa visina
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * 
	 * @param visina ne sme biti manja od 25 i veca 95, inace se baca izuzetak; njegova vrednost se dodeljuje istoimenom atributu
	 * @throws baca se izuzetak klase {@link RuntimeException} u slucaju unosa nedozvoljenih vrednosti
	 * 
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * @return tip povratne vrednosti je String vrednost- String koji u jednoj recenici prikazuje vrednost svih navedenih atributa u klasi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * @param obj koji predstavlja objekat klase Object
	 * @return tip povratne vrednosti je boolean vrednost
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
