# Learn Kotlin Programming

![picture](https://hypersense-software.com/blogs-assets/21756fe3-8017-922f-7b4c-271a0dea5044/file_1582906717409.jpg)

A beginner-friendly introduction to the Kotlin programming language. If you have no programming background, start here — the lessons begin from the very first line of code.

This project uses **Kotlin 2.4.20**, the [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html), and a **Java 21** toolchain.

## About Kotlin and why learn it

![kotlin](https://www.netsolutions.com/insights/wp-content/uploads/2020/04/Kotlin.jpg)

1. **Open source**: The Kotlin compiler, IDE plugins, and build tools are open source.
2. **Interoperable**: Kotlin is designed to work with Java. Existing Java and Android code can call Kotlin, and the other way around.
3. **Easy to learn**: The syntax is concise, especially if you already know Java.
4. **Concise and expressive**: Kotlin programs are typically shorter than the equivalent Java.
5. **Tool-friendly**: Kotlin is developed by JetBrains, the company behind IntelliJ IDEA and Android Studio.
6. **Large community**: Kotlin is used across Android, backend, and multiplatform projects, with a growing ecosystem.
7. **Safer code**: Null safety, smart casts, and compiler checks catch many mistakes before you run the program.
8. **Multiplatform**: You can share Kotlin code across Android, iOS, backend, desktop, and web targets.
9. **First-class Android support**: Android Jetpack, KTX, and Coroutines are built around Kotlin language features.
10. **Mature toolchain**: Since 2011, Kotlin has grown into a full ecosystem. The K2 compiler (Kotlin 2.x) is the default.

## How to run the lessons

You need [JDK 21](https://adoptium.net/) or newer. The Gradle Wrapper downloads Gradle 9.7.1 for you.

```bash
# Compile every lesson
./gradlew compileKotlin

# Run the Hello World lesson (default)
./gradlew run

# Run any other lesson by file name (without .kt)
./gradlew runLesson -Plesson=Variables
./gradlew runLesson -Plesson=DataTypes
./gradlew runLesson -Plesson=String
./gradlew runLesson -Plesson=TypeConversions
./gradlew runLesson -Plesson=Loops
./gradlew runLesson -Plesson=When
./gradlew runLesson -Plesson=Functions
./gradlew runLesson -Plesson=Map
./gradlew runLesson -Plesson=Arrays
./gradlew runLesson -Plesson=ArrayList
./gradlew runLesson -Plesson=Set
./gradlew runLesson -Plesson=HashSet

# Or run a lesson with its dedicated task (file name without .kt)
./gradlew runHelloWorld
./gradlew runVariables
./gradlew runLoops
./gradlew runFunctions

# Run unit tests for lesson helpers
./gradlew test
```

You can also open the project in IntelliJ IDEA and run the `main()` function in any lesson file.

## Lessons (2026 fundamentals track)

All lesson sources and Gradle task names use **English** identifiers. Sample output may include Turkish place names or phrases for learners.

| Lesson | Source | Gradle task | Topics |
| --- | --- | --- | --- |
| Hello World | [HelloWorld.kt](src/main/kotlin/HelloWorld.kt) | `runHelloWorld` | Entry point, `println` / `print` |
| Variables | [Variables.kt](src/main/kotlin/Variables.kt) | `runVariables` | `var`, `val`, type inference |
| Data types | [DataTypes.kt](src/main/kotlin/DataTypes.kt) | `runDataTypes` | Numeric types, `Char`, `String`, `Boolean` |
| String | [String.kt](src/main/kotlin/String.kt) | `runString` | Concatenation, iteration, `trim`, case, `split` |
| Type conversions | [TypeConversions.kt](src/main/kotlin/TypeConversions.kt) | `runTypeConversions` | `toInt`, `toIntOrNull`, explicit casts |
| Loops | [Loops.kt](src/main/kotlin/Loops.kt) | `runLoops` | `while`, `for`, ranges, `break` / `continue`, `repeat` |
| When | [When.kt](src/main/kotlin/When.kt) | `runWhen` | `when` statement and expression, type checks |
| Functions | [Functions.kt](src/main/kotlin/Functions.kt) | `runFunctions` | Parameters, defaults, single-expression functions, `vararg` |
| Map | [Map.kt](src/main/kotlin/Map.kt) | `runMap` | Read-only and mutable maps, keys and values |
| Arrays | [Arrays.kt](src/main/kotlin/Arrays.kt) | `runArrays` | `arrayOf`, `IntArray`, indices |
| Lists / ArrayList | [ArrayList.kt](src/main/kotlin/ArrayList.kt) | `runArrayList` | `listOf`, `mutableListOf`, list operations |
| Set | [Set.kt](src/main/kotlin/Set.kt) | `runSet` | `setOf`, uniqueness, set statistics |
| HashSet | [HashSet.kt](src/main/kotlin/HashSet.kt) | `runHashSet` | `hashSetOf`, set algebra |

## Support

If this project helps you, you can buy me a cup of coffee.

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/halilozel1903)

## Resources

- https://kotlinlang.org/docs/getting-started.html
- https://kotlinlang.org/docs/home.html
- https://developer.android.com/kotlin
- https://play.kotlinlang.org/

## License

This project is licensed under the [MIT License](LICENSE).
