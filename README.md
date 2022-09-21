# exercicioIMD

## Dependências

### Postgresql 12
```sh
sudo apt update && sudo apt upgrade
sudo apt -y install postgresql postgresql-contrib
sudo service postgresql start

# Criação do usuário postgres
sudo passwd postgres

# Criação da tabela e usuário para o projeto
sudo -sudo -u postgres psql
    CREATE USER web_project_user WITH ENCRYPTED PASSWORD 'password';
    ALTER ROLE web_project_user WITH LOGIN SUPERUSER INHERIT CREATEDB CREATEROLE REPLICATION;
    SET ROLE web_project_user;
    GRANT postgres TO web_project_user;
    CREATE DATABASE web_project_db ENCODING 'UTF8' TEMPLATE template0 OWNER web_project_user;
    EXIT;

# Criação das variáveis de ambiente para o banco 
export WEB_DB_NAME="web_project_db"
export WEB_DB_USERNAME="web_project_user"
export WEB_DB_PASSWORD="password"

# WSL (Persistência)
cat >> ~/.bashrc << 'EOF'
    export WEB_DB_NAME="web_project_db"
    export WEB_DB_USERNAME="web_project_user"
    export WEB_DB_PASSWORD="password"
    EOF
```

### Java 17
```sh
sudo apt update && sudo apt upgrade

sudo apt install -y openjdk-17-jdk

# Criação da variável JAVA_HOME
export JAVA_HOME=$(readlink -f /usr/bin/javac | sed "s:/bin/javac::")
export PATH=$PATH:$JAVA_HOME/bin

# WSL (Persistência)
$ cat >> ~/.bashrc << 'EOF'
    # set JAVA_HOME adn append PATH
    export JAVA_HOME=$(readlink -f /usr/bin/javac | sed "s:/bin/javac::")
    export PATH=$PATH:$JAVA_HOME/bin
    EOF
```

### Gradle 7.5

A documentação do _Gradle_ recomenda a instalação utilizando o _SDKMAN!_

```sh
# Dependencias
sudo apt install -y curl unzip zip

# Instalação do SDKMAN!
curl -s "https://get.sdkman.io" | bash

# Reinicie o bash
bash

# Instalação do Gradle
sdk install gradle
```

## Extensões recomendadas para o VSCode

* **Extension Pack for Java**
* **Spring Boot Extension Pack**
* **Gradle for Java**