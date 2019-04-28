/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListadoUsuarios;
import java.io.Serializable;
import java.util.List;



/**
 *
 * @author caroapaza
 */
public class UsuarioDaoImpl implements IUsuarioDAO,Serializable{
    private List<Usuario> listaUsuarios;

    public UsuarioDaoImpl() {
        listaUsuarios = new ListadoUsuarios().getListaUsuarios();
    }
    
    
    
    @Override
    public Usuario verificarCredenciales(Integer dni, String password) {
        Usuario usu = null;
        for(Usuario usuario: listaUsuarios){
            if(usuario.getDni() == dni && usuario.getPassword().equals(password)){
                usu = usuario;
            }
        }
        return usu;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
}
