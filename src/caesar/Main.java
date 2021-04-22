/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar;

import java.util.Scanner;

/**
 *
 * @author Apple Bee
 */
public class Main {
    public static void main(String[] args) {
        //abcdefghijklmnopqrstuvwxvz
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String originalMessage = sc.nextLine().toUpperCase();
        System.out.print("Enter your key: ");
        int key = sc.nextInt();
        String encryptedMessage = Caesar.encrypt(originalMessage, key);
        String decryptedMessage = Caesar.decrypt(encryptedMessage, key);
        System.out.println((int)encryptedMessage.charAt(0));
        

        System.out.println("Original Message: " + originalMessage);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
        System.out.println("\n=== Brute-force ===");
        for (int i = 0; i < 25; i++) {
            System.out.println("Key = " + (i+1) + ": " + Caesar.decrypt(encryptedMessage, i+1));
        }
    }
}
