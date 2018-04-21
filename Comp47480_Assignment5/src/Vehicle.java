public class Vehicle {


  public Vehicle(String model) {

    vehicle_name = model;

  }
  public  int getFrequentRenterPoints(int days){
  int days_rented=days;
    int frequent=1;
    if ((getVehicleName().equalsIgnoreCase("Landrover Freelander")) && days_rented > 1) {
      frequent++;
    }
  return frequent;
    }

  public double calculate_rental_cost(int days) {

    int days_rented = days;
    double thisAmount = 0;
    if (getVehicleName().equalsIgnoreCase("Peugeot 207")) {
      thisAmount = 2;
      if (days_rented > 2) {

        thisAmount += ((days_rented - 2) * 1.5);
      }
    }
     else if (getVehicleName().equalsIgnoreCase("Honda 50")){
      thisAmount = 1.5;
      if (days_rented > 3) {
        thisAmount += (days_rented - 3) * 1.5;
      }
    }
    else{
      thisAmount += (days_rented * 3.0);
    }
    return thisAmount;
  }
  public String getVehicleName() {
    return vehicle_name;
  }


  private String vehicle_name;

}
