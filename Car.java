/**
* 
Create a car class with a gas attribute and status method

Create a driver class that extends the car class and has the following three methods: drive, boost, refuel
Now create a driver class that extends the car class. The driver can choose to drive, use boosters, or refuel. Each method should print the action to the console, followed by the remaining amount of gas.

Driving should decrease gas by 1
Using boosters should decrease gas by 3
Refueling should increase gas by 2

Create a 'CarAndDriver' test class and instantiate the driver class

Call the drive method four times, the boost method once, and the refuel method three times
*/

public class Car {
  
  private int gas = 10;


  public int getGas() {
    return this.gas;
  }

  public void setGas(int gas) {
    this.gas = gas;
  }


}