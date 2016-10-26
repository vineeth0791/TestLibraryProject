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

        TestLibrary testLibrary=new TestLibrary(MainActivity.this);
        testLibrary.displaySurvey("pavani1 tryingh sFirst sample after uploading to git","THis is working");

    }
}
