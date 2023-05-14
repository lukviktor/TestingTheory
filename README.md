# TestingTheory

### Для запуска автотестов и создания отчета в Allure ввести команду:
```sh
mvn clean test allure:serve
```

Для запуска автотеста в console прописать команду:
```sh
mvn clean test
```
Для создания отчета в Allure ввести команду:
```sh
    mvn allure:serve
```

*добавляем папку с отчётом Allure к файлам. Ключ -f пригодится, если папка target указана в .gitignore*
```sh
git add -f .\target\allure-results\.
```