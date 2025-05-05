
public class Carro {
	private int ano, velocimetro;
	private String marca, modelo;
	private Motor motor;
	
	public Carro(int ano, String marca, String modelo, Motor motor) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.velocimetro = 0;
		this.motor = motor;
	}
	
	public boolean ligar() {
		if(this.motor.getEstadoMotor() == false) {
			this.motor.setEstadoMotor(true);
			return this.motor.getEstadoMotor();
		}
		return false;
	}
	
	public boolean desligar() {
		if(this.velocimetro == 0 && this.motor.getEstadoMotor() == true) {
			this.motor.setEstadoMotor(false);
			return this.motor.getEstadoMotor();
		}
		return false;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocimetro() {
		return velocimetro;
	}

	public void setVelocimetro(int velocimetro) {
		this.velocimetro = velocimetro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public boolean acelerar() {
		if(this.velocimetro < 100) {
		this.velocimetro += 20;
		return true;
		}
		return false;
	}
	public boolean frear() {
		if(this.velocimetro >= 20) {
		this.velocimetro -= 20;
		return true;
		}
		return false;
	}
	
	public Motor getMotor() {
		return motor;
	}
}
