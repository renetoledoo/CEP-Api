# API de Clientes

Este projeto consiste em uma API para gerenciamento de clientes e seus endereços associados.

## Funcionalidades

- **Listar Clientes**: Endpoint para listar todos os clientes cadastrados.
- **Buscar Cliente por ID**: Endpoint para buscar um cliente específico pelo seu ID.
- **Inserir Cliente**: Endpoint para inserir um novo cliente.
- **Atualizar Cliente**: Endpoint para atualizar os dados de um cliente existente.
- **Deletar Cliente**: Endpoint para deletar um cliente existente.

## Tecnologias Utilizadas

- [![Java](https://img.shields.io/badge/Java-Programming-blue?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
 Java
- [![Spring](https://img.shields.io/badge/Spring-Framework-green?style=for-the-badge&logo=spring)](https://spring.io/)
 Spring Framework (Spring Boot, Spring Data JPA, H2 DataBase,openfeign )
- [![Database](https://img.shields.io/badge/Database-H2-blue?style=for-the-badge&logo=mysql&logoColor=white)](https://www.h2database.com/html/main.html)
 Banco de Dados (H2 em memoria)
## Estrutura de Dados

Um cliente é representado pelo seguinte formato JSON:

```json
{
  "id": 1,
  "nome": "Nome do Cliente",
  "endereco": {
    "cep": "12345-678",
    "logradouro": "Rua Exemplo",
    "complemento": "Apto 123",
    "bairro": "Bairro Exemplo",
    "localidade": "Cidade Exemplo",
    "uf": "UF",
    "ibge": "1234567",
    "gia": "1234",
    "ddd": "12",
    "siafi": "1234"
  }
}
```
# Endpoints Disponíveis

## Listar Todos os Clientes
Endpoint para obter uma lista de todos os clientes cadastrados.


### /clientes - GET
Método HTTP
Resposta de Sucesso (200 OK)
Retorna uma lista de objetos JSON, cada um representando um cliente cadastrado.

Exemplo de Resposta

```json
[
  {
    "id": 1,
    "nome": "Cliente 1",
    "endereco": {
      "cep": "12345-678",
      "logradouro": "Rua Exemplo",
      "complemento": "Apto 123",
      "bairro": "Bairro Exemplo",
      "localidade": "Cidade Exemplo",
      "uf": "UF",
      "ibge": "1234567",
      "gia": "1234",
      "ddd": "12",
      "siafi": "1234"
    }
  }
]
```
## Buscar Cliente por ID
Endpoint para buscar um cliente específico pelo seu ID.

### /clientes/{id} - GET
Método HTTP
Parâmetros de URL

### {id} - O ID do cliente a ser buscado.
Resposta de Sucesso (200 OK)
Retorna um objeto JSON representando o cliente encontrado.

Exemplo de Resposta

```json

{
  "id": 1,
  "nome": "Cliente 1",
  "endereco": {
    "cep": "12345-678",
    "logradouro": "Rua Exemplo",
    "complemento": "Apto 123",
    "bairro": "Bairro Exemplo",
    "localidade": "Cidade Exemplo",
    "uf": "UF",
    "ibge": "1234567",
    "gia": "1234",
    "ddd": "12",
    "siafi": "1234"
  }
}
```
## Inserir Cliente
Endpoint para inserir um novo cliente.
URL
### /clientes - POST
Método HTTP
Corpo da Requisição
Um objeto JSON representando o novo cliente a ser inserido.

```json
{
    "id": 1,
    "nome": "Exemplo de Cliente",
    "endereco": {
        "cep": "********"
    }
}
```

So precisa passar o CEP, caso ele não encontre no nosso banco de Dados, ele pesquisa no ViaCEP (ResT API)

Resposta de Sucesso (200 OK)
Retorna um objeto JSON representando o cliente inserido.
Exemplo de Corpo da Requisição

```json
{
  "nome": "Novo Cliente",
  "endereco": {
    "cep": "54321-876",
    "logradouro": "Rua Nova",
    "complemento": "Casa 789",
    "bairro": "Bairro Novo",
    "localidade": "Cidade Nova",
    "uf": "UF",
    "ibge": "9876543",
    "gia": "5678",
    "ddd": "87",
    "siafi": "5678"
  }
}
```

## Deletar Cliente
Endpoint para deletar um cliente existente.
### /clientes/{id} - DELETE
Método HTTP

Parâmetros de URL

{id} - O ID do cliente a ser deletado.

Resposta de Sucesso (200 OK)

Retorna uma resposta vazia com status 200.

# Observações
Certifique-se de substituir {id} pelos IDs reais dos clientes ao fazer solicitações para os endpoints.
Os exemplos fornecidos são meramente ilustrativos e devem ser substituídos por dados reais.
Certifique-se de ajustar os detalhes dos endpoints conforme a implementação real da API.
Este documento fornece informações sobre os endpoints disponíveis na API de Clientes, incluindo detalhes sobre como usar cada endpoint e exemplos de solicitação e resposta.





