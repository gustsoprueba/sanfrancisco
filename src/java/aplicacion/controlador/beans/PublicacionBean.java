/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IPublicacionDAO;
import aplicacion.dao.imp.PublicacionDAOImp;
import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class PublicacionBean implements Serializable{
    private IPublicacionDAO publicacionDAO;
    /**
     * Creates a new instance of PublicaconBean
     */
    public PublicacionBean() {
        publicacionDAO = new PublicacionDAOImp();
    }
    
    public List<Publicacion> obtenerPublicaciones(){
        return publicacionDAO.obtenerPublicaciones();
    }
    
}
