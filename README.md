# 📚 Projeto de Listagem e Classificação de Nomes

Este projeto consiste em um sistema de gerenciamento de clientes, onde é possível cadastrar, consultar, excluir e alterar informações de clientes utilizando uma interface gráfica simples.

## 🔧 Funcionalidades

- **Cadastro de Clientes**: Permite adicionar novos clientes com informações como nome, CPF, telefone, endereço, número, cidade e estado.
- **Consulta de Clientes**: Possibilita a busca de clientes pelo CPF.
- **Exclusão de Clientes**: Remove um cliente do sistema através do CPF.
- **Alteração de Dados**: Atualiza as informações de um cliente já cadastrado.

## 📋 Tecnologias Usadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **Swing**: Biblioteca para construção da interface gráfica.
- **Coleções** (`Map`): Para armazenar e gerenciar os clientes de forma eficiente.

## 📊 Estrutura do Projeto

- **Classe `App`**: Controla a interação com o usuário e gerencia as operações de cadastro, consulta, exclusão e alteração.
- **Classe `Cliente`**: Representa o modelo de dados de um cliente.
- **Interface `IClienteDAO`**: Define as operações para manipulação de dados de clientes.
- **Classe `ClienteMapDAO`**: Implementa a interface `IClienteDAO` usando um `HashMap` para armazenar clientes.
