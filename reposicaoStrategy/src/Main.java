import entities.Pedido;
import entities.PedidoEletronico;
import entities.PedidoMovel;

public class Main {

    public static void main(String[] args) {

        Pedido pe = new PedidoEletronico(1000.0);
        System.out.println("Pedido Eletro:");
        System.out.println("Frete Comum: " + pe.calcularFreteComum());
        System.out.println("Frete Expresso: " + pe.calcularFreteExpresso());

        Pedido pm = new PedidoMovel(1000.0);
        System.out.println("Pedido Móvel:");
        System.out.println("Frete Comum: " + pm.calcularFreteComum());
        System.out.println("Frete Expresso: " + pm.calcularFreteExpresso());

    }

}