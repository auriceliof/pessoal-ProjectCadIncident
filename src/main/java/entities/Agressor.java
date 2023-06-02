package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Agressor implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name="id", nullable=false, unique=true)
    private int id;	
    @Column(name="nome_agressor")
	private String nomeAgressor;
    @Column(name="sexo_agressor")
	private String sexoAgressor;
    @Column(name="idade_agressor")
	private int idadeAgressor;
    @Column(name="parente_agressor")
	private String parenteAgressor;
    @Column(name="ocupacao_agressor")
	private String ocupacaoAgressor;
    @Column(name="reca_agressor")
	private String racaAgressor;
    @Column(name="genero_agressor")
	private String generoAgressor;
    @Column(name="sexual_agressor")
	private String sexualAgressor;
    @Column(name="escolar_agressor")
	private String escolarAgressor;
    @Column(name="serie_Agressor")
   	private int serieAgressor;
    
    @OneToOne(mappedBy = "agressor")
	private Incidente incidente;
	
	public int getId() {
		
	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAgressor() {
		return nomeAgressor;
	}
	public void setNomeAgressor(String nomeAgressor) {
		this.nomeAgressor = nomeAgressor;
	}
	public String getSexoAgressor() {
		return sexoAgressor;
	}
	public void setSexoAgressor(String sexoAgressor) {
		this.sexoAgressor = sexoAgressor;
	}
	public int getIdadeAgressor() {
		return idadeAgressor;
	}
	public void setIdadeAgressor(int idadeAgressor) {
		this.idadeAgressor = idadeAgressor;
	}
	public String getParenteAgressor() {
		return parenteAgressor;
	}
	public void setParenteAgressor(String parenteAgressor) {
		this.parenteAgressor = parenteAgressor;
	}
	public String getOcupacaoAgressor() {
		return ocupacaoAgressor;
	}
	public void setOcupacaoAgressor(String ocupacaoAgressor) {
		this.ocupacaoAgressor = ocupacaoAgressor;
	}
	public String getRacaAgressor() {
		return racaAgressor;
	}
	public void setRacaAgressor(String racaAgressor) {
		this.racaAgressor = racaAgressor;
	}
	public String getGeneroAgressor() {
		return generoAgressor;
	}
	public void setGeneroAgressor(String generoAgressor) {
		this.generoAgressor = generoAgressor;
	}
	public String getSexualAgressor() {
		return sexualAgressor;
	}
	public void setSexualAgressor(String sexualAgressor) {
		this.sexualAgressor = sexualAgressor;
	}
	public String getEscolarAgressor() {
		return escolarAgressor;
	}
	public void setEscolarAgressor(String escolarAgressor) {
		this.escolarAgressor = escolarAgressor;
	}
	public int getSerieAgressor() {
		return serieAgressor;
	}
	public void setSerieAgressor(int serieAgressor) {
		this.serieAgressor = serieAgressor;
	}
	public Incidente getIncidente() {
		return incidente;
	}
	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}
}
