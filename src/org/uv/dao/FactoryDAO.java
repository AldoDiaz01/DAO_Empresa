package org.uv.dao;

/**
 *
 * @author Kronoz
 */
public class FactoryDAO {
    
    public enum Type{
        DEPARTAMENTO, EMPLEADO
    }
    public static IDAOGeneral create(Type t){
        IDAOGeneral dao = null;
        switch(t){
            case DEPARTAMENTO:
                dao = new DAODepartamento();
                break;
            case EMPLEADO:
                dao = new DAOEmpleado();
                break;
        }
        return dao;
    }
}
