package ExecPadroes;

// Resumo: Em vez de expor construtores públicos, a classe oferece métodos estáticos com nomes descritivos que retornam instâncias. Resolve o problema de sobrecarga de construtores quando dois "construtores" precisariam ter a mesma assinatura de parâmetros.

// Quando usar: quando existem várias formas de instanciar um objeto e os construtores sozinhos não deixam claro o propósito de cada uma (ex: Date.hoje() vs Date.doAno(dia, mes)).

// Vantagens:

// Nomes explícitos tornam a criação mais legível
// Permite reaproveitar instâncias (cache) em vez de sempre criar um novo objeto
// Pode retornar subtipos, não só o próprio tipo

// Desvantagens:

// Se o construtor for privado, a classe não pode ser estendida por herança
// Não é tão visível/descobrível quanto um construtor comum (IDEs mostram construtores mais facilmente)

public class StaticFactoryMethod {
     private String url;
    private boolean segura;

    private StaticFactoryMethod(String url, boolean segura) {
        this.url = url;
        this.segura = segura;
    }

    public static StaticFactoryMethod paraLocalhost() {
        return new StaticFactoryMethod("localhost:5432", false);
    }

    public static StaticFactoryMethod segura(String url) {
        return new StaticFactoryMethod(url, true);
    }


// uso:
StaticFactoryMethod c1 = StaticFactoryMethod.paraLocalhost();
StaticFactoryMethod c2 = StaticFactoryMethod.segura("db.empresa.com");
}
