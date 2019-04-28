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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author caroapaza
 */
@ManagedBean
@RequestScoped
public class UsuarioBean implements Serializable{

   private IUsuarioDAO iUsuarioDAO;
    public UsuarioBean() {
        iUsuarioDAO = new UsuarioDaoImpl();
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

    public IUsuarioDAO getiUsuarioDAO() {
        return iUsuarioDAO;
    }

    public void setiUsuarioDAO(IUsuarioDAO iUsuarioDAO) {
        this.iUsuarioDAO = iUsuarioDAO;
    }
    
    
    
}
