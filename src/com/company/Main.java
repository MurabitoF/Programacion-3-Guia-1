package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //1
        /*int n = 10;
        double a = 80.2654;
        char c = 'f';

        System.out.println(n);
        System.out.println(a);
        System.out.println((int)c);
        System.out.println(n+a);
        System.out.println(a-n);*/
        //2
        /*int x= 23, y = 12;
        double n = 50000000, m = 400000000;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(n+m);
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println(n/m);*/
        //3
        /*int n = 8;
        n += 77;
        System.out.println(n);
        n -= 3;
        System.out.println(n);
        n *= 2;
        System.out.println(n);*/
        //4
        /*int a = 1, b = 2, c = 3, d = 4, aux = 0;

        System.out.println(a + " " + b + " " + c + " " + d);
        aux = a;
        a = b;
        b = c;
        c = d;
        d = aux;
        System.out.println(a + " " + b + " " + c + " " + d);*/
        //5
        /*int a = 0;
        Scanner lector = new Scanner(System.in);
        a = lector.nextInt();
         if (a%2 == 0)
         {
            System.out.println("El número ingresado es PAR\n");
         }
         else
         {
             System.out.println("El número ingresado es IMPAR\n");
         }*/
        //6
        /*int b = 0;
        Scanner lector = new Scanner(System.in);
        b = lector.nextInt();
        if (b >= 0)
        {
            System.out.println("El número ingresado es POSITIVO\n");
        }
        else
        {
            System.out.println("El número ingresado es NEGATIVO\n");
        }*/
        //7
        /*int c = 0;
        Scanner lector = new Scanner(System.in);
        c = lector.nextInt();
        if (c%2 == 0){
            System.out.print("El número ingresado es PAR");
        }
        else{
            System.out.print("El número ingresado es IMPAR");
        }
        if (c >= 0){
            System.out.print(", es POSITIVO");
        }
        else{
            System.out.print(", es NEGATIVO");
        }
        if (c%5 == 0){
            System.out.print(", ES MULTIPLO de 5");
        }
        else{
            System.out.print(", NO ES MULTIPLO de 5");
        }
        if (c%10 == 0){
            System.out.print(", ES MULTIPLO de 10");
        }
        else{
            System.out.print(", NO ES MULTIPLO de 10");
        }
        if (c<100){
            System.out.print(",y es MENOR que 100");
        }
        else{
            System.out.print(",y es MAYOR que 100");
        }*/
        //8
        /*String nombre;
        Scanner lector = new Scanner(System.in);
        nombre = lector.nextLine();

        System.out.println("Buenos días " + nombre);    */
        //9
        /*int x, dob,trip;
        Scanner lector = new Scanner(System.in);
        x = lector.nextInt();
        dob = x * 2;
        System.out.println(dob);
        trip = x * 3;
        System.out.println(trip);*/
        //10
        /*System.out.println("Ingrese la temperatura en °F");
        double far, cel;
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        far = lector.nextDouble();
        cel = (far - 32)/1.8;
        System.out.println("La tempreratura en °C es: " + df.format(cel));*/
        //11
        /*System.out.println("Ingrese el radio de la circunferencia: ");
        double rad, area, longitud;
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        rad = lector.nextDouble();
        area = Math.PI * (Math.pow(rad, 2));
        longitud = 2 * Math.PI * rad;
        System.out.println("El area del circulo es: " + df.format(area));
        System.out.println("La longitud es: " + df.format(longitud));*/
        //12
        /*double kmh, ms;
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese la velocidad en Km/H: ");
        kmh = lector.nextDouble();
        ms = kmh * ((double)10/36);
        System.out.println("La velocidad en m/s es: " + df.format(ms));*/
        //13
        /*double catOp, catAd, hip;
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese el cateto opuesto: ");
        catOp = lector.nextDouble();
        System.out.println("Ingrese el cateto adyasente: ");
        catAd = lector.nextDouble();
        hip = Math.sqrt(Math.pow(catOp,2) + Math.pow(catAd,2));
        System.out.println("La hipotenusa es: " + df.format(hip));*/
        //14
        /*System.out.println("Ingrese el radio de la esfera: ");
        double rad, volumen;
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        rad = lector.nextDouble();
        volumen = ((double) 4/3) * Math.PI * Math.pow(rad,3);
        System.out.println("El volumen del circulo es: " + df.format(volumen));*/
        //15

        //16
        /*System.out.println("Ingrese un numero de 3 digitos: ");
        String num;
        Scanner lector = new Scanner(System.in);
        num = lector.nextLine();
        System.out.println(num.charAt(0) + " " + num.charAt(1) + " " + num.charAt(2));*/
        //17
        /*System.out.println("Ingrese un numero de 5 digitos: ");
        String num;
        Scanner lector = new Scanner(System.in);
        num = lector.nextLine();
        for (int i = 0; i < 5; i++){
            if (i%2 == 0){
                System.out.println(num.charAt(i));
            }
        }*/
        //18
        /*int h, m ,s;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        h = lector.nextInt();*/



    }
}
