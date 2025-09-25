#  Projeto Banco - Sistema de Usuários

Este projeto implementa um sistema simples de banco digital, contendo usuários, contas, cartões, funcionalidades extras e notícias vinculadas.  
O modelo foi construído a partir de um **diagrama de classes UML**.

---

##  Estrutura de Classes

### **User**
- `String name` – Nome do usuário  
- `Account account` – Conta associada ao usuário  
- `Feature[] features` – Funcionalidades disponíveis  
- `Card card` – Cartão vinculado  
- `News[] news` – Notícias recebidas  

**Métodos sugeridos:**
- `addFeature(Feature feature)` → adiciona uma funcionalidade  
- `addNews(News news)` → adiciona uma notícia  

---

### **Account**
- `String number` – Número da conta  
- `String agency` – Agência da conta  
- `Number balance` – Saldo da conta  
- `Number limit` – Limite de crédito  

**Métodos sugeridos:**
- `deposit(Number value)` → realiza um depósito  
- `withdraw(Number value)` → realiza um saque  
- `getBalance()` → retorna o saldo atual  

---

### **Feature**
- `String icon` – Ícone representando a funcionalidade  
- `String description` – Descrição da funcionalidade  

---

### **Card**
- `String number` – Número do cartão  
- `Number limit` – Limite do cartão  

**Métodos sugeridos:**
- `pay(Number value)` → realiza um pagamento com o cartão  

---

### **News**
- `String icon` – Ícone da notícia  
- `String description` – Descrição da notícia  

---

##  Diagrama de Classes (Mermaid)

```mermaid
classDiagram
    class User {
        - String name
        - Account account
        - Feature[] features
        - Card card
        - News[] news
        + addFeature(Feature feature)
        + addNews(News news)
    }

    class Account {
        - String number
        - String agency
        - Number balance
        - Number limit
        + deposit(Number value)
        + withdraw(Number value)
        + getBalance()
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - Number limit
        + pay(Number value)
    }

    class News {
        - String icon
        - String description
    }

    User "1" --> "1" Account
    User "1" --> "N" Feature
    User "1" --> "1" Card
    User "1" --> "N" News
