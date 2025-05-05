package COM.simulado;

public class Intervalo {
    private double inferior, superior;

    public Intervalo(double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }

    public double getInferior(){
        return inferior;
    }

    public double getSuperior(){
        return superior;
    }

    public boolean pertence(double valor){
        if (valor >= inferior && valor <= this.superior) {
            return true;
        }
        return false;
    }
}
