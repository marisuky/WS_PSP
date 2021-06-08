package controlador;





import modelo.negocio.Arena;
import modelo.entidad.Arma;
import modelo.entidad.Espada;
import modelo.entidad.Guerrero;
import modelo.entidad.Healer;
import modelo.entidad.Hechizo;
import modelo.entidad.Mago;
import modelo.entidad.Personaje;
import modelo.entidad.Rezo;
import modelo.entidad.Util;

public class ClasePrincipal {



	public static void main(String[] args) {

	

	
		Personaje p1=  new Mago();
		Arma hechizo = new Hechizo();
		Personaje p2 = new Guerrero();
		Arma espada= new Espada();
		Personaje p3 = new Healer();
		Arma rezo = new Rezo();
	
		hechizo.setDañoMaximo(30);
		hechizo.setDañoMinimo(15);

		p1.setNombre("Gandalf");
		p1.setNivel(2);
		p1.setPuntosVida(100);
		p1.setIniciativa(3);
		p1.setArma(hechizo);
		
		espada.setDañoMaximo(25);
		espada.setDañoMinimo(10);
		
		p2.setNombre("Aragorn");
		p2.setNivel(5);
		p2.setPuntosVida(125);
		p2.setIniciativa(2);
		p2.setArma(espada);


		Arena arena = new Arena(p1, p2);
		Personaje pg = arena.combate();

		System.out.println("Personaje ganador!!" + pg.getNombre());

	}

}
