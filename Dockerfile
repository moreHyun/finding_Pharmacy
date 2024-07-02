# 베이스 이미지 선택
FROM openjdk:17
# 작업 디렉토리 설정
ARG JAR_FILE=build/libs/app.jar
# 애플리케이션 파일 추가
COPY ${JAR_FILE} ./app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./app.jar"]