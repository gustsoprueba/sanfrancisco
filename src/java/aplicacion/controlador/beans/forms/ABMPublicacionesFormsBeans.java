/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PublicacionBean;
import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class ABMPublicacionesFormsBeans implements Serializable{
    private List<Publicacion> publicaciones;
    @ManagedProperty(value = "#{publicacionBean}")
    private PublicacionBean publicacionBean;
    /**
     * Creates a new instance of ABMPublicacionesFormsBeans
     */
    public ABMPublicacionesFormsBeans() {
        
    }

    public void generarPublicaciones(){
        publicaciones = publicacionBean.obtenerPublicaciones();
    }
    
    @PostConstruct
    public void init(){
        generarPublicaciones();
    }
    
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public PublicacionBean getPublicacionBean() {
        return publicacionBean;
    }

    public void setPublicacionBean(PublicacionBean publicacionBean) {
        this.publicacionBean = publicacionBean;
    }
    
    
}
