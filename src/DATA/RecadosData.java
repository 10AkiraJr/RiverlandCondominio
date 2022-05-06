/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.Recados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Roberto Junior Akira
 */
public class RecadosData extends Conexao{
    public RecadosData()throws Exception{}

    public boolean incluir(Recados obj) throws Exception{
        String sql = "INSERT INTO recado (recado) VALUES(?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getRecados());
        return ps.executeUpdate()>0;
    }

    public boolean editar(Recados obj) throws Exception{
        String sql = "UPDATE recado SET recado=? WHERE id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getRecados());
        ps.setInt(2, obj.getId()); //System.out.println("SALVO DATA"); System.out.println(obj.getId());
        return ps.executeUpdate()>0;
    }

    public ArrayList<Recados> pesquisar(String pesq) throws Exception{
        ArrayList<Recados> listarecados = new ArrayList<>();
        String sql = "SELECT * FROM recado WHERE recado like '"+pesq+"%' ORDER BY recado";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Recados obj = new Recados(rs.getInt("id"), rs.getString("recado"));
            listarecados.add(obj);
        }
    return listarecados;
    }

    public boolean excluir(int id) throws Exception{
        String sql = "DELETE FROM recado WHERE id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate()>0;
    }
}
