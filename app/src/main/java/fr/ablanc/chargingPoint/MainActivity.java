package fr.ablanc.chargingPoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.ablanc.chargingPoint.manager.ChargingPointManagerCallback;
import fr.ablanc.chargingPoint.manager.MainActivityController;
import fr.ablanc.chargingPoint.model.ChargingPoint;

public class MainActivity extends AppCompatActivity implements ChargingPointManagerCallback {

    private MainActivityController mainActivityController = new MainActivityController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadPoint();


    }

    private void loadPoint(){
        mainActivityController.loadChargingPoint(this);
    }

    @Override
    public void getChargingPointResponseSucess(String message) {

    }

    @Override
    public void getChargingPointResponseError(String message) {

    }
}