package startOop.oop.carTrackSecond.dao.impl;

import startOop.oop.carTrackSecond.dao.TrackDAO;
import startOop.oop.carTrackSecond.data.Database;
import startOop.oop.carTrackSecond.model.Track;

import java.util.List;

public class TrackDAOImpl implements TrackDAO {

    @Override
    public List<Track> getAllTracks() {
        return Database.getAllTracks();
    }

    @Override
    public void roll(Track track) {
        if (track.getStatus().equals(Track.Doing.STOP) & track.isWithCar() == false) {
            track.setStatus(Track.Doing.ROLL);
            System.out.println("You changed your Track status on ROLL. Without some CAR!");
        }
        if (track.getStatus().equals(Track.Doing.STOP) & track.isWithCar() == true) {
            System.out.println("You can`t roll track, because it attached to car!");
        } else {
            System.out.println("Your track is rolling now!");
        }
    }

    @Override
    public void stop(Track track) {
        if (track.getStatus().equals(Track.Doing.ROLL) & track.isWithCar() == true) {
            System.out.println("You can`t stop you Track, because it attached to moving car!");
        }
        if (track.getStatus().equals(Track.Doing.ROLL) & track.isWithCar() == false) {
            track.setStatus(Track.Doing.STOP);
            System.out.println("You changed your Track status on STOP. Don`t attached to car.");
        } else {
            System.out.println("Your track is stop now!");
        }
    }
}
