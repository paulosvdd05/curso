import org.example.portaria
import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria(){
        //comece analisando os retornos do metodo testado
        Assertions.assertEquals(portaria(10,"",""), "Negado.");
        Assertions.assertEquals(portaria(20, "", ""), "Negado.");
        Assertions.assertEquals(portaria(20,"VIP",""),"Negado.");
        Assertions.assertEquals(portaria(20,"comum","xt3423423423"),"Welcome.");
        Assertions.assertEquals(portaria(20,"comum","3423423423"),"Negado.");


        Assertions.assertEquals(portaria(20,"premium","3423423423"),"Negado.");
        Assertions.assertEquals(portaria(20,"premium","xt3423423423"),"Negado.");
        Assertions.assertEquals(portaria(20,"premium","xl3423423423"),"Welcome.");
        Assertions.assertEquals(portaria(20,"luxo","xl3423423423"),"Welcome.");
    }
}