/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IAutorDAO;
import aplicacion.dao.imp.AutorDAOImp;
import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author candeluchi
 */
@ManagedBean
@SessionScoped
public class AutorBean implements Serializable{
    private IAutorDAO autorDAO;
    /**
     * Creates a new instance of AutorBean
     */
    public AutorBean() {
        autorDAO = new AutorDAOImp();
    }
    
    public List<Autor> obtenerAutores(){
        return getAutorDAO().obtenerAutores();
    }
    
    public void agregarAutor(Autor nuevoAutor){
        autorDAO.crear(nuevoAutor);
    }
    
    public void modificarAutor(Autor autorModificado){
        autorDAO.modificar(autorModificado);
    }
    
    public void eliminarAutor(Autor autor){
        autorDAO.borrar(autor);
              

    }
    

    /**
     * @return the autorDAO
     */
    public IAutorDAO getAutorDAO() {
        return autorDAO;
    }

    /**
     * @param autorDAO the autorDAO to set
     */
    public void setAutorDAO(IAutorDAO autorDAO) {
        this.autorDAO = autorDAO;
    }

}
