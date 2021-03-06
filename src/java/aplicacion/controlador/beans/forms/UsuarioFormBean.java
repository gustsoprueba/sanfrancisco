/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListadoRoles;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;



/**
 *
 * @author caroapaza
 */
@ManagedBean
@ViewScoped
public class UsuarioFormBean implements Serializable{
    private boolean esAdministrador;
    private boolean esUsuario;
    @ManagedProperty(value="#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario usuario;
    
    public UsuarioFormBean() {
       usuario = new Usuario();
    }
    
   
    /**
     * Obtiene la lista de usuarios activos
     * @return 
     */
    public List<Usuario> obtenerListaUsuariosActivos(){
        return usuarioBean.obtenerListaUsuariosActivos();
    }
    
    /**
     * agrega un usuario
     * con rol usuario
     */
    public void agregarNuevoUsuario(){
        //recupero objeto rol usuario
        usuarioBean.getUsuario().setRol(new ListadoRoles().getListaRoles().get(1));
        usuarioBean.agregarUsuario();        
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Éxito",  "Se agregó un Usuario correctamente." ));   
        RequestContext.getCurrentInstance().execute("PF('dlgAltaUsuario').hide();");
    }
    
    /**
     * agrega un nuevo usuario
     * con rol administrador
     */
    public void agregarNuevoUsuarioAdmin(){
        //recupero objeto rol administrador
        usuario.setRol(new ListadoRoles().getListaRoles().get(0));
        usuarioBean.setUsuario(usuario);
        usuarioBean.agregarUsuario();
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage("Éxito",  "Se agregó un Usuario Administrador correctamente." ));
        RequestContext.getCurrentInstance().execute("PF('dlgAltaUsuario').hide();");
    }
    
    /**
     * retorna el nombre del usuario en sesión
     * @return 
     */
    public String devolverNombreUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return "[ " + usuario.getApellido()+", "+usuario.getNombre() + " ]  ";
    }

    /**
     * Verifica si el usuario 
     * logueado al sistema permanece en sesión
     * @return 
     */
    public boolean verificarSesion() {
        boolean sesionValida = false;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") != null) {
            sesionValida = true;
        }
        return sesionValida;
    }
    
    /**
     * Devuelve el rol de usuario
     * @return  nombre de rol (administrador o usuario)
     */
    public String devolverRolUsuario(){
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return usuario.getRol().getNombre();
    }
    
    /**
     * Retorna el nombre de la página
     * que permite dar de alta un usuario
     * @return 
     */
    public String generarNuevoUsuario(){
        return "usuario-new.xhtml";
    }
    
    /**
     * Retorna el nombre de la página
     * que permite loguear al usuario
     * @return 
     */
    public String mostrarLogin(){
        return "login.xhtml";
    }
    
    public void reiniciarObjetoUsuario(){
        usuario = new Usuario();
    }
    
    public void modificarDatosUsuario(){
        usuarioBean.setUsuario(usuario);
        usuarioBean.modificarUsuario();
        RequestContext.getCurrentInstance().execute("PF('dlgModificarUsuario').hide();");
    }

    public void asignarUsuario(Usuario usuario){
       this.usuario = usuario;
    }
    
    public void eliminarUsuario(Usuario usuario){
        usuarioBean.setUsuario(usuario);
        usuarioBean.eliminarUsuario();
    }

    public boolean isEsAdministrador() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if(usuario.getRol().getNombre().equals("administrador")){
            esAdministrador = true;
        }else{
            esAdministrador = false;
        }
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public boolean isEsUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if(usuario.getRol().getNombre().equals("usuario")){
            esUsuario = true;
        }else{
            esUsuario = false;
        }
        return esUsuario;
    }

    public void setEsUsuario(boolean esUsuario) {
        this.esUsuario = esUsuario;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
