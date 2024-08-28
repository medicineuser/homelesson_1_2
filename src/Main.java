import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        takeWalk(50,30);
        takeWalk(randomGenerateAge(),25);

    }

    public static String takeWalk(int age , int temperature){
        if ((age >= 20 && age < 45) && (temperature >= -20 && temperature < 30)
        ){
            System.out.println("Можно идти гулять");
        } else if (age < 20 && (temperature > 0 && temperature < 28)){
            System.out.println("Можно идти гулять");
        }else if (age > 45 && (temperature > -10 && temperature < 25)){
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }
        return "";
    }

    public static int randomGenerateAge(){
        Random random = new Random();
        int age = random.nextInt(150);
        return age;
    }
}