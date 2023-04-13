package xakea;

public class Partida {
	private Taula taula;
	private Jokalaria jokalariZuria;
	private Jokalaria jokalariBeltza;
	private Jokalaria oraingoJokalaria;
	
	public void partidaBatJolastu() {
		taula = Taula.getTaula();
		jokalariZuria = new Jokalaria("Sobron69", "Zuria");
		jokalariBeltza = new Jokalaria("ErikPadronso", "Beltza");
		oraingoJokalaria = jokalariZuria;
		while(!this.partidaBukatuDa()) {
			this.mugimenduBatEgin(oraingoJokalaria);
			this.jokalarizAldatu();
		}
		this.emaitzaInprimatu();
	}
	
	public boolean partidaBukatuDa() {
		return(this.xakeMate()||this.berdinketa());
	}
	
	public boolean xakeMate() {
		boolean emaitza = false;
		//...
		return emaitza;
	}
	
	public boolean berdinketa() {
		boolean emaitza = false;
		//...
		return emaitza;
	}
	
	public void mugimenduBatEgin(Jokalaria jokalaria) {
		//...
	}
	
	public void jokalarizAldatu() {
		if(oraingoJokalaria==jokalariZuria) {
			oraingoJokalaria=jokalariBeltza;
		}else {
			oraingoJokalaria=jokalariZuria;
		}
	}
	
	public void emaitzaInprimatu() {
		if(this.xakeMate()) {
			if(oraingoJokalaria==jokalariZuria) {
				System.out.println("Partida bukatu da! "+jokalariBeltza.getIzena()+" da irabazlea.");
			}else {
				System.out.println("Partida bukatu da! "+jokalariZuria.getIzena()+" da irabazlea.");
			}
		}else {
			System.out.println("Partida bukatu da! Berdinketa dago.");
		}
	}
}
