## Vamos praticar!
Sugerimos que você resolva a seguinte atividade:

Crie uma aplicação onde tenhamos duas classes: Leão e Tigre.
Cada uma deve ter dois atributos:
    
    nome - String

    idade - int

e para a classe Leão, vamos adicionar o atributo:

    eAlfa - boolean

Para os dois animais vamos criar um método correr que irá registrar uma informação de que está correndo e criaremos outro método que calcule se é maior de 10 anos e se é alfa, se for, você deve registrar a informação. Devemos também lançar uma Exceção (Exception) se a idade do animal for menor que zero e adicionar um log de erro.

Criaremos uma classe main (principal), onde criaremos leões e tigres e executaremos os métodos:

    public void correr()

    public void eMaiorQue10()

Devemos também verificar os logs. A saída deve ser algo como:

    [2021-07-18 18:27:46] [ INFO ] [Leao:37] O Leão Simba está correndo

    [2021-07-18 18:27:46] [ INFO ] [Leao:37] O Leão Mufasa está correndo

    [2021-07-18 18:27:46] [ ERROR] [Leao:45] A idade não pode ser negativa

    [2021-07-18 18:27:46] [ ERROR] [Test:30] A idade do Leão Mufasa está incorreta

    java.lang.Exception

    at com.main.Leao.eMaiorQue10(Leao.java:46)

    at com.main.Test.main(Test.java:28)

    [2021-07-18 18:27:46] [ INFO ] [Tigre:28] O Tigre está correndo

    [2021-07-18 18:27:46] [ INFO ] [Tigre:28] O Tigre está correndo

Bons estudos!