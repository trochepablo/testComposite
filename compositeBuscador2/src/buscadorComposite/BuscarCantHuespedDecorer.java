package buscadorComposite;

import java.util.ArrayList;
import java.util.List;

public class BuscarCantHuespedDecorer extends BuscarBaseDecorer  {

	public BuscarCantHuespedDecorer(IBuscador buscador) {
		super(buscador);
	}
	
	@Override
	public List<Publicacion> Buscar(List<Publicacion> publicaciones, Criterio criterio){
		// TODO:

		//super().Buscar(publicaciones).filter(s.precio >= criterio.precioMinimo &&
		//							           s.precio <= criterio.precioMaximo)

		List<Publicacion> PublicacionesAux = new ArrayList<Publicacion>();
		for (Publicacion e : super.Buscar(publicaciones, criterio))  
        { 
            if (e.cantHuesped >= criterio.cantHuesped) 
            { 
            	PublicacionesAux.add(e);
            } 
        } 
		return PublicacionesAux;
	}

}
