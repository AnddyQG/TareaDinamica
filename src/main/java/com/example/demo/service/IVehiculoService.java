package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repo.modelo.Vehiculo;

public interface IVehiculoService {

	public void agregar(Vehiculo vehiculo);
	public List<Vehiculo> buscarVehiculoDinamico(String placa,String marca, BigDecimal precio);
	public int borrarPorPlaca(String placa);
	public int actualizarPorPlaca(String placa,String color);
	
	
}
