package com.techcom.myapplicationmapnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  /*  EditText source_loc;
    EditText final_loc;
    ImageView img_source_loc;
    ImageView img_final_loc;
    private static final int REQUEST_CODE_AUTOCOMPLETE_ADDRESS_ONE = 1900;
    private static final int REQUEST_CODE_AUTOCOMPLETE_ADDRESS_TWO = 1901;
    public static final int MY_SOURCE_LOCATION_CODE = 123;
    public static final int MY_FINAL_LOCATION_CODE = 124;
    private static final int GOOGLE_API_CLIENT_ID = 0;
    private AutoCompleteTextView mAutocompleteTextView;
    private static final String GOOGLE_PLACES_API_KEY = "AIzaSyBM3sJX7fGb7dX5yQBDiQCdZ6qhb2Lk8vw";


    private String fromAddress, towAddress;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Places.initialize(getApplicationContext(), GOOGLE_PLACES_API_KEY);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
        startActivity(intent);

       /* source_loc = (EditText) findViewById(R.id.source_loc);
        final_loc = (EditText) findViewById(R.id.final_loc);
        img_final_loc = (ImageView) findViewById(R.id.final_loc_map);
        img_final_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSourceLocation();
            }
        });
        img_source_loc = (ImageView) findViewById(R.id.source_loc_map);
        img_source_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFinalLocation();
            }
        });
*/
    }

     /*   @Override
        protected void onActivityResult ( int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == MY_SOURCE_LOCATION_CODE) {
                if (resultCode == RESULT_OK) {
                    Place place = Autocomplete.getPlaceFromIntent(data);
                    Log.i("tag", "Place: " + place.getName() + ", " + place.getLatLng());
                    //tvLocationName.setText(place.getName());
                    //tvPlaceId.setText(place.getId());
                    //tvLatLon.setText(String.valueOf(place.getLatLng()));
                    source_loc.setText(place.getName());
                    fromAddress = String.valueOf(place.getLatLng());
                } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                    // TODO: Handle the error.
                    Status status = Autocomplete.getStatusFromIntent(data);
                    Log.i("tag", status.getStatusMessage());
                } else if (resultCode == RESULT_CANCELED) {
                    // The user canceled the operation.
                }
            } else if (requestCode == MY_FINAL_LOCATION_CODE) {
                if (resultCode == RESULT_OK) {
                    Place place = Autocomplete.getPlaceFromIntent(data);
                    Log.i("tag", "Place: " + place.getName() + ", " + place.getLatLng());
                    //tvLocationName.setText(place.getName());
                    //tvPlaceId.setText(place.getId());
                    //tvLatLon.setText(String.valueOf(place.getLatLng()));
                    final_loc.setText(place.getName());
                    towAddress = String.valueOf(place.getLatLng());
                } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                    // TODO: Handle the error.
                    Status status = Autocomplete.getStatusFromIntent(data);
                    Log.i("tag", status.getStatusMessage());
                } else if (resultCode == RESULT_CANCELED) {
                    // The user canceled the operation.
                }
            }
            // super.onActivityResult(requestCode, resultCode, data);
            /*Intent intent=new Intent(MainActivity.this,MapsActivity.class);

            intent.putExtra("fromaddess",fromAddress);
            intent.putExtra("toaddress",towAddress);
            startActivity(intent);
            finish();*/
        }

    /*    public void setSourceLocation ()
        {
            List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG);
            Intent intent = new Autocomplete.IntentBuilder(
                    AutocompleteActivityMode.FULLSCREEN, fields)
                    .build(MainActivity.this);
            startActivityForResult(intent, MY_SOURCE_LOCATION_CODE);

        }
        public void setFinalLocation()
        {
            List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG);
            Intent intent = new Autocomplete.IntentBuilder(
                    AutocompleteActivityMode.FULLSCREEN, fields)
                    .build(MainActivity.this);
            startActivityForResult(intent, MY_FINAL_LOCATION_CODE);

        }

} */
