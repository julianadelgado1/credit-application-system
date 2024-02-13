<h1>request-credit-system</h1>
<p align="center">API Rest para um Sistema de Analise de Solicitação de Crédito</p>
<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Kotlin">
        <img src="https://img.shields.io/badge/Kotlin-v1.7.22-purple.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v3.0.3-brightgreen.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-v7.6-lightgreen.svg" />
    </a>
    <a alt="H2 ">
        <img src="https://img.shields.io/badge/H2-v2.1.214-darkblue.svg" />
    </a>
    <a alt="Flyway">
        <img src="https://img.shields.io/badge/Flyway-v9.5.1-red.svg">
    </a>
</p>

<h3>Descrição do Projeto</h3>

## API para Sistema de Avaliação de Créditos
Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma API REST SPRING BOOT E KOTLIN 🍃💜 para a empresa fornecer aos seus clientes as seguintes funcionalidades:

- ## Cliente (Customer):
- Cadastrar:

Request: firstName, lastName, cpf, income, email, password, zipCode e street

Response: String
- Editar cadastro:

Request: id, firstName, lastName, income, zipCode, street

Response: firstName, lastName, income, cpf, email, income, zipCode, street
- Visualizar perfil:

Request: id

Response: firstName, lastName, income, cpf, email, income, zipCode, street

- Deletar cadastro:

Request: id
Response: sem retorno

- ## Solicitação de Empréstimo (Credit):

- Cadastrar:

Request: creditValue, dayFirstOfInstallment, numberOfInstallments e customerId

Response: String
- Listar todas as solicitações de emprestimo de um cliente:

Request: customerId

Response: creditCode, creditValue, numberOfInstallment

- Visualizar um emprestimo:

Request: customerId e creditCode

Response: creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer

<h3>Local do Projeto</h3>

<p><a href="https://github.com/julianadelgado1/credit-application-system">https://gist.github.com/julianadelgado1/credit-application-system</a></p>
<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="350" width="450" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

<h3>Instrução de Uso</h3>
<p>No Terminal/Console:</p>
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone git@github.com:julianadelgado1/credit-application-system.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd </code></li> 
	<li>Execute o comando: <code>./gradlew bootrun</code></li>
</ol>
<h6>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e executar o projeto através da IDE **</h6>


<a href="https://drive.google.com/file/d/1wxwioDHS1sKFPq4G7b24tVZb-XMnoj-l/view?usp=share_link"> 🚀 Collection Sacola API - Postman</a><br>


<h3>Autor</h3>

<a href="https://www.linkedin.com/in/juliana-delgado-camoleze-86322546/">
 <br />
 <sub><b>Juliana Delgado</b></sub></a> <a href="https://www.instagram.com/camimi_la/" title="Instagram"></a>



<hr>
<h3>Contribuindo</h3>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. Caso você conheça alguém que se identifique com o conteúdo, não
deixe de compatilhar.

Se possível:

⭐️ Star o projeto

🐛 Encontrar e relatar issues