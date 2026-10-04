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
./gradlew runDataTypes
./gradlew runString
./gradlew runTypeConversions
./gradlew runArrays
./gradlew runArrayList
./gradlew runSet
./gradlew runHashSet
```

You can also run any lesson by file name (without `.kt`):

```bash
./gradlew runLesson -Plesson=Variables
```

Open the project in IntelliJ IDEA or Android Studio and run the `main()` function in any lesson file.

## Lessons

| Lesson | What you learn |
| --- | --- |
| [Hello World](src/main/kotlin/HelloWorld.kt) | Program entry point, `println` and `print` |
| [Variables](src/main/kotlin/Variables.kt) | `var` vs `val`, type inference, explicit types |
| [Data types](src/main/kotlin/DataTypes.kt) | Numbers, Booleans, characters, and literals |
| [String](src/main/kotlin/String.kt) | String templates, indexing, and common operations |
| [Type conversions](src/main/kotlin/TypeConversions.kt) | Casting and converting between types |
| [Arrays](src/main/kotlin/Arrays.kt) | Fixed-size arrays and iteration |
| [Lists / ArrayList](src/main/kotlin/ArrayList.kt) | `listOf`, `mutableListOf`, and Java `ArrayList` |
| [Set](src/main/kotlin/Set.kt) | Unique elements and set operations |
| [HashSet](src/main/kotlin/HashSet.kt) | Mutable sets backed by `HashSet` |

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
