package com.example.old64.accessscopethisandstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlienShip girlShip = new AlienShip();
        AlienShip boyShip = new AlienShip();
        Log.i("NumShips: ",""+AlienShip.getNumShips());

        girlShip.shipName = "Sue";
        boyShip.shipName = "Tom";

        Log.i("girlShipshieldStrength ",""+girlShip.getShieldStrength());
        Log.i("boyShipshieldStrength ",""+boyShip.getShieldStrength());

        girlShip.hitDetected();
        Log.i("girlShipshieldStrength ",""+girlShip.getShieldStrength());
        Log.i("boyShipshieldStrength ",""+boyShip.getShieldStrength());

        boyShip.hitDetected();
        boyShip.hitDetected();
        boyShip.hitDetected();

        Log.i("girlShipshieldStrength ",""+girlShip.getShieldStrength());
        Log.i("boyShipshieldStrength ",""+boyShip.getShieldStrength());

        boyShip.hitDetected();
        Log.i("girlShipshieldStrength ",""+girlShip.getShieldStrength());
        Log.i("boyShipshieldStrength ",""+boyShip.getShieldStrength());

        Log.i("NumShips: ",""+AlienShip.getNumShips());
    }
}
