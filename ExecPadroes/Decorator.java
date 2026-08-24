package ExecPadroes;

// Resumo: Adiciona novos comportamentos a um objeto individualmente, em tempo de execução, "envolvendo-o" em objetos decoradores que implementam a mesma interface — sem alterar a classe original nem afetar outras instâncias.

// Quando usar: quando você quer estender funcionalidades de forma flexível e combinável, evitando uma explosão de subclasses para cada combinação possível de comportamento.

// Vantagens:

// Alternativa mais flexível que herança para adicionar responsabilidades
// Decoradores podem ser combinados e aninhados livremente
// Segue o Open/Closed Principle — não precisa alterar a classe original

// Desvantagens:

// Muitos decoradores pequenos podem tornar o código difícil de entender
// Ordem de aplicação dos decoradores importa e pode gerar confusão

/*
    interface Mensagem {
    String getTexto();
}

class MensagemSimples implements Mensagem {
    private String texto;
    MensagemSimples(String texto) { this.texto = texto; }
    public String getTexto() { return texto; }
}

class MensagemComColchetes implements Mensagem {
    private Mensagem interna;
    MensagemComColchetes(Mensagem interna) { this.interna = interna; }
    public String getTexto() { return "[" + interna.getTexto() + "]"; }
}

// uso:
Mensagem m = new MensagemComColchetes(new MensagemSimples("Olá"));
System.out.println(m.getTexto()); // [Olá]
*/
