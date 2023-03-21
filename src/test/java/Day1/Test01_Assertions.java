package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){ //main methodu olmadan nasıl çalıştı?

        // JUnit içinde gömülü gelen main methodu kullanılıyor
        // JUnit5 ile beraber methodların "public" ile belirtilmesi zorunluluğu ortadan kalktı




    }

//!!! test isimlendirmelerinde --> "test" ile başlar (küçük t ile)

    @Test
    public void testLength(){ // String.length() methodunun düzgün çalışıp çalışmadığını test edelim

        String kelime = "Merhaba Dünya"; // 13 karakter
        int anlikDeger = kelime.length();
        int beklenenDeger = 13;
        assertEquals(beklenenDeger,anlikDeger);



    }

    //ÖRNEK 1:

    @Test
    public void testUpperCase(){ // String.toUpperCase()

        String anlikDeger = "Merhaba".toUpperCase();//MERHABA
        String beklenenDeger = "MERHABA";
        //assertEquals(beklenenDeger,anlikDeger);
        //hata anında kullanıcıya mesaj göndermek istiyorsam :
        assertEquals(beklenenDeger,anlikDeger,"UpperCase() methodu düzgün çalışmadı");


    }

    //ÖRNEK 2:

    @Test
    void testToplama(){ //Math.addExact()

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger);



    }

    //ÖRNEK 3:

    @Test
    void testContains(){ //String.contains()

        assertEquals(false,"Mirac".contains("z"));


    }


}
