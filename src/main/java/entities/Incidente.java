package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Incidente implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false, unique=true)
    private int id;	
    @Column(name="relato_vitima")
	private String relatoVitima;
    @Column(name="violacao_vitima")
	private String violacaoVitima;
	private String providencias;	
	@Column(name="data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="vitima_id")
	private Vitima vitima;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="agressor_id")
	private Agressor agressor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRelatoVitima() {
		return relatoVitima;
	}

	public void setRelatoVitima(String relatoVitima) {
		this.relatoVitima = relatoVitima;
	}

	public String getViolacaoVitima() {
		return violacaoVitima;
	}

	public void setViolacaoVitima(String violacaoVitima) {
		this.violacaoVitima = violacaoVitima;
	}

	public String getProvidencias() {
		return providencias;
	}

	public void setProvidencias(String providencias) {
		this.providencias = providencias;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}

	public Agressor getAgressor() {
		return agressor;
	}

	public void setAgressor(Agressor agressor) {
		this.agressor = agressor;
	}	
}
