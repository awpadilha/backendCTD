public class Estagiario extends Vendedor {

    @Override
    public int calcularPontos() {
        return PONTOS_POR_VENDA * vendas;
    }

    @Override
    public String mostrarCategoria(){
        int pontos = this.calcularPontos();
        if (pontos < 50) {
            return "Estagiário(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como estagiário novato";
        } else {
            return "Estagiário(a) " + this.nome + " tem um total de " + pontos + " pontos e categoriza como estagiário experiente";
        }
    }

    public Estagiario(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }
}

