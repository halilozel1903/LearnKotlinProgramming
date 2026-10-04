plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

group = "com.halilozel"
version = "2.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
    compilerOptions {
        progressiveMode.set(true)
    }
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

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

tasks.register<JavaExec>("runLesson") {
    group = "application"
    description = "Run a lesson by name. Example: ./gradlew runLesson -Plesson=Variables"
    val lessonName = providers.gradleProperty("lesson").orElse("HelloWorld")
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set(lessonName.map { "${it}Kt" })
    standardInput = System.`in`
}

fun registerLesson(taskName: String, mainClassName: String, description: String) {
    tasks.register<JavaExec>(taskName) {
        group = "application"
        this.description = description
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set(mainClassName)
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
    registerLesson("run$lesson", "${lesson}Kt", "Run the $lesson lesson")
}
