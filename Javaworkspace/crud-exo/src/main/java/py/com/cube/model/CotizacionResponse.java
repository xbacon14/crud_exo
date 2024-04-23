package py.com.cube.model;

import java.time.LocalDateTime;

public record CotizacionResponse(Cotizacion cotizacionAnterior, Cotizacion cotizacionActual, LocalDateTime timestamp) {
}