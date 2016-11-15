package Main;

import java.util.Scanner;

/**
 * Created by cristopher_ramirez on 14/11/16.
 */
public class Main {

    public static void main (String args[]){

        int opc;
        Scanner sc = new Scanner(System.in);

System.out.println("\t\t\tPrograma de gestion de alumnos\n");

        //testing
        do {
            System.out.println("Seleccione la opcion que desea hacer\n\n");
            System.out.println("1.Alta alumnos");
            System.out.println("2.Baja alumnos");
            System.out.println("3.Consulta de alumnos");
            System.out.println("4.Buscar por calificacion\n\n");

            System.out.println("Opcion:");
            opc = sc.nextInt();

            switch (opc){

                case 1:

                    break;



            }

        }while(opc!=9);


    }

}
