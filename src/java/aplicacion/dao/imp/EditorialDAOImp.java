/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IEditorialDAO;
import aplicacion.modelo.dominio.Editorial;
import aplicacion.modelo.util.ListadoEditoriales;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author candeluchi
 */
public class EditorialDAOImp implements IEditorialDAO, Serializable {

    private ListadoEditoriales listadoEditoriales;

    public EditorialDAOImp() {
        listadoEditoriales = new ListadoEditoriales();
    }

    public ListadoEditoriales getListadoEditoriales() {
        return listadoEditoriales;
    }

    public void setListadoEditoriales(ListadoEditoriales listadoEditoriales) {
        this.listadoEditoriales = listadoEditoriales;
    }
    
    
    @Override
    public List<Editorial> obtenerEditoriales() {
        return listadoEditoriales.getEditoriales();
    }

    @Override
    public void crear(Editorial editorial) {
        listadoEditoriales.agregar(editorial);
    }

    @Override
    public void modificar(Editorial editorial) {
        listadoEditoriales.modificar(editorial);
    }

    @Override
    public void borrar(Editorial editorial) {
        listadoEditoriales.eliminar(editorial);
    }
    
    
}
