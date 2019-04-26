/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource de usuarios
 * @author caroapaza
 */
public class ListadoUsuarios implements Serializable{
    private List<Usuario> listaUsuarios;

    public ListadoUsuarios() {
        listaUsuarios = new ArrayList<>();
        ListadoRoles listaRoles = new ListadoRoles();
        listaUsuarios.add(new Usuario(26798152, "Perez", "Juan", "3885872896",
                "perezjuan@mail.com", "123", "N", listaRoles.getListaRoles().get(0)));
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
}
