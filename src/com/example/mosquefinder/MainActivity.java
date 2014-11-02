package com.example.mosquefinder;


import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {
/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    */
    static final LatLng TutorialsPoint = new LatLng(-33.912361, 151.073722);
    private GoogleMap googleMap;
    private static final LatLng SYDNEY = new LatLng(-33.88,151.21);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       
       //need to add another button here 
       
       //anoth
       try { 
             if (googleMap == null) {
                googleMap = ((MapFragment) getFragmentManager().
                findFragmentById(R.id.map)).getMap();
             }
          googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
          CameraPosition cameraPosition = new CameraPosition.Builder()
          .target(SYDNEY)      // Sets the center of the map to Mountain View
          .zoom(10)                   // Sets the zoom
          .bearing(0)                // Sets the orientation of the camera to east
          .tilt(0)                   // Sets the tilt of the camera to 30 degrees
          .build();                   // Creates a CameraPosition from the builder
      googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
          Marker TP = googleMap.addMarker(new MarkerOptions().
          position(TutorialsPoint).title("LakembaMost"));

       } catch (Exception e) {
          e.printStackTrace();
       }
       
       
       
    }
    
    //button function here
    
    
    //another button function here
    
    

}

