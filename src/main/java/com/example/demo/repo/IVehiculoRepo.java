package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repo.modelo.Renta;
import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.repo.modelo.dto.VehiculoDto;

public interface IVehiculoRepo {

	public void insertar(Vehiculo vehiculo);
	public List<Vehiculo> seleccionarVehiculoDinamico(String placa,String marca, BigDecimal precio);
	public int eliminarPorPlaca(String placa);
	public int actualizarPorPlaca(String placa,String color);
	public List<VehiculoDto>seleccionarTodosDto();
	
	public List<Vehiculo> seleccionarVehiculoInnerJoin();
	public List<Renta> seleccionarRentaInnerJoin();
	public List<Vehiculo> seleccionarVehiculoOuterRightJoin();
	public List<Renta> seleccionarRentaOuterRightJoin();
	public List<Vehiculo> seleccionarVehiculoOuterLeftJoin();
	public List<Renta> seleccionarRentaOuterLeftJoin();
	public List<Vehiculo> seleccionarVehiculoOuterFullJoin();
	public List<Renta> seleccionarRentaOuterFullJoin();
	public List<Vehiculo> seleccionarVehiculoWhereJoin();
	public List<Renta> seleccionarRentaWhereJoin();
	
	
	
	
}
	
	
	
	

