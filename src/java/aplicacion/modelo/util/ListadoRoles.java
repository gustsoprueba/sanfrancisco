/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Rol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource de roles
 * @author caroapaza
 */
public class ListadoRoles implements Serializable{
    private List<Rol> listaRoles;

    public ListadoRoles() {
        listaRoles = new ArrayList<>();
        listaRoles.add(new Rol(1, "administrador", "Usuario con todos los permisos para crear, modificar, eliminar", "N"));
        listaRoles.add(new Rol(1, "usuario", "Usuario solo con permiso de lectura de catálogo", "N"));
    }

    public List<Rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Rol> listaRoles) {
        this.listaRoles = listaRoles;
    }
    
    
}
