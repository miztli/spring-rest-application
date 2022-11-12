
### H2 console

`http://localhost:8080/h2-console`

### API Scripts

```shell
curl --location --request POST 'http://localhost:8080/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Miztli",
    "age": 32,
    "gender": "MALE"
}'
```

### Containerize application

- Create Dockerfile
- Run image in detached mode: `docker run --name spring-boot-app -p8090:8080 -d spring-application:latest`
- To ssh into the container: `docker exec -it {containerId} {bash/sh}`
- To inspect container: `docker inspect {containerId}`
- To stop container: `docker stop {container-id}`
- To remove container: `docker rm {container-id}`