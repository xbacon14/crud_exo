package py.com.cube.model;

import java.time.LocalDateTime;

public record CotizacionResponse(Cotizacion anterior, Cotizacion actual, LocalDateTime timestamp) {
}