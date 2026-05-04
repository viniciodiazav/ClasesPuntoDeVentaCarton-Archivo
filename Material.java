package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "materiales")
public class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id", nullable = false)
    private short materialId;
    
    @Column(name = "tipo_material", nullable = false, unique = true, length = 50)
    private String tipo;
    
    @Column(name = "precio_de_compra", nullable = false)
    private BigDecimal precioCompra;
    
    @Column(name = "precio_de_venta", nullable = false)
    private BigDecimal precioVenta;

    public Material() {
    }
    
}
