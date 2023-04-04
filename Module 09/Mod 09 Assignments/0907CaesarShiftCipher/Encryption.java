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

    public Encryption(Scanner in) {
        shiftKey = getShift(in);
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

    public static String encryptMessage(String normAlphabet, String shiftedAlphabet, String message) {
        char[] messageArray = message.toCharArray();
        char[] returnArray = new char[messageArray.length];

        for (int i =0; i < returnArray.length; i++) {
            try {
            returnArray[i] = shiftedAlphabet.charAt(normAlphabet.indexOf(messageArray[i]));
            }
            catch (java.lang.StringIndexOutOfBoundsException e) {
                
            }
        }

        String returnString = makeCharString(returnArray);

        System.out.println("Encrypted Message:");
        System.out.println(returnString);

        return returnString;
    }
}