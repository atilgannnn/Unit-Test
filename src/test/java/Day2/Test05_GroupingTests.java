package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05_GroupingTests {


    // Amacımız : Aynı sınıfta birbirleriyle ilişkili testleri gruplamak için kullanılır

    @Nested
    class testMultiply{

        @ParameterizedTest
        @CsvSource(value = {"-12, -4, 3", "-12, 4, -3", "12, -4, -3"})
        void testMultiplyWithNonZero(int rs, int sayi1, int sayi2){

            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));

        }

        @ParameterizedTest
        @CsvSource(value = {"0, -4, 0", "0, 5, 0", "0, 4, 0"})
        void testMultiplyWithZero(int rs, int sayi1, int sayi2){

            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));

        }

    }// 1. Grup Testin Sonu

    @Nested
    class testAdd{

        @ParameterizedTest
        @CsvSource(value = {"-1, -4, 3", "1, 4, -3", "-7, -4, -3"})
        void testAddWithNonZero(int rs, int sayi1, int sayi2){

            assertEquals(rs, Math.addExact(sayi1,sayi2));

        }

        @ParameterizedTest
        @CsvSource(value = {"3, 0, 3", "5, 5, 0", "-3, 0, -3"})
        void testAddWithZero(int rs, int sayi1, int sayi2){

            assertEquals(rs, Math.addExact(sayi1,sayi2));


        }

    }// 2. Grup Testin Sonu







}
