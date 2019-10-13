package buscadorComposite;

import java.util.List;

public class BuscarBaseDecorer implements IBuscador {
	IBuscador envoltura; 
	
	public BuscarBaseDecorer(IBuscador buscador) {
		this.envoltura = buscador;
	}
	
	@Override 
	public List<Publicacion> Buscar(List<Publicacion> publicaciones, Criterio criterio){
		return this.envoltura.Buscar(publicaciones, criterio);
	}

}
