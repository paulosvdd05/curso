import org.example.abc
import org.example.countXO
import org.junit.jupiter.api.*

class MainTest {
    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoxoo"))},
            {Assertions.assertTrue(countXO("xxoo"))},


        )

    }


   @Test
   fun assumption(){
    Assumptions.assumeTrue(countXO("xxoo"))
       Assertions.assertTrue((abc()))
   }
}