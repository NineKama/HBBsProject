package com.example.domaumaru.googlemap_demo_comp.Class;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doma Umaru on 9/27/2016.
 */

public class cs_GoogleDirectionsData {
    @SerializedName("geocoded_waypoints")
    public List<GeocodedWaypoint> GeocodedWaypoints;
    @SerializedName("routes")
    public List<Route> Routes;
    @SerializedName("status")
    public String Status;

    public class Coordinate {
        @SerializedName("lat")
        public double Latitude;
        @SerializedName("lng")
        public double Longitude;
    }

    public class GeocodedWaypoint {
        @SerializedName("geocoder_status")
        public String GeocoderStatus;
        @SerializedName("place_id")
        public String PlaceId;
        @SerializedName("types")
        public List<String> Types;
    }

    public class Distance {
        @SerializedName("text")
        public String Text;
        @SerializedName("value")
        public int Value;
    }

    public class Duration {
        @SerializedName("text")
        public String Text;
        @SerializedName("value")
        public int Value;
    }

    public class Polyline {
        @SerializedName("points")
        public String Points;
    }

    public class Step {
        @SerializedName("distance")
        public Distance Distance;
        @SerializedName("duration")
        public Duration Duration;
        @SerializedName("end_location")
        public Coordinate EndLocation;
        @SerializedName("html_instructions")
        public String HtmlInstructions;
        @SerializedName("polyline")
        public Polyline Polyline;
        @SerializedName("start_location")
        public Coordinate StartLocation;
        @SerializedName("travel_mode")
        public String TravelMode;
    }

    public class Leg {
        @SerializedName("distance")
        public Distance Distance;
        @SerializedName("duration")
        public Duration Duration;
        @SerializedName("end_address")
        public String EndAddress;
        @SerializedName("end_location")
        public Coordinate EndLocation;
        @SerializedName("start_address")
        public String StartAddress;
        @SerializedName("start_location")
        public Coordinate StartLocation;
        @SerializedName("steps")
        public List<Step> Steps;
//        @SerializedName("traffic_speed_entry")
//        public List<TrafficSpeedEntry> TrafficSpeedEntry;
//        @SerializedName("via_waypoint")
//        public List<ViaWaypoint> ViaWaypoint;
    }

    public class OverviewPolyline {
        @SerializedName("points")
        public String Points;
    }

    public class Route {
        //        @SerializedName("bounds")
//        public Bounds bounds;
        @SerializedName("copyrights")
        public String Copyrights;
        @SerializedName("legs")
        public List<Leg> Legs;
        @SerializedName("overview_polyline")
        public OverviewPolyline OverviewPolyline;
        @SerializedName("summary")
        public String Summary;
        @SerializedName("warnings")
        public List<String> Warnings;
        @SerializedName("waypoint_order")
        public List<String> WaypointOrder;
    }
}
