/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Publicacion;
import java.util.List;

/**
 *
 * @author Ariel Vega
 */
public interface IPublicacionDAO {
    void agregarPublicacion(Publicacion nuevaPublicacion);
    List<Publicacion> obtenerPublicaciones();
    
}
