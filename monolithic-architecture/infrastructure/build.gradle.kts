dependencies {
    implementation(projects.monolithicDomain)

    implementation(libs.spring.context)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
