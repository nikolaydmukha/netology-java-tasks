package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByPurpose;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.CAR.name();
    }
}
