package truck.parts.factory;

import truck.parts.TruckPartsFactory;
import truck.parts.parts.Body;
import truck.parts.parts.Head;
import truck.parts.parts.Wheel;
import truck.parts.parts.skyparts.SkyBody;
import truck.parts.parts.skyparts.SkyHead;
import truck.parts.parts.skyparts.SkyWheel;

public class SkyTruckPartsFactory implements TruckPartsFactory {
    @Override
    public Head createHead() {
        return new SkyHead();
    }

    @Override
    public Body createBody() {
        return new SkyBody();
    }

    @Override
    public Wheel createWheel() {
        return new SkyWheel();
    }
}
