package ThirdExam.Four;

public class Left extends PocketThings{
    public Left(String thing) {
        super(thing, "left", "iron");
    }

    @Override
    public void sound(){
        System.out.println("дзынь дзынь");
    }
}
