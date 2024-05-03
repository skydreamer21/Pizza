package truck.parts;

import truck.parts.parts.Body;
import truck.parts.parts.Head;
import truck.parts.parts.Wheel;

public interface TruckPartsFactory {
    Head createHead();
    Body createBody();
    Wheel createWheel();
}
