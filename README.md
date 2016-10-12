# Regnskap-Core

### Rammeverk
* [Hibernate](http://hibernate.org/)
* [Spring](https://spring.io/)

### Utviklingsmiljø
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Tomcat 9](https://tomcat.apache.org/download-90.cgi) 
* [MySql](http://dev.mysql.com/downloads/mysql/)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* [Postman](https://www.getpostman.com/)

### Kjøre og deploye applikasjonen med IntelliJ IDEA
1. Åpne modul settings
2. Gå til Artifacts
3. Opprett ny "Web Application Exploded War"
4. Legg til alle tilgjengelige elementer
5. Åpne "Server configurations"
6. Legg til bygging av artifakten Regnskap under "Before launch"
7. Gå til fanen Deploy og legg til artifakten Regnskap
8. Start server
9. Gå til http://localhost:8080/api/category/


###Postman
1. Gå til Collections
2. Importer filen [src/main/resources/config/postman/Regnskap.postman_collection.json]()

### YouTrack
* Link: http://sohol.myjetbrains.com