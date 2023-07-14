package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IVehiculoRepo;
import com.example.demo.repo.modelo.Renta;
import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.repo.modelo.dto.VehiculoDto;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public List<Vehiculo> buscarVehiculoDinamico(String placa, String marca, BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoDinamico(placa, marca, precio);
	}

	@Override
	public int borrarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.eliminarPorPlaca(placa);
	}

	@Override
	public int actualizarPorPlaca(String placa, String color) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.actualizarPorPlaca(placa, color);
	}

	@Override
	public List<VehiculoDto> encontrarTodosDto() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarTodosDto();
	}

	@Override
	public List<Vehiculo> buscarVehiculoInnerJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoInnerJoin();
	}

	@Override
	public List<Renta> buscarRentaInnerJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarRentaInnerJoin();
	}

	@Override
	public List<Vehiculo> buscarVehiculoOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoOuterRightJoin();
	}

	@Override
	public List<Renta> buscarRentaOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarRentaOuterRightJoin();
	}

	@Override
	public List<Vehiculo> buscarVehiculoOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoOuterLeftJoin();
	}

	@Override
	public List<Renta> buscarRentaOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarRentaOuterLeftJoin();
	}

	@Override
	public List<Vehiculo> buscarVehiculoOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoOuterFullJoin();
	}

	@Override
	public List<Renta> buscarRentaOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarRentaOuterFullJoin();
	}

	@Override
	public List<Vehiculo> buscarVehiculoWhereJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarVehiculoWhereJoin();
	}

	@Override
	public List<Renta> buscarRentaWhereJoin() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionarRentaWhereJoin();
	}
	




	
	
}
