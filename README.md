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
./gradlew runLesson -Plesson=Arrays
./gradlew runLesson -Plesson=ArrayList
./gradlew runLesson -Plesson=Set
./gradlew runLesson -Plesson=HashSet
```

You can also open the project in IntelliJ IDEA and run the `main()` function in any lesson file.

## Lessons and samples

* [Hello World](src/main/kotlin/HelloWorld.kt)
* [Variables](src/main/kotlin/Variables.kt)
* [Data types](src/main/kotlin/DataTypes.kt)
* [String](src/main/kotlin/String.kt)
* [Type conversions](src/main/kotlin/TypeConversions.kt)
* [Arrays](src/main/kotlin/Arrays.kt)
* [Lists / ArrayList](src/main/kotlin/ArrayList.kt)
* [Set](src/main/kotlin/Set.kt)
* [HashSet](src/main/kotlin/HashSet.kt)

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
