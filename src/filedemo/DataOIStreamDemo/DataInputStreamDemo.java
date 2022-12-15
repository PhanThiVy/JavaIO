/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.DataOIStreamDemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author phanthivy
 */
public class DataInputStreamDemo {

    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt");
        DataInputStream inst = new DataInputStream(input);
        int i ;
        while ((i=inst.read())!=-1) {            
            System.out.println((char)i);
        }
//        int count = input.available();
//        System.out.println(count);
//        byte[] ary = new byte[count];
//        inst.read(ary);
//        for (byte bt : ary) {
//            char k = (char) bt;
//            System.out.print(k + "-");
//        }
        
    }
}
