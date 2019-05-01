/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Editorial;
import java.util.List;

/**
 *
 * @author candeluchi
 */
public interface IEditorialDAO {
    public List<Editorial> obtenerEditoriales();
    public void crear(Editorial editorial);
    public void modificar(Editorial editorial);
    public void borrar(Editorial editorial);    
}
