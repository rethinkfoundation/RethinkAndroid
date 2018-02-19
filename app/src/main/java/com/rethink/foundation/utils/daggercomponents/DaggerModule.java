package com.rethink.foundation.utils.daggercomponents;

import android.content.Context;

import com.rethink.foundation.data.DataManager;
import com.rethink.foundation.data.local.LocalDataManager;
import com.rethink.foundation.data.remote.RemoteDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zac on 12/02/18.
 */

@Module
public class DaggerModule {

    private Context context;

    public DaggerModule(Context context) {
        this.context = context;
    }

    /**
     * This provides the singleton object of Model class
     *
     * @return Utils class singleton object
     */
    @Provides
    @Singleton
    DataManager provideDataHelper() {
        return DataManager.getInstance(RemoteDataManager.getInstance(context), LocalDataManager.getInstance(), context);
    }

}
