package ThirdExam.Two;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static ThirdExam.Two.Start.start;

public class NewList {
    public static List<Person> a = new LinkedList<Person>();
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        while (true) {
            System.out.println("следующее поле - проверочное. пропустите его. " +
                    "если хотите выйти введите 0 в поле для имени");
            sc.nextLine();
            System.out.println("Введите имя");
            String name = sc.nextLine();
            if(name.equals("0")){
                break;
            }
            System.out.println("Введите фамилию");
            String surname = sc.nextLine();
            System.out.println("Введите отчество");
            String patronymic = sc.nextLine();
            try {
                Person b = new Person(a,name,surname,patronymic);
                a.add(b);
            } catch (SimilarEx e) {
                System.out.println("такой человек есть в списке");
            }
        }
        System.out.println(a);
        start();
    }

    public static void show(){
        if (a.isEmpty()){
            System.out.println("людей нет, создайте новых");
            start();
        }
        int index = 0;
        for (Person i : a){
            System.out.println("индекс "+index+". ФИО: "+i.getSurname()+" "+ i.getName()+" "+ i.getPatronymic());
            index++;
        }
        start();
    }


}
