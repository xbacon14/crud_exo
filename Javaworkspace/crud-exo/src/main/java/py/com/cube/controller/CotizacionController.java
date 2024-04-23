package py.com.cube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.com.cube.model.Cotizacion;
import py.com.cube.model.CotizacionResponse;
import py.com.cube.service.CotizacionService;

@RestController
@RequestMapping({ "/api/cotizacion" })
public class CotizacionController {
	@Autowired
	private CotizacionService service;

	@PostMapping("/save")
	public ResponseEntity<CotizacionResponse> saveCotizacion(@RequestBody Cotizacion cotizacion) {
		return service.saveCotizacion(cotizacion);
	}
}
