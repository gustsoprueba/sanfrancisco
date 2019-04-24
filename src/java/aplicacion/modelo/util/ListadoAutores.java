package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource de autores
 * @author Ariel Vega
 */
public class ListadoAutores implements Serializable{
    /**
     * autores de alguna de las publicaciones disponibles
     */
    private List<Autor> autores;

    /**
     * Constructor por defecto
     */
    public ListadoAutores() {
        autores = new ArrayList<>(); // inicializa autores
    }

    /**
     * Constructor parametrizado
     * @param autores el listado de autores
     */
    public ListadoAutores(List<Autor> autores) {
        this.autores = autores;
    }

    // sección de getters y setters
    
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
}
