package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6t2FDtSYzKhP1DXXWz4Ny694W1s3A9wMNGzfvhAc")
                .clientKey("Vb1bz1EnJ5Kq8Vt9Icg1M2UY8dzRapQgXxrc1etK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
