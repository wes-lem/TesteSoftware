# Projeto Java
Testes Payable/Employee (Date, Invoice, SalariedEmployee, CommissionEmployee, HourlyEmployee, PieceWorker, BasePlusCommissionEmployee). Suíte: AllTests.

## Pré-requisito
Pasta `lib` com `junit-4.13.2.jar` e `hamcrest-core-1.3.jar`. Links no GUIA_INSTALACAO_E_COMANDOS.md.

## Rodar testes

**Windows (na pasta Projeto Java):**
```bash
javac -cp ".;lib\*" *.java
java -cp ".;lib\*" org.junit.runner.JUnitCore AllTests
```

**Linux (na pasta Projeto Java):**
```bash
javac -cp ".:lib/*" *.java
java -cp ".:lib/*" org.junit.runner.JUnitCore AllTests
```

Rodar uma classe só: troque `AllTests` por `TestDate`, `TestInvoice`, etc.

Documentação dos testes: DOCUMENTACAO_TESTES.md. Instalação detalhada: GUIA_INSTALACAO_E_COMANDOS.md.
