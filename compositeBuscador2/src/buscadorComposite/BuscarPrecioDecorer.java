package buscadorComposite;

import java.util.ArrayList;
import java.util.List;

public class BuscarPrecioDecorer extends BuscarBaseDecorer  {

	public BuscarPrecioDecorer(IBuscador buscador) {
		super(buscador);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Publicacion> Buscar(List<Publicacion> publicaciones, Criterio criterio){
		// TODO:

		//super().Buscar(publicaciones).filter(s.precio >= criterio.precioMinimo &&
		//							           s.precio <= criterio.precioMaximo)

		List<Publicacion> PublicacionesAux = new ArrayList<Publicacion>();
		for (Publicacion e : super.Buscar(publicaciones, criterio))  
        { 
            if (e.ciudadDestino == criterio.ciudadDestino &&
            	e.fechaEntrada == criterio.fechaEntrada &&
            	e.fechaSalida == criterio.fechaSalida) 
            { 
            	PublicacionesAux.add(e);
            } 
        } 
		return PublicacionesAux;
	}

}
