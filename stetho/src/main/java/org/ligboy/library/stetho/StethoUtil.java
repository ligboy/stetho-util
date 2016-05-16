package org.ligboy.library.stetho;

import android.app.Application;
import android.support.annotation.NonNull;

import com.facebook.stetho.Stetho;

/**
 * Stetho Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoUtil {
    /**
     * Initialize Stetho
     * @param application Application
     */
    public static void initialize(@NonNull Application application) {
        Stetho.initialize(
                Stetho.newInitializerBuilder(application)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(application))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(application))
                        .build());
    }
}