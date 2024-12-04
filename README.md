# Algoritmo do Sabor 🍕

Uma plataforma de delivery de alimentos focada em uma pizzaria, permitindo o cadastro de clientes, gerenciamento de pedidos, acompanhamento de carrinho, cálculo de distância e tempo estimado de entrega.

## 📜 Funcionalidades Principais
- **Cadastro de Clientes:** CRUD completo para gerenciar os clientes da pizzaria.
- **Gestão de Pedidos:** Registro e acompanhamento de pedidos, incluindo forma de pagamento e data.
- **Carrinho:** Adicione pizzas ao carrinho e calcule o valor total do pedido.
- **Cardápio:** Gerenciamento do cardápio com opções disponíveis.
- **Distância e Entrega:** Verificação da distância e tempo estimado de entrega.
  
## 📂 Modelos de Dados

### Cliente
```
- ID (BigInt)
- Nome (String)
- Endereço (String)
- Telefone (String)
- CPF (String)
```

### Pizza
```
- ID (BigInt)
- Sabor (String)
- Valor (Float)
- Descrição (String)
- Tamanho (String)
```

### Cardápio
```
- ID (BigInt)
- id_pizza (BigInt)
- Disponível (Boolean)
```

### Pedido
```
- ID (BigInt)
- id_cliente (BigInt)
- id_carrinho (BigInt)
- Data (LocalDate)
- FormaPagamento (String)
```

### Carrinho
```
- ID (BigInt)
- id_pizza (BigInt)
- Valor
Total (Float)
```

### Endereço
```
- ID (BigInt)
- EndereçoPizzaria (String)
```

## 🚀 Tecnologias Utilizadas

Linguagem: Java 17

Framework: Spring Boot

Banco de Dados: SQL

Arquitetura: RESTful API 

## 🔧 Instalação e Configuração

1. Clone este repositório:
  ```
   git clone https://github.com/seu-repositorio/algoritmo-do-sabor.git
  ```
2. Configure o banco de dados no arquivo `application.properties` em `src/main/resources`:
  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/algoritmo_do_sabor
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
  ```
3. Execute o projeto:
  ```
  ./mvnw spring-boot:run
  ```

## 🛠️ Melhorias Futuras

 - Implementar autenticação e autorização.

 - Otimizar o cálculo de distância e tempo de entrega com integração de APIs externas.

 - Criar interface de usuário para melhorar a experiência do cliente.

### Desenvolvido por:

- [Estafany Santos](https://www.linkedin.com/in/estefany-santos/)
- [Lucas Matheus](https://www.linkedin.com/in/lucas-matheus-lima/)
- [Kevin Schuab](https://www.linkedin.com/in/kevin-schuab/)
- [Priscila Soares]()
- [Rayane Moara](https://www.linkedin.com/in/rayane-moara/)
- [Sarah Tavares]()


















