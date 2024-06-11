<h1> Kafka producer-consumer app</h1>

### Run in local env:

```bash
      docker-compose up -d
```

### Send message to endpoint 

```bash
      curl --location 'http://localhost:8080/api/v1/messages' \
      --header 'Content-Type: application/json' \
      --data '{
      "message": "hello kafka!"
      }'
```

### Check logs for updates from message listener

```bash
docker-compose logs main-service
```