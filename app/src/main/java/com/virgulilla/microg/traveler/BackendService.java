package com.virgulilla.microg.traveler;

import android.location.Location;

import org.microg.nlp.api.LocationBackendService;
import org.microg.nlp.api.LocationHelper;

public class BackendService extends LocationBackendService {

    @Override
    protected Location update() {
        Location location = LocationHelper.create("Sol - Madrid", 40.41660, -3.70382, 42);
        return location;
    }
}
