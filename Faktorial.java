import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        
        System.out.println("Faktorial dari " + n + " adalah " + hitungFaktorial(n));
    }
    
    static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}


