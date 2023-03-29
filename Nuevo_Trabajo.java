/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nuevo_trabajo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Nuevo_Trabajo {

    public static void main(String[] args) {
        float nota1= 1;
        float nota2= 0;
        Scanner r = new Scanner (System.in);
        System.out.println("ingrese las notas a calcular");
        float n = r.nextFloat();
        while (nota1<=n){
            System.out.println("ingrese la nota"+nota1+nota2);
            float cn = r.nextFloat();
            nota1+=n;
            nota2+=n;
            float promedio = nota1+nota2 /n;
            System.out.println("el promedio es :+promedio");
           
            
        }
    }
}