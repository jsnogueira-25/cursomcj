package com.juliana.cursomcj;

class Counter { 
    static int count = 0; // Static attribute to track the total number of Counter objects created
   
    
    public Counter() {
        count++; // Increment the static count whenever a new Counter object is created
    }

    public static void printTotalCount() {
        System.out.println("Total Counter objects created: " + count);
    }
    

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        

        System.out.println("c1.count: " + c1.count); // Accessing static attribute through an object (not recommended but possible)
        System.out.println("c2.count: " + c2.count);
        
        c2.count = 16;
        Counter.count=15;
              System.out.println("Counter.count: " + Counter.count); // Accessing static attribute directly through the class

        Counter.printTotalCount(); // Calling a static method
    }
}
