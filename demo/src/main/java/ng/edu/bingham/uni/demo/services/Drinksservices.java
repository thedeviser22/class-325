package ng.edu.bingham.uni.demo.services;

import ng.edu.bingham.uni.demo.domain.Drinks;

public interface Drinksservices {
    Drinks savedrink(Drinks drinks):
    Drinks getDrinksbyId(long id);
    List <Drinks> getDrink():

}
