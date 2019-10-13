package buscadorComposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompositeBuscador {
	
	Buscador buscador;
	BuscarPrecioDecorer buscarPrecio;
	BuscarCantHuespedDecorer buscarHuesped;
	Criterio filtros;
	
	String ciudad;
	String fechaEntrada;
	String fechaSalida;
	Integer precioMin;
	Integer precioMax;
	
	List<Publicacion> publicaciones;

	@BeforeEach
	void setUp() throws Exception {
		publicaciones = new ArrayList<Publicacion>();
		Publicacion publicacion1 = new Publicacion();
		publicacion1.ciudadDestino = "BA";
		publicacion1.fechaEntrada = "1";
		publicacion1.fechaSalida = "2";
		publicacion1.precio = 5;
		publicacion1.cantHuesped = 5;
		
		Publicacion publicacion2 = new Publicacion();
		publicacion2.ciudadDestino = "UY";
		publicacion2.fechaEntrada = "1";
		publicacion2.fechaSalida = "2";
		publicacion2.precio = 50;
		publicacion2.cantHuesped = 5;

		Publicacion publicacion3 = new Publicacion();
		publicacion3.ciudadDestino = "UY";
		publicacion3.fechaEntrada = "1";
		publicacion3.fechaSalida = "2";
		publicacion3.precio = 99;
		publicacion3.cantHuesped = 2;
		
		publicaciones.add(publicacion1);
		publicaciones.add(publicacion2);
		publicaciones.add(publicacion3);

	}

//	@Test
//	void testBusquedaDefault() {
//		
//		filtros = new Criterio();
//		
//		filtros.ciudadDestino = "BA";
//		filtros.fechaEntrada = "1";
//		filtros.fechaSalida= "2";
//		
//		buscador = new Buscador();
//		
//		// TODO:
//		// busqueda con campos requeridos: 
//		List<Publicacion> resultado = buscador.Buscar(publicaciones, filtros);
//		
//		assertEquals(1, resultado.size());
//	}
//	
//	@Test
//	void testBusquedaPrecio() {
//		
//		filtros = new Criterio();
//		
//		filtros.ciudadDestino = "UY";
//		filtros.fechaEntrada = "1";
//		filtros.fechaSalida= "2";
//		filtros.precioMin = 0;
//		filtros.precioMax = 100;
//			
//		buscador = new Buscador();
//		
//		//TODO:
//		// busqueda anidando precio min y max:
//		buscarPrecio = new BuscarPrecioDecorer(buscador);
//		List<Publicacion> resultado = buscarPrecio.Buscar(publicaciones, filtros);
//		
//		assertEquals(2, resultado.size());
//		
//	}
	
	@Test
	void testBusquedaHuesped() {
		
		filtros = new Criterio();
		
		filtros.ciudadDestino = "UY";
		filtros.fechaEntrada = "1";
		filtros.fechaSalida= "2";
		filtros.precioMin = 0;
		filtros.precioMax = 100;
		filtros.cantHuesped = 4;
			
		buscador = new Buscador();
	
		buscarPrecio = new BuscarPrecioDecorer(buscador);
		buscarHuesped = new BuscarCantHuespedDecorer(buscarPrecio);
		List<Publicacion> resultado = buscarHuesped.Buscar(publicaciones, filtros);
		
		assertEquals(1, resultado.size());
		
	}
	

}
