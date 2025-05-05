public class Main{
	public static void main(String[] args) {
		Motor m = new Motor(250,"Blabla", TipoMotor.ELETRICO);
		Carro c = new Carro(2025,"Renault","Kwid",m);
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c.acelerar() ? "Acelerou" : "Não Acelerou");
		System.out.println(c.acelerar() ? "Acelerou" : "Não Acelerou");
		System.out.println(c.getVelocimetro());
		System.out.println(c.getMotor().getTipoMotor());
	}
}


