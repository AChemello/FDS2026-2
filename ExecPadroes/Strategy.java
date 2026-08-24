package ExecPadroes;

// Resumo: Encapsula uma família de algoritmos intercambiáveis atrás de uma interface comum, permitindo trocar o algoritmo usado por uma classe em tempo de execução sem alterar o código cliente.

// Quando usar: quando uma classe precisa de variações de um mesmo comportamento (ex: cálculo de imposto que muda por estado, algoritmos de ordenação, formas de pagamento) e você quer evitar if/else gigantes que crescem a cada nova variação.

// Vantagens:

// Elimina condicionais complexas espalhadas pelo código
// Base do princípio SOLID "OCP" (Open/Closed Principle) — adicionar uma nova estratégia não exige alterar o código existente
// Facilita testar cada algoritmo isoladamente

// Desvantagens:

// Aumenta o número de classes no projeto
// O cliente precisa saber qual estratégia escolher/injetar

// CalculoImposto.java
/*
public interface CalculoImposto {
    double calcula(double valor);
}

// ImpostoRS.java
public class ImpostoRS implements CalculoImposto {
    public double calcula(double valor) { return valor * 0.15; }
}

// ImpostoSC.java
public class ImpostoSC implements CalculoImposto {
    public double calcula(double valor) { return valor * 0.25; }
}

// Venda.java
public class Venda {
    private double valorBase;
    private CalculoImposto imposto;

    public Venda(double valorBase, CalculoImposto imposto) {
        this.valorBase = valorBase;
        this.imposto = imposto;
    }

    public double total() {
        return valorBase + imposto.calcula(valorBase);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda(400.0, new ImpostoRS());
        System.out.println(venda.total());
    }
}
*/
