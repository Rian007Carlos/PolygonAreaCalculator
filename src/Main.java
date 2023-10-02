import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicite ao usuário o número de lados e o comprimento de um lado.
        System.out.print("Input the number of sides on the polygon: ");
        int numSides = input.nextInt();

        System.out.print("Input the length of one of the sides: ");
        double sideLength = parseDouble(input.next());

        // Calcule a área do polígono aqui
        double area = calculatePolygonArea(numSides, sideLength);

        // Exiba o resultado
        System.out.println("The area is: " + area);
    }

    // Implemente a função para calcular a área do polígono.
    private static double calculatePolygonArea(int numSides, double sideLength) {
        // Cálculo da área do polígono.
        return (numSides * Math.pow(sideLength, 2)) / 4 / Math.tan(Math.PI / numSides);
    }
    // Método para converter String em double, tratando possíveis exceções.
    private static double parseDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch(NumberFormatException e) {
            System.err.println("Input is not a valid number.");
            System.exit(1);
            return 0;
        }
    }
}