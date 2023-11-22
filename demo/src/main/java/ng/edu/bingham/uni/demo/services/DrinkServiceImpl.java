package ng.edu.bingham.uni.demo.services;

import ng.edu.bingham.uni.demo.domain.Drinks;
import ng.edu.bingham.uni.demo.repository.Drinkinterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DrinkServiceImpl implements Drinksservices {
    @Autowired
    Drinkinterface drinkinterface;
    @Override
    public Drinks savedrink(Drinks drinks) {
        return drinkinterface.save(drinks);
    }

    @Override
    public Drinks getDrinksbyId(long id) {
        Optional<Drinks> drink = drinkinterface.findById(id);
        Drinks emptydrink = null;
        If (drink.isPresent()){


        return null;
    }

    @Override
    public List<Drinks> getDrink() {
        return null;
    }
}
