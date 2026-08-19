#`Padrão de criação`
    -> Como criar um objeto e no fim utilizar
        -*New*: Cria um objeto novo
    ->Formas flexiveis de criar objetos
        ->Deixar o código mais fácil de ler
        ->Formas mias flexiveis novas versões
        ->Reuso
    ##Padrão
        *Static Factory Method*
            ->Deixar a semantica mais fácil de entender
                -Solução:
                ->Deixa teu construtor privado = "-"
                ->Cria método statico
                ->
        *Factory*
            ->herarquia de herença
            ->Uma unica classe q toma a decisão de para onde deve ir, centraliza a decisão em um único lugar
                ->Lógica n precisa estar em cima de instanceof
        *Builder*
            ->Cria um objeto cheio de parametros no contrutor(usar)
            ->Solução: cria um builder para a classe, com valor padrão, de maneira q ao dar new já assume esses valores
                ->MAS todos os métodos retornam o Builder podendo chamar todos os métodos atribuidos, encadeando o restante, chama apenas o que quiser, para alterar, sem restrição de ordem
            -Vantegens: Código mais legivel, endentificação da classe
            -Desvantagens: Planejar toma tempo, mais dificil analisar pelo o nome, nem sempre pode ser intuitivo
        *Singleton*
            -> Uso de static, contrutor e variaveis
                ->Threads
                ->Clone
            -> Permite acessar uma instancia unica de qualquer ponto do codigo
            ->Desvantagem: Dependencia escondida
----------------------------------------------------------------------------------------------------
            `R:`
            Static Factory Method
            Factory
            Builder
