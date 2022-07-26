package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     

        Worker worker = new Worker();
        Queen queen = new Queen();
        Drone drone = new Drone();

        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());

        output("----------------------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());

        HoneyBee bee = new HoneyBee();
        output(bee.doYourJob());


    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

