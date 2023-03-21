package Day3;

public class C01_StringModify {

    // Task : Kelimenin ilk iki harfinde "A" varsa silinsin
    // kelimelerin hepsi büyük harf olarak verilecek
    // AABC --> BC , ABC --> BC

    public String deleteAIfItIsInFirstTwoPosition(String str){

        if (str.length()<=2)

         return str.replace("A","");

        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);

        return firstTwoChars.replaceAll("A","") + afterFirstTwoChars;

    }





}
