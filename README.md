API Básica em Java (Spring Boot + PostgreSQL + Docker)
Basic Java API (Spring Boot + PostgreSQL + Docker)
Einfache Java-API (Spring Boot + PostgreSQL + Docker)
🇧🇷 Português
Visão geral

API mínima para estudo e portfólio: Java 21 + Spring Boot 3 + PostgreSQL (Docker) com três endpoints:

GET /health — status simples

GET /hello?name=SeuNome — mensagem em JSON

GET /dbping — valida conexão com o banco via SELECT 1

Stack

Java 21 (LTS)

Spring Boot 3 (Web, JDBC)

PostgreSQL 16 (Docker)

HikariCP (pool de conexões)

Maven

Pré-requisitos

JDK 21 instalado e no PATH

IntelliJ IDEA (Community é suficiente) ou outra IDE

Docker Desktop rodando (WSL2 no Windows)

Git

Como rodar (local)

Clonar

git clone https://github.com/SEU_USUARIO/java-api-basica.git
cd java-api-basica


Subir o PostgreSQL

docker compose up -d
docker ps
# deve aparecer pg_portfolio Up em 5432->5432


Config da aplicação
Arquivo: src/main/resources/application.yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/portfolio
    username: postgres
    password: postgres
server:
  port: 8080


Executar a API

Pelo IntelliJ: abrir ApiBasicaApplication e clicar ▶️

Ou via Maven (se instalado): mvn spring-boot:run

Endpoints (exemplos)
curl http://localhost:8080/health
curl http://localhost:8080/hello
curl "http://localhost:8080/hello?name=Daniel"
curl http://localhost:8080/dbping

Estrutura do projeto
api-basica/
 ├─ pom.xml
 ├─ docker-compose.yml
 └─ src/
    ├─ main/
    │   ├─ java/dev/daniel/apibasica/
    │   │   ├─ ApiBasicaApplication.java
    │   │   └─ web/HealthController.java
    │   └─ resources/application.yml
    └─ test/...

Solução de problemas

Connection refused: verifique docker ps e porta (5432).

Auth falhou: alinhe POSTGRES_USER/POSTGRES_PASSWORD no Compose e no application.yml.

Porta ocupada: altere no Compose para "5433:5432" e use jdbc:postgresql://localhost:5433/portfolio.

Roadmap (próximos passos)

CRUD com Spring Data JPA

Migrações com Flyway

Documentação Swagger/OpenAPI

Integração ao seu portfólio web

🇺🇸 English
Overview

Minimal learning/portfolio API: Java 21 + Spring Boot 3 + PostgreSQL (Docker) with three endpoints:

GET /health — simple status

GET /hello?name=YourName — JSON message

GET /dbping — database connectivity check via SELECT 1

Stack

Java 21 (LTS)

Spring Boot 3 (Web, JDBC)

PostgreSQL 16 (Docker)

HikariCP (connection pool)

Maven

Prerequisites

JDK 21 installed and on PATH

IntelliJ IDEA (Community is fine) or any IDE

Docker Desktop running (WSL2 on Windows)

Git

How to run (local)

Clone

git clone https://github.com/YOUR_USER/java-api-basica.git
cd java-api-basica


Start PostgreSQL

docker compose up -d
docker ps
# you should see pg_portfolio Up on 5432->5432


App config
File: src/main/resources/application.yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/portfolio
    username: postgres
    password: postgres
server:
  port: 8080


Run the API

IntelliJ: open ApiBasicaApplication and click ▶️

Or Maven (if installed): mvn spring-boot:run

Endpoints (examples)
curl http://localhost:8080/health
curl http://localhost:8080/hello
curl "http://localhost:8080/hello?name=Daniel"
curl http://localhost:8080/dbping

Project structure
api-basica/
 ├─ pom.xml
 ├─ docker-compose.yml
 └─ src/
    ├─ main/
    │   ├─ java/dev/daniel/apibasica/
    │   │   ├─ ApiBasicaApplication.java
    │   │   └─ web/HealthController.java
    │   └─ resources/application.yml
    └─ test/...

Troubleshooting

Connection refused: check docker ps and port (5432).

Auth failed: align POSTGRES_USER/POSTGRES_PASSWORD between Compose and application.yml.

Port already in use: change Compose to "5433:5432" and use jdbc:postgresql://localhost:5433/portfolio.

Roadmap (next steps)

CRUD with Spring Data JPA

Flyway migrations

Swagger/OpenAPI docs

Integration with your web portfolio

🇩🇪 Deutsch
Überblick

Minimale Lern-/Portfolio-API: Java 21 + Spring Boot 3 + PostgreSQL (Docker) mit drei Endpunkten:

GET /health — einfacher Status

GET /hello?name=DeinName — JSON-Nachricht

GET /dbping — Datenbank-Check via SELECT 1

Stack

Java 21 (LTS)

Spring Boot 3 (Web, JDBC)

PostgreSQL 16 (Docker)

HikariCP (Connection Pool)

Maven

Voraussetzungen

JDK 21 installiert und im PATH

IntelliJ IDEA (Community reicht) oder andere IDE

Docker Desktop läuft (WSL2 unter Windows)

Git

Ausführen (lokal)

Klonen

git clone https://github.com/IHR_USER/java-api-basica.git
cd java-api-basica


PostgreSQL starten

docker compose up -d
docker ps
# pg_portfolio sollte auf 5432->5432 laufen


App-Konfiguration
Datei: src/main/resources/application.yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/portfolio
    username: postgres
    password: postgres
server:
  port: 8080


API starten

In IntelliJ: ApiBasicaApplication öffnen und ▶️

Oder mit Maven (falls installiert): mvn spring-boot:run

Endpunkte (Beispiele)
curl http://localhost:8080/health
curl http://localhost:8080/hello
curl "http://localhost:8080/hello?name=Daniel"
curl http://localhost:8080/dbping

Projektstruktur
api-basica/
 ├─ pom.xml
 ├─ docker-compose.yml
 └─ src/
    ├─ main/
    │   ├─ java/dev/daniel/apibasica/
    │   │   ├─ ApiBasicaApplication.java
    │   │   └─ web/HealthController.java
    │   └─ resources/application.yml
    └─ test/...

Fehlerbehebung

Connection refused: docker ps und Port (5432) prüfen.

Auth fehlgeschlagen: POSTGRES_USER/POSTGRES_PASSWORD zwischen Compose und application.yml abgleichen.

Port belegt: im Compose auf "5433:5432" ändern und jdbc:postgresql://localhost:5433/portfolio verwenden.

Roadmap (nächste Schritte)

CRUD mit Spring Data JPA

Flyway-Migrationen

Swagger/OpenAPI-Dokumentation

Integration in dein Web-Portfolio
