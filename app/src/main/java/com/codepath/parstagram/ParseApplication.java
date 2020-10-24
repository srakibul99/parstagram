package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WWlZJP85XElrQhctouS856LSuUJkOXoLUzNxL3rG")
                .clientKey("3ygwvNlTyqdUBlNWHZ0Vj9tWyNCA4WF0emvjgeJk")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
