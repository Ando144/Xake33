package xakea;

public class Jokalaria {
	private String izena;
	private boolean zuria;
	
	public Jokalaria(String pIzena, String pKolorea) {
		izena = pIzena;
		if(pKolorea=="Zuria") {
			zuria=true;
		}else if(pKolorea=="Beltza") {
			zuria=false;
		}
	}
	
	public String getIzena() {
		return izena;
	}
}