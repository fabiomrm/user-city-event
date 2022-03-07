<h1 align="center">USER-CITY-EVENT PROJECT</h1>

<p align="center">
	Projeto de conclusão da terceira etapa do curso <a href="https://www.linkedin.com/school/devsuperior/">Dev Superior</a>.
</p>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=USER-CITY-EVENT&message=FMRM&color=blueviolet&style=flat-square&logo=ghost"/>
</p>
<h4 align="center"> 
	✔️...Finalizado...✔️
</h4>

### 😊 Objetivo
<p align="left">Estudar validação com Bean Validation, autenticação e autorização:</p>

- Spring Security
- OAuth 2.0
- Token JWT
- Autorização de rotas por perfil

### 📝 Diagrama UML

![image](https://user-images.githubusercontent.com/70236849/155547157-222a3dc1-ce7d-4b65-9613-8c767105c17c.png)

### Restrições
- somentes rotas de leitura de eventos e cidades são **públicas**;
- **clientes** podem inserir novos eventos;
- os demais acessos são permitidos apenas para **admins**.

### End-points
- [x] POST /oauth/token
```json
{
    "username": "newuser@gmail.com",
    "password": "password"
}
```
- [x] GET /cities

- [x] POST /cities
```json
{
    "name": "New City"
}
```
- [X] GET /events
- [X] POST /events
```json
{
    "name": "Novo evento",
    "url": "https://novoevento.com.br",
    "date": "2023-07-15",
    "cityId": 1
}
```


### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:
- [Spring](https://spring.io/projects/spring-boot)

### Autor
---
Feito por Fábio Monteiro 👋🏽 Entre em contato!

 [![Linkedin Badge](https://img.shields.io/badge/-fabiomrm-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/fabiomrm/)](https://www.linkedin.com/in/fabiomrm/) 
