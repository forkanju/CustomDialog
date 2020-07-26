package com.forkan.customdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mOpenDialog;
    Dialog mCustomDialog;
    private TextView mCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomDialog = new Dialog(this);

        mOpenDialog = findViewById(R.id.button_id);
        mOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();

            }
        });
    }

    private void showDialog() {
        mCustomDialog.setContentView(R.layout.custom_dialog_popup);
        mCancel = (TextView) mCustomDialog.findViewById(R.id.cancel_id);
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCustomDialog.dismiss();
            }
        });

        mCustomDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mCustomDialog.show();

    }
}