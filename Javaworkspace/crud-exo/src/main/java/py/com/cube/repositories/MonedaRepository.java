package py.com.cube.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.cube.model.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {

}
