/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.EditorialBean;
import aplicacion.controlador.beans.PublicacionBean;
import aplicacion.modelo.dominio.Editorial;
import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class ABMPublicacionesFormsBeans implements Serializable{
    private Publicacion nuevaPublicacion;
    private List<Publicacion> publicaciones;
    @ManagedProperty(value = "#{editorialBean}")
    private EditorialBean editorialBean;
    @ManagedProperty(value = "#{publicacionBean}")
    private PublicacionBean publicacionBean;
    /**
     * Creates a new instance of ABMPublicacionesFormsBeans
     */
    public ABMPublicacionesFormsBeans() {
        
    }

    public void generarPublicaciones(){
        publicaciones = publicacionBean.obtenerPublicaciones();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("publicaciones", publicaciones);
        
    }
    
    public void guardarNuevaPublicacion(){
        publicacionBean.agregarPublicacion(nuevaPublicacion);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, 
                        "Transacción Exitosa", "Se ha registrada la nueva publicación"));
        PrimeFaces.current().executeScript("PF('nuevaPublicacion').hide();");
        generarPublicaciones();
        nuevaPublicacion = new Publicacion();
    }
    
    @PostConstruct
    public void init(){
        nuevaPublicacion = new Publicacion();
        generarPublicaciones();
    }
    
    public List<Editorial> obtenerEditoriales(){
        return editorialBean.obtenerEditoriales();
    }

    public Publicacion getNuevaPublicacion() {
        return nuevaPublicacion;
    }

    public void setNuevaPublicacion(Publicacion nuevaPublicacion) {
        this.nuevaPublicacion = nuevaPublicacion;
    }
    
    
    
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    
    

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public EditorialBean getEditorialBean() {
        return editorialBean;
    }

    public void setEditorialBean(EditorialBean editorialBean) {
        this.editorialBean = editorialBean;
    }
    
    

    public PublicacionBean getPublicacionBean() {
        return publicacionBean;
    }

    public void setPublicacionBean(PublicacionBean publicacionBean) {
        this.publicacionBean = publicacionBean;
    }
    
    
}
