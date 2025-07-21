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

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0.0;
        double precoBruto = 0;


        for (ItemPedido item : itens) {
            double totalItem = item.getProduto().getPrecoBruto() * item.getQuantidade();
            totalProdutos += totalItem;
            precoBruto  += item.getProduto().getPrecoBruto() * item.getQuantidade();

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n",
                    item.getProduto().getClass().getName().split("\\.")[1], item.produto.getTitulo(), item.produto.getPrecoBruto(), item.getQuantidade(), totalItem);
        }

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f%n", precoBruto * (percentualDesconto / 100.0));
        System.out.printf("TOTAL PRODUTOS: %.2f%n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", calcularTotal());
        System.out.println("----------------------------");
    }
}

