package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "material")
public class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id", nullable = false)
    private short materialId;
    
    @Column(name = "tipo_material", nullable = false, unique = true, length = 50)
    final private String tipo;
    
    @Column(name = "precio_de_compra", nullable = false)
    private float precioCompra;
    
    @Column(name = "precio_de_venta", nullable = false)
    private float precioVenta;

    public Material(String tipo, float precioCompra, float precioVenta) {
        this.tipo = tipo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }
    
    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public short getMaterialId() {
        return materialId;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }
    
}
