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
    Set desJava, desCelulares, desWeb, desUniversal;
    
    public Conjuntos(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese 0: Hashset \n1: Treeset \n2: Linkedhashset \n");
        int param=entrada.nextInt();
        entrada.nextLine();
        SetFactory<String> factory=new SetFactory<String>();
        desJava<String>=factory.getInstance(param);
        desWeb<String>=factory.getInstance(param);
        desCelulares<String>=factory.getInstance(param);
        desUniversal<String>=factory.getInstance(param);
    }
    
    public void ingresarPersona(String nombre, int especialidad){
	switch( especialidad){
		case 0:
			desJava.add(nombre);
		case 1:
			desWeb.add(nombre);
		case 2:
			desCelulares.add(nombre);
}
        
    }

    public void imprimir(Set conjunto){
	String[] arreglo;
           arreglo=(String[])conjunto.toArray();
	for(int i=0;i<conjunto.size();i++){
		System.out.println(arreglo[i] + "\n");
	}

}
    
    public void interseccion(boolean java, boolean web, boolean cel){
	HashSet<String> interseccion1=new HashSet<String>();
	HashSet<String> interseccion2=new HashSet<String>();
	
	if(java && web && cel){
		interseccion1=desJava.retainAll(desWeb);
		interseccion2=interseccion1.retainAll(desCelulares);
		System.out.println(“Las personas que trabajan en las tres áreas son: \n2”);
		imprimir(interseccion2);
	}else if(java && web){
		interseccion1=desJava.retainAll(desWeb);
		System.out.println(“Las personas que trabajan en Java y Web son: \n2”);
		imprimir(interseccion1);
	}else if(java && cel){
		interseccion1=desJava.retainAll(desCelulares);
		System.out.println(“Las personas que trabajan en Java y Celulares son: \n2”);
		imprimir(interseccion1);
	}else if(web && cel){
		interseccion1=desWeb.retainAll(desCelulares);
		System.out.println(“Las personas que trabajan en Weby Celulares son: \n2”);
		imprimir(interseccion1);
	}
	
	
    }
    
    public void subconjunto(){
	boolean vacio;

	desUniversal = desJava;
	desUniversal.removeAll(desWeb);
	vacio = desUniversal.isEmpty();

	if(vacio == true){
		System.out.println("El conjunto de desarrolladores Java SI es subconjunto de desarrolladores Web");
        }
        else{
                System.out.println("El conjunto de  desarrolladores Java No es subconjunto de desarrolladores Web");
        }
	
    }
    
    public void masGrande(){
	int tamanio1;
	int tamanio2;
        int tamanio3;
 
	tamanio1 = desJava.size();
	tamanio2 = desWeb.size();
	tamanio3 = desCelulares.size();

	if (tamanio1 > tamanio2){
		if (tamanio1 > tamanio3)
		{
			System.out.println("El conjunto mas grande es: Java");
			imprimir(desJava);
                }
            else{
            System.out.println("El conjunto mas grande es: Celulares");
            imprimir(desCelulares);
            }
        else if(tamanio2 > tamanio3){
	System.out.println("El conjunto mas grande es: Web");
	imprimir(desWeb);
        }
	else {
		System.out.println("El conjunto mas grande es: Celulares");
		imprimir(desCelulares);
}
}
    }
    
}
