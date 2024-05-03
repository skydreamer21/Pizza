import truck.parts.sky.SkyBody;
import truck.parts.sky.SkyHead;
import truck.parts.sky.SkyWheel;
import truck.parts.tree.TreeBody;
import truck.parts.tree.TreeHead;
import truck.parts.tree.TreeWheel;
import truck.truck.SkyTruck;
import truck.truck.TreeTruck;

public class TruckMake {
    public static void main(String[] args) {
        SkyHead skyHead = new SkyHead();
        SkyBody skyBody = new SkyBody();
        SkyWheel skyWheel = new SkyWheel();
        SkyTruck skyTruck = new SkyTruck(skyHead, skyBody, skyWheel);


        TreeHead treeHead = new TreeHead();
        TreeBody treeBody = new TreeBody();
        TreeWheel treeWheel = new TreeWheel();
        TreeTruck treeTruck = new TreeTruck(treeHead, treeBody, treeWheel);
    }
}
