package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vitima implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	@Column(name = "nome_vitima")
	private String nomeVitima;
	@Column(name = "sexo_vitima")
	private String sexoVitima;
	@Column(name = "idade_vitima")
	private int idadeVitima;
	@Column(name = "escolar_vitima")
	private String escolarVitima;
	@Column(name = "serie_vitima")
	private int serieVitima;
	@Column(name = "turno_vitima")
	private String turnoVitima;
	@Column(name = "endereco_vitima")
	private String enderecoVitima;
	
	@OneToOne(mappedBy = "vitima")
	private Incidente incidente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeVitima() {
		return nomeVitima;
	}
	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}
	public String getSexoVitima() {
		return sexoVitima;
	}
	public void setSexoVitima(String sexoVitima) {
		this.sexoVitima = sexoVitima;
	}
	public int getIdadeVitima() {
		return idadeVitima;
	}
	public void setIdadeVitima(int idadeVitima) {
		this.idadeVitima = idadeVitima;
	}
	public String getEscolarVitima() {
		return escolarVitima;
	}
	public void setEscolarVitima(String escolarVitima) {
		this.escolarVitima = escolarVitima;
	}
	public int getSerieVitima() {
		return serieVitima;
	}
	public void setSerieVitima(int serieVitima) {
		this.serieVitima = serieVitima;
	}
	public String getTurnoVitima() {
		return turnoVitima;
	}
	public void setTurnoVitima(String turnoVitima) {
		this.turnoVitima = turnoVitima;
	}
	public String getEnderecoVitima() {
		return enderecoVitima;
	}
	public void setEnderecoVitima(String enderecoVitima) {
		this.enderecoVitima = enderecoVitima;
	}
	public Incidente getIncidente() {
		return incidente;
	}
	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}
}
