package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
    private TextView text;
    private String infoItem;
    private String res1;
    private String res2;
    private String res3;
    private int resNbr;
    private TextView list;
    private String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        text = findViewById(R.id.textTitle);
        list = findViewById(R.id.textList);
    }

    @Override
    protected void onResume(){
        super.onResume();
        resNbr = CameraActivity.getResultNbr();
        res1 = CameraActivity.getRes1();
        res2 = CameraActivity.getRes2();
        res3 = CameraActivity.getRes3();
        this.findMatchingInfo();

        //Alle Ergebnisse ausgeben
        test = res1+ ", "+ res2+ ", "+ res3+ ", Button: "+ resNbr;
        list.setText(test);
    }

    private void findMatchingInfo(){

        //Which button was pressed
        /*switch (resNbr){
            case 1:
                this.setTitle(res1);
            case 2:
                this.setTitle(res2);
            case 3:
                this.setTitle(res3);
        }*/

        if(resNbr == 1){
            this.setTitle(res1);
        }
        if(resNbr == 2){
            this.setTitle(res2);
        }
        if(resNbr == 3){
            this.setTitle(res3);
        }

        /*Fehler: Es wird immer usb a angezeigt
        Idee: ResNmb anzeigen, neu installieren und erneut testen, OnCreate wird nicht jedes mal aufgerufen?*/

    }
    private void setTitle(String title){
        text.setText(title);
    }
}
