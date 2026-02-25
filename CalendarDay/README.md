# CalendarDay – Prática JUnit 01
Retorna o dia da semana (MONDAY, TUESDAY, …) para uma data.

## Rodar testes

**Windows (pasta CalendarDay):**
```bash
javac -cp ".;lib\*" *.java
java -cp ".;lib\*" org.junit.runner.JUnitCore TestCalendarDay
```

**Linux (com JUnit no sistema):**
```bash
sudo apt install junit4
javac -cp .:/usr/share/java/junit4.jar *.java
java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore TestCalendarDay
```

**Linux (com pasta lib e JARs junit + hamcrest):**
```bash
javac -cp ".:lib/*" *.java
java -cp ".:lib/*" org.junit.runner.JUnitCore TestCalendarDay
```
