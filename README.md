# Regnskap-Core

### Rammeverk
* [Hibernate](http://hibernate.org/)
* [Spring](https://spring.io/)

### Utviklingsmiljø
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Docker](https://www.docker.com) 
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* [Postman](https://www.getpostman.com/)

### Kjøre og deploye applikasjonen med IntelliJ IDEA
1. Åpne modul settings
2. Gå til Artifacts
3. Opprett ny "Web Application: Archive"
4. Gi den navnet regnaksp_core
5. Legg til alle tilgjengelige elementer
6. Sett output directory til: #prosjektpath#/Regnskap-Core/docker-dir/tomcat/war
7. Sett opp docker configurasjon og pek på docker-dir/docker-compose.yml
8. Legg til regnskap_core under build
9. Kjør docker-compose filen
9. Gå til http://localhost:8080/regnskap/api/category/


### Postman
1. Gå til Collections
2. Importer filen [Regnskap.postman_collection.json](/src/main/resources/config/postman/Regnskap.postman_collection.json)

### YouTrack
* Link: http://sohol.myjetbrains.com
