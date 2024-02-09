import org.example.countXO
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testCountXO(){
        Assertions.assertEquals(countXO("xxoo"), true)
    }
}