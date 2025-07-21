public class Pedido {
    double percentualDesconto;
    ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double precoBruto = 0;
        double precoLiquido;
        double percentualDesconto = this.percentualDesconto; // desconto em %
        double valorDesconto;

        for (ItemPedido item : itens) {
            precoBruto  += item.getProduto().getPrecoBruto() * item.getQuantidade();
        }
        valorDesconto = precoBruto * (percentualDesconto / 100.0);
        precoLiquido = precoBruto - valorDesconto;
        return precoLiquido;
    }
}
