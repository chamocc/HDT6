
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

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
public class SetFactory<E> {
    public Set getInstance(int num){
        switch (num){
            case 0:
                return new HashSet<E>();
            case 1: 
                return new TreeSet<E>();
            case 2:
                return new LinkedHashSet<E>();
        }
        //Nunca llega aqui
        return new HashSet();
    }
}
