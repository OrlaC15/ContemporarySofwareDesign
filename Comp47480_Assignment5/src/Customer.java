import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String generate_statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        double thisamount = 0;
        String result = "Rental Record for " + getName() + "\n";

        // show figures for this rental
        for (int i = 0; i < _rentals.size(); i++) {
            result += _rentals.get(i).toString();
            int many_days = _rentals.get(i).getDaysRented();
            thisamount = _rentals.get(i).get_rental_cost();
            frequentRenterPoints += _rentals.get(i).getVehicle().getFrequentRenterPoints(many_days);
            totalAmount += thisamount;

        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }

    private String _name;
    public List<Rental> _rentals = new ArrayList<Rental>();

    public List<Rental> get_rentals() {
        return _rentals;
    }
}
