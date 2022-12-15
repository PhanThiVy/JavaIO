/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phanthivy
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
            bis = new BufferedInputStream(fis);
            int c =0;
            while ((c=bis.read())!=-1) {                
                System.out.print((char)c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
