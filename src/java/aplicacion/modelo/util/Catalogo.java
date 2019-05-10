package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.dominio.Editorial;
import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
        Publicacion primeraPub = new Publicacion();
        primeraPub.setIsbn("111111");
        primeraPub.setTitulo("PVISUAL con PrimeFaces");
        primeraPub.setFechaInventario(new Date());
        primeraPub.setEditorial(new Editorial(1, "Editorial UNJu"));
        List<Autor> autores = new ArrayList<>();
        autores.add(new Autor(1, "VEGA", "ARIEL ALEJANDRO"));
        autores.add(new Autor(1, "SOSA", "GUSTAVO SEBASTIAN"));
        autores.add(new Autor(1, "APAZA", "CAROLINA CECILIA"));
        autores.add(new Autor(1, "ESPINOZA", "ALFREDO"));
        primeraPub.setAutores(autores);
        publicaciones.add(primeraPub);
        
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
