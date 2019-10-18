/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcli;

/**
 *
 * @author Student
 */
public class Bird extends Animal{
    
    public Bird(String name, int age, double weight, boolean swim) {
        super(name, "Bird", age, weight, true, true, swim);
    }
    
    public void voice(){
        System.out.println("i am " + type +" "+
                 name+". And i am not Penguin.");
    }
    
}
