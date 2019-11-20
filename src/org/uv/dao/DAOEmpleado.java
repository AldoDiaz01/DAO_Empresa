package org.uv.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Kronoz
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, String>{
    private SessionFactory factory;
    private Session session;
    
    public DAOEmpleado(){
        factory = HibernateUtil.getSessionFactory();

    }

    @Override
    public boolean guardar(Empleado pojo) {
        session= factory.openSession();
        session.beginTransaction();
        session.save(pojo);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean eliminar(String id) {
        Empleado empleado = buscarById(id);
        session = factory.openSession();
        session.beginTransaction();
        session.delete(empleado);
        session.getTransaction().commit();;
        session.close();
        return true; 
    }

    @Override
    public boolean modificar(Empleado pojo) {
        session = factory.openSession();
        session.beginTransaction();
        session.update(pojo);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Empleado buscarById(String id) {
        Empleado empleado = null;
        session = factory.openSession();
        empleado = (Empleado)session.get(Empleado.class, id);
        session.close();
        return empleado;
    }

    @Override
    public List<Empleado> buscarTodos() {
        List<Empleado> lstEmpleado = new ArrayList<>();
        session = factory.openSession();
        lstEmpleado = session.createQuery("SELECT e FROM Empleado e").list();
        session.close();
        return lstEmpleado;
    }
}
