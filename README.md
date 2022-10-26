
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