package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource para las publicaciones
 * @author Ariel Vega
 */
public class Catalogo implements Serializable{
    /**
     * publicaciones del catálogo
     */
    private List<Publicacion> publicaciones;

    /**
     * Constructor por defecto
     */
    public Catalogo() {
        publicaciones = new ArrayList<>(); // inicializa publicaciones
    }

    /**
     * Constructor parametrizado
     * @param publicaciones las publicaciones del catálogo
     */
    public Catalogo(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    // sección getters y setters

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    
}
