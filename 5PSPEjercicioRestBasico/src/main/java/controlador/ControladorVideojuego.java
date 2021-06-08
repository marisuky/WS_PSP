package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import modelo.entidad.Videojuego;

@RestController
public class ControladorVideojuego {
	private Videojuego videogame = new Videojuego();

	@GetMapping("videojuego")
	public Videojuego obtenerMensaje() {
		videogame = new Videojuego();
		videogame.setId(4);
		videogame.setNombre("Angry Birds");
		videogame.setCompania("Rovio");
		videogame.setPrecio(55);
		return videogame;

	}

	@PutMapping("videojuego")
	public Videojuego cambiarPrecioVideojuego() {
		videogame = new Videojuego();
		videogame.setId(4);
		videogame.setNombre("Angry Birds");
		videogame.setCompania("Rovio");
		videogame.setPrecio(55);
		videogame.setPrecio(videogame.getPrecio() + 15);
		
		return videogame;
	}
}
