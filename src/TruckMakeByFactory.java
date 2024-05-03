import truck.parts.TruckPartsFactory;
import truck.parts.factory.SkyTruckPartsFactory;
import truck.truck.Truck;
import truck.truck.truck_by_factory.SkyTruck;

public class TruckMakeByFactory {
    public static void main(String[] args) {
        TruckPartsFactory factory = new SkyTruckPartsFactory();
        Truck truck = new SkyTruck(factory);
    }
}
