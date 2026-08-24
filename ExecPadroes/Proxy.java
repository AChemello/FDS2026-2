package ExecPadroes;

// Resumo: Cria uma classe "envelope" que implementa a mesma interface do objeto real e controla o acesso a ele — podendo aplicar regras de permissão, cache, log, ou criação tardia (lazy loading) — de forma transparente para o cliente.

// Quando usar: quando é preciso controlar o acesso a um objeto (permissões, custo de criação, cache) sem que o cliente perceba diferença em como usa o objeto.

// Vantagens:

// Controla acesso sem modificar a classe original
// Pode otimizar performance (cache, lazy loading)
// Transparente para o cliente, que usa a mesma interface

// Desvantagens:

// Adiciona uma camada extra que pode impactar levemente a performance
// Pode aumentar a complexidade se usado em excesso (múltiplos proxies empilhados)

/*
interface Cirurgia {
    void opera(int idCirurgiao);
}

class CirurgiaReal implements Cirurgia {
    public void opera(int idCirurgiao) {
        System.out.println("Cirurgião " + idCirurgiao + " operando.");
    }
}

class CirurgiaProxy implements Cirurgia {
    private CirurgiaReal cirurgia = new CirurgiaReal();

    public void opera(int idCirurgiao) {
        if (idCirurgiao < 1000) {
            System.out.println("Não autorizado.");
        } else {
            cirurgia.opera(idCirurgiao);
        }
    }
}
*/
