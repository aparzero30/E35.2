#!/bin/bash

docker cp taskDB.sql e16-spring-boot-activity-dbpostgresql-1:/tmp/taskDB.sql
docker exec -it e16-spring-boot-activity-dbpostgresql-1 bash -c "pg_restore -U postgres -d taskDB /tmp/taskDB.sql"