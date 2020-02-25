package com.virgool.viewmodel;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;


import com.virgool.model.User;


public class UserViewModel extends BaseObservable {
    private String name;
    private String phone;

    private Context context;

    public UserViewModel(User user) {
        this.name = name;
        this.phone = phone;
    }

    public UserViewModel(Context context) {
        this.context = context;
    }
    @Bindable
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
