package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedor_id", nullable = false)
    private int proveedorId;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    public Proveedor() {
    }

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public String getNombre() {
        return nombre;
    }
}
