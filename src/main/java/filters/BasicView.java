package filters;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import daos.UsuarioDao;
import entities.Usuario;

@ManagedBean
@ViewScoped
public class BasicView implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Usuario> usuario;

    @PostConstruct
    public void init() {
        usuario = UsuarioDao.listarTodos();
    }
    
    public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
}
