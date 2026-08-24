package ExecPadroes;

// Resumo: Garante que uma classe tenha apenas uma única instância em toda a aplicação e fornece um ponto de acesso global a ela.

// Quando usar: quando faz sentido existir só uma instância compartilhada de algo (ex: um gerenciador de configuração, um pool de conexões, um spooler de impressão).

// Vantagens:

// Controle rígido sobre como e quando a instância é criada
// Economiza recursos quando o objeto é caro de criar
// Acesso global controlado, sem variáveis globais soltas

// Desvantagens:

// Dificulta testes unitários (estado global compartilhado, difícil de mockar)
// Pode virar um "objeto Deus" acumulando responsabilidades
// Cuidado com concorrência (múltiplas threads podem criar instâncias duplicadas se não for sincronizado) e com clonagem/serialização, que podem quebrar a garantia de instância única

public class SingletonConfiguracaoApp {
    private static volatile SingletonConfiguracaoApp instancia;

    private SingletonConfiguracaoApp() {
        // carrega configurações...
    }

    public static SingletonConfiguracaoApp getInstance() {
        if (instancia == null) {
            synchronized (SingletonConfiguracaoApp.class) {
                if (instancia == null) {
                    instancia = new SingletonConfiguracaoApp();
                }
            }
        }
        return instancia;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

