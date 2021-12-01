package exemploUnchecked;

package exemploUnchecked;

public class Exemplo002 {

    public static void metodoUncheck(){
        try {
            CarroVo carro = new CarroVo();
            carro.getPlaca();
        } catch (IntegrationException e) {
            throw new BussinessException ("Erro  na criação do objeto", e);
        }

    }
}
