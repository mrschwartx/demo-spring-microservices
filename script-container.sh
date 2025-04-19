#!/bin/sh

make docker.accounts.build &&
make docker.cards.build &&
make docker.loans.build &&
make docker.configserver.build &&
make docker.eurekaserver.build &&
make docker.gatewayserver.build &&
docker compose up
