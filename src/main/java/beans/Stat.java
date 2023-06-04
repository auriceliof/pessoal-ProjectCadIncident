package beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@RequestScoped
public class Stat implements Serializable {
	private static final long serialVersionUID = 1L;
	private int value = 100;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void onChange() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "You have selected: " + value, null));
	}
}
