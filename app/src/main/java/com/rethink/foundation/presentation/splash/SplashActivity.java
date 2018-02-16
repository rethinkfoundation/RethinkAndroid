package com.rethink.foundation.presentation.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rethink.foundation.R;
import com.rethink.foundation.presentation.profile.ProfileActivity;
import com.rethink.foundation.presentation.referral.ReferralActivity;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    private SplashContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* SplashPresenter splashPresenter = new SplashPresenter(
                Injection.provideDataManager(getApplicationContext()), this);
*/
        presenter.checkFirstTime();
    }


    @Override
    public void setPresenter(SplashContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showNoDataConnectivityMessage(String message) {

    }

    @Override
    public void loadReferral() {
        Intent i = new Intent(SplashActivity.this, ReferralActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void loadProfile() {
        Intent i = new Intent(SplashActivity.this, ProfileActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void loadNews() {

    }
}
