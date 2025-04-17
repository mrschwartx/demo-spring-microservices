# demo-spring-microservices

Demo Spring Microservices Architecture for Bank API.

## How to run

## Locally

```bash
# Setup MySQL and RabbitMQ
docker compose -f docker-compose-dev.yml

# Run Config Server
make configserver.run

# Run Eureka Server
make eurekaserver.run

# Run Accounts Service
make accounts.run

# Run Cards Service
make cards.run

# Run Loans Service
make loans.run

# Open Swagger on each services and request init api
```

## Docker 

```bash
# Run Compose
docker compose up -d --build
```

## References
