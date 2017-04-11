package fr.esilv.s8.beacondetection;

import android.app.Application;

import com.radiusnetworks.proximity.KitConfig;
import com.radiusnetworks.proximity.ProximityKitManager;
import com.radiusnetworks.proximity.ProximityKitSyncNotifier;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Salem on 12/04/2017.
 */

public class MyApplication extends Application implements ProximityKitSyncNotifier {

    /**
     * Singleton storage for an instance of the manager
     */
    private static ProximityKitManager pkManager = null;

    @Override
    public void onCreate() {
        super.onCreate();
        Map<String, String> settings = new HashMap<>();
        settings.put(
                KitConfig.CONFIG_API_URL,
                "https://proximitykit.radiusnetworks.com/api/kits/MY_KIT_ID"
        );
        settings.put(
                KitConfig.CONFIG_API_TOKEN,
                "MY_KIT_SDK_TOKEN"
        );

    }

    }
