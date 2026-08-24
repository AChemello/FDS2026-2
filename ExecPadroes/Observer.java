package ExecPadroes;

import java.util.ArrayList;
import java.util.List;

// Resumo: Define uma dependência um-para-muitos entre objetos: quando o "sujeito" muda de estado, todos os "observadores" registrados são notificados automaticamente, mantendo baixo acoplamento entre eles.

// Quando usar: quando mudanças em um objeto precisam refletir em outros objetos, mas o conjunto de interessados é dinâmico ou desconhecido de antemão (ex: dashboards, sistemas de eventos, listeners de UI).

// Vantagens:

// Baixo acoplamento entre o objeto fonte e os interessados
// Fácil adicionar/remover observadores em tempo de execução
// Segue o princípio Open/Closed: novos observadores não exigem mudar a fonte de dados

// Desvantagens:

// Ordem de notificação não é garantida e pode gerar efeitos colaterais inesperados
// Pode causar vazamento de memória se observadores não forem removidos corretamente
// Debugging mais difícil (fluxo de execução "indireto")

/*
public interface Observer {
    void notifica(double novoValor);
}

// SensorTemperatura.java
import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private List<Observer> observadores = new ArrayList<>();

    public void registra(Observer o) {
        observadores.add(o);
    }

    public void setValor(double valor) {
        observadores.forEach(o -> o.notifica(valor));
    }
}

// Display.java
public class Display implements Observer {
    public void notifica(double novoValor) {
        System.out.println("Temperatura atual: " + novoValor);
    }
}
*/
