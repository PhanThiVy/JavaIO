/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.SequenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileOutputStream fos=null;
        SequenceInputStream sequenceInputStream = null;
        try {
            fis1 = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            fis2 = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File2.txt");
            fos = new FileOutputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\TextOut.txt");
            sequenceInputStream = new SequenceInputStream(fis1, fis2);
            int c = 0;
            while ((c = sequenceInputStream.read()) != -1) {
                //print in console
                System.out.print((char) c);
                //write into TextOut.txt
                fos.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SequenceInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis1 != null) {
                fis1.close();
            }
            if (fis2 != null) {
                fis2.close();
            }
            if (sequenceInputStream != null) {
                sequenceInputStream.close();
            }
        }
    }
}
