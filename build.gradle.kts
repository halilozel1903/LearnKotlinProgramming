plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
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

fun registerLessonRun(taskName: String, lessonName: String, description: String) {
    tasks.register<JavaExec>(taskName) {
        group = "application"
        this.description = description
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set("${lessonName}Kt")
        standardInput = System.`in`
    }
}

listOf(
    "HelloWorld",
    "Variables",
    "DataTypes",
    "String",
    "TypeConversions",
    "Loops",
    "When",
    "Functions",
    "Map",
    "Arrays",
    "ArrayList",
    "Set",
    "HashSet",
).forEach { lesson ->
    val taskName = "run$lesson"
    registerLessonRun(taskName, lesson, "Run the $lesson lesson")
}
