import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FunctionsTest {
    @Test
    fun addReturnsSumOfOperands() {
        assertEquals(42, add(14, 28))
    }

    @Test
    fun doubleMultipliesByTwo() {
        assertEquals(14, double(7))
    }

    @Test
    fun isEvenRecognizesParity() {
        assertTrue(isEven(4))
        assertFalse(isEven(7))
    }
}
