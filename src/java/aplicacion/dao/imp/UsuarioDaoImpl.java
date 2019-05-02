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
    private ListadoUsuarios listadoUsuarios;

    public UsuarioDaoImpl() {
        listaUsuarios = new ListadoUsuarios().getListaUsuarios();
        listadoUsuarios = new ListadoUsuarios();
    }
    
    
    
    @Override
    public Usuario verificarCredenciales(Integer dni, String password) {
        Usuario usu = null;
        for(Usuario usuario: listadoUsuarios.obtenerUsuariosActivos()){
            if(usuario.getDni() == dni && usuario.getPassword().equals(password)){
                usu = usuario;
            }
        }
        return usu;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuario.setBorrado("N");
        listadoUsuarios.agregar(usuario);
        System.out.println("se agregó un usuario: "+usuario);
    }
    
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListadoUsuarios getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(ListadoUsuarios listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    @Override
    public List<Usuario> getListaUsuariosActivos() {
        return listadoUsuarios.obtenerUsuariosActivos();
    }
 
}
