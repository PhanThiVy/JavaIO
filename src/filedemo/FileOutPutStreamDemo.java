/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class FileOutPutStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        String str = "Hello";
        byte[] arr = str.getBytes();
        try {
            fos = new FileOutputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            fos.write(66);
            fos.write(arr);
            fos.write(arr, 1, 3);
            System.out.println("Successful");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutPutStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutPutStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}
