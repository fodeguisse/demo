###DevOps Docker
1) récupérer le code source de l'appli java/springBoot via git
------------------------
git clone ….

2) construire l'application java via maven
----------------------------------
cd …/demo  (là où il ya pom.xml)
mvn package
cd target
ls

3) construire l'image docker depuis le fichier Dokerfile
-------------------------------------------------------
cd ..
docker image build -t xyz/demo .
docker image ls

4) lancer le conteneur docker à partir de l'image construite:
-------------------------------------------------------
docker container run -d -p 8282:8181 xyz/demo
docker container ls
curl http://localhost:8282/demo/index.html