FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY runApp.sh /
COPY usagedata-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["/runApp.sh"]
CMD ["-Dspring.redis.host=127.0.0.1 -Dspring.redis.port=6379"]
