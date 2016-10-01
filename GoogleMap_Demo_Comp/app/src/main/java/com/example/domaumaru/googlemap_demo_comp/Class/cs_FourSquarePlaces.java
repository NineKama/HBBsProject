package com.example.domaumaru.googlemap_demo_comp.Class;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doma Umaru on 9/27/2016.
 */

public class cs_FourSquarePlaces {
    @SerializedName("meta")
    public Meta meta;
    @SerializedName("response")
    public Response response;

    public class Meta {
        @SerializedName("code")
        public int code;
        @SerializedName("requestId")
        public String requestid;
    }

    public class Contact {
    }

    public class Labeledlatlngs {
        @SerializedName("label")
        public String label;
        @SerializedName("lat")
        public double lat;
        @SerializedName("lng")
        public double lng;
    }

    public class Location {
        @SerializedName("address")
        public String address;
        @SerializedName("crossStreet")
        public String crossstreet;
        @SerializedName("lat")
        public double lat;
        @SerializedName("lng")
        public double lng;
        @SerializedName("labeledLatLngs")
        public List<Labeledlatlngs> labeledlatlngs;
        @SerializedName("distance")
        public int distance;
        @SerializedName("cc")
        public String cc;
        @SerializedName("city")
        public String city;
        @SerializedName("state")
        public String state;
        @SerializedName("country")
        public String country;
        @SerializedName("formattedAddress")
        public List<String> formattedaddress;
    }

    public class Icon {
        @SerializedName("prefix")
        public String prefix;
        @SerializedName("suffix")
        public String suffix;
    }

    public class Categories {
        @SerializedName("id")
        public String id;
        @SerializedName("name")
        public String name;
        @SerializedName("pluralName")
        public String pluralname;
        @SerializedName("shortName")
        public String shortname;
        @SerializedName("icon")
        public Icon icon;
        @SerializedName("primary")
        public boolean primary;
    }

    public class Stats {
        @SerializedName("checkinsCount")
        public int checkinscount;
        @SerializedName("usersCount")
        public int userscount;
        @SerializedName("tipCount")
        public int tipcount;
    }

    public class Items {
    }

    public class Specials {
        @SerializedName("count")
        public int count;
        @SerializedName("items")
        public List<Items> items;
    }

    public class Groups {
    }

    public class Herenow {
        @SerializedName("count")
        public int count;
        @SerializedName("summary")
        public String summary;
        @SerializedName("groups")
        public List<Groups> groups;
    }

    public class Venues {
        @SerializedName("id")
        public String id;
        @SerializedName("name")
        public String name;
        @SerializedName("contact")
        public Contact contact;
        @SerializedName("location")
        public Location location;
        @SerializedName("categories")
        public List<Categories> categories;
        @SerializedName("verified")
        public boolean verified;
        @SerializedName("stats")
        public Stats stats;
        @SerializedName("specials")
        public Specials specials;
        @SerializedName("hereNow")
        public Herenow herenow;
        @SerializedName("referralId")
        public String referralid;
        @SerializedName("venueChains")
        public List<Venuechains> venuechains;
        @SerializedName("hasPerk")
        public boolean hasperk;
    }

    public class Venuechains {
        @SerializedName("id")
        public String id;
    }

    public class Response {
        @SerializedName("venues")
        public List<Venues> venues;
        @SerializedName("confident")
        public boolean confident;
    }
}
