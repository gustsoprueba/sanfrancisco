package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Representa una editorial de una Publicacion
 * @author Ariel Vega
 * @version 1.0
 */
public class Editorial implements Serializable{
    /**
     * codigo unívoco para identificar las editoriales
     */
    private Integer codigo;
    /**
     * Nombre de la editorial
     */
    private String nombreEditorial;
  
    /**
     * Constructor por defecto
     */
    public Editorial() {
    }

    /**
     * Constructor parametrizado
     * @param codigo identificador unívoco de una editorial
     * @param nombreEditorial  nombre de la editorial
     */
    public Editorial(Integer codigo, String nombreEditorial) {
        this.codigo = codigo;
        this.nombreEditorial = nombreEditorial;
    }

    
    
    // SECCIÓN DE GETTERS Y SETTERS

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

}
