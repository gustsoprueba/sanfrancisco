/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IEditorialDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Editorial;
import aplicacion.modelo.util.ListadoEditoriales;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author candeluchi
 */
public class EditorialDAOImp implements IEditorialDAO, Serializable {
    

    public EditorialDAOImp() {
        //listadoEditoriales = new ListadoEditoriales();
    }
     
    @Override
    public List<Editorial> obtenerEditoriales() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sesion.createCriteria(Editorial.class);
        List<Editorial> editoriales = criteria.list();
        sesion.close();
        return editoriales;
    }

    @Override
    public void crear(Editorial editorial) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(editorial);
        sesion.getTransaction().commit();
        sesion.close();
        //listadoEditoriales.agregar(editorial);
    }

    @Override
    public void modificar(Editorial editorial) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.update(editorial);
        sesion.getTransaction().commit();
        sesion.close();
    }

    @Override
    public void borrar(Editorial editorial) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.delete(editorial);
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    
}
