
public class Direccion {
private String tipovia;
private String nombre;
private String n;
private String cp;


public Direccion() {
	super();
}

public Direccion(String tipovia, String nombre, String n, String cp) {
	super();
	this.tipovia = tipovia;
	this.nombre = nombre;
	this.n = n;
	this.cp = cp;
}

public String getTipovia() {
	return tipovia;
}
public void setTipovia(String tipovia) {
	this.tipovia = tipovia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getN() {
	return n;
}
public void setN(String n) {
	this.n = n;
}
public String getCp() {
	return cp;
}
public void setCp(String cp) {
	this.cp = cp;
}
@Override
public String toString() {
	return " tipovia:" + tipovia + ", nombre:" + nombre + ", n:" + n + ", cp:" + cp + "\n";
}



}
