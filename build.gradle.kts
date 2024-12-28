plugins {
    id("java")
    id("application")
}

application {
    mainClassName = "com.bloomtech.GradleAssignment"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.squareup.okhttp3.okhttp:4.9.3")
}

