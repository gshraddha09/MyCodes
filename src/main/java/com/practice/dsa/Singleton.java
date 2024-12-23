//package com.example.dsa;
//
//public class Singleton extends Thread{
//    // The single instance is stored in a static field.
//    private static Singleton instance;
//
//    // Private constructor prevents instantiation from other classes.
//    private Singleton() {}
//
//    // Public method to provide access to the instance.
//    public void run() {
//        if (instance == null) {
//            // Lazy initialization: instance is created only when needed.
//            instance = new Singleton();
//        }
//    }
//Singleton s= new Singleton();
//   s.start();
//    
//}
