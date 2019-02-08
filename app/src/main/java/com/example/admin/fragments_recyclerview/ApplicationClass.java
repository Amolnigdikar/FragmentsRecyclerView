package com.example.admin.fragments_recyclerview;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people=new ArrayList<Person>();
        people.add(new Person("Chris Morris","9876543210"));
        people.add(new Person("Shei Hope","9123456780"));
        people.add(new Person("Evin Lewis","9234567810"));
        people.add(new Person("Kagiso Rabada","9345678120"));
    }
}
