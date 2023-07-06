package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repo.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void insertar(Vehiculo vehiculo);
	public List<Vehiculo> seleccionarVehiculoDinamico(String placa,String marca, BigDecimal precio);
	public int eliminarPorPlaca(String placa);
	public int actualizarPorPlaca(String placa,String color);
	
}
