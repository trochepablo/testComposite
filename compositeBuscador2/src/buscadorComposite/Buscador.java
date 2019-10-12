package buscadorComposite;

import java.util.List;

public class Buscador implements IBuscador {
	
	Criterio criterio; // filtros de busqueda
	
	public Buscador(Criterio criterio) {
		this.criterio = criterio;
	}
	
	@Override
	public List<Publicacion> Buscar(List<Publicacion> publicaciones) {
		// TODO:
		//return  publicaciones.filter(s => s.ciudadDestino == criterio.ciudadDestino
		//							 s.fechaIngreso == criterio.fechaIngreso											
		//						     s.fechaSalida ==  crioterio.fechaSalida)
		//
		return publicaciones;
	}
}
