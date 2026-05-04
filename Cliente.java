package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private int clienteId;
    
    @Column(name = "direccion", nullable = false, length = 120)
    private String direccion;
    
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    
    @Column(name = "contacto", nullable = false, length = 255)
    private String contacto;
    
}
