package org.example;

public class EquatorialCoordinate {
    private final long longitude;
    private final long azimuth;

    public long getLongitude() {
        return longitude;
    }

    public long getAzimuth() {
        return azimuth;
    }

    public EquatorialCoordinate(long longitude, long azimuth) {
        this.longitude = longitude;
        this.azimuth = azimuth;
    }
}
