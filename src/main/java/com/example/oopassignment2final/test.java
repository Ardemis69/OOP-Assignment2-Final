package com.example.oopassignment2final;

public class test {
    /**
     * test class containing objects
     * This class was created just to test the implemented methods
     * @param args
     */
    public static void main(String[] args) {
            Tasks t1 = new Tasks("title1", "this is first description", 3);
            Tasks t2 = new Tasks("title1", "this is first description", 4);
            Tasks t3 = new Tasks("title1", "this is first description", 5);
            Tasks t4 = new Tasks("title1", "this is first description", 6);
            Tasks t5 = new Tasks("title1", "this is first description", 7);
            Tasks t6 = new Tasks("title1", "this is first description", 8);
            DaySummary d1 = new DaySummary();
            d1.addTasks(t1);
            d1.addTasks(t2);
            d1.addTasks(t3);
            d1.addTasks(t4);
            d1.addTasks(t5);
            d1.addTasks(t6);
            System.out.println(d1.getSize());


        }
}
