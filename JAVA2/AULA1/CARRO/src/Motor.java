
public class Motor {
	private int potencia;
	private String descricao;
	private TipoMotor tipoMotor;
	private boolean estadoMotor;
	public Motor(int potencia, String descricao, TipoMotor tipoMotor) {
		super();
		this.potencia = potencia;
		this.descricao = descricao;
		this.tipoMotor = tipoMotor;
		this.estadoMotor = false;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public boolean getEstadoMotor() {
		return estadoMotor;
	}
	public void setEstadoMotor(boolean estadoMotor) {
		this.estadoMotor = estadoMotor;
	}
	
	
}
