package ExecPadroes;
// Resumo: Separa a construção de um objeto complexo (com muitos parâmetros opcionais) em uma classe auxiliar (o builder), que oferece uma interface fluente para configurar cada atributo antes de montar o objeto final.

// Quando usar: quando um objeto tem muitos parâmetros, especialmente opcionais e/ou do mesmo tipo (o que impossibilita usar sobrecarga de construtores sem ambiguidade).

// Vantagens:

// Elimina construtores telescópicos (múltiplas sobrecargas confusas)
// Código de criação mais legível (interface fluente, com nomes de método autoexplicativos)
// Permite valores padrão para parâmetros não informados

// Desvantagens:

// Mais código boilerplate (precisa da classe builder inteira)
// Para objetos simples, é over-engineering


public class BuilderPizza {
    private final String molho;
    private final String cobertura;
    private final boolean bordaRecheada;

    public static class Builder {
        private String molho = "TOMATE";
        private String cobertura = "MARGUERITA";
        private boolean bordaRecheada = false;

        public Builder molho(String molho) { this.molho = molho; return this; }
        public Builder cobertura(String cobertura) { this.cobertura = cobertura; return this; }
        public Builder comBorda() { this.bordaRecheada = true; return this; }
        public BuilderPizza build() { return new BuilderPizza(this); }
    }

    private BuilderPizza(Builder b) {
        this.molho = b.molho;
        this.cobertura = b.cobertura;
        this.bordaRecheada = b.bordaRecheada;
    }


// uso:
BuilderPizza p = new BuilderPizza.Builder()
        .cobertura("CALABRESA")
        .comBorda()
        .build();
}
