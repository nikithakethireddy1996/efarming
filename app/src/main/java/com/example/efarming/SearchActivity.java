package com.example.efarming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    SupportMapFragment mapFragment;
    SearchView searchView;
    private ArrayList<LatLng> latlngs = new ArrayList<>();
    private MarkerOptions options = new MarkerOptions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchView = findViewById(R.id.sv_location);
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String location = searchView.getQuery().toString();
                if (location.length() > 0 && location.equalsIgnoreCase("grapes")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(38.384401, -100.782266));
                    latlngs.add(new LatLng(39.683452, -97.666177));
                    latlngs.add(new LatLng(40.333804, -94.872031));
                    latlngs.add(new LatLng(39.108342, -94.614589));
                    latlngs.add(new LatLng(38.181654, -97.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("grapes");
                        options.snippet("grapesInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                }
                else if (location.length() > 0 && location.equalsIgnoreCase("mangoes")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(41.384401, -97.782266));
                    latlngs.add(new LatLng(42.683452, -101.666177));
                    latlngs.add(new LatLng(43.333804, -99.872031));
                    latlngs.add(new LatLng(44.108342, -100.614589));
                    latlngs.add(new LatLng(45.181654, -98.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("mangoes");
                        options.snippet("mangoesInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("oranges")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(46.384401, -90.782266));
                    latlngs.add(new LatLng(47.683452, -85.666177));
                    latlngs.add(new LatLng(48.333804, -92.872031));
                    latlngs.add(new LatLng(49.108342, -80.614589));
                    latlngs.add(new LatLng(50.181654, -97.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("oranges");
                        options.snippet("orangesInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("bananas")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(51.384401, -100.782266));
                    latlngs.add(new LatLng(52.683452, -97.666177));
                    latlngs.add(new LatLng(53.333804, -101.872031));
                    latlngs.add(new LatLng(54.108342, -94.614589));
                    latlngs.add(new LatLng(55.181654, -102.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("bananas");
                        options.snippet("bananasInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("apples")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(40.384408, -97.782269));
                    latlngs.add(new LatLng(39.683454, -99.666179));
                    latlngs.add(new LatLng(38.333808, -94.872036));
                    latlngs.add(new LatLng(37.108344, -94.614585));
                    latlngs.add(new LatLng(36.181656, -104.339195));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("apples");
                        options.snippet("applesInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("carrot")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(60.384401, -100.782266));
                    latlngs.add(new LatLng(59.683452, -99.666177));
                    latlngs.add(new LatLng(58.333804, -101.872031));
                    latlngs.add(new LatLng(57.108342, -94.614589));
                    latlngs.add(new LatLng(56.181654, -108.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("carrot");
                        options.snippet("carrotInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("cucumber")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(55.384401, -100.782266));
                    latlngs.add(new LatLng(54.683452, -97.666177));
                    latlngs.add(new LatLng(53.333804, -102.872031));
                    latlngs.add(new LatLng(52.108342, -94.614589));
                    latlngs.add(new LatLng(51.181654, -104.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("cucumber");
                        options.snippet("cucumberInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("spinach")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(50.384401, -100.782266));
                    latlngs.add(new LatLng(49.683452, -97.666177));
                    latlngs.add(new LatLng(48.333804, -102.872031));
                    latlngs.add(new LatLng(47.108342, -94.614589));
                    latlngs.add(new LatLng(46.181654, -109.339199));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("spinach");
                        options.snippet("spinachInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("capsicum")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(45.384408, -98.782269));
                    latlngs.add(new LatLng(44.683454, -97.666179));
                    latlngs.add(new LatLng(43.333808, -94.872036));
                    latlngs.add(new LatLng(42.108344, -94.614585));
                    latlngs.add(new LatLng(41.181656, -97.339195));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("capsicum");
                        options.snippet("capsicumInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else if (location.length() > 0 && location.equalsIgnoreCase("potato")) {
                    latlngs.clear();
                    map.clear();
                    latlngs.add(new LatLng(40.384408, -97.782269));
                    latlngs.add(new LatLng(39.683454, -99.666179));
                    latlngs.add(new LatLng(38.333808, -94.872036));
                    latlngs.add(new LatLng(37.108344, -94.614585));
                    latlngs.add(new LatLng(36.181656, -104.339195));
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();
                    for (LatLng p : latlngs) {
                        options.position(p);
                        options.title("potato");
                        options.snippet("potatoInfo");
                        map.addMarker(options);
                        builder.include(options.getPosition());
                    }
                    LatLngBounds bounds = builder.build();
                    // offset from edges of the map in pixels
                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, 100);
                    map.moveCamera(cu);
                } else {
                    latlngs.clear();
                    map.clear();
                    Toast.makeText(getApplicationContext(), "Please enter valid fruit or vegetable", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
    }

}
