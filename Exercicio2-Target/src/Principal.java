import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
				
        boolean pertence = false;
        int a = 0;
        int b = 1;
        int c = 0;
           
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            
            System.out.print("Sequência de Fibonacci: ");
        
        while (c <= num) {
            if (c == num) {
                pertence = true;
            }
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        if (pertence) {
            System.out.println("\n O número " + num + " pertence à sequência de Fibonacci.");
          }
         else {
            System.out.println("\n O número " + num + " não pertence à sequência de Fibonacci.");
    }     
  }
}
	

