/*
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/9.3.1/samples
 */

plugins {
    kotlin("jvm") version "1.9.22"  // Kotlin plugin
    application                     // Run plugin
}

repositories {
    mavenCentral()
}

dependencies { }

application {
    mainClass.set("MainKt")
}