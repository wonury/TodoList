package com.thepencil.journel.ui.login;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.thepencil.journel.util.Event;

import kotlin.Unit;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<Event<Unit>> _navigateToJoinEvent = new MutableLiveData<>();
    public LiveData<Event<Unit>> navigateToJoinEvent = _navigateToJoinEvent;

    public void navigateToJoin() {
        _navigateToJoinEvent.setValue(new Event<>(Unit.INSTANCE));
    }
}
