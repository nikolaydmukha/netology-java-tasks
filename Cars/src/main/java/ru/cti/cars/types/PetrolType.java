package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByFuelTypes;
import main.java.ru.cti.cars.VehicleTypeByPurpose;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.PETROL.name();
    }
}
