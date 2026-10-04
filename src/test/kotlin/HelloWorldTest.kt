import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun helloWorldMainPrintsExpectedGreeting() {
        val captured = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(captured))
        try {
            val main = Class.forName("HelloWorldKt").getMethod("main", Array<String>::class.java)
            main.invoke(null, emptyArray<String>())
        } finally {
            System.setOut(originalOut)
        }

        val expected = "Hello World!${System.lineSeparator()}We Love Kotlin"
        assertEquals(expected, captured.toString())
    }
}
