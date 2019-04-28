/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Autor;
import java.util.List;

/**
 *
 * @author candeluchi
 */
public interface IAutorDAO {
    public List<Autor> obtenerAutores();
    public void crear(Autor autor);
    public void modificar(Autor autor);
    public void borrar(Autor autor);
    
}
