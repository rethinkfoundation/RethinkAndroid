package com.rethink.foundation.presentation.newsfeed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rethink.foundation.R;

/**
 * Created by zac on 16/02/18.
 */

public class NewsFeedFragment extends Fragment implements NewsFeedContract.View {

    private NewsFeedContract.Presenter presenter;

    public static NewsFeedFragment newInstance() {
        return new NewsFeedFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.news_feed_fragment, container, false);

        Button button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadData();
            }
        });

        return root;
    }

    @Override
    public void setPresenter(NewsFeedContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showNoDataConnectivityMessage(String message) {

    }
}
