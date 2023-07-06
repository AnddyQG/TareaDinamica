package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Vehiculo;
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
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setColor("Plomo");
		vehiculo.setFechaEnsamble(LocalDate.of(2023, 9, 10));
		vehiculo.setMarca("LAMBO");
		vehiculo.setPlaca("564AAA");
		vehiculo.setPrecio(new BigDecimal(65500));
		
		//this.iVehiculoService.agregar(vehiculo);
		
		List<Vehiculo> vehiculoE= this.iVehiculoService.buscarVehiculoDinamico("123ABC", "MERCEDES", new BigDecimal(4500));
		System.out.println(vehiculoE);
		
//		Integer aux=this.iVehiculoService.borrarPorPlaca("564AAA");
//		System.out.println("Se a eliminado " + aux + " vehiculos");
//		
//		Integer aux2=this.iVehiculoService.actualizarPorPlaca("321AFC", "VERDE");
//		System.out.println("Se a actualizado "+ aux2 +" vehiculos");
//		
	}

}
