package ThirdExam.Three;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start {

    public static List<Figure> pack1;
    public static List<Figure> pack2;
    public static List<Figure> pack3;
    public static List<List> allPAcks = new LinkedList<>();
    public static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void start() throws FigEx {
        System.out.println("1. упаковать вещи\n" +
                "2. просмотреть сумки\n" +
                "3. выйти");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("вы хотите упаковать сумки рандомно? так быстрее\n1. да \n2. нет");
                int q = sc.nextInt();
                if (q == 1) {
                    random();
                } else newPack();
                break;
            case 2:
                showAll();
                break;
            default:
                break;
        }
    }

    public static void newPack() throws FigEx {
        List<Figure> prepare = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                System.out.println("сумка №" + (i) + " упакована\nначинаем следующую\n");
            }
            prepare.clear();
            System.out.println("Сколько круглых вещей вы собираетесь положить?");
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                System.out.println("Как называется ваша круглая вещь?");
                String roundName = sc.nextLine();
                if (roundName.equals("")) {
                    roundName = sc.nextLine();
                }
                System.out.println("сколько штук?");
                int roundCount = sc.nextInt();
                Round e = new Round(roundName, roundCount);
                prepare.add(e);
            }
            System.out.println("какую плоскую вещь вы положите?");
            String flatName = sc.nextLine();
            if (flatName.equals("")) {
                flatName = sc.nextLine();
            }
            Flat flat = new Flat(flatName);
            System.out.println("какую цилиндрическую вещь (Бутылка) вы положите?");
            String cylName = sc.nextLine();
            if (cylName.equals("")) {
                cylName = sc.nextLine();
            }
            Cylinder cylinder = new Cylinder(cylName);
            prepare.add(flat);
            prepare.add(cylinder);

            switch (i) {
                case 0:
                    pack1 = prepare;
                    allPAcks.add(pack1);
                    break;
                case 1:
                    pack2 = prepare;
                    allPAcks.add(pack2);
                    break;
                case 2:
                    pack3 = prepare;
                    allPAcks.add(pack3);
            }
            if (i == 2) {
                System.out.println("закончили\n");
            }
        }
        start();
    }


    public static void random() throws FigEx {



        for (int i = 0; i < 3; i++) {
            List<Figure> prepare = new LinkedList<>();
            String[] things = {"яблоко", "тенисный мяч", "папка", "книга", "вода", "Кока-Кола"};
            rd.nextInt();
            int rand = rd.nextInt(2);
            System.out.println(rand);
            int rand2=rd.nextInt(2)+2;
            System.out.println(rand2);
            int rand3=rd.nextInt(2)+4;
            System.out.println(rand3);
            if (i != 0) {
                System.out.println("сумка №" + (i) + " упакована\nначинаем следующую\n");
            }
            prepare.clear();
            int b = rd.nextInt(2);
            if (b == 0) {
                String roundName = things[rand];
                int roundCount = rd.nextInt(50) + 1;
                Round e = new Round(roundName, roundCount);
                prepare.add(e);
            } else {
                for (int j = 0; j <2; j++) {
                    String roundName = things[j];
                    int roundCount = rd.nextInt(50) + 1;
                    Round e = new Round(roundName, roundCount);
                    prepare.add(e);
                }
            }
            String flatName = things[rand2];

            Flat flat = new Flat(flatName);
            String cylName = things[rand3];
            Cylinder cylinder = new Cylinder(cylName);
            prepare.add(flat);
            prepare.add(cylinder);

            switch (i) {
                case 0:
                    pack1 = prepare;

                    break;
                case 1:
                    pack2 = prepare;

                    break;
                case 2:
                    pack3 = prepare;


            }
            if (i == 2) {
                System.out.println("закончили\n");
            }
        }
        start();
    }

    public static void showAll() throws FigEx {
        for (Figure i : pack1){
            System.out.println(i.toString());
        }
        for (Figure i : pack2){
            System.out.println(i.toString());
        }
        for (Figure i:pack3){
            System.out.println(i.toString());
        }
        start();
    }

}
