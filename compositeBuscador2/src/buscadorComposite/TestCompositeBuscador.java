package buscadorComposite;

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

	@BeforeEach
	void setUp() throws Exception {
		
		// buscador = new Buscador(filtros);
		// 
	}

	@Test
	void testBusquedaDefault() {
		
		ciudad = "Buenos Aires";
		fechaEntrada = "01/04/2019";
		ciudad = "09/04/2019";
		
		// filtros = new Criterio(ciudad, fechaEntrada, fechaSalida);
		
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
		
		//TODO:
		// busqueda anidando precio min y max:
		// buscarPrecio = new BuscarPrecioDecorer(buscador);
		// buscarPrecio.buscar(publicaciones)
		
	}
	

}
