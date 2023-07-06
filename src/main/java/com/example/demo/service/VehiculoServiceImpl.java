package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IVehiculoRepo;
import com.example.demo.repo.modelo.Vehiculo;

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

	
	
}
