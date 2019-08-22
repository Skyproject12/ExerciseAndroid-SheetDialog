package com.example.sheetdialog;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetDialog bottomSheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomSheetDialog= new BottomSheetDialog(MainActivity.this);
        View view= getLayoutInflater().inflate(R.layout.dialog_layout,null);
        bottomSheetDialog.setContentView(view);
        Button button= findViewById(R.id.button_show);
        ConstraintLayout shareConstraint= bottomSheetDialog.findViewById(R.id.shareConstraint);
        View linkContraint= bottomSheetDialog.findViewById(R.id.linkConstraint);
        View editConstraint= bottomSheetDialog.findViewById(R.id.editConstraint);
        View hapusConstraint= bottomSheetDialog.findViewById(R.id.hapusConstraint);
        View keluarConstraint= bottomSheetDialog.findViewById(R.id.keluarConstraint);
        button.setOnClickListener(this);
        shareConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        switch(id){
            case R.id.button_show:
                bottomSheetDialog.show();
                break;
            case R.id.shareConstraint:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linkConstraint:
                Toast.makeText(this, "link", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
