package ThirdExam.Two;

import java.util.List;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(List<Person> CheckedList,String name, String surname, String patronymic) throws SimilarEx{
        for (Person i: CheckedList){
            if(i.getName().equals(name)&&i.getPatronymic().equals(patronymic)&&i.getSurname().equals(surname))
            {
                throw new SimilarEx("this person is registered.");
            }
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public static void SimiEx(List<Person> CheckedList,Person CheckedObj)throws SimilarEx{
        for (Person i: CheckedList){
            if(i.getName().equals(CheckedObj.getName())&&i.getPatronymic().equals(CheckedObj.getPatronymic())&&i.getSurname().equals(CheckedObj.getSurname()))
            {
                throw new SimilarEx("this person is registered.");
            }
        }
    }
}
