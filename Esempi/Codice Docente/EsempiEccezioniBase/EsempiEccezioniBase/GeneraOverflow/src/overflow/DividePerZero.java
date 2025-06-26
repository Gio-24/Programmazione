package overflow;

import java.util.Scanner;

public class DividePerZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire due numeri interi: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Risultato della divisione intera " + x + "/" + y);
        System.out.println(DivisionePerZero(x,y));
        input.close();
    }

    public static int DivisionePerZero(int a, int b){
        return a/b;
    }  

}
