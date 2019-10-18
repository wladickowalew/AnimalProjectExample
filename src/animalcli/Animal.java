/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcli;


public class Animal {
    protected String name;
    protected String type;
    protected int age;
    protected double weight;
    protected boolean walk;
    protected boolean fly;
    protected boolean swim;
    protected int id; 
    protected static int n = 1; //file
    
    {
        id = n++;
        name = "Animal №" + id;
        type = "No type";
    }

    public Animal(String name, String type, int age, double weight, boolean walk, boolean fly, boolean swim) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.walk = walk;
        this.fly = fly;
        this.swim = swim;
    }
    
    public void show_info(){
        System.out.println("--------------------");
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age+" years old");
        System.out.println("Weight: "+weight);
        System.out.println(fly? "Fly":"Not Fly");
        System.out.println(walk? "Walk":"Not Walk");
        System.out.println(swim? "Swim":"Not Swim");
        System.out.println();
    }
    
   public void weightUp(){
       weight *= 1.1; 
    }
    
    public void weightDown(){
       weight *= 0.9; 
    }
    
    public void voice(){
        System.out.println("i am " + type +" "+
                 name+". And i am beautifull.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public int getId() {
        return id;
    }   
    
}
 