package tpdamian;

public class Pronostico {
	String Gano;
	String Empato;
	String Perdio;
	
	public Pronostico() {

	}

	public Pronostico(String gano, String empato, String perdio) {
		super();
		Gano = gano;
		Empato = empato;
		Perdio = perdio;
	}

	public String getGano() {
		return Gano;
	}

	public void setGano(String gano) {
		Gano = gano;
	}

	public String getEmpato() {
		return Empato;
	}

	public void setEmpato(String empato) {
		Empato = empato;
	}

	public String getPerdio() {
		return Perdio;
	}

	public void setPerdio(String perdio) {
		Perdio = perdio;
	}
	
	
	
	
}

