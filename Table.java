import java.util.Scanner;

public class Table{
    Scanner sc = new Scanner(System.in);
    public void main(String[] args) {
        System.out.println("Enter a num : ");
        int num = sc.nextInt();
        for(int i = 0; i < 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

