/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.imp.UsuarioDaoImpl;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author caroapaza
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
   private Usuario usuario;
   private IUsuarioDAO iUsuarioDAO;
   
    public UsuarioBean() {
        iUsuarioDAO = new UsuarioDaoImpl();
        usuario = new Usuario();
    }
    /**
     * retorna un objeto usuario
     * si coinciden el dni y el password
     * enviados por parametros
     * @param dni
     * @param password
     * @return 
     */
    public Usuario verificarCredenciales(Integer dni, String password){
        return iUsuarioDAO.verificarCredenciales(dni, password);
    }
    
     public void agregarUsuario(){
        iUsuarioDAO.crearUsuario(usuario);
           
    }
     public void modificarUsuario(){
         iUsuarioDAO.modificarUsuario(usuario);
     }
     
     public void eliminarUsuario(){
         iUsuarioDAO.eliminarUsuario(usuario);
     }
        
     public List<Usuario> obtenerListaUsuariosActivos(){
         return iUsuarioDAO.getListaUsuariosActivos();
     }
     
    public IUsuarioDAO getiUsuarioDAO() {
        return iUsuarioDAO;
    }

    public void setiUsuarioDAO(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }

    public Usuario getUsuario() {
       usuario = new Usuario();
       return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
       
}
