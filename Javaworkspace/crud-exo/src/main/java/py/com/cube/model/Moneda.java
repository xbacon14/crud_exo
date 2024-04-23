package py.com.cube.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "BS_MONEDA")
@Entity
@Data
public class Moneda {

//	1- GUARANI
//	2- DOLAR
//	3- REAL

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MONEDA")
	private Long id;

	@Column(name = "DS_MONEDA")
	private String descripcion;

}
