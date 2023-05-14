# TestingTheory

### Для запуска автотестов и создания отчета в Allure ввести команду:
```sh
mvn clean test allure:serve
```

*Для запуска автотеста в console прописать команду:*
```sh
mvn clean test
```
*Для создания отчета в Allure ввести команду:*
```sh
    mvn allure:serve
```
или
```sh
allure serve target/allure-results
```

*Можно также сохранить отчет в формате HTML, используя команду:*
*Эта команда генерирует отчет в формате HTML и сохраняет его в папке target/allure-report.*
*После этого можно открыть файл index.html в браузере для просмотра отчета*
```sh
allure generate target/allure-results -o target/allure-report
```

*добавляем папку с отчётом Allure к файлам. Ключ -f пригодится, если папка target указана в .gitignore*
```sh
git add -f .\target\allure-results\.
```