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

## Technology

- **Spring Framework**:
  - **Spring Boot**: Rapid development of production-grade applications.
  - **Spring Cloud Config**: Centralized configuration management.
  - **Spring Cloud Gateway**: API gateway for routing requests and handling cross-cutting concerns.
  - **Spring Data JPA**: Simplifies database operations via ORM.
  - **Spring Cloud Netflix Eureka**: Service discovery and registration.
  - **Lombok**: Boilerplate code reduction (e.g., getters, setters, constructors).
- **Resilience**:
  - **Resilience4j**: Fault tolerance with circuit breakers, rate limiters, retries, and bulkheads.
  - **Retry**: Automatic retry mechanisms for failed operations.
  - **Rate Limiting with Redis**: Redis-backed rate limiting for services.
- **Observability**:
  - **Grafana Alloy**: Metrics/log collector and agent.
  - **Grafana Loki**: Log aggregation system.
  - **Grafana**: Visualization and dashboarding tool.
  - **MinIO**: S3-compatible object storage for storing log chunks.
- **Infrastructure**:
  - **Nginx**: Reverse proxy and load balancer (can be used in front of services).
  - **Docker & Docker Compose**: Containerization and service orchestration.
  - **Makefile**: Simplified service management commands.
- **Database & Messaging**:
  - **MySQL**: Relational database used by services.
  - **RabbitMQ**: Message broker for asynchronous communication.

---

## References

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Cloud Netflix Eureka](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html)
- [Spring Cloud Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
- [Resilience4j Documentation](https://resilience4j.readme.io/docs)
- [Grafana Loki](https://grafana.com/oss/loki/)
- [Grafana Alloy](https://grafana.com/docs/alloy/)
- [MinIO](https://min.io/docs/minio/linux/index.html)
- [Grafana](https://grafana.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [RabbitMQ](https://www.rabbitmq.com/)
- [MySQL](https://dev.mysql.com/doc/)
