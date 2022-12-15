/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            int c = 0;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
}
