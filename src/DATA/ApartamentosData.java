/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.Apartamentos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Roberto Junior Akira
 */
public class ApartamentosData extends Conexao{
    public ApartamentosData()throws Exception{}
    
    public ArrayList<Apartamentos> pesquisar(String pesq) throws Exception{
    ArrayList< Apartamentos> listaApartamentos = new ArrayList<>();
    String sql = "Select * from tbmoradores where situacao like '"+pesq+"%' order by situacao";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
    while(rs.next()){
        Apartamentos obj = new Apartamentos(rs.getInt("id"),rs.getString("apartamento"),rs.getInt("situacao"));
        listaApartamentos.add(obj);
    }
    return listaApartamentos;
    }
    
}
