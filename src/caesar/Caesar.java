/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar;

/**
 *
 * @author Apple Bee
 */
public class Caesar {
    
    public static String encrypt(String msg, int key) {
        String str = "";
        for (int i = 0; i < msg.length(); i++) {
            int e = (int) msg.charAt(i);
            if( e == 32) e = 32;
            else {
                e += key;
                e = e > (int) 'Z' ? e - 26 : e;
            }
            str += (char) e;
        }
        return str;
    }
    
    public static String decrypt(String msg, int key) {
        String str = "";
        for (int i = 0; i < msg.length(); i++) {
            int e = (int) msg.charAt(i);
            if( e == 32) e = 32;
            else {
                e -= key;
                e = e < (int) 'A' ? e + 26 : e;
            }
            str += (char) e;
        }
        return str;
    }
}
