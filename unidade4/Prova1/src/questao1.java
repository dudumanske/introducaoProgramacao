public class questao1 {
    public static void main(String[] args) {
        String nivel = "baixo";
        String altura = "certa";

        if (nivel.equals("") && altura.equals("")) {
            System.out.println("Nível e Altura");
        } else {
            System.out.println("Teste Altura");
            if (altura.equals("")) {
                System.out.println("Altura Vazia");
                System.out.println("Nível Vazio");
            } else {
                System.out.println("Altura Cadastrada");
            }
        }
        System.out.println("_FINALIZADO_");
    }
}
