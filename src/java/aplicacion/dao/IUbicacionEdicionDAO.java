/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.UbicacionEdicion;
import java.util.List;

/**
 * Representa la interfaz DAO para realizar la persistenciad de objetos
 * tipo UbicacionEdicion
 * @author Ariel Vega
 */
public interface IUbicacionEdicionDAO {
    public List<UbicacionEdicion> obtenerUbicaciones();
    public void crear(UbicacionEdicion ubicacionEdicion);
    public void modificar(UbicacionEdicion ubicacionEdicion);
    public void borrar(UbicacionEdicion ubicacionEdicion);
}
