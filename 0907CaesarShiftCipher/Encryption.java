import java.util.Scanner;

public class Encryption {
    private final int shiftKey;
    private String message;
    private String shiftAlphabet;
    
    public String getMessage() {
        return message;
    }

    public int getShiftKey () {
        return shiftKey;
    }

    public void setShiftAlphabet (String alphabet) {
        shiftAlphabet = alphabet;
    }

    public String getShiftAlphabet () {
        return shiftAlphabet;
    }

    Encryption(Scanner in) {
        shiftKey = getShiftKey(in);
        message = getMessage(in);
    }

    public int getShift (Scanner in) {
        System.out.println("Please enter shift number (0-25): ");
        int shift = in .nextInt();
        
        while (true) {
            if (shift > 25 || shift < 0) {
                System.out.println("Input invalid, Please enter number from 0-25: ");
                shift = in.nextInt();
            }
            else
                return shift;
        }
    }

    public String getMessage (Scanner in) {
        System.out.println("Please enter the message to be encoded (NO Punctuation): ");
        
        in.nextLine();
        String message = in.nextLine();

        return message;
        
    }

    public static String generateAlphabet(String alphabet, int shiftKey) {
        String alphabetDouble = alphabet + alphabet;
        char[] shiftAlphabet = new char[26];
        
        //create new alphabet
        for (int i = 0; i < 26; i++) {
            shiftAlphabet[i] = alphabetDouble.charAt(i + shiftKey);
            
        }
    }
}