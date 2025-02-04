dependencies {
    implementation(projects.monolithicDomain)
    implementation(projects.monolithicInfrastructure)

    // aspect
    runtimeOnly(libs.aspectj.weaver)

    // validation
    implementation(libs.jakarta.validation.api)

    // hibernate & jpa
    implementation(libs.spring.boot.starter.data.jpa)

    // kotlin-jdsl
    implementation(libs.jdsl.jpql.dsl)
    implementation(libs.jdsl.jpql.render)
    implementation(libs.jdsl.spring.jpa.support)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
