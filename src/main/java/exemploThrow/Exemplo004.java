package exemploThrow;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo004 {

    public String recuperarIdUsuario(String query) throws AcessoADadosExeption {

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            //...
        } catch (SQLException e) {
            throw new AcessoADadosException("Problema na criação do Statement", e);

        } finally {
            stmt.close();
        }


    }

}
