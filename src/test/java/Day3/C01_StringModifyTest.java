package Day3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {


    C01_StringModify strModify;

    @BeforeEach
    void setup(){

        strModify = new C01_StringModify();
        System.out.println("@BeforeEach çalıştı");


    }

    @AfterEach
    void tearDown(){


        strModify = null;
        System.out.println("@AfterEach çalıştı");


    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC","BA, ABA","BC, BAC"})
    void deleteIfItIsInFirstTwoPositionTest(String expected, String actual){

        assertEquals(expected,strModify.deleteAIfItIsInFirstTwoPosition(actual));
        System.out.println("çalıştı");

    }







}
