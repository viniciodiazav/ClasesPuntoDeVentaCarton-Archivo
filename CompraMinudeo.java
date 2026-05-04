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

@Entity
@Table(name = "compras_minudeo")
public class CompraMinudeo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compra_id", nullable = false)
    private long compraId;
    
    @OneToOne
    @JoinColumn(name = "id_transaccion", nullable = false)
    private Transaccion transaccion;
    
    @ManyToOne
    @JoinColumn(name = "id_operador", nullable = false)
    private Usuario operador;

    public CompraMinudeo() {
    }

    public long getCompraId() {
        return compraId;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public Usuario getOperador() {
        return operador;
    }
    
}
