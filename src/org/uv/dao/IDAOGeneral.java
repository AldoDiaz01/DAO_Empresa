package org.uv.dao;

import java.util.List;

/**
 *
 * @author Kronoz
 */
public interface IDAOGeneral <T, V> {
    
    public boolean guardar(T entity);
    public boolean modificar(T entity);
    public boolean eliminar(V id);
    public T buscarById(V id);
    public List<T> buscarTodos();
    
}
