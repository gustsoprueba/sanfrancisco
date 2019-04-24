package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa una publicación de la biblioteca
 * @author gustso
 */
public class Publicacion {
    /**
     * codigo internacional univoco de una publicacion
     */
    private String isbn;
    /**
     * Fecha en la que se ha inventariado la publicación
     */
    private Date fechaInventario;
    /**
     * identificador unívoco de la publicación dentro del catalogo de
     * publicaciones
     */
    private Integer numeroInventario;
    /**
     * representa el/los autores de la publicación
     */
    private List<Autor> autores;
    /**
     * titulo de la publicacion
     */
    private String titulo;
    /**
     * indica si es primera, segunda, etc edición
     */
    private String edicion;
    /**
     * Lugar donde se ha editado la publicación
     */
    private UbicacionEdicion ubicacionEdicion;
    /**
     * editorial que ha liberado la publicación
     */
    private Editorial editorial;
    /**
     * año de publicación
     */
    private Short anioPublicacion;
    /**
     * Clasificación interna para uso personal de los bibliotecarios
     */
    private String cdu;
    /**
     * permite registrar observaciones sobre la publicación
     */
    private String observaciones;

    /**
     * Constructor por defecto
     */
    public Publicacion() {
        autores = new ArrayList<>();
        ubicacionEdicion = new UbicacionEdicion();
        editorial = new Editorial();
    }

    /**
     * Constructor parametrizado
     * @param isbn codigo internacional univoco de una publicacion
     * @param fechaInventario Fecha en la que se ha inventariado la publicación
     * @param numeroInventario identificador unívoco de la publicación dentro 
     * del catalogo de publicaciones
     * @param autores representa el/los autores de la publicación
     * @param titulo titulo de la publicación
     * @param edicion indica si es primera, segunda, etc edición
     * @param ubicacionEdicion Lugar donde se ha editado la publicación
     * @param editorial editorial que ha liberado la publicación
     * @param anioPublicacion año de publicación
     * @param cdu Clasificación interna para uso personal de los bibliotecarios
     * @param observaciones permite registrar observaciones sobre la publicación
     */
    public Publicacion(String isbn, Date fechaInventario, Integer numeroInventario, List<Autor> autores, String titulo, String edicion, UbicacionEdicion ubicacionEdicion, Editorial editorial, Short anioPublicacion, String cdu, String observaciones) {
        this.isbn = isbn;
        this.fechaInventario = fechaInventario;
        this.numeroInventario = numeroInventario;
        this.autores = autores;
        this.titulo = titulo;
        this.edicion = edicion;
        this.ubicacionEdicion = ubicacionEdicion;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cdu = cdu;
        this.observaciones = observaciones;
    }
    
    // seccion de getters y setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getFechaInventario() {
        return fechaInventario;
    }

    public void setFechaInventario(Date fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public Integer getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(Integer numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public UbicacionEdicion getUbicacionEdicion() {
        return ubicacionEdicion;
    }

    public void setUbicacionEdicion(UbicacionEdicion ubicacionEdicion) {
        this.ubicacionEdicion = ubicacionEdicion;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Short getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getCdu() {
        return cdu;
    }

    public void setCdu(String cdu) {
        this.cdu = cdu;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
