package CarUP.Classes;

import java.awt.Color;

import CarUP.Enumerators.TypeCar;
import CarUP.Enumerators.TypeFuel;
import CarUP.Enumerators.TypeGearBox;
import CarUP.Interfaces.ICarWash;
import CarUP.Interfaces.IFuelStation;

public class Pickup extends Car implements IFuelStation, ICarWash{

    private int loadCap;

    public Pickup(String make, String model, int numberWheels, TypeFuel fuelType,
            TypeGearBox gearBoxType, Color bodyColor, int engineCap, int loadCap) {
        super(make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);    
        this.loadCap = loadCap;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }
}
