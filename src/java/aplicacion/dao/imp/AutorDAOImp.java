/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAutorDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.util.ListadoAutores;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author candeluchi
 */
public class AutorDAOImp implements IAutorDAO, Serializable {
  
    @Override
    public List<Autor> obtenerAutores() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Autor.class);
        List<Autor> autores = criteria.list();
        session.close();
        return autores;
    }

    @Override
    public void crear(Autor autor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(autor);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void modificar(Autor autor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(autor);
        session.getTransaction().commit();;
        session.close();
    }

    @Override
    public void borrar(Autor autor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(autor);
        session.getTransaction().commit();;
        session.close();
    }
    
}
