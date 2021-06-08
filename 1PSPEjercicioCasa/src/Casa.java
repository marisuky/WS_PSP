import java.util.ArrayList;

public class Casa {
	
	private Direccion direcion;
	private ArrayList<Habitacion> habitaciones;
	private Persona propietario;
	private ArrayList<Persona> inquilino;
	private int precio;
	
	
	public Casa() {
		super();
	}


	public Casa(Direccion direcion, ArrayList<Habitacion> habitaciones, Persona propietario,
			ArrayList<Persona> inquilino, int precio) {
		super();
		this.direcion = direcion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.precio = precio;
	}


	public Direccion getDirecion() {
		return direcion;
	}


	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}


	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}


	public Persona getPropietario() {
		return propietario;
	}


	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}


	public ArrayList<Persona> getInquilino() {
		return inquilino;
	}


	public void setInquilino(ArrayList<Persona> inquilino) {
		this.inquilino = inquilino;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Casa: \ndirecion:" + direcion + "habitaciones:" + habitaciones + "\npropietario:" + propietario
				+ "inquilino:" + inquilino + ", precio:" + precio + "]";
	}
	
	
	
}
