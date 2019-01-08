# 이용량 조회 Docker 이미지 만들기

### 이미지 만들기

##### docker file 명세서 생성

- FROM 기본 이미 정보를 기술하고,  ENTRYPOINT와 CMD정보로 실행에 필요한 Arguments를 명시함.

  ```shell
  FROM openjdk:8-jdk-alpine
  VOLUME /tmp
  COPY runApp.sh /
  COPY usagedata-db.jar app.jar
  ENTRYPOINT ["/runApp.sh"]
  CMD ["-Dspring.datasource.url=jdbc:postgresql://localhost/testdb", "-Dspring.data.source.username=kos_user", "-Dspring.datasource.password=new1234!"]
  ```


- runApp.sh 파일을 생성하여 docker 이미지 생성시 Arguments를 실행할 외부 shell script 파일을 만듬.

  ```shell
  #!/bin/sh
  
  CMD="java $@ -jar app.jar"
  
  echo ${CMD}
  ${CMD}
  ```



##### docker build 이미지 생성

```
docker build -t sit-kos/retrieve-usagedata-db:0.1 .
```



##### docker tag

- 필요한 namespace 또는 원격시스템에 전송하기 위한 작업 수행

```
docker tag sit-kos/retrieve-usagedata-db:0.1 kos-cluster.icp:8500/sit-kos/retrieve-usagedata-db:0.1
```

##### docker push

```
docker push kos-cluster.icp:8500/sit-kos/retrieve-usagedata-db:0.1
```

