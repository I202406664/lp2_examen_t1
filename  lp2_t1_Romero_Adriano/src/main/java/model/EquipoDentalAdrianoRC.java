package model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class EquipoDentalAdrianoRC {

	@Id
	@Column(name = "nro_equipo")
	@EqualsAndHashCode.Include
	private int nroEquipo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "costo", nullable = false)
	private double precio;
	
	
	@Column(name = "fecha_adquisicion")
	private LocalDate fechaAdquisicion;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "id_dentista")
	private DentistaAdrianoRC dentista;
}
