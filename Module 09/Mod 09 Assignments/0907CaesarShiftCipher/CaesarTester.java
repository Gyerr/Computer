import java.util.Scanner;

public class CaesarTester {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main (String[] args) {
        while ( true) {
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Encrypt or Decrypt messages using a cipher (Caesar Shift)");
            System.out.println("Enter \'E\' to encrypt, \'D\' to decrypt, or \'Q\' to quit the program");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

            Scanner in = new Scanner(System.in);
            String choice = in.next().toLowerCase();

            if(choice.equals("e")) {
                System.out.println("Encryption");

                Encryption encrypt = new Encryption(in);

                encrypt.setShiftAlphabet(Encryption.generateAlphabet(ALPHABET, encrypt.getShiftKey()));

                Encryption.encryptMessage(ALPHABET, encrypt.getShiftAlphabet(), encrypt.getMessage());
            }
            else if (choice.equals("d")) {
                System.out.println("Decryption");

                Decryption decrypt = new Decryption(in);

                String originalShiftAlphabet = Decryption.generateAlphabet(ALPHABET, decrypt.getShiftKey());
                String reverseShiftAlphabet = Decryption.reverseShiftAlphabet(ALPHABET, decrypt.getShiftKey());
                int shiftKey = decrypt.getShiftKey();
                String message = decrypt.getEncryptedMessage(); 

                Decryption.decryptMessage(originalShiftAlphabet, reverseShiftAlphabet, message, shiftKey);
            }
            else if(choice.equals("q")) {
                System.out.println("Thank you for using the program.");
                System.exit(0);
            }
            else {
                System.out.println("Your slection was invalid, please try again.");

                CaesarTester.main(args);
            }

        }

    }
}
