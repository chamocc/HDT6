/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Edgar Chamo 13083
 * @Daniel Gerendas 13158
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        boolean termino=false;
        System.out.println("Bienvenido a la base de datos: \n");
        Conjuntos conjuntos=new Conjuntos();
        Scanner entrada=new Scanner(System.in);
        while(!termino){
            System.out.println("Ingrese: \n 1...Ingresar persona\n 2...Interseccion\n 3...Subconjunto\n 4...Más grade\n 5...salir");
            int param=entrada.nextInt();
            entrada.nextLine();
            if(param==1){
                System.out.println("Ingrese el nombre");
                String nombre=entrada.next();
                System.out.println("Ingrese si pertenece a 1:Java\n2:Web\n3:Celulares");
                int conjunto=entrada.nextInt();
                conjuntos.ingresarPersona(null, conjunto);
            }else if(param==2){
                System.out.println("Ingrese 1:Int. Java-Web\n 2:Java-Cel\n 3:Cel-Web\n 4:los tres");
                int cual=entrada.nextInt();
                if(cual==1){
                    conjuntos.interseccion(true, true, false);
                }else if(cual==2){
                    conjuntos.interseccion(true, false, true);
                }else if(cual==3){
                    conjuntos.interseccion(false, true, true);
                }else if(cual==4){
                    conjuntos.interseccion(true, true, true);
                }
            }else if(param==3){
                conjuntos.subconjunto();
            }else if(param==4){
                conjuntos.masGrande();
            }else if(param==5){
                termino=true;
            }
        }
    }
}
