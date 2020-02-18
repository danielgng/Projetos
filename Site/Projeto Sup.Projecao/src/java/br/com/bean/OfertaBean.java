package br.com.bean;

import br.com.DAO.OfertaDAO;
import br.com.entidade.Oferta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class OfertaBean {

    private Oferta oferta = new Oferta();
    private OfertaDAO of_dao = new OfertaDAO();

    private List<Oferta> listaof = new ArrayList<>();

    public void cadastrar_alterar() throws ClassNotFoundException, SQLException {
        new OfertaDAO().inserir_alterar(oferta);
        oferta = new Oferta();
        listar();
    }

    public void listar() throws ClassNotFoundException, SQLException {
        listaof = of_dao.selecionarTudo();
    }
    
    
    
    public void alterar(Oferta f){
        oferta = f;
    }
 
    public void deletar(Oferta oferta) throws ClassNotFoundException,SQLException{
        new OfertaDAO().deletar(oferta);
        listar();
    }
    
    
    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta Oferta) {
        this.oferta = oferta;
    }

    public OfertaDAO getOf_dao() {
        return of_dao;
    }

    public void setOf_dao(OfertaDAO of_dao) {
        this.of_dao = of_dao;
    }

    public List<Oferta> getListaof() {
        return listaof;
    }

    public void setListaof(List<Oferta> listaof) {
        this.listaof = listaof;
    }

   

   

}
