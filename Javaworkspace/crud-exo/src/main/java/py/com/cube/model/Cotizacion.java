package py.com.cube.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "BS_COTIZACION")
@Entity
@Data
public class Cotizacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COTIZACION")
	private Long id;

	@Column(name = "VL_COMPRA")
	private BigDecimal vlCompra;

	@Column(name = "VL_VENTA")
	private BigDecimal vlVenta;

	@Column(name = "DT_COTIZACION")
	private LocalDateTime dtCotizacion;

	@ManyToOne
	@JoinColumn(name = "ID_MONEDA", referencedColumnName = "ID_MONEDA")
	private Moneda moneda;

	@PrePersist
	void dtCotizacion() {
		this.dtCotizacion = LocalDateTime.now();
	}

	public Boolean validarCotizacion() {
		if (vlCompra == null || vlVenta == null || moneda == null) {
			return false;
		}
		return true;
	}
}
