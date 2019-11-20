package org.uv.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Kronoz
 */

@Entity
@Table(name = "departamentos")
public class Departamento {
    
    @Id 
    @Column(name = "clave")
    private String clave;
    
    @Column(name = "nombre")
    private String nombre;
    
    public Departamento() {}
    public Departamento(String clave, String nombre)
    {
        this.clave = clave;
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
