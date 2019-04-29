/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IUbicacionEdicionDAO;
import aplicacion.modelo.dominio.UbicacionEdicion;
import aplicacion.modelo.util.ListadoUbicaciones;
import java.io.Serializable;
import java.util.List;

/**
 * Implementación del Patron DAO para objetos tipo UbicacionEdicion
 * en la coleccion ubicada en ListadoUbicaciones
 * @author Ariel Vega
 */
public class UbicacionEdicionDAOImp implements Serializable, IUbicacionEdicionDAO{
    ListadoUbicaciones listadoUbicaciones = new  ListadoUbicaciones();
    
    @Override
    public List<UbicacionEdicion> obtenerUbicaciones() {
        return listadoUbicaciones.getUbicacionEdiciones();
    }

    @Override
    public void crear(UbicacionEdicion ubicacionEdicion) {
        
        listadoUbicaciones.agregar(ubicacionEdicion);
    }

    @Override
    public void modificar(UbicacionEdicion ubicacionEdicion) {
        listadoUbicaciones.modificar(ubicacionEdicion);
    }

    @Override
    public void borrar(UbicacionEdicion ubicacionEdicion) {
        listadoUbicaciones.eliminar(ubicacionEdicion);
    }

    public ListadoUbicaciones getListadoUbicaciones() {
        return listadoUbicaciones;
    }

    public void setListadoUbicaciones(ListadoUbicaciones listadoUbicaciones) {
        this.listadoUbicaciones = listadoUbicaciones;
    }
    
}
