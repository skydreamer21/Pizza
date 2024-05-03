package truck.truck;

import truck.parts.sky.SkyBody;
import truck.parts.sky.SkyHead;
import truck.parts.sky.SkyWheel;

public class SkyTruck {
    public SkyHead head;
    SkyBody body;
    SkyWheel wheel;

    public SkyTruck(SkyHead head, SkyBody body, SkyWheel wheel) {
        this.head = head;
        this.body = body;
        this.wheel = wheel;
    }

    public void showLogo() {
        head.showSkyLight();
        body.showSky();
    }
}
