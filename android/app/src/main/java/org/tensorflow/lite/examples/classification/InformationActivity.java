package org.tensorflow.lite.examples.classification;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Size;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
    protected TextView text;
   /* private String infoItem;
    private String res1;
    private String res2;
    private String res3;
    private int resNbr;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        this.findMatchingInfo();
    }

    private void findMatchingInfo(){
        text = findViewById(R.id.textTitle);
        //Which button was pressed

        switch (CameraActivity.getResultNbr()){
            case 1:
                this.setTitle(CameraActivity.getRes1());
            case 2:
                this.setTitle(CameraActivity.getRes2());
            case 3:
                this.setTitle(CameraActivity.getRes3());
        }
        /*if(CameraActivity.getResultNbr() == 1){
            this.setTitle(CameraActivity.getRes1());
        }
        if(CameraActivity.getResultNbr() == 2){
            this.setTitle(CameraActivity.getRes2());
        }
        if(CameraActivity.getResultNbr() == 3){
            this.setTitle(CameraActivity.getRes3());
        }*/
    }
    private void setTitle(String title){
        text.setText(title);
    }
}
