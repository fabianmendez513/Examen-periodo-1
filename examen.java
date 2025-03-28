    import java.util.Scanner;

        public class examen {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // x + 2x = 3x
                System.out.print("Ingrese un valor para x: ");
                int x1 = scanner.nextInt();
                int resultado1 = x1 + 2 * x1;
                System.out.println("Resultado de la ecuación x + 2x: " + resultado1);
        
                // x^2 - 3x
                int x2 = 5;
                int resultado2 = (x2 * x2) - (3 * x2);
                System.out.println("Resultado de la ecuación x^2 - 3x con x=5: " + resultado2);
        
                // (a + b + c) / 3
                System.out.print("Ingrese el primer número: ");
                int a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int b = scanner.nextInt();
                System.out.print("Ingrese el tercer número: ");
                int c = scanner.nextInt();
                double resultado3 = (a + b + c) / 3.0;
                System.out.println("Resultado de la ecuación (a + b + c) / 3: " + resultado3);
        
                // x^2 + 2(x + 1)
                System.out.print("Ingrese un valor para x: ");
                int x4 = scanner.nextInt();
                int resultado4 = (x4 * x4) + 2 * (x4 + 1);
                System.out.println("Resultado de la ecuación x^2 + 2(x + 1): " + resultado4);
        
                scanner.close();
            }
        }
        
        
        