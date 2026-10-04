# Learn Kotlin Programming

A beginner-friendly introduction to the **Kotlin** programming language. If you have no programming background, start here — the lessons begin from the very first line of code.

The examples use current Kotlin idioms, English comments, and a Gradle build on **Kotlin 2.4.20** (K2 compiler) with **JDK 21**.

## Requirements

- JDK 21 or newer (the Gradle toolchain can download one automatically)
- No local Gradle install is required; use the wrapper

## Build and test

```bash
./gradlew compileKotlin
./gradlew test
```

## Run the lessons

```bash
./gradlew run                  # Hello World (default)
./gradlew runHelloWorld
./gradlew runVariables
./gradlew runLoops
./gradlew runFunctions
```

You can also run any lesson by file name (without `.kt`):

```bash
./gradlew runLesson -Plesson=Variables
./gradlew runLesson -Plesson=When
```

Open the project in IntelliJ IDEA or Android Studio and run the `main()` function in any lesson file.

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

## Why learn Kotlin?

1. **Open source** — compiler, IDE plugins, and build tools are open source.
2. **Interoperable** — designed to work with Java and Android codebases.
3. **Concise** — less boilerplate than Java for the same ideas.
4. **Tool-friendly** — developed by JetBrains (IntelliJ IDEA, Android Studio).
5. **Null safety** — the type system helps you avoid null-pointer mistakes.
6. **Multiplatform** — share logic across Android, iOS, server, desktop, and web targets.
7. **Modern toolchain** — Kotlin 2.x uses the stable K2 compiler by default.

## Project layout

```
src/main/kotlin/     Lesson sources (one file per topic)
src/test/kotlin/     Smoke tests for selected lessons
gradle/              Version catalog and wrapper
```

## Resources

- [Getting started with Kotlin](https://kotlinlang.org/docs/getting-started.html)
- [Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Android Kotlin guides](https://developer.android.com/kotlin)
- [Kotlin Playground](https://play.kotlinlang.org/)
- [What's new in Kotlin 2.4.20](https://kotlinlang.org/docs/whatsnew2420.html)

## Support

If this project helps you, you can [buy me a coffee](https://www.buymeacoffee.com/halilozel1903).

## License

This project is licensed under the [MIT License](LICENSE).
