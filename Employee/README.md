# Employee
Testes da classe EmployeeDetails (nome, salário mensal, salário anual, taxa).

## Rodar testes

**Windows (com pasta lib: junit + hamcrest):**
```bash
javac -cp ".;lib\*" *.java
java -cp ".;lib\*" org.junit.runner.JUnitCore TestEmployeeDetails
```

**Linux (JUnit no sistema):**
```bash
sudo apt install junit4
javac -cp .:/usr/share/java/junit4.jar *.java
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestEmployeeDetails
```

**Linux (com pasta lib):**
```bash
javac -cp ".:lib/*" *.java
java -cp ".:lib/*" org.junit.runner.JUnitCore TestEmployeeDetails
```
