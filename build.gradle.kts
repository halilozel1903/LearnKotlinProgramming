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

application {
    mainClass.set("HelloWorldKt")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
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
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set(mainClassName)
        standardInput = System.`in`
    }
}

registerLesson("runHelloWorld", "HelloWorldKt", "Run the Hello World lesson")
registerLesson("runVariables", "VariablesKt", "Run the variables lesson")
registerLesson("runDataTypes", "DataTypesKt", "Run the data types lesson")
registerLesson("runString", "StringKt", "Run the String lesson")
registerLesson("runTypeConversions", "TypeConversionsKt", "Run the type conversions lesson")
registerLesson("runArrays", "ArraysKt", "Run the arrays lesson")
registerLesson("runArrayList", "ArrayListKt", "Run the ArrayList lesson")
registerLesson("runSet", "SetKt", "Run the Set lesson")
registerLesson("runHashSet", "HashSetKt", "Run the HashSet lesson")
