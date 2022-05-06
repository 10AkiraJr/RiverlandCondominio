/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

/**
 *
 * @author Roberto Junior Akira
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            System.out.println("Conexão ok.");
            String sql = "insert into tbapartamentos (apartamento) "
                    + "values ('A02')";
            java.sql.PreparedStatement ps = c.getConexao().prepareStatement(sql);
            if (ps.executeUpdate()>0){
                System.out.println("Registro Salvo com sucesso!");
            }
            else{
                System.out.println("Erro ao salvar!");
            }
            
        } catch (Exception ex) {
            System.out.println("Erro." + ex.getMessage());
        }
        
    }
}
