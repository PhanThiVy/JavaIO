/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo.permissionDemo;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/**
 *
 * @author phanthivy
 */
public class PermissionDemo {

    public static void main(String[] args) throws IOException {
        String srg = "C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\File1.txt";
        FilePermission file1 = new FilePermission("C:\\Users\\phanthivy\\Documents\\NetBeansProjects\\FileDemo\\src\\ListFile\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
//        FilePermission file2 = new FilePermission(srg, "write");
//        permission.add(file2);
        if (permission.implies(new FilePermission(srg, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path " + srg);
        } else {
            System.out.println("No Read, Write permission is granted for the path " + srg);
        }
    }
}
