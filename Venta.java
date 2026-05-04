package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "ventas")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venta_id", nullable = false)
    private long ventaId;
    
    @OneToMany(mappedBy = "venta")
    private List<Paca> pacasVendidas;
    
    @Column(name = "fecha_emision", nullable = false)
    private LocalDateTime fechaEmision;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;
    
    @Column(name = "nombre_conductor", nullable = false)
    private String nombreConductor;
    
    @Column(name = "placas_camion", nullable = false)
    private String placasCamion;
    
    public Venta() {
    }
    
}
