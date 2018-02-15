package com.rethink.foundation.presentation;

/**
 * Created by zac on 04/12/17.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void showNoDataConnectivityMessage(String message);
}
