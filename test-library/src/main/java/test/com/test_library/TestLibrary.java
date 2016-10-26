package test.com.test_library;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ibetter on 13-09-16.
 */
public class TestLibrary {

    private Context context;
    private Activity activity;

    public TestLibrary(Activity activity)
    {
        this.activity=activity;
        context=activity.getApplicationContext();


    }

    public void displaySurvey(String titleMSG,String title)
    {


        LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(test.com.test_library.R.layout.test_display_survey, null);


        AlertDialog.Builder alertDialog=new AlertDialog.Builder(activity);
        alertDialog.setView(view);


        TextView titleTextView = (TextView)view .findViewById(test.com.test_library.R.id.title);
        titleTextView.setText(title);

        TextView msgTextView = (TextView)view .findViewById(test.com.test_library.R.id.msg);
        msgTextView.setText(titleMSG);

        alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

        Dialog dialog= alertDialog.create();
        dialog.show();
    }
}
