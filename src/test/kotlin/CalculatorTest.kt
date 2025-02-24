import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun `add two numbers correctly`() {
        assertEquals( 25.0, calculator.add(10.0, 15.0))
    }

    @Test
    fun `add negative numbers`() {
        assertEquals( -25.0, calculator.add(-10.0, 15.0))
    }

    @Test
    fun `subtract two numbers correctly`() {
        assertEquals( 25.0, calculator.subtract(32.0, 7.0))
    }

    @Test
    fun `multiply two numbers correctly`() {
        assertEquals( 25.0, calculator.multiply(5.0, 5.0))
    }
    @Test
    fun `divide two numbers correctly`() {
        assertEquals( 25.0, calculator.divide(50.0, 2.0))
    }
    @Test
    fun `division by zero`() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(25.0, 0.0)
        }
    }

    @Test
    fun `large numbers`() {
        assertEquals(2.0e12, calculator.add(1.0e12, 1.0e12))
    }

}