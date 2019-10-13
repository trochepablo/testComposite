package buscadorComposite;

import java.util.List;

public interface IBuscador {
	List<Publicacion> Buscar(List<Publicacion> publicaciones, Criterio criterio);
}
