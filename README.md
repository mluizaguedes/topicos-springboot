## Tópicos Spring Boot

![Top Language](https://img.shields.io/github/languages/top/mluizaguedes/topicos-springboot?style=for-the-badge)

Este projeto é uma aplicação backend construída com Spring Boot, desenvolvida para gerenciar entidades acadêmicas ou de projeto, como trabalhos, seções, revisões, anotações e comentários. Inclui sistema de autenticação e autorização baseado em JWT.

### Tecnologias Utilizadas

*   Java 17
*   Spring Boot 3.x
*   Spring Data JPA
*   Spring Security
*   PostgreSQL
*   Docker & Docker Compose
*   Maven
*   JWT (JSON Web Tokens)

### Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   [JDK 17](https://www.oracle.com/java/technologies/downloads/) ou superior
*   [Maven](https://maven.apache.org/download.cgi) (instalado ou via `mvnw` wrapper)
*   [Docker Desktop](https://www.docker.com/products/docker-desktop/) (para ambiente de desenvolvimento e banco de dados)
*   Um cliente REST (ex: Postman, Insomnia) para testar a API

### Como Instalar e Configurar

1.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/mluizaguedes/topicos-springboot
    cd topicos-springboot-main
    ```

2.  **Configurar o Ambiente de Desenvolvimento (Dev Containers - Recomendado):**
    *   Certifique-se de que o Docker Desktop esteja rodando.
    *   No VS Code, instale a extensão "Dev Containers".
    *   Abra a pasta `topicos-springboot-main` no VS Code. Uma notificação aparecerá perguntando se você deseja reabrir a pasta em um contêiner de desenvolvimento. Confirme.
    *   O Dev Container iniciará automaticamente os serviços `app` (sua aplicação Spring Boot) e `db` (PostgreSQL) conforme configurado em `.devcontainer/docker-compose.yml`.
    *   **Configuração do Banco de Dados:** Após os contêineres estarem prontos, o banco de dados PostgreSQL estará acessível. Você precisará executar o script `DDL.sql` para criar as tabelas e o usuário `spring` que a aplicação utilizará. Conecte-se ao banco de dados `postgres` no `postgresdb:5432` (usuário `postgres`, senha `postgres` para o usuário inicial do DB) e execute o `DDL.sql`.
    *   Verifique se o arquivo `src/main/resources/application.properties` está configurado para o ambiente do Dev Container:
        ```properties
        spring.datasource.url=jdbc:postgresql://postgresdb:5432/postgres
        spring.datasource.username=spring
        spring.datasource.password=pass123
        spring.jpa.hibernate.ddl-auto=none
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.format_sql=true
        ```

3.  **Compilar o Projeto:**
    *   Dentro do ambiente do Dev Container (ou localmente, se preferir), compile o projeto usando Maven:
        ```bash
        ./mvnw clean install
        ```

### Como Executar

1.  **Via Dev Containers (Recomendado):**
    *   Após a configuração e compilação dentro do Dev Container, você pode iniciar a aplicação Spring Boot:
        ```bash
        ./mvnw spring-boot:run
        ```
    *   A aplicação estará acessível em `http://localhost:8080` no seu navegador ou cliente REST, devido ao redirecionamento de portas do Dev Container.

2.  **Localmente (Após Configuração Manual do DB):**
    *   Se você optou por configurar o banco de dados PostgreSQL manualmente (ou via Docker Compose, mas rodando a aplicação Spring Boot diretamente na sua máquina local), certifique-se de que o banco de dados esteja acessível via `localhost:5432` e que o `application.properties` esteja configurado para isso.
    *   Navegue até o diretório `topicos-springboot-main` e execute:
        ```bash
        ./mvnw spring-boot:run
        ```
    *   A aplicação estará disponível em `http://localhost:8080`.
