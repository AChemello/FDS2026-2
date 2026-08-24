package ExecPadroes;

// Resumo: Uma requisição passa por uma cadeia (ou lista) de manipuladores; cada um decide se processa a requisição, a ignora, ou a repassa adiante, sem que o objeto alvo precise conhecer quem vai tratá-la.

// Quando usar: quando o sistema precisa processar diferentes tipos de requisições sobre um objeto, mas nem o tipo nem a ordem de tratamento são conhecidos de antemão (ex: pipelines de logging, middlewares, validações em sequência).

// Vantagens:

// Desacopla o objeto alvo das operações que serão aplicadas a ele
// Fácil reordenar ou adicionar novos tratadores sem alterar os existentes
// Um grupo de tratadores pode agir como se fosse um único componente

// Desvantagens:

// Difícil depurar/rastrear o comportamento em tempo de execução
// Risco de dois tratadores fazerem a mesma coisa, gerando manutenção duplicada
// Se ninguém tratar a requisição, ela pode "cair no vazio" silenciosamente

/*
class MensagemLog {
    String nivel, texto;
    MensagemLog(String nivel, String texto) { this.nivel = nivel; this.texto = texto; }
}

interface TratadorLog {
    void executa(MensagemLog msg);
}

class TrataInfo implements TratadorLog {
    public void executa(MensagemLog msg) {
        if ("INFO".equals(msg.nivel)) System.out.println(msg.texto);
    }
}

class TrataErro implements TratadorLog {
    public void executa(MensagemLog msg) {
        if ("ERROR".equals(msg.nivel)) throw new RuntimeException(msg.texto);
    }
}

class PipelineLog {
    private List<TratadorLog> tratadores = new ArrayList<>();
    public void adiciona(TratadorLog t) { tratadores.add(t); }
    public void processa(MensagemLog msg) { tratadores.forEach(t -> t.executa(msg)); }
}
*/
