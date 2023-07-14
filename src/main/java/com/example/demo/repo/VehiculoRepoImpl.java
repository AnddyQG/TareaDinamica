package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Renta;
import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.repo.modelo.dto.VehiculoDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public List<Vehiculo> seleccionarVehiculoDinamico(String placa, String marca, BigDecimal precio) {

		CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Vehiculo> criteriaQuery = builder.createQuery(Vehiculo.class);
		Root<Vehiculo> myTabla = criteriaQuery.from(Vehiculo.class);

		Predicate vPlaca = builder.equal(myTabla.get("placa"), placa);
		Predicate vMarca = builder.equal(myTabla.get("marca"), marca);
		// si su precio es menor a 5k AND
		// si su precio es mayor igual a 5k OR
		Predicate predicadoFinal = null;
		if (precio.compareTo(new BigDecimal(5000)) < 0) {
			predicadoFinal = builder.and(vPlaca, vMarca);
		} else {
			predicadoFinal = builder.or(vPlaca, vMarca);
		}

		criteriaQuery.select(myTabla).where(predicadoFinal);
		TypedQuery<Vehiculo> queryFinal = this.entityManager.createQuery(criteriaQuery);
		return queryFinal.getResultList();

	}

	@Override
	public int eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("DELETE FROM Vehiculo e WHERE e.placa = :datoPlaca");
		query.setParameter("datoPlaca", placa);

		return query.executeUpdate();
	}

	@Override
	public int actualizarPorPlaca(String placa, String color) {
		// TODO Auto-generated method stub
		Query query = this.entityManager
				.createQuery("UPDATE Vehiculo e SET e.color = :datoColor WHERE e.placa = :datoPlaca");
		query.setParameter("datoColor", color);
		query.setParameter("datoPlaca", placa);

		return query.executeUpdate();
	}

	@Override
	public List<VehiculoDto> seleccionarTodosDto() {
		// TODO Auto-generated method stub
		TypedQuery<VehiculoDto> query = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repo.modelo.dto.VehiculoDto(e.placa, e.marca) FROM Vehiculo e",
				VehiculoDto.class);

		return query.getResultList();
	}

	@Override
	public List<Vehiculo> seleccionarVehiculoInnerJoin() {

//SELECT * FROM vehiculo v inner join renta r on v.vehi_id = r.rent_id_vehiculo
		String queryString = "SELECT v from Vehiculo v JOIN v.rentas r";

		TypedQuery<Vehiculo> query = this.entityManager.createQuery(queryString, Vehiculo.class);
		return query.getResultList();

	}

	@Override
	public List<Renta> seleccionarRentaInnerJoin() {
		// TODO Auto-generated method stub{

		String queryString = "SELECT r from Vehiculo v JOIN v.rentas r";
		TypedQuery<Renta> query = this.entityManager.createQuery(queryString, Renta.class);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> seleccionarVehiculoOuterRightJoin() {

		String queryString = "SELECT v from Vehiculo v RIGHT JOIN v.rentas r";

		TypedQuery<Vehiculo> query = this.entityManager.createQuery(queryString, Vehiculo.class);
		return query.getResultList();

	}

	@Override
	public List<Renta> seleccionarRentaOuterRightJoin() {

		String queryString = "SELECT r from Vehiculo v RIGHT JOIN v.rentas r";
		TypedQuery<Renta> query = this.entityManager.createQuery(queryString, Renta.class);
		return query.getResultList();

	}

	@Override
	public List<Vehiculo> seleccionarVehiculoOuterLeftJoin() {

		String queryString = "SELECT v from Vehiculo v LEFT JOIN v.rentas r";

		TypedQuery<Vehiculo> query = this.entityManager.createQuery(queryString, Vehiculo.class);
		return query.getResultList();

	}

	@Override
	public List<Renta> seleccionarRentaOuterLeftJoin() {

		String queryString = "SELECT r from Vehiculo v LEFT JOIN v.rentas r";
		TypedQuery<Renta> query = this.entityManager.createQuery(queryString, Renta.class);
		return query.getResultList();

	}

	@Override
	public List<Vehiculo> seleccionarVehiculoOuterFullJoin() {
		String queryString = "SELECT v from Vehiculo v FULL JOIN v.rentas r";

		TypedQuery<Vehiculo> query = this.entityManager.createQuery(queryString, Vehiculo.class);
		return query.getResultList();
	}

	@Override
	public List<Renta> seleccionarRentaOuterFullJoin() {

		String queryString = "SELECT r from Vehiculo v FULL JOIN v.rentas r";
		TypedQuery<Renta> query = this.entityManager.createQuery(queryString, Renta.class);
		return query.getResultList();
	}

	@Override
	public List<Vehiculo> seleccionarVehiculoWhereJoin() {
		// TODO Auto-generated method stub
		// SELECT h.* from hotel h ,habitacion ha WHERE h.hotel_id=ha.habi_id_hotel
		// SELECT h FROM Hotel h, Habitacion ha WHERE h.hotelId = ha.habiIdHotel
		//SELECT h FROM Hotel h, Habitacion ha WHERE h= ha.hotel
String queryString = "SELECT v from Vehiculo v , Renta r WHERE v=r.vehiculo";
		
		TypedQuery<Vehiculo> query = this.entityManager.createQuery(queryString, Vehiculo.class);		
		return query.getResultList();
		
	}

	@Override
	public List<Renta> seleccionarRentaWhereJoin() {
		String queryString = "SELECT r from Vehiculo v , Renta r WHERE v=r.vehiculo";
		TypedQuery<Renta> query = this.entityManager.createQuery(queryString, Renta.class);
		return query.getResultList();
	}

}
