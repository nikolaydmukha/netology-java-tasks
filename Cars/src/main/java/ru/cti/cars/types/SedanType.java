package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByBodyTypes;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.SEDAN.name();
    }
}
