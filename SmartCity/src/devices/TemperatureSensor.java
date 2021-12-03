package devices;

public class TemperatureSensor extends SensorNodes {
  private int value;

  public TemperatureSensor(int ID, int value) {
    super(ID);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }


  @Override
  public String toString() {
    return String.format("\n\t[Temperature Sensor]: %d °C", getValue());
  }

}
