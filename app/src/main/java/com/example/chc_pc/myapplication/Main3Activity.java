package com.example.chc_pc.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main3);

        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,"clicked",Toast.LENGTH_SHORT);
                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:10086"));
                //startActivity(intent);
                AlertDialog.Builder dialog = new AlertDialog.Builder(Main3Activity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Main3Activity.this,"uihhh",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();

            }
        });
    }
}
