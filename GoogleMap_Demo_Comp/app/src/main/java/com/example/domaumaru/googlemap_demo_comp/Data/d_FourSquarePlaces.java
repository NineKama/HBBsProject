package com.example.domaumaru.googlemap_demo_comp.Data;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Doma Umaru on 9/27/2016.
 */

public class d_FourSquarePlaces {
    public String id = "BVJMMLEX2FLG4UN2CMEABBK2XPAIPEFEGRMQAZFLJGRLI5HV";
    public String secret = "JN33ZUSGAVQLT1IHW3YTI3I2VALWHZL0TY5OQRLHFBYT4QUF";
    public String version = "20160923";
    public LatLng latLng;
    public String latLngAcc;
    public String query;
    public String radius;
    public String limit;

    public d_FourSquarePlaces(LatLng latLng, String latLngAcc, String query, String radius, String limit) {
        this.latLng = latLng;
        this.latLngAcc = latLngAcc;
        this.query = query;
        this.radius = radius;
        this.limit = limit;
    }
}
