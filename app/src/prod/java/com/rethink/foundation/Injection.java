package com.rethink.foundation;


import android.content.Context;
import android.support.annotation.NonNull;

import com.rethink.foundation.data.DataManager;
import com.rethink.foundation.data.local.LocalDataManager;
import com.rethink.foundation.data.remote.RemoteDataManager;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by zac on 12/02/18.
 */

public class Injection {


    public static DataManager provideDataManager(@NonNull Context context) {
        checkNotNull(context);

        return DataManager.getInstance(RemoteDataManager.getInstance(context), LocalDataManager.getInstance(), context);
    }
}
