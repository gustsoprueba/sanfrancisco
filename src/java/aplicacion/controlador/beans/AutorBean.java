/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IAutorDAO;
import aplicacion.dao.imp.AutorDAOImp;
import aplicacion.modelo.dominio.Autor;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author candeluchi
 */
@ManagedBean
@SessionScoped
public class AutorBean {

    private IAutorDAO autorDAO;
    private Autor autor;
    /**
     * Creates a new instance of AutorBean
     */
    public AutorBean() {
        autorDAO = new AutorDAOImp();
        autor = new Autor();
    }
    
    public List<Autor> obtenerAutores(){
        return getAutorDAO().obtenerAutores();
    }
    
    public void agregarAutor(){
        autorDAO.crear(autor);
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Exito",  "Se agrego un Autor correctamente." ));        
    }
    
    public void eliminarAutor(Autor autor){
        autorDAO.borrar(autor);
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Exito",  "Se elimino un Autor correctamente." ));        

    }
    
    public void iniciarAutor(){
        autor = new Autor();
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

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
