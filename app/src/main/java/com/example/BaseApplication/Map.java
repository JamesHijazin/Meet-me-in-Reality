package com.example.BaseApplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng; // Add this import
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class Map extends AppCompatActivity {


    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;

    private Marker marker;
    double landmarkLatitude = 37.8102;
    double landmarkLongitude = 144.9628;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.btnLogout);
        textView = findViewById(R.id.user_details);
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        if (mapFragment != null) {
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    // Add markers and configure the map here
                    LatLng landmarkLocation = new LatLng(landmarkLatitude, landmarkLongitude);

                    LatLng landmarkLocation_2 = new LatLng(landmarkLatitude + 10, landmarkLongitude + 10);

                    MarkerOptions markerOptions = new MarkerOptions()
                            .position(landmarkLocation)
                            .title("Landmark Name")
                            .draggable(true); // Make the marker draggable

                    MarkerOptions markerOptions_2 = new MarkerOptions()
                            .position(landmarkLocation_2)
                            .title("Landmark Name")
                            .draggable(true); // Make the marker draggable
                    googleMap.addMarker(markerOptions_2);
                    Marker marker = googleMap.addMarker(markerOptions);

                    // Set an OnMarkerClickListener to handle marker interactions
                    googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                        @Override
                        public boolean onMarkerClick(Marker marker) {
                            // Create a custom dialog to let the user interact with the marker
                            showCustomMarkerDialog(marker);
                            return true; // To consume the event and prevent default behavior
                        }
                    });

                    // Set an OnMarkerDragListener to detect when the marker is dragged
                    googleMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {
                        @Override
                        public void onMarkerDragStart(Marker marker) {

                        }

                        @Override
                        public void onMarkerDrag(Marker marker) {

                        }

                        @Override
                        public void onMarkerDragEnd(Marker marker) {

                        }
                    });
                }
            });
        }

    }

    private void showCustomMarkerDialog(final Marker marker) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Location Information");
        builder.setMessage("Have you found this location");

        builder.setPositiveButton("Found Location", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (marker != null) {

                    marker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
                }
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}