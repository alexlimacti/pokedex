## Projeto de estudos sobre Programação Reativa com Spring WebFlux

### Ambiente utilizado no projeto

- JDK 14

- Intellij Idea 2020.3

- Gradle

- Spring Boot 2.4.3

- MongoDB (Docker)

  

### Execução do MongoDB em contêiner

Levando em consideração de que já temos o docker hub ou docker desktop instalado, execute o seguinte comando no prompt:

docker run --name mongodb -d -p 27017:27017 -v ~/data:/data/db mongo

Com isso o docker baixará a imagem do mongodb e executará a mesma localmente.



### Gerando massa para testes

Na classe ReactivewebApplication contém um método comentado, o método init. Basta remover os comentários nesse método e executar a aplicação para gerar a massa. Após a execução, recomendo comentar novamente esse método para não duplicar as massas.



### Explicação do projeto

Em breve