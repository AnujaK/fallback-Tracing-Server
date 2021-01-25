# fallback-Tracing-Server
Server meant to fail frequently ;)

<br/>We cannot add a custom Zipkin server i.e. cannot inject zipkin into another spring boot project. So need to run it separately (default port 9411)

### Start Zipkin
curl -sSL https://zipkin.io/quickstart.sh | bash -s
<br/>java -jar zipkin.jar

### Run this project 
./gradlew bootRun

#### Request
http://localhost:8090/produce/
<br/> Every third request to another microservice is supposed to fail, in which case, the fallback method will bs called.

<br/> Logs seen on console and Zipkin UI on http://localhost:9411/zipkin/
