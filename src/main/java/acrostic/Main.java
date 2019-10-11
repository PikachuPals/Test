/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acrostic;

import org.me.mylib.LibClass;

/**
 *
 * @author andy2
 */
public class Main{
    public static void main(String[] args) {
        String result = LibClass.acrostic(args);
        System.out.println("Result = " + result);
        System.out.println("New print lines!");
    }
}