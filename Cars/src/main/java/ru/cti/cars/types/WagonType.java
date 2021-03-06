package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByBodyTypes;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.WAGON.name();
    }
}
