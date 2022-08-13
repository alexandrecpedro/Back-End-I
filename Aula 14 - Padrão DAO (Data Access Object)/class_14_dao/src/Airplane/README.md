## Vamos praticar!
Uma empresa de aviação nos pede para desenvolver um sistema para gestão de sua frota. Eles querem cadastrar seus aviões, com a possibilidade de modificá-los, cancelá-los e visualizar toda a frota.

Após o levantamento da necessidade, reunimos as seguintes informações que devemos utilizar para registrar um avião:

    Marca

    Modelo

    Matrícula

    Data de entrada em serviço

    Id

Sugerimos que você implemente o padrão DAO, usando o H2 como banco de dados e implemente os métodos que nos permitam:

    Registrar um novo avião;

    Buscar um avião por id;

    Eliminar um avião por id;

    Buscar todos os aviões.

Você deverá criar uma camada de negócio e testar os 4 métodos com o JUnit.

Atenção!
Para executar o exercício é necessário adicionar essas bibliotecas ao projeto.

    H2
    JUnit
    Hamrest-core
