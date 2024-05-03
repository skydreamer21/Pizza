package truck.parts.factory;

import truck.parts.TruckPartsFactory;
import truck.parts.parts.Body;
import truck.parts.parts.Head;
import truck.parts.parts.Wheel;
import truck.parts.parts.treeparts.TreeBody;
import truck.parts.parts.treeparts.TreeHead;
import truck.parts.parts.treeparts.TreeWheel;

public class TreeTruckPartsFactory implements TruckPartsFactory {

    @Override
    public Head createHead() {
        return new TreeHead();
    }

    @Override
    public Body createBody() {
        return new TreeBody();
    }

    @Override
    public Wheel createWheel() {
        return new TreeWheel();
    }
}
