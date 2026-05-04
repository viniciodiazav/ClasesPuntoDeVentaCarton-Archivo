package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Data
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
    private double pesoBruto;
    
    @Column(name = "tara_kgms", nullable = false)
    private double tara;
    
    @Column(name = "peso_neto_kgms", nullable = false)
    private double pesoNeto;
    
    @Column(name = "nombre_conductor", nullable = false, length = 30)
    private String nombreConductor;
    
    @Column(name = "placas_camion", nullable = false, length = 20)
    private String placasCamion;

    @OneToOne
    @JoinColumn(name = "id_transaccion", nullable = false)
    private Transaccion transaccion;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    public CompraMayoreo() {
    }
    
}
