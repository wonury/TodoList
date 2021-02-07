package com.thepencil.journel.ui.join;

import android.net.Uri;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.thepencil.journel.util.Event;

import kotlin.Unit;
import timber.log.Timber;

public class JoinViewModel extends ViewModel {
    private MutableLiveData<Event<Unit>> _navigateToGallery = new MutableLiveData<>();
    public LiveData<Event<Unit>> navigateToGallery = _navigateToGallery;

    private MutableLiveData<Uri> _profileImageUri = new MutableLiveData<>();
    public LiveData<Uri> profileImageUri = _profileImageUri;

    public void requestPicker() {
        _navigateToGallery.setValue(new Event<>(Unit.INSTANCE));
    }

    public void requestJoin() {
    }

    public void setProfileImageUri(Uri uri) {
        _profileImageUri.setValue(uri);
    }
}
