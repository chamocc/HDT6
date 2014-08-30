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
    Set desJava, desCelulares, desWeb, desUniversal, interseccion;
    
    public Conjuntos(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese 0: Hashset \n1: Treeset \n2: Linkedhashset \n");
        int param=entrada.nextInt();
        entrada.nextLine();
        SetFactory<String> factory=new SetFactory<String>();
        desJava=factory.getInstance(param);
        desWeb=factory.getInstance(param);
        desCelulares=factory.getInstance(param);
        desUniversal=factory.getInstance(param);
        interseccion=factory.getInstance(param);
    }
    
    public void ingresarPersona(String nombre, int especialidad){
	switch( especialidad){
		case 0:
			desJava.add(nombre);
                        break;
		case 1:
			desWeb.add(nombre);
                    break;
		case 2:
			desCelulares.add(nombre);
                    break;
}
        
    }

    public void imprimir(Set conjunto){
	String[] arreglo=new String[conjunto.size()];
        arreglo=(String[])conjunto.toArray(new String[0]);
	for(int i=0;i<conjunto.size();i++){
		System.out.println(arreglo[i] + "\n");
	}

}
    
    public void interseccion(boolean java, boolean web, boolean cel){
	if(java && web && cel){
                interseccion=desJava;
		interseccion.retainAll(desWeb);
		interseccion.retainAll(desCelulares);
		System.out.println("Las personas que trabajan en las tres áreas son: \n");
		imprimir(interseccion);
	}else if(java && web){
		interseccion=desJava;
                interseccion.retainAll(desWeb);
		System.out.println("Las personas que trabajan en Java y Web son: \n");
		imprimir(interseccion);
	}else if(java && cel){
		interseccion=desJava;
                interseccion.retainAll(desCelulares);
		System.out.println("Las personas que trabajan en Java y Celulares son: \n");
		imprimir(interseccion);
	}else if(web && cel){
		interseccion=desWeb;
                interseccion.retainAll(desCelulares);
		System.out.println("Las personas que trabajan en Celulares y Web son: \n");
		imprimir(interseccion);
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

	if (tamanio1 > tamanio2 && tamanio1 > tamanio3){
            System.out.println("El Conjunto mas grande es desarrolladores Java");
            imprimir(desJava);
        }
        else{
            if(tamanio2 > tamanio1 && tamanio2 > tamanio3){
                System.out.println("El Conjunto mas grande es desarrolladores Web");
                imprimir(desWeb);
            }
            else{
                System.out.println("El Conjunto mas grande es desarrolladores Celulares"); 
                imprimir(desCelulares);
            }
            
        }
    }
    
}
