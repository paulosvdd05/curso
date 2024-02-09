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
    fun vaiFalhar(){
        fail("Nao posso terminar os testes sem este metodo")
    }
}