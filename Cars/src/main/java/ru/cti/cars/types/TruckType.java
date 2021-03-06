package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByPurpose;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.TRUCK.name();
    }
}