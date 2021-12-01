package exemploChecked;


import com.sun.jdi.ClassNotPreparedException;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo001 {

    public static void metodoCheck(){
        try {
            PreparedStatement stmt = con.prepareStatement (query);
            //...
        } catch (SQLException e) {
            throw new AcessoADadosException ("Problema na criação do Statement", e);
        }


    }
}
