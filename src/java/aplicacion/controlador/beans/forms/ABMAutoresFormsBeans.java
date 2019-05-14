/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.AutorBean;
import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class ABMAutoresFormsBeans implements Serializable{
    @ManagedProperty(value = "#{autorBean}")
    private AutorBean autorBean;
    private Autor nuevoAutor;
    private List<Autor> autores;
    

    /**
     * Creates a new instance of ABMAutoresFormsBEans
     */
    public ABMAutoresFormsBeans() {
    }
    
    public void eliminarAutorSeleccionado(Autor autorSeleccionado){
        autorBean.eliminarAutor(autorSeleccionado);
        generarAutores();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Se ha eliminado el Autor Seleccionado"));
        generarAutores();
    }
    
    public void generarAutores(){
        autores = autorBean.obtenerAutores();
    }
    
    public void guardarNuevoAutor(){
        autorBean.agregarAutor(nuevoAutor);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Se ha registrado el nuevo Autor"));
        nuevoAutor = new Autor();
        generarAutores();
        PrimeFaces.current().executeScript("PF('nuevoAutor').hide();");
        
    }
    
    @PostConstruct
    public void init(){
        nuevoAutor = new Autor();
        generarAutores();
    }

    public void onRowEdit(RowEditEvent event) {
        Autor autorModificado = (Autor) event.getObject();
        autorBean.modificarAutor(autorModificado);
        generarAutores();
        FacesMessage msg = new FacesMessage("Exito", "Autor modificado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowEditCancel(RowEditEvent event) {
        
        FacesMessage msg = new FacesMessage("Edición Cancelada", "No se ha confirmado los cambios");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public AutorBean getAutorBean() {
        return autorBean;
    }

    public void setAutorBean(AutorBean autorBean) {
        this.autorBean = autorBean;
    }

    public Autor getNuevoAutor() {
        return nuevoAutor;
    }

    public void setNuevoAutor(Autor nuevoAutor) {
        this.nuevoAutor = nuevoAutor;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
    
}
