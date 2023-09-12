// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println( getAgeAndTemperature(54 , 25));
        System.out.println( getAgeAndTemperature(36 , -5));
        System.out.println( getAgeAndTemperature(8 , 13));
        System.out.println( getAgeAndTemperature(5 , 40));
        System.out.println( getAgeAndTemperature(46 , 17));
    }
    public static String getAgeAndTemperature(int age, int temperature){
        String pig ;
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30 ){
           pig = "Можно идти гулять1";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28 ) {
            pig = "Можно идти гулять2";

        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            pig = "Можно идти гулять3";
        } else {
            pig = "Оставайтесь дома";
        }

        return pig;

    }
}