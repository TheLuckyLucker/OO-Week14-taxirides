/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxirides;

/**
 * 
 * @author Tiko Huizinga - s44608988
 * @author Conny Blach - s4329872
 *
 */
public class Train {
  private int nrOfPassengers;
  private final Station station;
  private int nrOfTrips = 0;

  public Train(Station station) {
    this.station = station;
    this.nrOfPassengers = 0;
  }

  /**
   * Populate this train with number nrOfPassengers
   *
   * @param number
   *          the number of passenegers of this train
   */
  public void getIn(int number) {
    nrOfPassengers = number;
  }

  /**
   * empties this train and augment the number of Passengers at the station with
   * this nrOfPassenegers
   */
  public void getOff() {
    nrOfTrips += 1;
    station.enterStation(nrOfPassengers);
  }

  public void closeStation() {
    station.close();
  }

  public int getNrOfTrips() {
    return nrOfTrips;
  }

}

