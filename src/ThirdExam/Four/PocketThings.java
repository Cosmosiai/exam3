package ThirdExam.Four;

public abstract class PocketThings {
    private String thing;
    private String pocket;
    private String material;



    public PocketThings(String thing, String pocket, String material) {
        this.thing=thing;
        this.pocket = pocket;
        this.material = material;
    }


    public String getThing() {
        return thing;
    }

    public String getPocket() {
        return pocket;
    }

    public String getMaterial() {
        return material;
    }


     public void sound() {
    }
}
