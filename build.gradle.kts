/*
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/9.3.1/samples
 */

plugins {
    kotlin("jvm") version "2.3.10"  // Kotlin plugin
    application                     // Run plugin
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

application {
    mainClass.set("MainKt")
}