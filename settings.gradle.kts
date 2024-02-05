pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "effective_mobile_xml"
include(":app")
include(":features:auth")
include(":features:catalog")
include(":features:profile")
include(":features:home")
include(":data")
include(":features:discount")
include(":navigation")
