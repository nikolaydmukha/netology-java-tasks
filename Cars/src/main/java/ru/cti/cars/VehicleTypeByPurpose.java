package main.java.ru.cti.cars;

public class VehicleTypeByPurpose extends VehicleType{

    public VehicleTypeByPurpose() {    }
    public VehicleTypeByPurpose(String attribute) {

        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
