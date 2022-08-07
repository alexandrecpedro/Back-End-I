## Exercício para as mesas de trabalho
Durante esta aula, vamos revisar o que vimos anteriormente no exercício a seguir.
Considere:

    - Exercício em grupo

    - Nível de complexidade: intermediário 🔥🔥

## Enunciado
Pedimos que vocês criem uma aplicação que calcule a média dos valores, o máximo e o mínimo em uma lista de inteiros:

List<Integer> listaInteiros

Devem gerar os seguintes logs:

    + Quando a lista tiver mais de 5 itens;

    + Quando a lista tiver mais de 10 itens;

    + A média;

    + Gerar um erro se a lista não tiver elementos e gere o log.

Em seguida, devem criar uma classe principal (main), onde criamos uma lista para cada um dos itens e verificamos se os logs existem.

A saída deve ser algo como:

        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista é maior que 5
        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista é maior que 5
        [2021-07-18 18:15:11] [ INFO ] [ListaMedia:19] O comprimento da lista é maior que 10
        [2021-07-18 18:15:11] [ ERROR] [Test:24] A lista é igual a zero.
        java.lang.Exception
            at com.logging.ListaMedia.<init>(ListaMedia.java:22)
            at com.logging.Test.main(Test.java:22)
