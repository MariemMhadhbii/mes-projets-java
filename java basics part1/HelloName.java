import java.util.Scanner;  // Importe la classe Scanner pour lire les entrées au clavier

public class HelloName {
    public static void main(String[] args) {
        // Crée un objet Scanner pour lire ce que l'utilisateur tape
        Scanner input = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir son prénom
        System.out.print("Input your first name: ");
        // Lit le prénom saisi et le stocke dans la variable fname
        String fname = input.next();
        
        // Demande à l'utilisateur de saisir son nom
        System.out.print("Input your last name: ");
        // Lit le nom saisi et le stocke dans la variable lname
        String lname = input.next();
        
        // Saute une ligne pour faire une séparation
        System.out.println();
        
        // Affiche le message de salutation
        // "\n" crée un saut de ligne après "Hello"
        System.out.println("Hello \n" + fname + " " + lname);
    }
}