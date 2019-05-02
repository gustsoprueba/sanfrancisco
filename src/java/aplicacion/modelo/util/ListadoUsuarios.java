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
        listaUsuarios.add(new Usuario(25798152, "Diaz", "María", "3884870845",
                "diazmaria@mail.com", "456", "N", listaRoles.getListaRoles().get(1)));
        listaUsuarios.add(new Usuario(25798153, "Murillo", "Ignacio", "3884870888",
                "murillo@mail.com", "789", "N", listaRoles.getListaRoles().get(1)));
        listaUsuarios.add(new Usuario(25798154, "Mendita", "Ana Laura", "3884877444",
                "mendieta@mail.com", "222", "S", listaRoles.getListaRoles().get(1)));
    }
    
    public void agregar(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    public void eliminar(Usuario usuario){
        for(int i = 0; i< listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getDni() == usuario.getDni()){
                listaUsuarios.remove(i);
            }
        }
        
    }
    
    public void modificar(Usuario usuario){
        for(Usuario usu: listaUsuarios){
            if(usu.getDni() == usu.getDni()){
                usu = usuario;
            }
        }
    }
    
    public List<Usuario> obtenerUsuariosActivos(){
        List<Usuario> listado = new ArrayList();
        for(Usuario usu:listaUsuarios){
            if(usu.getBorrado().equals("N")){
                listado.add(usu);
            }
        }
        return listado;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
}
