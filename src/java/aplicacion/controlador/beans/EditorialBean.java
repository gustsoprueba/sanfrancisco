/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.imp.EditorialDAOImp;
import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author candeluchi
 */
@ManagedBean
@SessionScoped
public class EditorialBean implements Serializable {
    
    private EditorialDAOImp editorialDAOImp;
    private Editorial editorial;

    /**
     * Creates a new instance of EditorialBean
     */
    public EditorialBean() {
        editorialDAOImp = new EditorialDAOImp();
        editorial = new Editorial();
    }

    public EditorialDAOImp getEditorialDAOImp() {
        return editorialDAOImp;
    }

    public void setEditorialDAOImp(EditorialDAOImp editorialDAOImp) {
        this.editorialDAOImp = editorialDAOImp;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public void iniciarEditorial(){
        editorial = new Editorial();
    }
    
    public void agregarEditoria(){
        editorialDAOImp.crear(editorial);
    }
    
    public void modificarEditorial(Editorial editorial){
        editorialDAOImp.modificar(editorial);
    }
    public void eliminarEditorial(Editorial editorial){
        editorialDAOImp.borrar(editorial);
    }
    
}
