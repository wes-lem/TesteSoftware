# Teste e Qualidade de Software
**Weslem Rodrigues e Silva**
- JUnit 4

## Estrutura
- **Projeto Java** – testes do projeto Payable/Employee (Date, Invoice, funcionários). Ver `Projeto Java/DOCUMENTACAO_TESTES.md` e `Projeto Java/GUIA_INSTALACAO_E_COMANDOS.md`.
- **Employee** – EmployeeDetails + TestEmployeeDetails.
- **CompareSubstrings** – CompareSubstrings + TestCompareSubstrings.

## Projeto Java – rodar testes
Coloque os JARs (junit e hamcrest) em `Projeto Java/lib`. Na pasta `Projeto Java`:

**Windows:**
```bash
javac -cp ".;lib\*" *.java
java -cp ".;lib\*" org.junit.runner.JUnitCore AllTests
```

**Linux:**
```bash
javac -cp ".:lib/*" *.java
java -cp ".:lib/*" org.junit.runner.JUnitCore AllTests
```

## Employee – rodar testes (Linux)
```bash
sudo apt install junit4
javac -cp .:/usr/share/java/junit4.jar EmployeeDetails.java TestEmployeeDetails.java
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestEmployeeDetails
```
