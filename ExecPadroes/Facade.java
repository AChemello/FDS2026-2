package ExecPadroes;

// Resumo: Fornece uma interface única e simplificada para um conjunto de classes/subsistemas complexos, escondendo os detalhes internos e facilitando o uso pelos clientes mais comuns.

// Quando usar: quando um sistema cresce e acumula muitos subsistemas, tornando complexo para o cliente comum usar diretamente todas as classes envolvidas — mesmo que ainda seja possível acessar as classes internas quando necessário.

// Vantagens:

// Simplifica o uso de sistemas complexos
// Reduz o acoplamento entre o cliente e os subsistemas internos
// Não impede o acesso direto aos subsistemas quando realmente necessário

// Desvantagens:

// Pode virar um "objeto Deus" se acumular responsabilidades demais
// Pode esconder funcionalidades avançadas que ficam menos acessíveis


// class Estoque { void reservar(int produtoId) { /* ... */ } }
// class Pagamento { void cobrar(double valor) { /* ... */ } }
// class Entrega { void agendar(int pedidoId) { /* ... */ } }

// class PedidoFacade {
//     private Estoque estoque = new Estoque();
//     private Pagamento pagamento = new Pagamento();
//     private Entrega entrega = new Entrega();

//     public void finalizarPedido(int produtoId, double valor, int pedidoId) {
//         estoque.reservar(produtoId);
//         pagamento.cobrar(valor);
//         entrega.agendar(pedidoId);
//     }
// }

// // uso:
// new PedidoFacade().finalizarPedido(101, 199.90, 555);


