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
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Conjuntos {
    Scanner entrada;
    Set desJava, desCelulares, desWeb;
    
    public Conjuntos(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese 0: Hashset \n1: Treeset \n2: Linkedhashset \n");
        int param=entrada.nextInt();
        entrada.nextLine();
        SetFactory factory=new SetFactory();
        desJava=factory.getInstance(param);
        desWeb=factory.getInstance(param);
        desCelulares=factory.getInstance(param);
    }
    
    public void ingresarPersona(){
        
    }
    
    public void interseccion(){
    }
    
    public void subconjunto(){
    }
    
    public void masGrande(){
    }
    
}
