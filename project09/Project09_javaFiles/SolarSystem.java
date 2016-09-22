package project09;

import java.util.ArrayList;

public class SolarSystem {
   
   ArrayList<Planet> planetList;
   
   public SolarSystem() {
      
      planetList = new ArrayList<Planet>();
      
      planetList.add(new Planet("Mercury", 57.9, 88, 4880, .055, .37));
      planetList.add(new Planet("Venus", 108.2, 224.7, 12104, .815, .88));
      planetList.add(new Planet("Earth", 149.6, 365.26, 12756, 1, 1));
      planetList.add(new Planet("Mars", 227.9, 687, 6787, .108, .38));
      planetList.add(new Planet("Jupiter", 778.3, 4332, 142800, 317.9, 2.64));
      planetList.add(new Planet("Saturn", 1427, 10761, 120000, 95.2, 1.15));
      planetList.add(new Planet("Uranus", 2869.6, 30685, 51800, 14.6, 1.17));
      planetList.add(new Planet("Neptune", 4496.6, 60195, 49500, 17.2, 1.18));
   }
   
   public ArrayList<Planet> getPlanets() {
      return planetList;
   }
   
}
