#!/bin/sh

# Init accounts, cards, loans
curl -X GET http://localhost:8072/accounts/api/seeds/init

# Clean accounts, cards, loans
