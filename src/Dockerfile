FROM openjdk:17
# this new image will be create from parent image = openjdk:17(stable)

# Create app directory inside docker image
WORKDIR /usr/app

#demo.jar si <finalName>demo</finalName> dans partie <build> de pom.xml
COPY  target/demo.jar  ./

#optimisation possible : https://spring.io/guides/topicals/spring-boot-docker

EXPOSE 8181

CMD ["java","-jar","demo.jar" ]
# CMD ["java","-jar","demo.jar" ,"-Dspring.profiles.active" , "mysql" ]