/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.Moradores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Roberto Junior Akira
 */
public class MoradoresData extends Conexao{
    public MoradoresData()throws Exception{}
    public boolean incluir(Moradores obj) throws Exception{
        String sql = "insert into tbmoradores (nome, cpf, email, telefone, apartamento) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getCpf());
        ps.setString(3, obj.getEmail());
        ps.setString(4, obj.getTelefone());
        ps.setInt(5, obj.getApartamento());
        return ps.executeUpdate()>0;
    }
    public boolean editar(Moradores obj) throws Exception{
        String sql = "UPDATE tbmoradores SET nome=?, cpf=?, email=?, telefone=?, apartamento=? WHERE id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getCpf());
        ps.setString(3, obj.getEmail());
        ps.setString(4, obj.getTelefone());
        ps.setInt(5, obj.getApartamento());
        ps.setInt(6, obj.getId());
        return ps.executeUpdate()>0;
    }

    public ArrayList<Moradores> pesquisar(String pesq) throws Exception{
        ArrayList<Moradores> listaMoradores = new ArrayList<>();
        String sql = "Select * from tbmoradores where nome like '"+pesq+"%' order by nome";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Moradores obj = new Moradores(rs.getInt("id"),rs.getString("nome"),rs.getString("cpf"),
                    rs.getString("email"),rs.getString("telefone"),rs.getInt("apartamento"));
            listaMoradores.add(obj);
        }
    return listaMoradores;
    }
    
    public boolean excluir(int id) throws Exception{
        String sql = "DELETE FROM tbmoradores WHERE id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate()>0;
    }
}
