package truck.truck.truck_by_factory;

import truck.parts.TruckPartsFactory;
import truck.truck.Truck;

public class SkyTruck extends Truck {

    private TruckPartsFactory partsFactory;

    public SkyTruck(TruckPartsFactory partsFactory) {
        this.head = partsFactory.createHead();
        this.body = partsFactory.createBody();
        this.wheel = partsFactory.createWheel();
    }
}
