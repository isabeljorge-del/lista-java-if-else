public class Exercicio9 {

    public static void main(String[] args) {

        int a = 3;
        int b = 3;
        int c = 5;

        if (a == b && b == c) {
            System.out.println("Triângulo equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }

    }

}
