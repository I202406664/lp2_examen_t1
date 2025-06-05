package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@DynamicInsert
@Getter@Setter
public class DentistaAdrianoRC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	private int idDentista;
	
	@Column(name = "cop", nullable = false)
	private String nroConsulta;
	
	@Column(name = "nombre_completo", nullable = false)
	private String nombreCompleto;
	
	@Column(name = "fecha_inicio_contrato", nullable = false)
	private LocalDate fechaContrato;
	
	@Column(name = "turno", nullable = false)
	private String turno;
	
	@Column(name = "correo", nullable = false)
	private String correo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad")
	private EspecialidadAdrianoRC idEspecialidad;
	
	@Override
	public String toString() {
		return nombreCompleto;
}
}
