package map;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.liushi.selfApp.MainActivity;
import com.liushi.selfApp.R;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by liushi on 11/7/14.
 */
public class MapActivity extends Activity {
//        implements
//        LocationListener,
//        GooglePlayServicesClient.ConnectionCallbacks,
//        GooglePlayServicesClient.OnConnectionFailedListener {

    private static String TAG = "MapActivity";
    private GoogleMap mMap;
//    private LocationRequest mLocationRequest;
    private LocationClient mLocationClient;
    private ProgressBar mActivityIndicator;

    boolean mUpdatesRequested = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

//        mLocationRequest = LocationRequest.create();
//
//        mLocationRequest.setInterval(LocationUtils.UPDATE_INTERVAL_IN_MILLISECONDS);
//
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//
//        mLocationRequest.setFastestInterval(LocationUtils.FAST_INTERVAL_CEILING_IN_MILLISECONDS);
//
//        mUpdatesRequested = false;

//        mLocationClient = new LocationClient(this, this, this);
//
//        Location mCurrentLocation = this.getLocation();
//
//        String title = this.getAddress(mCurrentLocation);

//        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//        mMap.addMarker(new MarkerOptions()
//                          .position(new LatLng(0, 0))
//                          .title("title")
//                          );
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        mLocationClient.connect();
//    }
//
//    @Override
//    protected void onStop() {
//        mLocationClient.disconnect();
//        super.onStop();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        switch (requestCode) {
//            case LocationUtils.CONNECTION_FAILURE_RESOLUTION_REQUEST:
//                switch (resultCode) {
//                    case Activity.RESULT_OK:
//                        Log.d(LocationUtils.APPTAG, getString(R.string.resolved));
//                        Toast.makeText(this.getApplicationContext(), R.string.connected, Toast.LENGTH_SHORT).show();
//                        break;
//                    default:
//                        Log.d(LocationUtils.APPTAG, getString(R.string.no_resolution));
//                        Toast.makeText(this.getApplicationContext(), R.string.disconnected, Toast.LENGTH_SHORT).show();
//                        break;
//                }
//
//            default:
//                Log.d(LocationUtils.APPTAG, getString(R.string.unknown_activity_request_code, requestCode));
//                break;
//        }
//    }
//
//    private boolean servicesConnected() {
//        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
//
//        if (ConnectionResult.SUCCESS == resultCode) {
//            Log.d(LocationUtils.APPTAG, getString(R.string.play_services_available));
//            return true;
//        } else {
//            Dialog errorDialog = GooglePlayServicesUtil.getErrorDialog(resultCode, this, 0);
//            if (errorDialog != null) {
//                map.ErrorDialogFragment errorDialogFragment = new map.ErrorDialogFragment();
//                errorDialogFragment.setDialog(errorDialog);
//                errorDialogFragment.show(errorDialogFragment.getFragmentManager(), LocationUtils.APPTAG);
//            }
//        }
//        return false;
//    }
//
//    public Location getLocation() {
//        Location currentLocation = null;
//        if (servicesConnected()) {
//            currentLocation = mLocationClient.getLastLocation();
//        }
//        return currentLocation;
//    }
//
//    public String getAddress(Location currentLocation) {
//        String address = "";
//        //in Gingerbread and later, use Geocoder.isPresent() to see if a geocoder is available
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD && !Geocoder.isPresent()) {
//            Toast.makeText(this, R.string.no_geocoder_available, Toast.LENGTH_LONG).show();
//            return address;
//        }
//
//        if (servicesConnected()) {
////            Location currentLocation = getLocation();
//
//            mActivityIndicator.setVisibility(View.VISIBLE);
//
//            GetAddressTask getAddressTask = new GetAddressTask(this.getApplicationContext());
//
//            address = getAddressTask.doInBackground(currentLocation);
//
////            (new GetAddressTask(this)).execute(currentLocation);
//        }
//
//        return address;
//    }
//
//
//
//    @Override
//    public void onConnected(Bundle bundle) {
//        Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onDisconnected() {
//        Toast.makeText(this, "Disconnected, please re-connect", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onConnectionFailed(ConnectionResult connectionResult) {
//        if (connectionResult.hasResolution()) {
//            try {
//                connectionResult.startResolutionForResult(this, LocationUtils.CONNECTION_FAILURE_RESOLUTION_REQUEST);
//            } catch (IntentSender.SendIntentException e) {
//                e.printStackTrace();
//            }
//        } else {
//            showErrorDialog(connectionResult.getErrorCode());
//        }
//    }
//
//    public void onLocationChanged(Location location) {
//        Log.i(TAG, "time: " + location.getTime());
//        Log.i(TAG, "Lng: " + location.getLongitude());
//        Log.i(TAG, "Lat: " + location.getLatitude());
//        Log.i(TAG, "Altitude: " + location.getAltitude());
//    }
//
////    public void startPeriodicUpdates() {
////        mLocationClient.requestLocationUpdates(mLocationRequest, this);
////    }
//
//    public void onStatusChanged(String provider, int status, Bundle extras) {
//        switch (status) {
//            case LocationProvider.AVAILABLE:
//                Log.i(TAG, "current GPS status is available");
//                break;
//            case LocationProvider.OUT_OF_SERVICE:
//                Log.i(TAG, "current GPS status is out of service");
//                break;
//            case LocationProvider.TEMPORARILY_UNAVAILABLE:
//                Log.i(TAG, "current GPS status is unavailable");
//                break;
//        }
//    }
//
//    protected class GetAddressTask extends AsyncTask<Location, Void, String> {
//        Context localContext;
//
//        public GetAddressTask(Context localContext) {
//            super();
//            this.localContext = localContext;
//        }
//
//        @Override
//        protected String doInBackground(Location... locations) {
//            Geocoder geocoder = new Geocoder(localContext, Locale.getDefault());
//
//            Location currentLocation = locations[0];
//
//            List<Address> addresses = null;
//
//            try {
//                addresses = geocoder.getFromLocation(currentLocation.getLatitude(), currentLocation.getLongitude(), 1);
//            } catch (IOException e1){
//                Log.e(LocationUtils.APPTAG, getString(R.string.IO_Exception_getFromLocation));
//
//                // print the stack trace
//                e1.printStackTrace();
//
//                // Return an error message
//                return (getString(R.string.IO_Exception_getFromLocation));
//            } catch (IllegalArgumentException exception2) {
//
//                // Construct a message containing the invalid arguments
//                String errorString = getString(
//                        R.string.illegal_argument_exception,
//                        currentLocation.getLatitude(),
//                        currentLocation.getLongitude()
//                );
//                // Log the error and print the stack trace
//                Log.e(LocationUtils.APPTAG, errorString);
//                exception2.printStackTrace();
//
//                //
//                return errorString;
//            }
//
//            if (addresses != null && addresses.size() > 0) {
//                Address address = addresses.get(0);
//
//                String addressText = getString(R.string.address_output_string,
//                                           address.getMaxAddressLineIndex()>0 ? address.getAddressLine(0) : "",
//                                           address.getLocality(),
//                                           address.getCountryName());
//                return addressText;
//            } else {
//                return getString(R.string.no_address_found);
//            }
//
//        }
//
//        @Override
//        protected void onPostExecute(String address) {
//            mActivityIndicator.setVisibility(View.GONE);
//        }
//    }
//
//    private void showErrorDialog(int errorCode) {
//        Dialog errorDialog = GooglePlayServicesUtil.getErrorDialog(errorCode, this, LocationUtils.CONNECTION_FAILURE_RESOLUTION_REQUEST);
//
//        if (errorDialog != null) {
//            ErrorDialogFragment errorDialogFragment = new map.ErrorDialogFragment();
//            errorDialogFragment.setDialog(errorDialog);
//            errorDialogFragment.show(errorDialogFragment.getFragmentManager(), LocationUtils.APPTAG);
//
//        }
//    }


}
