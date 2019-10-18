/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcli;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class AnimalCLIApp {

    static Scanner sc;
    static boolean work = true;
    static ArrayList<Animal> animals;
    
    public static void main(String[] args) {
        animals = new ArrayList<Animal>();
        sc = new Scanner(System.in);
        Animal a = new Animal("Vasya1","баран",
                            67,43.7,true,false,false);
        Animal a1 = new Animal("Vasya2","баран",
                            67,43.7,true,false,false);
        animals.add(a);
        animals.add(a1);
        show_commands();
        
    }
    
    private static void show_commands(){
        while (work){
            System.out.println("Приветствуем, введите номер команды:");
            System.out.println("1 - увидеть всех животных");
            System.out.println("2 - добавить новое животное");
            System.out.println("3 - удалить животное");
            System.out.println("4 - отредактировать животное");
            System.out.println("5 - праздники");
            System.out.println("6 - диета");
            System.out.println("7 - выход");
        
            String command = sc.nextLine();
            switch(command){
                case "1":
                    show_animals();
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    hollydays();
                    break;
                case "6":
                    dietas();
                    break;
                case "7":
                    System.out.println("Пока");
                    work = false;
                    break;
                default:
                    System.out.println("enter valid command");
                    break;
            }
        }
    }
    
    private static void show_animals(){
        System.out.println("Вот список всех животных: ");
        for (Animal animal: animals){
            animal.show_info();
        }
    }
    private static void hollydays(){
        System.out.println("Все животные пожирнели");
        for (Animal animal: animals){
            animal.weightUp();
        }
    }
    private static void dietas(){
        System.out.println("Запасы провизии подходят к концу, мой лорд");
        for (Animal animal: animals){
            animal.weightDown();
        }
    }
    
}
