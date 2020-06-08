package AerialVehicles;

import Entities.Coordinates;

public interface AerialVehicleService {

    void flyTO(Coordinates flyToCoordinates);

    void land();

    void check();

    void repair();
}
