package com.rethink.foundation.utils.daggercomponents;

import com.rethink.foundation.data.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zac on 12/02/18.
 */

@Singleton
@Component(modules = {DaggerModule.class})
public interface DaggerComponent {

    /**
     * Creates singleton object using dagger2
     * @return singleton object of DataHelper(Model) class
     */
    DataManager provideDataHelper();

}
