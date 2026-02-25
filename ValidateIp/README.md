# ValidateIp – Prática JUnit 03
Valida se uma string é um endereço IPv4 válido (0.0.0.0 a 255.255.255.255).

## Rodar testes

**Windows (pasta ValidateIp, com lib contendo junit e hamcrest):**
```bash
javac -cp ".;lib\*" *.java
java -cp ".;lib\*" org.junit.runner.JUnitCore TestValidateIp
```

**Linux (com JUnit no sistema):**
```bash
sudo apt install junit4
javac -cp .:/usr/share/java/junit4.jar *.java
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestValidateIp
```

**Linux (com pasta lib e JARs junit + hamcrest):**
```bash
javac -cp ".:lib/*" *.java
java -cp ".:lib/*" org.junit.runner.JUnitCore TestValidateIp
```
