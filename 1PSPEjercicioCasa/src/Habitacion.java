
public class Habitacion {
	private String tipo;
	private int num;
	private int m2;
	
	
	public Habitacion() {
		super();
	}


	public Habitacion(String tipo, int num, int m2) {
		super();
		this.tipo = tipo;
		this.num = num;
		this.m2 = m2;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	@Override
	public String toString() {
		return " tipo:" + tipo + ", num:" + num + ", m2:" + m2 + "\n";
	}
	
	

}
