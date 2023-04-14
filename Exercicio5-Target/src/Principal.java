import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String inputString = scan.nextLine();

        String invertedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            invertedString += inputString.charAt(i);
        }

        System.out.println("String invertida: " + invertedString);
    }
}