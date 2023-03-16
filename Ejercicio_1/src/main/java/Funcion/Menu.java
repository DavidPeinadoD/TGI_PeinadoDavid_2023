package Funcion;

import java.util.Scanner;

    public class Menu {




    public void Mostrar(){

        Funcion funcion = new Funcion();
        System.out.println("Introduzca el valor de x: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Introduzca el valor de y: ");
        int y=sc.nextInt();
        int opcion = 0;
        do{
            System.out.println("----Menú----");
            System.out.println("Elija una opción: ");
            System.out.println("1. Funcion 1");
            System.out.println("2. Funcion 2");
            System.out.println("3. Salir");


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(funcion.Funcion1(x,y));

                    break;
                case 2:
                    System.out.println(funcion.Funcion2(x,y));
                    break;
                case 3:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }



        }while (opcion != 3);

    }
    public void RecogerDatos(){

    }
    }


