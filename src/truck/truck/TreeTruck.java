package truck.truck;

import truck.parts.tree.TreeBody;
import truck.parts.tree.TreeHead;
import truck.parts.tree.TreeWheel;

public class TreeTruck {

    public TreeHead head;
    TreeBody body;
    TreeWheel wheel;

    public TreeTruck(TreeHead head, TreeBody body, TreeWheel wheel) {
        this.head = head;
        this.body = body;
        this.wheel = wheel;
    }
}
