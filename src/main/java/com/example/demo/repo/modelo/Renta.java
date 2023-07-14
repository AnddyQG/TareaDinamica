package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	
	
	@Id
	@SequenceGenerator(name = "seq_renta", sequenceName = "seq_renta", allocationSize = 1)
	@GeneratedValue(generator = "seq_renta", strategy = GenerationType.SEQUENCE)
	@Column(name = "rent_id")
	
	
	private Integer id;
	@Column(name = "rent_fecha")
	private LocalDate fecha;
	@Column(name = "rent_numero_dias")
	private Integer numeroDias;
	@Column(name = "rent_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "rent_id_vehiculo")
	private Vehiculo vehiculo;
	
	
	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valor=" + valor + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
	
}
