package test.com.testlibraryproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import test.com.test_library.TestLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context=MainActivity.this;
  //add comment another comment has been added
        TestLibrary testLibrary=new TestLibrary(MainActivity.this);
        testLibrary.displaySurvey("First testig vineeth sample after uploading to git","THis is working");

    }
}
