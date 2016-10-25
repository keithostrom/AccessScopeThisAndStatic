package com.example.old64.accessscopethisandstatic;

import android.util.Log;

/**
 * Created by old64 on 10/24/16.
 */

public class AlienShip {
    private static int numShips;
    private int shieldStrength;
    public String shipName;

    public AlienShip() {
        numShips++;
        this.setShieldStrength(100);
    }

    public static int getNumShips() {
        return numShips;
    }

    private void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return this.shieldStrength;
    }

    public void hitDetected() {
        shieldStrength -= 25;
        Log.i("Incomming: ","Bam!");
        if( shieldStrength == 0) {
            destroyShip();
        }
    }

    private void destroyShip() {
        numShips--;
        Log.i("Explosion: ", ""+this.shipName + "destroyed");
    }
}
