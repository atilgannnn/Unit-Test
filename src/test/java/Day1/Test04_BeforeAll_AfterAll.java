package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(TestInfo info){ // bu annotation da best practice static yazmaktır

        System.out.println("beforeAll() çalıştı");

    }

    @AfterAll
    static void afterAll(TestInfo info){

        System.out.println("afterAll() çalıştı");

    }

    @Test
    void testArrays(TestInfo info){

        String str = "Unit Test with JUnit";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit","Test","with","JUnit"};
        System.out.println(info.getDisplayName() + " çalıştı");
        assertArrayEquals(beklenenDizi,anlikDizi,"Diziler birbirine eşit değil!");


    }

    @Test
    void testArrays2(TestInfo info){

        String str = "Spring Boot ile Backend yazmak everestin tepesine çıkmak gibi";
        int anlikDeger = str.split(" ").length;
        int beklenenDeger = 9;
        System.out.println(info.getDisplayName() + " çalıştı");
        assertEquals(beklenenDeger,anlikDeger,"Uzunluklar birbirine eşit değil!");


    }









}
