## Vamos praticar!

Depois de passar pelo conteúdo da aula de hoje, chegou a sua vez de colocar em prática o que aprendemos. Temos que criar uma entidade no banco de dados H2 chamada de Paciente, que contenha os seguintes campos: nome, sobrenome, endereço, RG, data de cadastro, nome de usuário e senha.

### O que você deve fazer?

- Criar uma conexão com o banco de dados e inserir uma linha na tabela de Paciente;

- Em seguida, abra uma transação, setAutoCommit(false), e atribua outra senha utilizando uma instrução de update, e em sequência gere uma exceção, throw new Exception.

- Por último, verifique através de uma consulta se a senha do paciente manteve o seu valor inicial.

Sucesso!