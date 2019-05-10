/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IPublicacionDAO;
import aplicacion.modelo.dominio.Publicacion;
import aplicacion.modelo.util.Catalogo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Ariel Vega
 */
public class PublicacionDAOImp implements Serializable, IPublicacionDAO{
    private Catalogo catalogo;

    public PublicacionDAOImp() {
        catalogo = new Catalogo();
    }
    
    
    
    @Override
    public List<Publicacion> obtenerPublicaciones() {
        return catalogo.getPublicaciones();
    }

    @Override
    public void agregarPublicacion(Publicacion nuevaPublicacion) {
        catalogo.agregarPublicacion(nuevaPublicacion);
    }
    
}
