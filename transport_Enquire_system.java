//package com;
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// import transport.bus;
//
//import java.util.Scanner;
////base class
//class transport
//{
//    String tranport_mode;
//    String from;
//    String destination;
//    int distance;
//
//    //using constrictor topic
//
//    transport(String tranport_mode, String from, String destination,int distance)
//    {
//        this.tranport_mode = tranport_mode;
//        this.from = from;
//        this.destination = destination;
//        this.distance=distance;
//    }
//    // using transport to inheritance characterstics to base class
//    class bus extends transport
//    {
//        List<String> timings;
//
//        public bus(String tranport_mode, String from, String destination,int distance)
//        {
//            super(tranport_mode, from, destination,distance);
//            timings = new ArrayList<>();
//        }
//        // to enter time slots
//        public void add_time_slot(String timing)
//        {
//            timings.add(timing);
//        }
//
//        // to display avalible time slot for bus rote
//        public void display_time_slot()
//        {
//            System.out.println("the avalible slots for " + tranport_mode + "are :");
//            for (String timing : timings)
//            {
//                System.out.println(timing);
//            }
//        }
//        //total distance cost of fair
//        public void display_cost()
//        {
//
//            System.out.println(distance+" is distance and cost is rupees"+distance*2);
//        }
//    }
//
//// train class in herita the properties of transport class
//
//    class train extends transport
//    {
//        List<String> timings;
//
//        public train(String tranport_mode, String from, String destination,int distance)
//        {
//            super(tranport_mode, from, destination,distance);
//            timings = new ArrayList<>();
//        }
//        // to enter time slots
//        public void add_time_slot(String timing)
//        {
//            timings.add(timing);
//        }
//
//        // to display avaloble time slot for train rote
//        public void display_time_slot()
//        {
//            System.out.println("the avalible slots for " + tranport_mode + "are :");
//            for (String timing : timings)
//            {
//                System.out.println(timing);
//            }
//        }
//        //total distance cost of fair
//        public void display_cost()
//        {
//
//            System.out.println(distance+" is distance and cost is rupees"+distance*100);
//        }
//    }
//
//// rocket class in herita the properties of transport class
//
//    class rocket extends transport
//    {
//        List<String> timings;
//
//        public rocket(String tranport_mode, String from, String destination,int distance)
//        {
//            super(tranport_mode, from, destination,distance);
//            timings = new ArrayList<>();
//        }
//        // to enter time slots
//        public void add_time_slot(String timing)
//        {
//            timings.add(timing);
//        }
//
//        // to display avaloble time slot for train rote
//        public void display_time_slot()
//        {
//            System.out.println("the avalible slots for " + tranport_mode + "are :");
//            for (String timing : timings)
//            {
//                System.out.println(timing);
//            }
//        }
//        //total distance cost of fair
//        public void display_cost()
//        {
//
//            System.out.println(distance+" is distance and cost is rupees"+distance*10);
//        }
//    }}
//
//public class transport_Enquire_system
//{
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        List<transport> transports = new ArrayList<>();
//
//        System.out.println("welcome to transport enquire system follow the steps below");
//        //used in switch case according to coustmour choice
//
//        System.out.println("to select destination");
//        System.out.println("press 1: earth to venus");
//        System.out.println("press 2: earth to mars");
//        System.out.println("press 3: earth to jupiter");
//        System.out.println("press 4: Exit");
//
//        System.out.println("to select transport mode");
//        System.out.println("press 5: bus");
//        System.out.println("press 6: train");
//        System.out.println("press 7: rocket");
//        System.out.println("press 8: Exit the transport mode");
//
//        int choice =obj.nextInt();
//        int choice1 =obj.nextInt();
//
//        switch (choice) {
//            case 1:
//                switch(choice1)
//                {
//                    case 5:
//                        bus bus1 = new bus("Bus 1", "earth", "venus",30);
//                        bus1.add_time_slot("8am");
//                        bus1.add_time_slot("12pm");
//                        bus1.add_time_slot("4pm");
//                        transports.add(bus1);
//                        break;
//                    case 6:
//                        train train1 = new train("Train 1", "earth", "venus",30);
//                        train1.add_time_slot("7am");
//                        train1.add_time_slot("11am");
//                        train1.add_time_slot("3pm");
//                        transports.add(train1);
//                        break;
//                    case 7:
//                        rocket rocket1 = new rocket("rocket 1", "earth", "venus",30);
//                        rocket1.addTimings("9am");
//                        rocket1.addTimings("1pm");
//                        rocket1.addTimings("5pm");
//                        transports.add(rocket1);
//                        break;
//                    case 8:
//                        System.out.println("Exiting the transport mode");
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Invalid choice. Please select a valid option.");
//                        break;
//                }
//                break;
//
//            case 2:
//                switch(choice1)
//                {
//                    case 5:
//                        bus bus2 = new bus("Bus 2", "earth", "mars",50);
//                        bus2.add_time_slot("8am");
//                        bus2.add_time_slot("12pm");
//                        bus2.add_time_slot("4pm");
//                        transports.add(bus2);
//                        break;
//                    case 6:
//                        train train2 = new train("Train 2", "earth", "mars",50);
//                        train2.add_time_slot("7am");
//                        train2.add_time_slot("11am");
//                        train2.add_time_slot("3pm");
//                        transports.add(train2);
//                        break;
//                    case 7:
//                        rocket rocket2 = new rocket("rocket 2", "earth", "jupiter",50);
//                        rocket2.addTimings("9am");
//                        rocket2.addTimings("1pm");
//                        rocket2.addTimings("5pm");
//                        transports.add(rocket2);
//                        break;
//                    case 8:
//                        System.out.println("Exiting the transport mode");
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Invalid choice. Please select a valid option.");
//                        break;
//                }
//
//                break;
//            case 3:
//                switch(choice1)
//                {
//                    case 5:
//                        bus bus3 = new bus("Bus 3", "earth", "jupiter",70);
//                        bus3.add_time_slot("8am");
//                        bus3.add_time_slot("12pm");
//                        bus3.add_time_slot("4pm");
//                        transports.add(bus3);
//                        break;
//                    case 6:
//                        train train3 = new train("Train 3", "earth", "jupiter",70);
//                        train3.add_time_slot("7am");
//                        train3.add_time_slot("11am");
//                        train3.add_time_slot("3pm");
//                        transports.add(train3);
//                        break;
//                    case 7:
//                        rocket rocket3 = new rocket("rocket 3", "earth", "jupiter",70);
//                        rocket3.addTimings("9am");
//                        rocket3.addTimings("1pm");
//                        rocket3.addTimings("5pm");
//                        transports.add(rocket3);
//                        break;
//                    case 8:
//                        System.out.println("Exiting the transport mode");
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Invalid choice. Please select a valid option.");
//                        break;
//                }
//
//                break;
//            case 4:
//                System.out.println("Exiting the Transport Enquiry System");
//                System.exit(0);
//            default:
//                System.out.println("Invalid choice. Please select a valid option.");
//                break;
//        }
//    }}