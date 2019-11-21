/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoempresa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.uv.dao.Departamento;
import org.uv.dao.Empleado;
import org.uv.dao.FactoryDAO;
import org.uv.dao.HibernateUtil;
import org.uv.dao.IDAOGeneral;

/**
 *
 * @author Kronoz
 */
public class DAOEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IDAOGeneral<Departamento, String> dao;

    /**
     * Creates a new instance of DepartamentoResource
     */
    
        dao = FactoryDAO.create(FactoryDAO.Type.DEPARTAMENTO);
        /*SessionFactory session = HibernateUtil.getSessionFactory();
        //Departamento dep = new Departamento();
        
        Session s = session.openSession();
        Transaction t = s.beginTransaction();
        
        //Departamento dep = new Departamento();
        //dep.setClave("01");
        //dep.setNombre("Contabilidad");
        
        /*Departamento dep = (Departamento)s.load(Departamento.class, "04");
        
        Empleado emp = new Empleado();
        emp.setClave("01");
        emp.setNombre("Aldo Diaz Torres");
        emp.setDireccion("Av Siempre Viva #642");
        emp.setTelefono("271-179-19-43");
        emp.setDepartamento(dep);
        
        s.save(emp);
        
        t.commit();
        s.close();
        session.close();*/
    }
    
}
