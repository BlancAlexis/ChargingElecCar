package fr.ablanc.chargingPoint.manager;

import android.util.Log;

import java.io.IOException;

import fr.ablanc.chargingPoint.model.ChargingPoint;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityController {

    private final ApiManager apiManager;

    public MainActivityController() {
        apiManager = ApiManager.getInstance();
    }

    public void loadChargingPoint(ChargingPointManagerCallback callBack) {
        apiManager.getChargingService().getPageCharacters(6).enqueue(new Callback<ChargingPoint>() {
            @Override
            public void onResponse(Call<ChargingPoint> call, Response<ChargingPoint> response) {
                if (response.isSuccessful()) {
                    ChargingPoint point = response.body();
                    System.out.println(point);
                    callBack.getChargingPointResponseSucess("It's work"+point.toString());
                }
                callBack.getChargingPointResponseError("Erreur du onResponse" + response.errorBody());
            }


            @Override
            public void onFailure(Call<ChargingPoint> call, Throwable t) {
                callBack.getChargingPointResponseError("Erreur onFailure" + t.toString());
            }
        });

    }
       /* Call<ChargingPoint> callTimeParis = apiManager.getChargingService().getTimeCityEurope("london");
        callTimeParis.enqueue(new Callback<Clock>() {
            @Override
            public void onResponse(Call<Clock> call, Response<Clock> response) {
                if (response.isSuccessful()) {
                    Clock c = response.body();
                    Log.e("onResponse", c.getDatetime());
                    callBack.getTimeResponseSuccess(c);

                } else {
                    Log.e("onResponse", "Not successfull : " + response.code());
                    callBack.getChargingPointResponseError("échec de la requête "+ response.code());
                }
            }

            @Override
            public void onFailure(Call<Clock> call, Throwable t) {
                Log.e("onFailure", t.getLocalizedMessage());
                callBack.getTimeResponseError("Erreur lors de la requete : " + t.getLocalizedMessage());
            }
        });*/

        }

