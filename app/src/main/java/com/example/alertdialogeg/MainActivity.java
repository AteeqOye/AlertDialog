package com.example.alertdialogeg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        //for one btn
       /* AlertDialog.Builder alertDialog = new AlertDialog.Builder (MainActivity.this);
        alertDialog.setTitle ("ABC");
        alertDialog.setIcon (R.drawable.ic_baseline_info_24);
        alertDialog.setMessage ("Hy");
        alertDialog.setPositiveButton ("No", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this, "YEssss", Toast.LENGTH_SHORT).show ();
            }
        });
        alertDialog.setNegativeButton ("yes", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this, "Nooo", Toast.LENGTH_SHORT).show ();
            }
        });
        alertDialog.show ();
*/
    }
        // For Two Btns

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder (MainActivity.this);
        
        alertDialog.setTitle ("Exit");
        alertDialog.setIcon (R.drawable.ic_baseline_info_24);
        alertDialog.setMessage ("Are you sure!");
        alertDialog.setNegativeButton ("No", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this, "OK", Toast.LENGTH_SHORT).show ();
            }
        });
        alertDialog.setPositiveButton ("Yes", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed ();
            }
        });
        alertDialog.setNeutralButton ("Cancel", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this, "Canceled!", Toast.LENGTH_SHORT).show ();
            }
        });
        alertDialog.show ();
        

    }
}