/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IUbicacionEdicionDAO;
import aplicacion.dao.imp.UbicacionEdicionDAOImp;
import aplicacion.modelo.dominio.UbicacionEdicion;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 * Bean administrador que gestiona el patron DAO para un objeto tipo 
 * UbicacionEdicion
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class UbicacionEdicionBean implements Serializable{

    private IUbicacionEdicionDAO ubicacionEdicionDAO;
    private UbicacionEdicion ubicacionEdicion;
    /**
     * Creates a new instance of AutorBean
     */
    public UbicacionEdicionBean() {
        ubicacionEdicionDAO = new UbicacionEdicionDAOImp();
        ubicacionEdicion = new UbicacionEdicion();
    }
    
    public List<UbicacionEdicion> obtenerUbicaciones(){
        return getUbicacionEdicionDAO().obtenerUbicaciones();
    }
    
    public void agregarUbicacion(){
        ubicacionEdicionDAO.crear(ubicacionEdicion);
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Exito",  "Se agrego una Ubicacion de Edición correctamente." ));        
    }
    
    public void eliminarUbicacion(UbicacionEdicion ubicacionEdicion){
        ubicacionEdicionDAO.borrar(ubicacionEdicion);
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Exito",  "Se elimino una Ubicación de Edición correctamente." ));        

    }
    
    public void iniciarUbicacionEdicion(){
        ubicacionEdicion = new UbicacionEdicion();
    }

    public IUbicacionEdicionDAO getUbicacionEdicionDAO() {
        return ubicacionEdicionDAO;
    }

    public void setUbicacionEdicionDAO(IUbicacionEdicionDAO ubicacionEdicionDAO) {
        this.ubicacionEdicionDAO = ubicacionEdicionDAO;
    }

    public UbicacionEdicion getUbicacionEdicion() {
        return ubicacionEdicion;
    }

    public void setUbicacionEdicion(UbicacionEdicion ubicacionEdicion) {
        this.ubicacionEdicion = ubicacionEdicion;
    }

    
}
