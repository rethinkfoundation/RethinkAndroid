package com.rethink.foundation.utils.daggercomponents;

import android.content.Context;

import com.rethink.foundation.data.DataManager;
import com.rethink.foundation.data.local.LocalDataManager;
import com.rethink.foundation.data.remote.RemoteDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sreedev on 12/02/18.
 */

@Module
public class DaggerModule {

    /**
     * This provides the singleton object of Model class
     *
     * @return Utils class singleton object
     */
    @Provides
    @Singleton
    DataManager provideDataHelper() {
        Context context = null;
        return DataManager.getInstance(RemoteDataManager.getInstance(context), LocalDataManager.getInstance(), context);
    }

}
