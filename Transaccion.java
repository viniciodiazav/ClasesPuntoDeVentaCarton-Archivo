package com.demo.punto_de_venta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "transacciones")
public class Transaccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaccion_id", nullable = false)
    private long transaccionId;
    
    @Column(name = "tipo_de_pago", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPago tipoPago;
    
    @Column(name = "monto_estimado", nullable = false)
    private BigDecimal montoEstimado;
    
    @Column(name = "descuento", nullable = false)
    private BigDecimal descuento;
    
    @Column(name = "monto_total", nullable = false)
    private BigDecimal montoTotal;

    public Transaccion() {
    }
    
    public Transaccion(TipoPago tipoPago, BigDecimal montoEstimado, BigDecimal descuento, BigDecimal montoTotal) {
        this.tipoPago = tipoPago;
        this.montoEstimado = montoEstimado;
        this.descuento = descuento;
        this.montoTotal = montoTotal;
    }

    public long getTransaccionId() {
        return transaccionId;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public BigDecimal getMontoEstimado() {
        return montoEstimado;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }
    
}
