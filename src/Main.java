//write a program to calculate the percentage of students
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float total = 500;
        System.out.println("Enter marks of 5 subjects");
        System.out.println("English");
        float a = Sc.nextFloat();
        System.out.println("Hindi");
        float b = Sc.nextFloat();
        System.out.println("Physics");
        float c = Sc.nextFloat();
        System.out.println("Chemistry");
        float d = Sc.nextFloat();
        System.out.println("Biology");
        float e = Sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println("Your total marks is:");
        System.out.println(sum);
        float percentage = (sum / total) * 100;
        System.out.println("Marks percentage is:");
        System.out.println(percentage);

    }
}