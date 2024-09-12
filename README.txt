Avaliação - Desenvolvedor Backend Java
Descrição
Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar o cadastro de beneficiários de um plano de saúde. A API permite cadastrar beneficiários com seus documentos, listar todos os beneficiários, listar os documentos de um beneficiário específico, atualizar as informações cadastrais e remover beneficiários.

Funcionalidades
A aplicação expõe os seguintes endpoints:

Cadastrar um beneficiário: Permite registrar um beneficiário junto com seus documentos.
Listar todos os beneficiários: Retorna todos os beneficiários cadastrados no sistema.
Listar documentos de um beneficiário: Retorna todos os documentos de um beneficiário específico com base em seu ID.
Atualizar dados de um beneficiário: Permite a atualização dos dados cadastrais de um beneficiário.
Remover um beneficiário: Remove um beneficiário do sistema.

Tecnologias Utilizadas
Java 17: Linguagem de programação utilizada.
Spring Boot 3.x: Framework para simplificação do desenvolvimento da aplicação.
Spring Data JPA: Para persistência e gerenciamento dos dados.
H2 Database: Banco de dados relacional em memória (ou outro banco relacional a critério).
Postman: Para documentação dos endpoints REST.
Maven: Gerenciamento de dependências e build.

Requisitos
Java 17 ou superior
Maven 3.8.x ou superior

Como Executar
Clonar o repositório
Execute o seguinte comando para clonar o repositório: git clone https://github.com/OliveiraGomesMoises/beneficiario.documento


Aqui está um exemplo de README.md para o seu projeto:

Avaliação - Desenvolvedor Backend Java
Descrição
Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar o cadastro de beneficiários de um plano de saúde. A API permite cadastrar beneficiários com seus documentos, listar todos os beneficiários, listar os documentos de um beneficiário específico, atualizar as informações cadastrais e remover beneficiários.

Funcionalidades
A aplicação expõe os seguintes endpoints:

Cadastrar um beneficiário: Permite registrar um beneficiário junto com seus documentos.
Listar todos os beneficiários: Retorna todos os beneficiários cadastrados no sistema.
Listar documentos de um beneficiário: Retorna todos os documentos de um beneficiário específico com base em seu ID.
Atualizar dados de um beneficiário: Permite a atualização dos dados cadastrais de um beneficiário.
Remover um beneficiário: Remove um beneficiário do sistema.
Funcionalidade Opcional:
Autenticação e Autorização (Opcional): Implementado com Spring Security para proteger o acesso aos endpoints (caso implementado).
Tecnologias Utilizadas
Java 17: Linguagem de programação utilizada.
Spring Boot 3.x: Framework para simplificação do desenvolvimento da aplicação.
Spring Data JPA: Para persistência e gerenciamento dos dados.
H2 Database: Banco de dados relacional em memória (ou outro banco relacional a critério).
Swagger: Para documentação dos endpoints REST.
Maven: Gerenciamento de dependências e build.
Requisitos
Java 17 ou superior
Maven 3.8.x ou superior

Como Executar
1. Clonar o repositório
Execute o seguinte comando para clonar o repositório: 
 
git clone https://github.com/OliveiraGomesMoises/beneficiario.documento
 

 Configurar o Banco de Dados
A aplicação já está configurada para usar o banco de dados H2, que é um banco de dados embarcado. Não é necessária nenhuma configuração adicional.
Caso queira alterar o banco de dados, edite as configurações no arquivo application.properties em src/main/resources:

Executar o Projeto
Com o Maven instalado, dentro do diretório do projeto, execute o seguinte comando para compilar e rodar a aplicação:
mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080/beneficiario.documento/api/v1/beneficiario

Endpoints Principais
Método	Endpoint	Descrição
POST	/api/v1/beneficiarios	Cadastrar um novo beneficiário
GET	/api/v1/beneficiarios	Listar todos os beneficiários
GET	/api/v1/beneficiarios/{id}/documentos	Listar os documentos de um beneficiário
PATCH	/api/v1/beneficiarios/{id}	Atualizar dados de um beneficiário
DELETE	/api/v1/beneficiarios/{id}	Remover um beneficiário


AUTOR
Moisés Gomes de Oliveira

Email : mosesgdo@gmail.com
