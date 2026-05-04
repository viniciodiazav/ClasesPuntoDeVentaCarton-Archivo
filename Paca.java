package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "pacas")
public class Paca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paca_id", nullable = false)
    private long pacaId;
    
    @Column(name = "fecha_emision", nullable = false)
    private LocalDateTime fechaEmision;
    
    @Column(name = "codigo_paca", nullable = false, length = 200)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_inventario")
    private Inventario inventario;
    
    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = true)
    private Venta venta;
    
    public Paca() {
    }
    
}
