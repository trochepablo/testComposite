package buscadorComposite;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompositeBuscador {
	
	Buscador buscador;
	BuscarPrecioDecorer buscarPrecio;
	Criterio filtros;
	
	String ciudad;
	String fechaEntrada;
	String fechaSalida;
	Integer precioMin;
	Integer precioMax;
	
	List<Publicacion> publicaciones;

	@BeforeEach
	void setUp() throws Exception {
		// publicaciones = new List<Publicacion>();
		// publicaciones.add(new Publicacion())
	}

	@Test
	void testBusquedaDefault() {
		
		ciudad = "Buenos Aires";
		fechaEntrada = "01/04/2019";
		ciudad = "09/04/2019";
		
		// filtros = new Criterio(ciudad, fechaEntrada, fechaSalida);
		buscador = new Buscador(filtros);
		// TODO:
		// busqueda con campos requeridos: 
		// buscador.buscar(publicaciones)
		
	}
	
	@Test
	void testBusquedaPrecio() {
		
		ciudad = "Buenos Aires";
		fechaEntrada = "01/04/2019";
		ciudad = "09/04/2019";
		precioMin = 50;
		precioMax = 100;
		
		// filtros = new Criterio(ciudad, fechaEntrada, fechaSalida, precioMin, precioMax);
		buscador = new Buscador(filtros);
		//TODO:
		// busqueda anidando precio min y max:
		// buscarPrecio = new BuscarPrecioDecorer(buscador);
		// buscarPrecio.buscar(publicaciones)
		
	}
	

}
