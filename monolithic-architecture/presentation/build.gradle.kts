dependencies {

    implementation(libs.spring.boot.starter.web)
}

tasks.bootJar {
    enabled = true
}

tasks.jar {
    enabled = false
}
