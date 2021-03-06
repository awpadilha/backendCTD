
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){

        int pontos = this.calcularPontos();
        if (pontos < 20) {
            return "Vendedor(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como vendedor novato";
        } else if (pontos >= 20 && pontos <= 30) {
            return "Vendedor(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como vendedor aprendiz";
        }  else if (pontos > 30 && pontos <= 40) {
            return "Vendedor(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como vendedor bom";
        }  else {
            return "Vendedor(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como vendedor mestre";
        }

    }

}








