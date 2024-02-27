plugins {
    kotlin("jvm")
}

group = "ru.basharin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))
}

kotlin {
    jvmToolchain(19)
}