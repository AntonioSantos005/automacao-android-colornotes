# Automação de Testes Mobile com Appium - Projeto ColorNote

Este projeto implementa uma automação de testes para o aplicativo Android **ColorNote**, utilizando **Java, Appium, Cucumber, JUnit e Maven**. O foco principal é validar a funcionalidade de criação de notas no app.

## 🧪 Funcionalidade Automatizada

- Criar nova nota no aplicativo ColorNote

## 🔧 Tecnologias Utilizadas

- Java 11+
- Appium
- Selenium WebDriver
- Cucumber (BDD com Gherkin)
- JUnit
- Maven

## 📁 Estrutura do Projeto

```
src
├── test
│   ├── java
│   │   ├── pageObjects         # Páginas do app (ColorNote)
│   │   ├── runners             # Runner do Cucumber
│   │   ├── stepsDefinitions    # Implementação dos passos Gherkin
│   │   └── utils               # Configurações e hooks
│   └── resources
│       └── features            # Cenário de teste em Gherkin (Criar nota)
```

## 🚀 Como Executar os Testes

1. Inicie o Appium server e conecte um dispositivo ou emulador Android:

```bash
adb devices
```

2. Clone o projeto:

```bash
git clone https://github.com/AntonioSantos005/automacao-android-colornotes.git
cd automacao-android-colornotes
```

3. Execute os testes com Maven:

```bash
mvn clean test
```

4. Visualize o relatório em:

```
target/cucumber-report/index.html
```

## 📦 Aplicativo testado

- **ColorNote** – Aplicativo de notas para Android

## 📝 Observações

- Projeto desenvolvido em 2022
- O projeto é uma resolução de um desafio para capacitação de profissionais

## 👤 Autor

Antônio de Sousa – [LinkedIn](https://www.linkedin.com/in/antoniosousas/)
