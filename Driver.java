/*
 * Create a driver class that extends the car class and has the following three methods: drive, boost, refuel
Now create a driver class that extends the car class. The driver can choose to drive, use boosters, or refuel. Each method should print the action to the console, followed by the remaining amount of gas.

Driving should decrease gas by 1
Using boosters should decrease gas by 3
Refueling should increase gas by 2
 */


public class Driver extends Car {

  public void drive(){
    this.setGas(this.getGas()-1);
    System.out.println("You drive the car. Gas remaining: "+this.getGas()+"/10");
  }

  public void boosters(){
    this.setGas(this.getGas()-3);
    System.out.println("Used the boosters. "+this.getGas());
  }

  public void refuel(){
    this.setGas(getGas()+2);
    System.out.println("Refueld. "+this.getGas());
  }

}
