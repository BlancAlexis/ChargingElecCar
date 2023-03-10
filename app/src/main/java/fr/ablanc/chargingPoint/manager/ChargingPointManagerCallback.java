package fr.ablanc.chargingPoint.manager;

import fr.ablanc.chargingPoint.model.ChargingPoint;

public interface ChargingPointManagerCallback {
    void getChargingPointResponseSucess(String message);
    void getChargingPointResponseError(String message);
}
