package entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

      @Id
      @GeneratedValue
      @Column(name="id", nullable=false, unique=true)
      private int id;

      @Column(name="nome", nullable=false, unique=true)
      private String nomeUsuario;
      
      @Column(name="login", nullable=false, unique=true)
      private String login;
      
      @Column(name="senha", nullable=false, unique=false)
      private String senha;
      
      @Column(name="data_cadastro")
      @Temporal(TemporalType.DATE)
      private Date dataCadastro;
     
      public int getId() {
		return id;
      }
	
      public void setId(int id) {
			this.id = id;
      }
	
      public String getNomeUsuario() {
	       return nomeUsuario;
      }

      public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
      }

      public String getLogin() {
		return login;
      }

      public void setLogin(String login) {
		this.login = login;
      }

      public String getSenha() {
            return senha;
      }

      public void setSenha(String senha) {
            this.senha = senha;
      }
            
      public Date getDataCadastro() {
    	  return dataCadastro;
      }

      public void setDataCadastro(Date dataCadastro) {
    	  this.dataCadastro = dataCadastro;
      }

	@Override
	public int hashCode() {
		return Objects.hash(id, login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id && Objects.equals(login, other.login);
	} 
 }