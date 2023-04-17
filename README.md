# Dailytask
DailyTask é uma aplicação de gerenciamento de tarefas diárias desenvolvida em Java com uso do framework Spring Boot.
A aplicação permite que os usuários cadastrem suas tarefas diárias e acompanhem seu progresso.

## Funcionalidades
- Cadastro de usuários
- Cadastro de tarefas diárias
- Listagem de tarefas diárias
- Marcar tarefas como concluídas
- Deletar tarefas

## Diagrama de Classes UML 
![UML refreshed](https://user-images.githubusercontent.com/87671071/232627951-42b070d8-29a1-4524-8820-7318d699ae5c.PNG)

## Ferramentas

Backend:

      - Java
      - Spring Boot c/ Spring Data JPA
      - Lombok
      - JPA / Hibernate
      - Maven
      
Dependências:

     Data JPA - > Utilizando o JPA para fazer a ponte entre o banco de dados e a aplicação -> ORM
     
     Web -> É uma aplicação WEB, Utilizado para receber requisições, devolver uma resposta ...
     
     MySQL -> Utilizado esse BANCO no ambiente de desenvolvimento e produção.
     
     LomBok -> Utilizado para evitar muitas linhas de código através de annotations.

Programas Utilizados :
 
    Insomnia - Utilizado para fazer as requisições (CONSUMIR) a aplicação.
    
    IntelliJ - IDE escolhida para desenvolver o projeto.
    
    MySQL 8.0 Command Line Client - Plataforma utilizada para fazer a manipulação e a leitura dos dados de uma base de dados do banco MySQL.
    
    Git e GitHub - Utilizados para commitar o projeto e subir o código para a nuvem(remoto).


Bancos de Dados :

    MySQL - Usado em ambiente de desenvolvimento e produção.  

## Pré-requisitos

Antes de executar a aplicação, verifique se você possui os seguintes pré-requisitos:

- Java JDK 11 ou superior
- Maven 3.6.3 ou superior
- Banco de dados MySQL (ou outro banco de dados compatível) configurado e em execução

## Como executar o Projeto
- Clone este repositório.
- Importe o projeto em sua IDE de preferência (recomendado: IntelliJ IDEA, Eclipse).
- Configure as dependências do projeto (JDK, Spring Boot, etc.).
- Execute o projeto localmente utilizando a IDE ou através do comando mvn spring-boot:run no terminal.
- A API estará disponível em http://localhost:8080 (ou outra porta configurada).

## Contribuições
Contribuições são bem-vindas! Se você encontrar algum problema, tiver alguma sugestão ou quiser colaborar com o projeto,
sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Perfil do Linkedin:
https://www.linkedin.com/in/gabrielsenec/
