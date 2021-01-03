package siscomerc.bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import siscomerc.modelo.TipoUsuario;
import siscomerc.modelo.Usuario;

@ManagedBean
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<TipoUsuario> tipo = Arrays.asList(TipoUsuario.values());

	public void salvar(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário cadastrado com sucesso!"));
		
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<TipoUsuario> getTipo() {
		return tipo;
	}

	public void setTipo(List<TipoUsuario> tipo) {
		this.tipo = tipo;
	}

}
