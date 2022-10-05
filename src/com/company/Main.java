package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstMethod(17, -22));
        System.out.println(firstMethod(21, -19));
        System.out.println(firstMethod(7, 1));
        System.out.println(firstMethod(60, -6));
        System.out.println(firstMethod(44, 29));
        System.out.println(firstMethod(generateRandomAge(), 12));

    }
    public static String firstMethod(int age, int temperature){
        if ((20<age && age<45) && (-20<temperature && temperature<30)){
            return "Можно идти гулять";
        }
        else if ((age<20) && (0<temperature && temperature<28)){
            return "Можно идти гулять";
        }
        else if ((age>45) && (-10<temperature && temperature<25)){
            return "Можно идти гулять";
        }
        else{
            return "Оставайтсь дома";
        }
    }

    // 2 task
    public static int generateRandomAge(){
        Random random =new Random();
        int x= random.nextInt(100)+1;
        System.out.println("random integer is "+x);
        return x;
    }
}
