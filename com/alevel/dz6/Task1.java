package com.alevel.dz6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(123, "gal 45", "Вес 138");
        System.out.println(phone1.number + ", " + phone1.model + ", " + phone1.weight + "!");

        Phone phone2 = new Phone(2383, "one 10", "Вес 160");
        System.out.println(phone2.number + ", " + phone2.model + ", " + phone2.weight + "!");

        Phone phone3 = new Phone(921, "Gi 75", "Вес130");
        System.out.println(phone3.number + ", " + phone3.model + ", " + phone3.weight + "!");

        Phone ph = new Phone(2341,"gtr 20");
        System.out.println(ph.number + ", " + ph.model);

        System.out.println();

        phone1.receiveCall(phone1.name1);
        phone1.getNumber();

        phone2.receiveCall(phone2.name2);
        phone2.getNumber();

        phone3.receiveCall(phone3.name3);
        phone3.getNumber();
    }

    public static class Phone {

        public int number;
        public String model;
        public String weight;

        String name1 = "Филип";
        String name2 = "Андрей";
        String name3 = "Дима";


        public void receiveCall(String name) {
            System.out.println("звонит" + " " + name);


        }

        public void getNumber() {

            System.out.println(number);
        }

        public Phone(int n, String m, String w) {
            number = n;
            model = m;
            weight = w;

            Task1.Phone ph = new Task1.Phone(1,"model");

        }
        public Phone(int n,String m){
            number = n;
            model = m;

        }
        public Phone(){}

    }

}

