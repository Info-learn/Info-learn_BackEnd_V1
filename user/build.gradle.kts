val jar: Jar by tasks
jar.enabled = false

dependencies {

    //JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //MySQL driver
    implementation("mysql:mysql-connector-java:8.0.31")
    //Security
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.security:spring-security-config:5.7.3")
    //Validation
    implementation("org.springframework.boot:spring-boot-starter-validation:2.7.4")
    //Jwts
    implementation("io.jsonwebtoken:jjwt:0.9.1")

}