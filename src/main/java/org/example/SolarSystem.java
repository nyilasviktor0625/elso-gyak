package org.example;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private static final List<Planet> globalDiscoveredPlanets =new ArrayList<>();

    public SolarSystem() {
        globalDiscoveredPlanets.add(new Planet(1444,"Mercury"));
        globalDiscoveredPlanets.add(new Planet(1244,"Venus"));
        globalDiscoveredPlanets.add(new Planet(1344,"Earth"));
        globalDiscoveredPlanets.add(new Planet(1044,"Mars"));
    }
    public static List<Planet> getGlobalDiscoveredPlanets(){
        return globalDiscoveredPlanets;
    }
}
