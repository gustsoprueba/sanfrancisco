package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Representa un autor de una Publicacion
 * @author Ariel Vega
 * @version 1.0
 */
public class Autor implements Serializable{
    /**
     * codigo unívoco para identificar los autores
     */
    private Integer codigo;
    /**
     * Apellido del autor
     */
    private String apellido;
    /**
     * Nombres del autor
     */
    private String nombres;

    /**
     * Constructor por defecto
     */
    public Autor() {
    }

    /**
     * Constructor parametrizado
     * @param codigo identificador unívoco de un autor
     * @param apellido apellido del autor
     * @param nombres nombres del autor
     */
    public Autor(Integer codigo, String apellido, String nombres) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombres = nombres;
    }
    
    // SECCIÓN DE GETTERS Y SETTERS

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}
