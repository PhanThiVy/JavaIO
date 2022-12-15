/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        new BufferedOutputStream(fos);
        String str = "I have a cute cat";
        byte[] b = str.getBytes();
        try {
            fos = new FileOutputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            bos = new BufferedOutputStream(fos);
            fos.write(b);
            fos.flush();
            System.out.println("Successful");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                fos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }
}
