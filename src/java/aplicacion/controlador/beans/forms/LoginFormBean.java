/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author caroapaza
 */
@ManagedBean
@SessionScoped
public class LoginFormBean implements Serializable{
    @ManagedProperty (value="#{usuarioBean}")
    private UsuarioBean usuarioBean;

   private Integer dni;
   private String password;
   
    public LoginFormBean() {
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
    
    /**
     * Verificar si el dni y el password
     * corresponden a un usuario guardado en la
     * lista de usuarios
     * @return 
     */
    public String verificarCredenciales(){
        String resultado = "";
        Usuario usuario = usuarioBean.verificarCredenciales(dni, password);
        if(usuario != null){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
            resultado = "menu?faces-redirect=true";
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "acceso denegado", "las credenciales son incorrectas"));
        }
        return resultado;
    }
    
     /**
     * Cierra sesión 
     * @return página login
     */
    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cerrando Sesión", "Cerrando Sesión");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        return "login?faces-redirect=true";
                
      
    }
}
