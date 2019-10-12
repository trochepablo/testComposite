package buscadorComposite;

import java.util.List;

public class BuscarPrecioDecorer extends BuscarBaseDecorer  {

	public BuscarPrecioDecorer(IBuscador buscador) {
		super(buscador);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Publicacion> Buscar(List<Publicacion> publicaciones){
		// TODO:
		//super().Buscar(publicaciones).filter(s.precio >= criterio.precioMinimo &&
		//							           s.precio <= criterio.precioMaximo)
		return publicaciones;
	}

}
