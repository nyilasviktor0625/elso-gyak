package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Astronomer {
    private final List<Planet> nyilvantartas = new ArrayList<Planet>();
    private final String name;
    private final InternationActronomicalUnion internationActronomicalUnion;
    private final PlanetCalculator pc;
    private long discoveredPlanetNumber=8;

    public Astronomer(String name, InternationActronomicalUnion internationActronomicalUnion,PlanetCalculator pc) {
        this.name = name;
        this.internationActronomicalUnion = internationActronomicalUnion;
        this.pc = pc;
    }
private String getPlanetNameFromAstronomer(){
        return name+" "+ discoveredPlanetNumber++;
}
    public boolean observeTheSky(Date date, EquatorialCoordinate equatorialCoordinate){
       if(!internationActronomicalUnion.isThePlanetDiscovered(date,equatorialCoordinate)) {
           Point realPosition = internationActronomicalUnion.getRealPosition(date, equatorialCoordinate);

          Planet planet= new Planet(pc.getPlanetRadiusInPosition(realPosition), getPlanetNameFromAstronomer());
        internationActronomicalUnion.register(planet,realPosition);
        return false;
       }
       return true;
    }
}
