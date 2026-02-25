# Teste e Qualidade de Software
**Weslem Rodrigues e Silva**
- JUnit 4

## Atividades

| # | Atividade        | Pasta              | Autor              |
|---|------------------|--------------------|--------------------|
| 1 | Prática JUnit 01 | [CalendarDay](CalendarDay)             | Weslem Rodrigues e Silva |
| 2 | Prática JUnit 02 | [CompareSubstrings](CompareSubstrings) | Weslem Rodrigues e Silva |
| 3 | Prática JUnit 03 | [ValidateIp](ValidateIp)               | Weslem Rodrigues e Silva |
| 4 | Employee         | [Employee](Employee)                   | Weslem Rodrigues e Silva |
| 5 | Projeto Java     | [Projeto Java](Projeto%20Java)         | Weslem Rodrigues e Silva |

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
