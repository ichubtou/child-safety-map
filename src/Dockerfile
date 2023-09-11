FROM openjdk:11-jre
COPY build/libs/childsafetymap-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java -jar -Duser.timezone=Asia/Seoul childsafetymap.jar
