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
```
--Exemplos -imagens 🖼️

<img width="325" height="290" alt="image" src="https://github.com/user-attachments/assets/608cb625-3308-415f-9fe1-6290277c94f2" />        

⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬

<img width="279" height="117" alt="image" src="https://github.com/user-attachments/assets/d228d613-a0d3-440a-ae83-3dc4d5e48eeb" />





