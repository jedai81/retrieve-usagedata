FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY runApp.sh /
COPY usagedata-db.jar app.jar
ENTRYPOINT ["/runApp.sh"]
CMD ["-Dspring.datasource.url=jdbc:postgresql://localhost/testdb", "-Dspring.data.source.username=kos_user", "-Dspring.datasource.password=new1234!"]
