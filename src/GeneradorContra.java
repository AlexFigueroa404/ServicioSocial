import javax.swing.*;
import java.util.Random;

public class GeneradorContra {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();

        int passwordLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud de la contraseña en el rango 6 - 20 : "));

        String password = "";


        for (int i = 0; i < passwordLength; i++) {

            int randomIndex = random.nextInt(characters.length());
            password += characters.charAt(randomIndex);
        }

        System.out.println("La contraseña generada es: " + password);

    }
}