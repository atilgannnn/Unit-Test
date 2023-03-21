package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTimes {


    // !!! Testi tekrarlatmak istiyorsam???

    @RepeatedTest(5)
    void testSubString(){

        assertEquals("Java", "Java çok güzel".substring(0,4));
        System.out.println("testSubstring() çalıştı");


    }

    @RepeatedTest(3)
    void testRepeated(){

        assertEquals(2,Math.addExact(1,1));

    }

    // ÖRNEK - 1

    Random rm = new Random();
    @RepeatedTest(5)
    @Disabled // Class seviyesinde bu annotation ın oldugu method çalışmaz diğer methodlar çalışır
    void testMathAddExact(){

        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : " + sayi1 + " sayi2 : " + sayi2);

    }



















}
