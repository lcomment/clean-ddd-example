dependencies {
    implementation(libs.spring.boot.starter.data.redis)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
