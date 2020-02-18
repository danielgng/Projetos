package br.com.bean;

import br.com.DAO.UsuarioDAO;
import br.com.entidade.Usuario;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

    private Usuario usuario = new Usuario();
    private UsuarioDAO dao = new UsuarioDAO();

    private List<Usuario> listus = new ArrayList<>();

    public void cadastrar_alterar() throws ClassNotFoundException, SQLException {
        new UsuarioDAO().inserir_alterar(usuario);
        usuario = new Usuario();
        listar();
    }

    public String entrar() throws ClassNotFoundException, SQLException, Exception {
        boolean acesso = false;
                acesso = new UsuarioDAO().login(usuario);
        
        if (acesso) {
            return "home";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Usuario ou senha incorretos",
                            "Tente novamente!!"));
            return "index";
        }
    }

    public String logout() {
        return "index";
    }

    public void listar() throws ClassNotFoundException, SQLException {
        listus = dao.selecionarTudo();
    }

    public void alterar(Usuario usuario) {
        this.usuario = usuario;
    }

    public void deletar(Usuario usuario) throws ClassNotFoundException, SQLException {
        new UsuarioDAO().deletar(usuario);
        listar();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAO getDAO() {
        return dao;
    }

    public void setDAO(UsuarioDAO dao) {
        this.dao = dao;
    }

    public List<Usuario> getListUsuario() {
        return listus;
    }

    public void setListUsuario(List<Usuario> listus) {
        this.listus = listus;
    }

}
