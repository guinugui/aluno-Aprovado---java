package entities;

public class Estudante {

	private String name;
	private Double primeiraNota;
	private Double segundaNota;
	private Double terceiraNota;

	public Estudante(String name, Double primeiraNota, Double segundaNota, Double terceiraNota) {
		this.name = name;
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
		this.terceiraNota = terceiraNota;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrimeiraNota() {
		return primeiraNota;
	}

	public void setPrimeiraNota(Double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public Double getSegundaNota() {
		return segundaNota;
	}

	public void setSegundaNota(Double segundaNota) {
		this.segundaNota = segundaNota;
	}

	public Double getTerceiraNota() {
		return terceiraNota;
	}

	public void setTerceiraNota(Double terceiraNota) {
		this.terceiraNota = terceiraNota;
	}

	public Double media() {
		return primeiraNota + segundaNota + terceiraNota;
	}

	public Double faltandoPontos() {
		if (media() < 60.0) {
			return 60.0 - media();
		} else {
			return 0.0;
		}
	}

}
