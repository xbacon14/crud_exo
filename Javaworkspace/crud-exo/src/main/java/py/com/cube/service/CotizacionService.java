package py.com.cube.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.cube.model.Cotizacion;
import py.com.cube.model.CotizacionResponse;
import py.com.cube.repositories.CotizacionRepository;

@Service
@Transactional(rollbackFor = Exception.class)
public class CotizacionService {

	@Autowired
	private CotizacionRepository repository;

	public ResponseEntity<CotizacionResponse> saveCotizacion(Cotizacion cotizacion) {

		if (cotizacion.validarCotizacion()) {
			repository.saveAndFlush(cotizacion);
			List<Cotizacion> result = repository.findCotizacionActualAndAnterior();

			Cotizacion cotizacionActual = result.get(0);
			Cotizacion cotizacionAnterior = result.size() > 1 ? result.get(1) : null;

			return ResponseEntity.ok(new CotizacionResponse(cotizacionAnterior, cotizacionActual, LocalDateTime.now()));
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

	}
}
