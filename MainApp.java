// Commentaire conflit 1

package java_tp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    // Simple interactive calculator
    public static void main(String[] args) {
        boolean demo = args.length > 0 && args[0].equalsIgnoreCase("demo");
        if (demo) {
            runDemo();
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Mini-calculette Java (tapez 'q' pour quitter)");

        while (true) {
            try {
                System.out.print("Entrez le premier nombre: ");
                String s = sc.next();
                if (s.equalsIgnoreCase("q")) break;
                double a = Double.parseDouble(s);

                System.out.print("Entrez l'opérateur (+ - * /): ");
                String op = sc.next();
                if (op.equalsIgnoreCase("q")) break;

                System.out.print("Entrez le second nombre: ");
                s = sc.next();
                if (s.equalsIgnoreCase("q")) break;
                double b = Double.parseDouble(s);

                double result = calculate(a, b, op);
                System.out.println("Résultat: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Nombre invalide. Mon faux conflit.");
            } catch (ArithmeticException e) {
                System.out.println("Erreur arithmétique: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static double calculate(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("division par zéro");
                return a / b;
            default:
                throw new ArithmeticException("Opérateur inconnu: " + op);
        }
    }

    // Demo mode runs a few sample calculations and prints results
    private static void runDemo() {
        System.out.println("Mode demo: exécute quelques calculs de test");
        double[][] tests = {
            {1, 2},
            {5, 3},
            {10, 0},
            {7.5, 2.5}
        };
        String[] ops = {"+","-","*","/"};

        for (int i = 0; i < ops.length; i++) {
            double a = tests[i][0];
            double b = tests[i][1];
            String op = ops[i];
            try {
                double r = calculate(a, b, op);
                System.out.printf("%s %s %s = %s\n", a, op, b, r);
            } catch (Exception e) {
                System.out.printf("%s %s %s -> erreur: %s\n", a, op, b, e.getMessage());
            }
        }
    }
}
