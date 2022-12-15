/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;

import java.io.File;

/**
 *
 * @author phanthivy
 */
public class FileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "";
        boolean bool = false;
        try {
            // createing  new files  
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);
            // createing new canonical from file object  
            File file2 = file.getCanonicalFile();
//            // returns true if the file exists  
            System.out.println(file2);
            bool = file2.exists();
//            // returns absolute pathname  
            path = file2.getAbsolutePath();
            System.out.println(bool);
            // if file exists  
            if (bool) {
                // prints  
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // if any error occurs  
            e.printStackTrace();
        }
    }

}
