package startOop.oop.carTrackSecond.dao.factory;

import startOop.oop.carTrackSecond.dao.TrackDAO;
import startOop.oop.carTrackSecond.dao.impl.CarDAOImpl;
import startOop.oop.carTrackSecond.dao.impl.TrackDAOImpl;

public class DAOFactory {
    /**
     * @return instance of {@link CarDAOImpl}
     */
    public static CarDAOImpl getAllCarMethods() {
        return new CarDAOImpl();
    }

    /**
     * @return instance of {@link TrackDAO}
     */
    public static TrackDAO getAllTrackMethods() {
        return new TrackDAOImpl();
    }
}
