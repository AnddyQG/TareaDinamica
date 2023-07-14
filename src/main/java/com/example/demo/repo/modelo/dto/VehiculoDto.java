package com.example.demo.repo.modelo.dto;

public class VehiculoDto {

	private String placa;
	private String marca;
	
	public VehiculoDto() {
		
	}
	
	public VehiculoDto(String placa, String marca) {
		super();
		this.placa = placa;
		this.marca = marca;
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

	@Override
	public String toString() {
		return "VehiculoDto [placa=" + placa + ", marca=" + marca + "]";
	}
	
	
	
}
