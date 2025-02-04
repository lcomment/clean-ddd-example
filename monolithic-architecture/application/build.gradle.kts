dependencies {
    implementation(libs.spring.boot.starter.web)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
