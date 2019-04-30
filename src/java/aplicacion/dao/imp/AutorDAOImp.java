/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAutorDAO;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.util.ListadoAutores;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author candeluchi
 */
public class AutorDAOImp implements IAutorDAO, Serializable {
    
    private ListadoAutores listaAutores = new ListadoAutores();

    @Override
    public List<Autor> obtenerAutores() {
        return listaAutores.getAutores();
    }

    @Override
    public void crear(Autor autor) {
        listaAutores.agregar(autor);
    }

    @Override
    public void modificar(Autor autor) {
        listaAutores.modificar(autor);
    }

    @Override
    public void borrar(Autor autor) {
        listaAutores.eliminar(autor);
    }
    
}
