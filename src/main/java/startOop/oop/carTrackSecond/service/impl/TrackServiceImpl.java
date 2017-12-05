package startOop.oop.carTrackSecond.service.impl;

import startOop.oop.carTrackSecond.dao.TrackDAO;
import startOop.oop.carTrackSecond.dao.factory.DAOFactory;
import startOop.oop.carTrackSecond.model.Track;
import startOop.oop.carTrackSecond.service.TrackService;

import java.util.List;

public class TrackServiceImpl implements TrackService {

    @Override
    public List<Track> getAllTracks() {
        TrackDAO allTrackMethods = DAOFactory.getAllTrackMethods();
        return allTrackMethods.getAllTracks();
    }

    @Override
    public void roll(Track track) {
        if (track != null) {
            DAOFactory.getAllTrackMethods().roll(track);
        }
    }

    @Override
    public void stop(Track track) {
        if (track != null) {
            DAOFactory.getAllTrackMethods().stop(track);
        }
    }
}
