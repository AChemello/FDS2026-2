package ExecPadroes;
// Resumo: Centraliza em uma classe "fábrica" a lógica de decidir qual subclasse concreta instanciar, com base em algum parâmetro. O cliente usa o objeto retornado sem conhecer sua classe concreta.

// Quando usar: quando um objeto tem várias subclasses possíveis e a escolha de qual instanciar depende de uma condição em tempo de execução, e você quer que o cliente fique desacoplado dessas subclasses.

// Vantagens:

// Desacopla o código cliente das classes concretas
// Centraliza a lógica de criação em um único lugar, facilitando manutenção
// Facilita adicionar novos tipos sem alterar o código cliente

// Desvantagens:

// A fábrica precisa ser alterada toda vez que um novo tipo é adicionado (viola um pouco o Open/Closed Principle se não for combinado com outras técnicas, como reflection ou registro dinâmico)
// Pode virar um método gigante cheio de if/instanceof se crescer muito
/*
// Notificacao.java
public interface Notificacao {
    void enviar(String mensagem);
}

// NotificacaoEmail.java
public class NotificacaoEmail implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}

// NotificacaoSms.java
public class NotificacaoSms implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}

// NotificacaoFactory.java
public class NotificacaoFactory {
    public static Notificacao criar(String tipo) {
        return switch (tipo) {
            case "email" -> new NotificacaoEmail();
            case "sms" -> new NotificacaoSms();
            default -> throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        };
    }
}
*/
