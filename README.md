# flyway-demo-app
This Spring Boot application will demonstrate flyway capabilities while using Spring Boot

## Instructions to use Docker
Use Terminal to go to directory ../postgresql-init-stuff
1. Go to the directory where you stored postgresql_flyway_compose.yml
2. Run the following command: ```docker-compose -f postgresql_flyway_compose.yml up```
3. Run the following command: ```docker ps```
4. Using the *\<CONTAINER ID\>* provided from #3 run the following command: ```docker cp initialize-demo-db.sql <container-name>:/docker-entrypoint-initdb.d```
   - EXAMPLE COMMAND:  ```docker cp initialize-demo-db.sql 9b5577185676:/docker-entrypoint-initdb.d```
5. Run the following command: ```docker exec -it db-init-demo-postgres bash```
6. Run the following command: ```cd /docker-entrypoint-initdb.d```
7. Run the following command: ```psql -d my_flyway_db -f initialize-demo-db.sql -U postgres```
8. Run the following command:  ```exit``` {You should have exited the container OS}
  
## Stop and remove Docker container
1. Using the *\<CONTAINER ID\>* provided from #3 run the following command:  ```docker stop <CONTAINER ID>```
2. Using the *\<CONTAINER ID\>* provided from #3 run the following command:  ```docker container rm <CONTAINERID>```

## Instructions to use Persisted HSQLDB
1. Clone https://github.com/timfrichard/hsqldb-server-start repository
2. Run **com.sparkys.start.hsqldb.util.StartServer** as a Java application using *Program argument* like below.
   - EXAMPLE "/temp/flyway/flyway-db" "FLYWAY_DB" "flywayDB" "9090"
     - "/temp/liquibase/liquibase-db" *hard drive location*
     - "FLYWAY_DB" *location name*
     - "flywayDB" *database name*
     - "9090" *port number*
3. Update ```application.yml``` hsql-persisted-profile profile section with your information.
