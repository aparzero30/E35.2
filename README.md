# E35.2

http://localhost:8080/home is the root url 

How to run this application:


 Clone this repository

Install Docker and Docker Compose 

Enter this commands:

-f "docker-compose.yml" up -d --build                                                //this  will run docker 

docker cp taskDB.sql e16-spring-boot-activity-dbpostgresql-1:/tmp/taskDB.sql         //copy the backup file for database

docker exec -it e16-spring-boot-activity-dbpostgresql-1 bash                         //acces psql command line

pg_restore -U postgres -d taskDB /tmp/taskDB.sql                                    //restore backup file




        
        
      




