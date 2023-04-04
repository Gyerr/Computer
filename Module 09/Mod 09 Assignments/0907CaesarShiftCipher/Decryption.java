import java.util.Scanner;

public class Decryption {
    
    private final int shiftKey;
    private String encryptedMessage;

    public int getShiftKey() {
        return shiftKey;
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public Decryption(Scanner in) {
        shiftKey = getShiftKey(in);
        encryptedMessage = getMessage(in);
    }

    public int getShiftKey(Scanner in) {
        String returnString = "";
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

    public String getMessage(Scanner in) {
        System.out.println("Please enter the message to be decrypted without using punctuation: ");

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

        String newShiftedAlphabet = makeCharString(shiftAlphabet);

        System.out.println("Shifted alphabet: ");
        System.out.println(newShiftedAlphabet);

        return newShiftedAlphabet;
    }

    public static String makeCharString(char[] array) {
        String returnString = "";
        for (char character : array) {
            returnString += character;
        }
        return returnString;
    }

    public static String decryptMessage(String normAlphabet, String shiftedAlphabet, String message, int shiftKey) {
        normAlphabet = reverseShiftAlphabet(normAlphabet, shiftKey);

        char[] messageArray = message.toCharArray();
        char[] returnArray = new char[messageArray.length];

        for (int i = 0; i < returnArray.length; i++) {
            try {
                returnArray[i] = shiftedAlphabet.charAt(normAlphabet.indexOf(messageArray[i]));
            }
            catch (java.lang.StringIndexOutOfBoundsException e) {

            }
        }

            String returnString = makeCharString(returnArray);

            System.out.println("Decrypted Message: ");
            System.out.println(returnString);

            return returnString;
        
    }

    public static String reverseShiftAlphabet(String alphabet, int shiftKey) {
        shiftKey = 25-shiftKey;

        String doubleAlphabet = alphabet + alphabet;
        char[] shiftAlphabet = new char[26];

        for (int i = 0; i < 26; i++) {
            shiftAlphabet[i] = doubleAlphabet.charAt(i + shiftKey);
        }

        String newShiftedAlphabet = makeCharString(shiftAlphabet);

        System.out.println("Shifted Alphabet: ");
        System.out.println(shiftAlphabet);

        return newShiftedAlphabet;
    }

}
