import org.jetbrains.kotlin.gradle.tasks.KotlinCompile





plugins {
    kotlin("jvm") version "1.7.10"
    jacoco
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("junit:junit:4.13.2")


}



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}