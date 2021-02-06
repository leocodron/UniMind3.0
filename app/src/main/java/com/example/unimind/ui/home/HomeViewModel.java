package com.example.unimind.ui.home;

import android.view.Gravity;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private TextView homeTitle;

    public HomeViewModel() {
//        homeTitle = new TextView();
//
    }

    public TextView getText() {
        return homeTitle;
    }
}