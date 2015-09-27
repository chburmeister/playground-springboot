playground-directory for springboot

run via Maven:
mvn clean spring-boot:run

debug via Remote debugger:
java -agentlib:jdwp=transposocket,server=y,suspend=y,address=9999 -jar target/springboot-0.0.1-SNAPSHOT.jar