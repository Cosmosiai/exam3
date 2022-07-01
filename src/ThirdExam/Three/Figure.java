package ThirdExam.Three;

import java.util.List;

public abstract class Figure {
    private String name;
    private int count;
    private String figure;

    public Figure(String name, int count, String figure) {
        this.name = name;
        this.count = count;
        this.figure = figure;
    }

    public Figure(String name)throws FigEx{
        this.name = name;
        this.count=getCount();
        this.figure=getFigure();
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String getFigure() {
        return figure;
    }
    @Override
    public String toString(){
        return "тип "+getName()+". количество "+getCount()+". фигура "+getFigure();
    }
}
