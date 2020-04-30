# springboot-beginning
[Spring Boot Tutorial for Beginners (Java Framework -youtube tutorial)](https://www.youtube.com/watch?v=vtPkZShrvXQ&amp;t=188s)

[docker postgres](https://hub.docker.com/_/postgres)
# [spring initizer](https://start.spring.io/)

[spring boot react fullstack reference](https://github.com/amigoscode/spring-boot-essentials)

```
docker run --name postgres-spring -e POSTGRES_PASSWORD=q1w2e3r4 -d -p 5432:5432 postgres:alpine

PS C:\workspace> docker start postgres-spring
postgres-spring
PS C:\workspace> docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
7d3d64693904        postgres:alpine     "docker-entrypoint.s…"   3 days ago          Up 9 seconds        0.0.0.0:5432->5432/tcp   postgres-spring

PS C:\workspace\springboot-beginning> docker port postgres-spring
5432/tcp -> 0.0.0.0:5432

docker exec -it 7d3d64693904 bin/bash

bash-5.0# psql -U postgres

postgres=# \l
                                 List of databases
   Name    |  Owner   | Encoding |  Collate   |   Ctype    |   Access privileges
-----------+----------+----------+------------+------------+-----------------------
 postgres  | postgres | UTF8     | en_US.utf8 | en_US.utf8 |
 template0 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
(3 rows)

postgres=#

postgres=# CREATE DATABASE demodb;
CREATE DATABASE
postgres=#

postgres=# \c demodb
You are now connected to database "demodb" as user "postgres".
demodb=#

```
