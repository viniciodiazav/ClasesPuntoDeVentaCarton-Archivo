package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "compras_mayoreo")
public class CompraMayoreo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compra_mayoreo_id", nullable = false)
    private long compraId;
    
    @Column(name = "fecha_entrada", nullable = false)
    private LocalDateTime entrada;
    
    @Column(name = "fecha_salida", nullable = false)
    private LocalDateTime salida;
    
    @Column(name = "peso_bruto_kgms", nullable = false)
    private long pesoBruto;
    
    @Column(name = "tara_kgms", nullable = false)
    private long tara;
    
    @Column(name = "peso_neto_kgms", nullable = false)
    private long pesoNeto;
    
    @ManyToOne
    @Column(name = "materal", nullable = false)
    private Material material;
    
}
