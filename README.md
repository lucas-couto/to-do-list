# ✅ To-Do List API - Spring Boot

Uma API REST simples para gerenciamento de tarefas (to-do list), desenvolvida com Java e Spring Boot. Ideal para estudos e para aprender a estruturação de projetos backend em Java.

---

## 🧠 Objetivo

Criar uma aplicação backend que permita cadastrar, listar, atualizar e deletar tarefas de forma simples, seguindo boas práticas de arquitetura em camadas (Controller, Service, Repository).

---

## 📋 Funcionalidades

- ✅ Criar uma nova tarefa
- 📄 Listar todas as tarefas
- 🔄 Atualizar uma tarefa existente
- ❌ Deletar uma tarefa
- 🔍 Buscar uma tarefa por ID

---

## ⚙️ Requisitos Técnicos

- Spring Boot 3.x
- Java 17 ou superior
- Spring Web
- Spring Data JPA
- Spring Validation
- Banco de dados em memória H2
- Lombok para reduzir boilerplate
- Maven como gerenciador de dependências

---

## 🛠️ Estrutura do Projeto

```
com.pfda.todo
├── controllers     # Endpoints REST
├── services        # Regras de negócio
├── models          # Entidades JPA
├── repositories     # Persistência de dados
└── dtos           # (opcional) Data Transfer Objects
```

---

## 🔗 Endpoints da API

| Método | Rota         | Descrição                          |
|--------|--------------|------------------------------------|
| GET    | /tasks       | Lista todas as tarefas             |
| GET    | /tasks/{id}  | Busca tarefa por ID (opcional)     |
| POST   | /tasks       | Cria uma nova tarefa               |
| PUT    | /tasks/{id}  | Atualiza uma tarefa existente      |
| DELETE | /tasks/{id}  | Deleta uma tarefa                  |

---

## 🧪 Regras de Validação

- O campo **título** da tarefa é obrigatório.
- O campo **status de conclusão** é definido como `false` por padrão.

---

## 🛡️ Requisitos Não Funcionais

- API RESTful
- Status HTTP corretos nas respostas (`200`, `201`, `400`, `404`)
- Código limpo e bem estruturado
- Fácil execução local com um único comando

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos

- Java 17+
- Maven 3+

### Passos

```bash
git clone https://github.com/seu-usuario/todo-list-api.git
cd todo-list-api
./mvnw spring-boot:run
```

Acesse o H2 console:
```
http://localhost:8080/h2-console
```

## ✍️ Autor

Feito por Lucas Couto (https://github.com/lucas-couto) 🚀