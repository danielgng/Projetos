package br.com.DAO;

import br.com.entidade.Usuario;
import br.com.util.FabricaConexao;
import br.com.util.MD5;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public void inserir_alterar(Usuario usuario) throws ClassNotFoundException, SQLException {
        try {

            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst;
            if (usuario.getCodigo() == null) {
                pst = conexao.prepareCall("INSERT INTO usuario "
                        + "(codigo,nome,email,id,senha)"
                        + " VALUES(null,?,?,?,?)");
            } else {
                pst = conexao.prepareCall("UPDATE usuario "
                        + "SET nome = ?, email = ?, id = ?, senha = ? "
                        + "WHERE codigo = ?");
                pst.setInt(5, usuario.getCodigo());
            }

            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getId());
            pst.setString(4, MD5.stringHexa(MD5.gerarHash(usuario.getSenha(), "MD5")));
            pst.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> selecionarTudo() throws ClassNotFoundException, SQLException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst = conexao.prepareCall("SELECT * FROM usuario");
            ResultSet rs = pst.executeQuery();
            List<Usuario> lista = new ArrayList<>();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setId(rs.getString("id"));
                lista.add(usuario);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean login(Usuario usuario) throws Exception {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst = conexao.prepareCall("SELECT COUNT(*) AS valor FROM usuario WHERE senha = ? AND id = ?");
            pst.setString(1, MD5.stringHexa(MD5.gerarHash(usuario.getSenha(), "MD5")));
            pst.setString(2, usuario.getId());
            ResultSet rs = pst.executeQuery();
            //Retornar esses dados para criar Session
            while (rs.next()) {
                return rs.getBoolean("valor");
            }
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return false;
    }

    public void deletar(Usuario usuario) throws ClassNotFoundException, SQLException {
        try {
            Connection connexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst;

            if (usuario.getCodigo() != null) {
                pst = connexao.prepareCall("DELETE FROM usuario WHERE codigo = ?;");
                pst.setInt(1, usuario.getCodigo());
                pst.execute();
            }
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
