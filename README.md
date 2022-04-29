# API APP Leitura de Cocho

API APP Leitura de Cocho é uma aplicação BackEnd desenvolvido em Java com o FrameWork SpringBoot para se utilizar no aplicativo Leitura de Cocho.

A API foi desenvolvida para integração ao APP Leitura de Cocho.

A API realiza os CRUDS de

- Usuáio
- Fazenda
- Registro


## Instalação

Para instalação primeiramente clone o repositório local, em seguida abra o diretório salvo e instale as dependências

```sh
git clone https://github.com/RToramaru/manejo-de-cocho-app
cd api-app
mvn clean install
```
Em seguida altere as configurações do banco de dados para as suas
```sh
api-app\src\main\resources\application.properties
```
## Uso

Execute o aplicativo Spring Boot usando Maven:
```sh
mvn spring-boot:run
```
Abrir na porta 

```sh
localhost:8080
```

## Desenvolvedores
Luana Ataide Castro https://github.com/luanaacastro

Rafael Almeida Soares https://github.com/RToramaru
