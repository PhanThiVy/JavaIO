package filedemo.sequenceInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phanthivy
 */
public class SequenceInputStreamEnumerationDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileInputStream fis3 = null;
        SequenceInputStream sequenceInputStream = null;
        try {
            fis1 = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            fis2 = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File2.txt");
            fis3 = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\TextOut.txt");
            //creating Vector object to all the stream    
            Vector v = new Vector();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            //creating enumeration object by calling the elements method
            Enumeration enumeration = v.elements();
            //passing the enumeration object in the constructor    
            sequenceInputStream = new SequenceInputStream(enumeration);
            int i;
            while ((i = sequenceInputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SequenceInputStreamEnumerationDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis1 != null) {
                fis1.close();
            }
            if (fis2 != null) {
                fis2.close();
            }
            if (fis3 != null) {
                fis3.close();
            }
        }

    }
}
