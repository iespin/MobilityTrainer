pluginManagement {
    repositories {
        google() // Repositorio de Google (KSP y otros plugins de Android)
        mavenCentral() // Repositorio Maven Central
        gradlePluginPortal() // Repositorio de plugins de Gradle
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MobilityTrainer"
include(":app")
