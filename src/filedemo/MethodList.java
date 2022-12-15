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
public class MethodList {
    public static void main(String[] args) {
        File file  = new File("C:\\Users\\phanthivy\\Documents\\Visual Studio 2010\\Project");
        //return name file list
        String fileName[] = file.list();
        for (String fileName1 : fileName) {
            System.out.println(fileName1);
        }
        //return file list(absolutedPath)
        File files[]=file.listFiles();  
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
