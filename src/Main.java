import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj długość ciągu: ");
        int n = input.nextInt();

        int[] ciag = new int[n];
        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            ciag[i] = input.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (ciag[i] % 2 == 0) {
                suma += ciag[i];
            }
        }
        System.out.println("Suma liczb parzystych wynosi: " + suma);
    }
}
