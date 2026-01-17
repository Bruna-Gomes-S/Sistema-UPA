# Sistema de Cadastro - UPA 🏥

Este é um sistema desenvolvido em Java para o gerenciamento e cadastro de pacientes em uma Unidade de Pronto Atendimento (UPA). O projeto utiliza integração com banco de dados MySQL para persistência dos dados.

## 🚀 Funcionalidades
* Cadastro de novos pacientes.
* Gerenciamento de informações de atendimento.
* Integração com banco de dados via JDBC.

## 🛠️ Tecnologias Utilizadas
* **Java**: Linguagem principal do sistema.
* **MySQL**: Banco de dados para armazenamento.
* **Eclipse IDE**: Ambiente de desenvolvimento.

## 📋 Pré-requisitos (Banco de Dados)
Para que o sistema funcione corretamente, você precisa ter o MySQL instalado e criar o banco de dados conforme as configurações abaixo:

```sql
CREATE DATABASE UPA_SP;

USE UPA_SP;

-- Exemplo de tabela base (ajuste conforme seu código)
CREATE TABLE pacientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    endereco VARCHAR(200),
    cidade VARCHAR(100)
);
<img width="380" height="352" alt="image" src="https://github.com/user-attachments/assets/83c7740a-e75f-4ab4-9006-98b200100404" />
