package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id", nullable = false)
    private int usuarioId;
    
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;
    
    @Column(name = "usuario", nullable = false, unique = true, length = 30)
    private String usuario;
    
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    
    @Column(name = "rol", nullable = false)
    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Usuario() {
    }
}
