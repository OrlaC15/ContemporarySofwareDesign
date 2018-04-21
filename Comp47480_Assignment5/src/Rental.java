
// Represents a rental of a vehicle
public class Rental {

  private Vehicle _vehicle;
  private int _daysRented;

  public Rental(Vehicle vehicle, int daysRented) {
    _vehicle = vehicle;
    _daysRented = daysRented;
  }

  public int getDaysRented() {
    return _daysRented;
  }

  public Vehicle getVehicle() {
    return _vehicle;
  }

  public double get_rental_cost() {
    return getVehicle().calculate_rental_cost(getDaysRented());
  }

  @Override
  public String toString() {
    String result;
    result = getVehicle().getVehicleName() + "\t" + String.valueOf(getVehicle().calculate_rental_cost(getDaysRented())) + "\n";
    return result;
  }


}