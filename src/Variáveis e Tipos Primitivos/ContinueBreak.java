public class ContinueBreak {
    public static void main(String[] args) {
       
       // O código vai imprimir os números de 0 a 10 e vai pular o 7.
       
        for (int i = 0; i <=10; i++){
            if (i ==7) {
                continue;
            }
            System.out.println(i);
    
        }

        // Nesse caso apenas os números de 0 a 6 serão impressos

        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
    
}
