/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author caroapaza
 */
public class Rol implements Serializable{
    private int codigo;
    private String nombre;
    private String descripcion;
    private String borrado;

    public Rol() {
    }

    public Rol(int codigo, String nombre, String descripcion, String borrado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.borrado = borrado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBorrado() {
        return borrado;
    }

    public void setBorrado(String borrado) {
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return "Rol{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", borrado=" + borrado + '}';
    }
    
    
    
}
