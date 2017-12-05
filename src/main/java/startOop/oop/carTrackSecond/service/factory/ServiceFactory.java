package startOop.oop.carTrackSecond.service.factory;

import startOop.oop.carTrackSecond.service.CarService;
import startOop.oop.carTrackSecond.service.TrackService;
import startOop.oop.carTrackSecond.service.impl.CarServiceImpl;
import startOop.oop.carTrackSecond.service.impl.TrackServiceImpl;

public class ServiceFactory {

    /**
     * @return instance of {@link CarService}
     */
    public static CarService getAllCarMethods() {
        return new CarServiceImpl();
    }

    /**
     * @return instance of {@link TrackService}
     */
    public static TrackService getAllTrackMethods() {
        return new TrackServiceImpl();
    }
}
