package tp6;

public class Maintp6 {

    public static void main(String[] args) {
        try {
            double n = Double.parseDouble(args[0]);
            double x = Double.parseDouble(args[1]);
            
            if (n == 0) {
                throw new ArithmeticException("Impossible de faire une division par zéro.");
            }
            if (x < 0) {
                throw new NegatifExeption("x ne peut pas être négatif.");
            }
            
            double res = Mathematique.f(n, x);
            System.out.println("Résultat : " + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne.");
        } catch (NumberFormatException e) {
            System.out.println("Les arguments doivent être des nombres.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NegatifExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
