public class CalculadorDeEstoque {
    public static void main(String[] args) {
        
        //double livroJava8; reservando região da memória no java com variáveis
        //double livroTDD; tipo doble número com ponto flutuante

        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;
        double sub = livroJava8 - livroTDD;
        double mult = livroJava8 * livroTDD;
        double div = livroJava8 / livroTDD;
        double modulo = livroJava8 % livroTDD;

        System.out.println("O total em estoque soma é "+ soma);
        System.out.println("O total em estoque soma é "+ sub);
        System.out.println("O total em estoque soma é "+ mult);
        System.out.println("O total em estoque soma é "+ div);
        System.out.println("O total em estoque soma é "+ modulo);
    }
}
