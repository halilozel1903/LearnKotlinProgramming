plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("HelloWorldKt")
}

tasks.register<JavaExec>("runLesson") {
    group = "application"
    description = "Run a lesson. Example: ./gradlew runLesson -Plesson=Variables"
    val lessonName = providers.gradleProperty("lesson").orElse("HelloWorld")
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set(lessonName.map { "${it}Kt" })
    standardInput = System.`in`
}
