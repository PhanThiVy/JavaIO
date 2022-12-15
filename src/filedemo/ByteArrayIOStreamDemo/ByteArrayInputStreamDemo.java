/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.ByteArrayIOStreamDemo;

import java.io.ByteArrayInputStream;

/**
 *
 * @author phanthivy
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        byte[] arr = {12,54,67,89};
        ByteArrayInputStream bin = new ByteArrayInputStream(arr);
        int i ;
        while ((i = bin.read())!=-1) {            
            System.out.println((char)i);
        }
    }
}
