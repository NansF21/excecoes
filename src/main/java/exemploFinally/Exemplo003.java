package exemploFinally;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo003 {

    public static void metodoFinal(){

        try {
            PreparedStatement stmt = con.prepareStatement (query);
            //...
        } catch (SQLException e) {
            throw new AcessoADadosException("Problema na criação do Statement", e);

        } finally {
            stmt.close();
        }

    }
}
