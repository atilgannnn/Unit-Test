package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test03_BeforeEach_AfterEach {

    //!! Başlangıçta testin ihtiyaç duyduğu dataya ilk değerlerini vermek için kullanılır

    String str;

    @BeforeEach
    void beforeEach(){

        str = "JUnit5 ile test yazmak çok kolay";

        System.out.println("beforeEach() çalıştı");


    }

    @AfterEach
    void afterEach(){


        str = null;
        System.out.println("afterEach() çalıştı");


    }

    @Test
    void testArrays(TestInfo info){

        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5","ile","test","yazmak","çok","kolay"};
        System.out.println(info.getDisplayName() + "çalıştı");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));

    }

    @Test
    void testStringLength(TestInfo info){

        int anlikDeger = str.length(); // str şu an beforeEach içerisindeki str yani ilk str nin uzunluğu gelecek

        int beklenenDeger = 32;

        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName() + "çalıştı");





    }






}
