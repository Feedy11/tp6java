package tp6;
import java.io.IOException;

public class mainauth{
    public static void main(String[] args) {
            try {
                new Authentification();
                System.out.println("Authentification réussie !");

            } catch (WrongLoginException | WrongPwdException e) {
                System.out.println("Erreur! " + e.getMessage());

            } catch (WrongInputLength e) {
                System.out.println("Erreur! " + e.getMessage());

            } catch (IOException e) {
                System.out.println("Erreur!" + e.getMessage());
            }
        
    }
}

