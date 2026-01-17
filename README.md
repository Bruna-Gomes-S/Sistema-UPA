# 🟢 Sistema de Cadastro - UPA 

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

<img width="372" height="408" alt="image" src="https://github.com/user-attachments/assets/9b584af8-dd3c-4ce2-b6c3-134ba5a089e6" /> 🌐🌐🌐🌐🌐 <img width="381" height="429" alt="image" src="https://github.com/user-attachments/assets/003c7e37-df0d-4784-bd53-c14daf945c0e" />
  


  

⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬             ⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬

<img width="396" height="119" alt="image" src="https://github.com/user-attachments/assets/08f719ca-b85e-4ffc-8680-609152bcfe33" /> 🌐🌐🌐🌐🌐 <img width="377" height="120" alt="image" src="https://github.com/user-attachments/assets/20e02eb1-dac4-4ffc-aa3a-5d112edc8962" />

<img width="715" height="145" alt="image" src="https://github.com/user-attachments/assets/d2556180-f11a-4aeb-ae49-6babf63a2f17" />









