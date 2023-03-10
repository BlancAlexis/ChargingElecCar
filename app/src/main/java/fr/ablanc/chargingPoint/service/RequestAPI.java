package fr.ablanc.chargingPoint.service;

import java.util.List;

import fr.ablanc.chargingPoint.model.ChargingPoint;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestAPI {
    @GET("records/{id}")
    Call<ChargingPoint> getPageCharacters(@Query("id") int num);

//    Call<List<ChargingPoint> listChargingPoint> getPageCharacters(@Query("start") int page);
}
