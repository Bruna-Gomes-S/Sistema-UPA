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

<img width="329" height="288" alt="image" src="https://github.com/user-attachments/assets/4f11d15e-1327-4e53-b043-9ae9bf43a18d" /> 🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐 <img width="327" height="290" alt="image" src="https://github.com/user-attachments/assets/3d475dd2-0cd9-48e4-9ad1-4e762e6f3c3e" />  


  

⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬             ⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬

<img width="338" height="116" alt="image" src="https://github.com/user-attachments/assets/77b6484d-beda-43ff-8e83-14fb34817967" /> 🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐
   <img width="365" height="115" alt="image" src="https://github.com/user-attachments/assets/401708f3-0862-4c53-a153-0963db9ba983" /> 







