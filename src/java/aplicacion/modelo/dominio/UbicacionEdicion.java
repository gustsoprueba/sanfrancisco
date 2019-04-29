/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Representa un lugar donde se ha editado publicaciones
 * @author Ariel Vega
 */
public class UbicacionEdicion implements Serializable{
    /**
     * representa un identificador unívoco para identificar una ubicación de
     * edición
     */
    private Integer codigo;
    /**
     * lugar de edición
     */
    private String lugarEdicion;

    /**
     * Constructor por defecto
     */
    public UbicacionEdicion() {
    }

    /**
     * Constructor parametrizado
     * @param codigo identificador unívoco de una ubicación de edición
     * @param lugarEdicion nombre del lugar de edición
     */
    public UbicacionEdicion(Integer codigo, String lugarEdicion) {
        this.codigo = codigo;
        this.lugarEdicion = lugarEdicion;
    }
    
    // SECCIÓN DE GETTERS Y SETTERS

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLugarEdicion() {
        return lugarEdicion;
    }

    public void setLugarEdicion(String lugarEdicion) {
        this.lugarEdicion = lugarEdicion;
    }
    
}
