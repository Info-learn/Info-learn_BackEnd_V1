val jar: Jar by tasks
jar.enabled = false

dependencies {

    //JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    //MySQL driver
    implementation("mysql:mysql-connector-java")
    //Security
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.security:spring-security-config")
    //Validation
    implementation("org.springframework.boot:spring-boot-starter-validation")
    //Jwts
    implementation("io.jsonwebtoken:jjwt:0.9.1")

}

allOpen{
    annotation("jakarta.persistence.Entity")
    annotation("com.example.global.annotation.UseCase")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("org.springframework.data.redis.core.RedisHash")
    annotation("jakarta.persistence.Embeddable")
}

noArg{
    annotation("jakarta.persistence.Entity")
    annotation("com.example.global.annotation.UseCase")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("org.springframework.data.redis.core.RedisHash")
    annotation("jakarta.persistence.Embeddable")
}