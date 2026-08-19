#Padrões estruturais
    ##Adapter
        ->Permite que os objetos com interfaces diferentes sejam comaptiveis
            ->Converte a interface de uma classe na interface esperada por uma classe cliente
    ##Decorator
        ->Permite adionar um comportamento a um um objeto individualmente de maneira dinamica sem precisar modificar o comportamento de outros objetos da mesma classe
            ->Uso de herença
                ->Uma interface que seja uma abstração do componente
                    ->O objeto decorador gerencia o objeto que ele decora
    ##Proxy
        ->Cria uma classe envelope que preve as mesmas funcionalidade do projeto original
            ->controlar o acesso ao objeto real
                ->Quando:
                    -deseja fornecer acesso a um objeto de forma condicional
                ->Agrega regras de acesso
    ##Facade
        ->Fornece uma interface unica para um conjunto de interfaces
            ->uma interface de mais alto nivel que torna o subsistema mais facil de usar
                ->uso da interface quando necessarios
