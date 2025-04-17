#!/bin/sh

make docker.accounts.build &&
make docker.cards.build &&
make docker.loans.build &&
make docker.configserver.build &&
docker compose up
