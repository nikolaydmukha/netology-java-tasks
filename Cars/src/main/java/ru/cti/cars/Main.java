package main.java.ru.cti.cars;

import main.java.ru.cti.cars.types.BusType;
import main.java.ru.cti.cars.types.DieselType;
import main.java.ru.cti.cars.types.PassengerType;
import main.java.ru.cti.cars.types.PetrolType;
import main.java.ru.cti.cars.types.PickupType;
import main.java.ru.cti.cars.types.SedanType;
import main.java.ru.cti.cars.types.TruckType;
import main.java.ru.cti.cars.types.WagonType;

public class Main {
    public static void main(String[] args) {
        VehicleTypeByPurpose vehicleTypeByPurposeBUS = new VehicleTypeByPurpose(VehicleTypeEnum.VehicleTypes.BUS.name());
        VehicleTypeByPurpose vehicleTypeByPurposeCAR = new VehicleTypeByPurpose(VehicleTypeEnum.VehicleTypes.CAR.name());
        VehicleTypeByPurpose vehicleTypeByPurposeTRUCK = new VehicleTypeByPurpose(VehicleTypeEnum.VehicleTypes.TRUCK.name());

        System.out.println(vehicleTypeByPurposeBUS.getTypeName());

        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd mercesdesAd = new VehicleAd("Mercedes", "250", new PassengerType(), new SedanType(), new DieselType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd scaniaAd = new VehicleAd("Scania", "1", new BusType(), new WagonType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, mercesdesAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println(adsService.toString());
        adsService.filterByVehicleTypeByPurpose(new TruckType());

        System.out.println(volvoAd.getVehicleTypeByFuelTypes().getTypeName());
        System.out.println(mercesdesAd.getModel());
    }
}
