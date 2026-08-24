package ExecPadroes;

// Resumo: Converte a interface de uma classe existente na interface que o cliente espera, permitindo que classes com interfaces incompatíveis trabalhem juntas sem modificar a classe original.

// Quando usar: quando você tem uma classe pronta (que não pode ou não deve ser modificada) e precisa encaixá-la em um contexto que exige uma interface diferente, mas conceitualmente relacionada.

// Vantagens:

// Reutiliza código existente sem modificá-lo
// Desacopla o cliente da implementação concreta da classe adaptada
// Facilita integração com bibliotecas externas ou código legado

// Desvantagens:

// Adiciona uma camada extra de indireção
// Se usado em excesso, pode indicar problema de design mais profundo no sistema

/*
class QuadradoAntigo {
    double x, y, lado;
    QuadradoAntigo(double x, double y, double lado) { this.x=x; this.y=y; this.lado=lado; }
    double getLado() { return lado; }
}

interface QuadradoNovo {
    double getXf();
    double getYf();
}

class QuadradoAdapter implements QuadradoNovo {
    private QuadradoAntigo quadrado;
    QuadradoAdapter(QuadradoAntigo quadrado) { this.quadrado = quadrado; }

    public double getXf() { return quadrado.x + quadrado.getLado(); }
    public double getYf() { return quadrado.y + quadrado.getLado(); }
}
*/
