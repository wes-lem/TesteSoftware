# Teste e Qualidade de Software
**Weslem Rodrigues e Silva**
- JUnit 4

## Atividades

| # | Atividade        | Pasta / Arquivo    | Autor              |
|---|------------------|--------------------|--------------------|
| 1 | Prática JUnit 01 | [CalendarDay](CalendarDay)             | Weslem |
| 2 | Prática JUnit 02 | [CompareSubstrings](CompareSubstrings) | Weslem |
| 3 | Prática JUnit 03 | [ValidateIp](ValidateIp)               | Weslem |
| 4 | Employee         | [Employee](Employee)                   | Weslem |
| 5 | Projeto Java     | [Projeto Java](Projeto%20Java)         | Weslem |
| 6 | Exercícios - Unidade 01 | [PDF](01AtividadeTesteSoft.pdf) | Weslem |
| 7 | Exercícios - Unidade 03 e 04 | [PDF](Lista%20de%20Exerc%C3%ADcios%20-%20Unidade%2003%20e%2004.pdf) | Weslem |

## Comandos (resumo)
Comandos completos em cada pasta: ver **README** na pasta da atividade.

**CalendarDay** – ver [CalendarDay/README.md](CalendarDay/README.md)

**CompareSubstrings** – na pasta: `javac -cp .:/usr/share/java/junit4.jar *.java` e `java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestCompareSubstrings` (Linux)

**ValidateIp** – ver [ValidateIp/README.md](ValidateIp/README.md)

**Employee** (Linux):
```bash
cd Employee
sudo apt install junit4
javac -cp .:/usr/share/java/junit4.jar *.java
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestEmployeeDetails
```

**Projeto Java** – ver [Projeto Java/GUIA_INSTALACAO_E_COMANDOS.md](Projeto%20Java/GUIA_INSTALACAO_E_COMANDOS.md). Resumo: coloque JARs em `Projeto Java/lib`; na pasta `Projeto Java`, Windows `javac -cp ".;lib\*" *.java` e `java -cp ".;lib\*" org.junit.runner.JUnitCore AllTests`; Linux use `.:lib/*` no lugar de `.;lib\*`.
