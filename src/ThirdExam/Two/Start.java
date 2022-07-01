package ThirdExam.Two;


import static ThirdExam.Two.NewList.*;

public class Start {
    public static void start(){
        System.out.println("1. хочу получить список людей\n" +
                "2. хочу создать новый список людей\n" +
                "3. хочу выйти");
        int a = sc.nextInt();
        switch (a){
            case 1:
                show();
            case 2:
                main();
            default:
                break;
        }
    }
}
