package pizza4;

public class Pizza4 {
    private boolean isPrepared;
    private int bakedTime;
    private int sliceNum;
    private String box;

    public Pizza4() {
        isPrepared = false;
        bakedTime = 0;
        sliceNum = 1;
        box = "None";
    }

    public void prepare() {
        isPrepared = true;
    }

    public void bake(int time) {
        bakedTime = time;
    }

    public void cut(int sliceNum) {
        this.sliceNum = sliceNum;
    }

    public void box(String box) {
        this.box = box;
    }

}
