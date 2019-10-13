package buscadorComposite;

import java.util.ArrayList;
import java.util.List;

public class Buscador implements IBuscador {


	@Override
	public List<Publicacion> Buscar(List<Publicacion> publicaciones, Criterio criterio) {
		// TODO:
		//return  publicaciones.filter(s => s.ciudadDestino == criterio.ciudadDestino
		//							 s.fechaIngreso == criterio.fechaIngreso											
		//						     s.fechaSalida ==  crioterio.fechaSalida)
		//
		
		List<Publicacion> PublicacionesAux = new ArrayList<Publicacion>();
		for (Publicacion e : publicaciones)  
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
