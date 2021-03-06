package main.java.ru.cti.cars.types;

import main.java.ru.cti.cars.VehicleTypeByFuelTypes;
import main.java.ru.cti.cars.VehicleTypeByPurpose;
import main.java.ru.cti.cars.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.VehicleTypes.HYBRID.name();
    }
}
