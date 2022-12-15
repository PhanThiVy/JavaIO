/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.ByteArrayIOStreamDemo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos1 = null;
        FileOutputStream fos2 = null;
        ByteArrayOutputStream bout=null;
        String str = "Have a nice day!";
        byte[] arr = str.getBytes();
        try {
            fos1 = new FileOutputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            fos2 = new FileOutputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File2.txt");
            bout = new ByteArrayOutputStream();
            bout.write(arr);
            bout.writeTo(fos1);
            bout.writeTo(fos2);
            bout.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ByteArrayOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos1 != null) {
                fos1.close();
            }
            if (fos2 != null) {
                fos2.close();
            }
            if (bout != null) {
                bout.close();
            }
        }

    }
}
