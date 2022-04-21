import java.util.Random;

public class PwdCrtr {
    private String password = "";
    private Random rnd;

    public String createPassword(int size) {
        rnd = new Random();
        int min = 32, max = 126;
        
        for (int i = 0; i < size; i++) {
            password += (char)(rnd.nextInt(max - min + 1) + min);
        }

        return password;
    }
}