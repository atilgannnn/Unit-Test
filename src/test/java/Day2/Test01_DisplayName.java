package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_DisplayName {

    @Test
    //test_parseInt_If_it_is_throwing_for_non_digit_value
    @DisplayName("parseInt() methoduna nümerik olmayan argüman gönderildiğinde fırlatılan exceptionı test eden method")
    void testException(){

        String str = "Merhaba";

        assertThrows(NumberFormatException.class,()->{

            Integer.parseInt(str);

        });

    }











}
