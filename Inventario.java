package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventario_id", nullable = false)
    private long inventarioId;
    
    
    @Column(name = "fecha_de_corte", nullable = false, unique = true)
    private LocalDateTime fecha;
    
    @OneToMany(mappedBy = "inventario")
    @Column(name = "transacciones", nullable = false)
    private List<Transaccion> transacciones;
 
    @Column(name = "pacas_estimadas", nullable = false)
    private long pacasEstimadas;
    
    @OneToMany(mappedBy = "inventario")
    @Column(name = "pacas_reales", nullable = false)
    private List<Paca> pacasReales;

    public Inventario() {
    }
    
    
    
}
