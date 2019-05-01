/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.EditorialBean;
import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author candeluchi
 */
@ManagedBean
@SessionScoped
public class ABMEditorialesFormBean implements Serializable {

    @ManagedProperty( value = "#{editorialBean}")
    private EditorialBean editorialBean;
    private List<Editorial> editoriales;
    
    @PostConstruct
    public void init(){
        cargarEditoriales();
    }
    
    /**
     * Creates a new instance of EditorialFormBean
     */
    public ABMEditorialesFormBean() {
    }

    public EditorialBean getEditorialBean() {
        return editorialBean;
    }

    public void setEditorialBean(EditorialBean editorialBean) {
        this.editorialBean = editorialBean;
    }

    public List<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(List<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
    
    public void cargarEditoriales(){
        editoriales = editorialBean.getEditorialDAOImp().getListadoEditoriales().getEditoriales();
    }
    
    public void onRowEdit(RowEditEvent event) {
        
        //en caso de trabajar con BD Real deberia lanzar la
        //actualizacion en la misma, y no solo quedarme con la actualizacion
        //en el arrayList de memoria.
        
        Editorial editorialModificada = ((Editorial) event.getObject());
        editorialBean.modificarEditorial(editorialModificada);
        
        FacesMessage msg = new FacesMessage("Editorial Modificada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void agregarNuevaEditorial(){
        editorialBean.agregarEditoria();
        editorialBean.setEditorial(new Editorial());
        FacesMessage msg = new FacesMessage("Editorial Agregada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);        
        
    }
    
    public void eliminarEditorialSeleccionado(Editorial editorial){
        editorialBean.eliminarEditorial(editorial);
        FacesMessage msg = new FacesMessage("Editorial Eliminada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);        
        
    }
    
    
}
