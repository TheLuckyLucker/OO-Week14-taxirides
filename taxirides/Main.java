package taxirides;

public class Main {
  public static void main(String[] args) {
    Simulation sim = new Simulation();
    while (!sim.ended()) {
      sim.step();
    }
    sim.showStatistics();
  }

}
