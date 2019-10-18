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
public class Fish extends Animal{
    
    public Fish(String name, int age, double weight, boolean fly) {
        super(name, "Fish", age, weight, false, fly, true);
    }
    
    public void voice(){
        System.out.println("i am " + type +" "+
                   name+". And i am not Karp.");
    }
    
    
}
