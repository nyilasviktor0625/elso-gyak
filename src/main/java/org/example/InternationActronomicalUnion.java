package org.example;

import java.util.Date;

public interface InternationActronomicalUnion {
    boolean isThePlanetDiscovered(Date noticeDate,EquatorialCoordinate equatorialCoordinate);
    Point getRealPosition(Date noticeDate, EquatorialCoordinate equatorialCoordinate);
    boolean register(Planet planet,Point position);
}
