package com.example.sdgmentorshipapp;

import android.content.Context;
import android.telephony.TelephonyManager;

import java.util.Locale;

public class Location {

//    String locale = context.getResources().getConfiguration().locale.getCountry();

    public static String getCountry(Context context) {
        String country = PreferencesManager.getInstance(context).getString(COUNTRY);
        if (country != null) {
            return country;
        }

        LocationManager locationManager = (LocationManager) PiplApp.getInstance().getSystemService(Context.LOCATION_SERVICE);
        if (locationManager != null) {
            Location location = locationManager
                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (location == null) {
                location = locationManager
                        .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            }
            if (location == null) {
                log.w("Couldn't get location from network and gps providers")
                return
            }
            Geocoder gcd = new Geocoder(context, Locale.getDefault());
            List<Address> addresses;
            try {
                addresses = gcd.getFromLocation(location.getLatitude(),
                        location.getLongitude(), 1);

                if (addresses != null && !addresses.isEmpty()) {
                    country = addresses.get(0).getCountryName();
                    if (country != null) {
                        PreferencesManager.getInstance(context).putString(COUNTRY, country);
                        return country;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        country = getCountryBasedOnSimCardOrNetwork(context);
        if (country != null) {
            PreferencesManager.getInstance(context).putString(COUNTRY, country);
            return country;
        }
        return null;
    }
}
