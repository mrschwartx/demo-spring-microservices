#!/bin/sh

# Init accounts, cards, loans
curl -X GET http://localhost:8072/examplebank/accounts/seeds/init
curl -X GET http://localhost:8072/examplebank/cards/seeds/init
curl -X GET http://localhost:8072/examplebank/loans/seeds/init

# Fetch Customer Details
     curl -X GET "http://localhost:8072/examplebank/accounts/api/customers/fetchCustomerDetails?mobileNumber=0812345678" \
          -H "Accept: application/json"

# Clean accounts, cards, loans
curl -X GET http://localhost:8072/examplebank/accounts/seeds/clean
curl -X GET http://localhost:8072/examplebank/cards/seeds/clean
curl -X GET http://localhost:8072/examplebank/loans/seeds/clean