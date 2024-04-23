package py.com.cube.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import py.com.cube.model.Cotizacion;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Long> {
	@Query(value = "SELECT c.* FROM bs_cotizacion c ORDER BY c.ID_COTIZACION DESC LIMIT 2", nativeQuery = true)
	List<Cotizacion> findCotizacionActualAndAnterior();
}
