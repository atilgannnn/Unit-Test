package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {


    @Test
    void testLength(){ // Burada sürekli olarak aynı methodu tekrar ettik

        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Şeyma".length()>0);
        assertTrue("Beyza".length()>0);
        assertTrue("Ömer".length()>0);

    }

    // Daha kullanışlı olan parametreli test methodumuzu yazıyoruz

    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Osman","Şeyma","Beyza","Ömer"})
    void testLength2(String str){

        assertTrue(str.length()>0);


    }

    // ÖRNEK - 1

    @Test
    void testUpperCase(){

        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    // Comma-separated özelliğini kullanıyorum

    @ParameterizedTest
    @CsvSource(value =
            {
             "MERHABA, Merhaba",
             "JAVA, Java",
             "TEST, Test"
            })
    void testUpperCase2(String str1,String str2){

        assertEquals(str1,str2.toUpperCase());

    }

    // ÖRNEK - 2

    /*

    java --> a ------> assertTrue(contains)
    junit --> u ------> assertTrue(contains)
    hello --> a ------> assertFalse(contains)

    */

    @ParameterizedTest
    @CsvSource(value = {"true, java, a", "true, junit, u", "false, hello, a"})
    void testContains(boolean b1,String s1,String s2){

        assertEquals(b1,s1.contains(s2));


    }







}
