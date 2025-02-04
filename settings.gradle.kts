rootProject.name = "clean-ddd-example"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

// Monolithic Architecture
module(name = ":monolithic", path = "monolithic-architecture")
module(name = ":monolithic-presentation", path = "monolithic-architecture/presentation")
module(name = ":monolithic-application", path = "monolithic-architecture/application")
module(name = ":monolithic-domain", path = "monolithic-architecture/domain")
module(name = ":monolithic-infrastructure", path = "monolithic-architecture/infrastructure")
module(name = ":monolithic-persistence", path = "monolithic-architecture/infrastructure/persistence-mysql")
module(name = ":monolithic-cache", path = "monolithic-architecture/infrastructure/cache-redis")
module(name = ":monolithic-support", path = "monolithic-architecture/support")

// Microservice Architecture
module(name = ":msa", path = "microservice-architecture")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

fun module(name: String, path: String) {
    include(name)
    project(name).projectDir = file(path)
}
