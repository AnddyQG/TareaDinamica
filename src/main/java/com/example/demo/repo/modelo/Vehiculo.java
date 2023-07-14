package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@SequenceGenerator(name = "seq_vehiculo", sequenceName = "seq_vehiculo", allocationSize = 1)
	@GeneratedValue(generator = "seq_vehiculo", strategy = GenerationType.SEQUENCE)
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	@Column(name = "vehi_fecha_ensamble")
	private LocalDate fechaEnsamble;
	@Column(name = "vehi_color")
	private String color;
	
	@OneToMany(mappedBy = "vehiculo",cascade = CascadeType.ALL)
	private List<Renta> rentas;
	
	
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", placa=" + placa + ", marca=" + marca + ", precio=" + precio
				+ ", fechaEnsamble=" + fechaEnsamble + ", color=" + color + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaEnsamble() {
		return fechaEnsamble;
	}

	public void setFechaEnsamble(LocalDate fechaEnsamble) {
		this.fechaEnsamble = fechaEnsamble;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}



}
