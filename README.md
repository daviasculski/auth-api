#User Authentication API
Este projeto é uma API RESTful de autenticação de usuários, desenvolvida como um portfólio para demonstrar habilidades em desenvolvimento back-end, arquitetura de software e segurança. A API é capaz de gerenciar o registro de novos usuários e, em etapas futuras, o processo de login e autenticação.

Arquitetura e Tecnologias
O projeto segue os princípios da Arquitetura Limpa (Clean Architecture), com uma clara separação entre as camadas de Controller, Service, Repository e Model/Entity. A aplicação foi construída com um conjunto robusto de tecnologias padrão do mercado.

Tecnologias Utilizadas
Linguagem & Framework: Java 21, Spring Boot

Gerenciamento de Dependências: Maven

Arquitetura: Arquitetura Limpa (Clean Architecture)

Segurança: Spring Security, BCrypt (para criptografia de senha), JWT (futura implementação)

Banco de Dados: MySQL (em ambiente de produção), H2 Database (para testes e desenvolvimento)

ORM: Spring Data JPA, Hibernate

Ferramentas: Git, Postman/cURL (para testes de API)

Funcionalidades Implementadas
Atualmente, a API conta com o seguinte endpoint:

Registro de Usuário

POST /api/auth/register

Descrição: Registra um novo usuário no sistema com um username e password.

Como Rodar o Projeto Localmente
Siga os passos abaixo para configurar e executar a API na sua máquina.

Pré-requisitos
Java Development Kit (JDK) 21

Maven

MySQL Server (para ambiente de produção, mas o H2 será usado para este projeto)

Cliente de API (como Postman ou cURL)

Passos de Instalação
Clone o repositório:
git clone https://github.com/seu-usuario/nome-do-seu-repositorio.git
cd nome-do-seu-repositorio

Configure o banco de dados:

A API está configurada para usar o banco de dados H2 em memória por padrão para facilitar os testes. Você não precisa de configuração adicional para rodar a aplicação.

(Opcional: Para conectar a um banco MySQL, altere o arquivo src/main/resources/application.properties com suas credenciais.)

Execute a aplicação:
mvn spring-boot:run

A aplicação será iniciada e estará disponível em http://localhost:8080.
