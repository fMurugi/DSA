import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your kisw marks");
        int kisw = s.nextInt();
        System.out.println("enter your maths marks");
        int mathsMarks = s.nextInt();
        System.out.println("enter yout Eng marks:");
        int engMarks = s.nextInt();

        float average = ((kisw+engMarks+mathsMarks)/3);
        System.out.println("your average is: "+average);

    }
}
