/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.UbicacionEdicion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa el datasource de las ubicaciones donde se hab editado
 * las publicaciones
 * @author Ariel Vega
 */
public class ListadoUbicaciones implements Serializable{
    /**
     * ubicaciones de alguna de las publicaciones disponibles
     */
    private List<UbicacionEdicion> ubicaciones;

    /**
     * Constructor por defecto
     */
    public ListadoUbicaciones() {
        ubicaciones = new ArrayList<>(); // inicializa ubicaciones
        //Creo un ubicacion por defecto en el array de ubicaciones
        UbicacionEdicion ubicacion = new UbicacionEdicion(1, "Jujuy");
        ubicaciones.add(ubicacion);
    }

    public void agregar(UbicacionEdicion ubicacion){
        UbicacionEdicion ueAuxiliar = new UbicacionEdicion();
        ueAuxiliar.setCodigo(ubicacion.getCodigo());
        ueAuxiliar.setLugarEdicion(ubicacion.getLugarEdicion());
        ubicaciones.add(ubicacion);
    }
    
    public void eliminar(UbicacionEdicion ubicacion){
        for(int i = 0; i< ubicaciones.size();i++){
            if(ubicaciones.get(i).getCodigo().equals(ubicacion.getCodigo())){
                ubicaciones.remove(i);
            }
        }
        
    }
    
    public void modificar(UbicacionEdicion ubicacion){
        for(UbicacionEdicion ubicacionActual: ubicaciones){
            if(ubicacionActual.getCodigo().equals(ubicacion.getCodigo())){
                ubicacionActual = ubicacion;
            }
        }
    }
    
    /**
     * Constructor parametrizado
     * @param ubicaciones el listado de ubicaciones
     */
    public ListadoUbicaciones(List<UbicacionEdicion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    // sección de getters y setters
    
    public List<UbicacionEdicion> getUbicacionEdiciones() {
        return ubicaciones;
    }

    public void setUbicacionEdiciones(List<UbicacionEdicion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
}
