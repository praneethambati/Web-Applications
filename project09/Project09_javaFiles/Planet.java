package project09;

public class Planet {
   
   // Name of planet
   private String name;
   // Average distance from sun (millions of kilometers)
   private double averageDistanceFromSun;
   // Period of revolution (Earth days)
   private double periodOfRevolution;
   // Diameter (kilometers)
   private double diameter;
   // Mass (Earth = 1)
   private double mass;
   // Gravity (Earth = 1)
   private double gravity;

   public Planet(String name, double averageDistanceFromSun,
           double periodOfRevolution, double diameter,
           double mass, double gravity) {
      this.name = name;
      this.averageDistanceFromSun = averageDistanceFromSun;
      this.periodOfRevolution = periodOfRevolution;
      this.diameter = diameter;
      this.mass = mass;
      this.gravity = gravity;
   }

   public String getName() {
      return name;
   }

   public double getAverageDistanceFromSun() {
      return averageDistanceFromSun;
   }

   public double getPeriodOfRevolution() {
      return periodOfRevolution;
   }

   public double getDiameter() {
      return diameter;
   }

   public double getMass() {
      return mass;
   }

   public double getGravity() {
      return gravity;
   }

   @Override
   public String toString() {
      return "Planet{" + "name=" + name
              + ", averageDistanceFromSun=" + averageDistanceFromSun
              + ", periodOfRevolution=" + periodOfRevolution
              + ", diameter=" + diameter
              + ", mass=" + mass
              + ", gravity=" + gravity + '}';
   }

}
