package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repo.modelo.Renta;
import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.repo.modelo.dto.VehiculoDto;

public interface IVehiculoService {

	public void agregar(Vehiculo vehiculo);
	public List<Vehiculo> buscarVehiculoDinamico(String placa,String marca, BigDecimal precio);
	public int borrarPorPlaca(String placa);
	public int actualizarPorPlaca(String placa,String color);
	public List<VehiculoDto> encontrarTodosDto();
	
	
	public List<Vehiculo> buscarVehiculoInnerJoin();
	public List<Renta> buscarRentaInnerJoin();
	
	
	public List<Vehiculo> buscarVehiculoOuterRightJoin();
	public List<Renta> buscarRentaOuterRightJoin();
	public List<Vehiculo> buscarVehiculoOuterLeftJoin();
	public List<Renta> buscarRentaOuterLeftJoin();
	public List<Vehiculo> buscarVehiculoOuterFullJoin();
	public List<Renta> buscarRentaOuterFullJoin();
	public List<Vehiculo> buscarVehiculoWhereJoin();
	public List<Renta> buscarRentaWhereJoin();
	
}
