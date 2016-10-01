package com.example.domaumaru.googlemap_demo_comp.Api;

import com.example.domaumaru.googlemap_demo_comp.Class.cs_GoogleDirectionsData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Doma Umaru on 9/27/2016.
 */

public interface api_Google {
    @GET("/maps/api/directions/json")
    Call<cs_GoogleDirectionsData> getDirections(@Query("origin") String origin,
                                                @Query("destination") String destination,
                                                @Query("key") String key);
}
