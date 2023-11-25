plugins {
    kotlin("jvm") version "1.9.0"
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
}
// publish to Gradle Plugin Portal
group = "com.nhatvm"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

gradlePlugin {
    website = "https://fatherofapps.com/"
    vcsUrl = "https://github.com/frank-nhatvm/gradle-rice.git"
    plugins {
        create("cloneGitRepo"){
            id = "com.nhatvm.rice"
            displayName = "Utilities Gradle Task"
            description = "A plugin with some utilities Gradle tasks: clone github repository, rename aar file etc"
            tags = listOf("clonegithub","renameaar")
            implementationClass = "com.nhatvm.rice.GitClonePlugin"
        }
        repositories {
            gradlePluginPortal()
        }
    }
}