package com.otus.hmjava;


import static com.otus.hmjava.Commands.ADD;
import static com.otus.hmjava.Commands.LIST;
import static com.otus.hmjava.Commands.EXIT;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Animal bobik = new Animal();
        bobik.setName("Бобик");
        bobik.setAge(5);
        bobik.setWeight(15);
        bobik.setColor("черный");

        bobik.say();
        bobik.go();
        bobik.drink();
        bobik.eat();

        System.out.println(bobik);

        Cat murzik = new Cat();
        murzik.say();

        Dog sharik = new Dog();
        sharik.say();


        Duck utka = new Duck();
        utka.say();
        utka.fly();
        
        
         ArrayList<Animal> animal = new ArrayList<>();
         
        Scanner sc = new Scanner(System.in);

        String chose;


        while (true){

            System.out.println("Выбери команду add/list/exit");
            chose = sc.next().toLowerCase(Locale.ROOT).trim();
            switch (chose){
                case ADD:
                    System.out.println("Какое животное выберешь? cat / dog / duck ?");
                    String animalType = sc.next();
                    Animal animal = null;

                    if (animalType.equals("cat")){
                        animal = new Cat();
                        generateAnimal(animal, sc);
                    } else if (animalType.equals("dog")){
                        animal = new Dog();
                        generateAnimal(animal, sc);
                    } else if (animalType.equals("duck")){
                        animal = new Duck();
                        generateAnimal(animal, sc);
                    }
                    animal.add(animal);
                    animal.say();
                    break;
                case LIST:
                    System.out.println(animal.toString());

                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong enter");
            }
        }
    }
    public static void generateAnimal(Animal animal, Scanner scanner){
        System.out.println("Введите имя");
        animal.setName(scanner.next());
        System.out.println("Введите возвраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next());
    }
    }
