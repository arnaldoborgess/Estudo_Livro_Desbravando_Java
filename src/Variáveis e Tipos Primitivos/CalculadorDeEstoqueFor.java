

public class CalculadorDeEstoqueFor {
    public static void main(String[] args) {
        
        //Utilizando For forma direta
        double soma = 0;
        for (double i = 0; i <35; i ++) {
            soma +=59.90;
        }

        
        /* //Forma Tradicional
         double soma = 0;
        for (int contador = 0; contador <35; contador ++); {
            soma += 59.90;
        } 
*/
        
        System.out.println("O total em estoque soma é "+ soma);

        if (soma <150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >=2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
       
        
    }
}
