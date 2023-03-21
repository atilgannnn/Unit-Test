package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C04_Mock_Islemler_Test {


    @Test
    void islemler(){


        C04_Mock_Islemler dummyObject = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasım");


        //methodlar çağırılmış mı kontrol edelim

        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");






    }

    //methodun kaç kere çağırıldığını test edelim

    @Test
    void testKacDefaCagirildi(){

        C04_Mock_Islemler dummyObject2 = Mockito.mock(C04_Mock_Islemler.class);

            dummyObject2.ekleOgrenci("Ahmet");
            dummyObject2.ekleOgrenci("Ahmet");
            dummyObject2.ekleOgrenci("Mehmet");

        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

        //Halide parametresi ile ekleOgrenci() methodu hiç çağırılmama durumunu kontrol etmek istersem?

        verify(dummyObject2,times(0)).ekleOgrenci("Halide");

        //Herhangi bir parametre ile hiç çağırılmaytan methodu test etsem?

        verify(dummyObject2,never()).silOgrenci(anyString());

        //Methodun en az 2 defa çağırıldığı durumu test edelim

        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");

    }

    //Methodların çağırılma sırasını test edebiliriz

    @Test
    void testSirasiniKontrol(){

        C04_Mock_Islemler dummyObject3 = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Hüseyin");
        dummyObject3.silOgrenci("Ahmet");

        InOrder inOrder = inOrder(dummyObject3);

        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Hüseyin");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");


    }






}
