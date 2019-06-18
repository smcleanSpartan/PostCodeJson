package com.spartaglobal.PostcodeService;

import PostcodeDeserialiser.LocationDeserialiser;

public class App
{
    public static void main( String[] args )
    {
         LocationDeserialiser location = new LocationDeserialiser("resources/postcodes.json");
        System.out.println(location.mainMapped.getStatus());
        System.out.println(location.mainMapped.getResult());
        //System.out.println(location.mainMapped.getCodes());
    }
}
