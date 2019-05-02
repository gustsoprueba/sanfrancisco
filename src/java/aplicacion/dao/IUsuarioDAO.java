/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author caroapaza
 */
public interface IUsuarioDAO {
    Usuario verificarCredenciales(Integer dni, String password);
    void crearUsuario(Usuario usuario);
    List<Usuario> getListaUsuariosActivos();
    
}
