loans.run:
	cd loans && mvn clean spring-boot:run

accounts.run:
	cd accounts && mvn clean spring-boot:run

cards.run:
	cd cards && mvn clean spring-boot:run

docker.loans.build:
	cd loans && docker build -t examplebank/loans .

docker.accounts.build:
	cd accounts && docker build -t examplebank/accounts .

docker.cards.build:
	cd cards && docker build -t examplebank/cards .