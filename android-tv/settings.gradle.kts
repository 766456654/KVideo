pluginManagement {
    repositories {
        maven { url = uri("https://raw.githubusercontent.com/alexgreench/google-webrtc/master") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolution {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KVideo-TV"
include(":app")
