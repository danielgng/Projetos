package br.com.DAO;

import br.com.entidade.Oferta;
import br.com.util.FabricaConexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OfertaDAO {

    public void inserir_alterar(Oferta oferta) throws ClassNotFoundException, SQLException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst;
            if (oferta.getCodigo() == null) {
                pst = conexao.prepareCall("INSERT INTO oferta (codigo,produto,valor,data)"
                        + " values(null,?,?,?)");
            } else {
                pst = conexao.prepareCall("UPDATE oferta set produto=?, valor=?, data? where codigo=?");
                pst.setInt(3, oferta.getCodigo());
            }
            
            pst.setString(1, oferta.getProduto());
            pst.setString(2, oferta.getValor());
            pst.setString(3, oferta.getData());
            pst.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(OfertaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Oferta> selecionarTudo() throws ClassNotFoundException, SQLException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst = conexao.prepareCall("SELECT * FROM oferta");
            ResultSet rs = pst.executeQuery();
            List<Oferta> lista = new ArrayList<>();
            while (rs.next()) {
                Oferta of = new Oferta();
                of.setCodigo(rs.getInt("codigo"));
                of.setProduto(rs.getString("produto"));
                of.setValor(rs.getString("valor"));               
                of.setData(rs.getString("data"));                
                lista.add(of);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(OfertaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
  public void deletar(Oferta oferta) throws  ClassNotFoundException,SQLException{
     try{
         Connection connexao=(Connection) FabricaConexao.getConexao();
         PreparedStatement pst;
         
         if(oferta.getCodigo()!=null){
         pst=connexao.prepareCall("DELETE FROM oferta WHERE codigo=?;");
         pst.setInt(1,oferta.getCodigo());
         pst.execute();
     }
         FabricaConexao.fecharConexao();
     }catch(SQLException ex){
         Logger.getLogger(OfertaDAO.class.getName()).log(Level.SEVERE,null,ex);
     }
     
   }
    
    
}
