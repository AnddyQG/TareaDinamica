package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.repo.modelo.dto.VehiculoDto;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class TareaDinamicaApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TareaDinamicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		//this.iVehiculoService.agregar(vehiculo);
		
//		List<Vehiculo> vehiculoE= this.iVehiculoService.buscarVehiculoDinamico("123ABC", "MERCEDES", new BigDecimal(4500));
//		System.out.println(vehiculoE);
//		
//		Integer aux=this.iVehiculoService.borrarPorPlaca("564AAA");
//		System.out.println("Se a eliminado " + aux + " vehiculos");
//		
//		Integer aux2=this.iVehiculoService.actualizarPorPlaca("321AFC", "VERDE");
//		System.out.println("Se a actualizado "+ aux2 +" vehiculos");
//		
		
//		List<VehiculoDto>dtos=  this.iVehiculoService.encontrarTodosDto();
//		dtos.stream().forEach(System.out::println);
		System.out.println("INNER JOIN");
		this.iVehiculoService.buscarVehiculoInnerJoin().stream().forEach(System.out::println);
		this.iVehiculoService.buscarRentaInnerJoin().stream().forEach(System.out::println);
		System.out.println("RIHT JOIN");
		this.iVehiculoService.buscarVehiculoOuterRightJoin().stream().forEach(System.out::println);
		this.iVehiculoService.buscarRentaOuterRightJoin().stream().forEach(System.out::println);
		
		System.out.println("LEFT JOIN");
		this.iVehiculoService.buscarVehiculoOuterLeftJoin().stream().forEach(System.out::println);
		this.iVehiculoService.buscarRentaOuterLeftJoin().stream().forEach(System.out::println);
		System.out.println("FULL JOIN");
		
		this.iVehiculoService.buscarVehiculoOuterFullJoin().stream().forEach(System.out::println);
		this.iVehiculoService.buscarRentaOuterFullJoin().stream().forEach(System.out::println);
		
		System.out.println("WHERE JOIN");
		this.iVehiculoService.buscarVehiculoWhereJoin().stream().forEach(System.out::println);
		this.iVehiculoService.buscarRentaWhereJoin().stream().forEach(System.out::println);
		
		
		
	}

}
