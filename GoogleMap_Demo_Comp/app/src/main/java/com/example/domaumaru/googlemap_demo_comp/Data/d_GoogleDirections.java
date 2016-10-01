package com.example.domaumaru.googlemap_demo_comp.Data;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Doma Umaru on 9/27/2016.
 */

public class d_GoogleDirections {
    public String key = "AIzaSyDEWB3rOYPOskjaSF1-3i10zvfuZtxRQws";
    public LatLng origin;
    public LatLng destination;

    public d_GoogleDirections(LatLng origin, LatLng destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public void addOrigin(LatLng origin) {
        this.origin = origin;
    }

    public void addDestination(LatLng destination) {
        this.destination = destination;
    }
}
