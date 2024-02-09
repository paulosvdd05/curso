import org.example.countXO
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xoo"))
        Assertions.assertTrue(countXO("xxoxxo"))
        Assertions.assertTrue(countXO("xxoxoo"))

    }
}