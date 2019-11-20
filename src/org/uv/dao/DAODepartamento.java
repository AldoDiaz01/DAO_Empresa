package org.uv.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Kronoz
 */
public class DAODepartamento implements IDAOGeneral<Departamento, String>{
    
    private SessionFactory factory;
    private Session session;
    
    public DAODepartamento(){
        factory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean guardar(Departamento pojo) {
        
        session= factory.openSession();
        session.beginTransaction();
        session.save(pojo);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean eliminar(String id) {
        Departamento departamento = buscarById(id);
        session = factory.openSession();
        session.beginTransaction();
        session.delete(departamento);
        session.getTransaction().commit();;
        session.close();
        return true; 
    }

    @Override
    public boolean modificar(Departamento pojo) {
        session = factory.openSession();
        session.beginTransaction();
        session.update(pojo);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Departamento buscarById(String id) {
        Departamento departamento = null;
        session = factory.openSession();
        departamento = (Departamento)session.get(Departamento.class, id);
        session.close();
        return departamento;
    }

    @Override
    public List<Departamento> buscarTodos() {
        List<Departamento> lstDepartamento = new ArrayList<>();
        session = factory.openSession();
        lstDepartamento = session.createQuery("SELECT d FROM Departamento d").list();
        session.close();
        return lstDepartamento;
    }
}
