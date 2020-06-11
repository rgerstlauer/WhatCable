package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
    private TextView titleItem;
    private TextView infoItem;
    private ImageView imageItem;

    private String res1;
    private String res2;
    private String res3;
    private int resNbr;

    private String infoUSB;
    private String infoHDMI;
    private String infoKlinke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        titleItem = findViewById(R.id.textTitle);
        infoItem = findViewById(R.id.textInfo);
        imageItem = findViewById(R.id.pictureOfCable);
        infoUSB = "Hier wird ein längerer Text erscheinen, der Informationen über das USB Typ A Kabel enthält. Dies ist Momentan jedoch nur ein Test ob alles richtig angezeit wird. Außerdem kann man hier sehen, ob es schön aussieht oder nicht. Total sinnloser Text also.";
        infoHDMI = "Hier wird ein längerer Text erscheinen, der Informationen über das HDMI Kabel enthält. Dies ist Momentan jedoch nur ein Test ob alles richtig angezeit wird. Außerdem kann man hier sehen, ob es schön aussieht oder nicht. Total sinnloser Text also.";
        infoKlinke = "Hier wird ein längerer Text erscheinen, der Informationen über das Klinkenkabel enthält. Dies ist Momentan jedoch nur ein Test ob alles richtig angezeit wird. Außerdem kann man hier sehen, ob es schön aussieht oder nicht. Total sinnloser Text also.";
    }

    @Override
    protected void onResume(){
        super.onResume();
        resNbr = CameraActivity.getResultNbr();
        res1 = CameraActivity.getRes1();
        res2 = CameraActivity.getRes2();
        res3 = CameraActivity.getRes3();
        this.findMatchingInfo();
    }

    private void findMatchingInfo(){
        //Which button was pressed
        if(resNbr == 1){
            this.setTitle(res1);
            this.setInfo(res1);
            this.setImage(res1);
        }
        if(resNbr == 2){
            this.setTitle(res2);
            this.setInfo(res2);
            this.setImage(res2);
        }
        if(resNbr == 3){
            this.setTitle(res3);
            this.setInfo(res3);
            this.setImage(res3);
        }
    }
    private void setTitle(String result){
        if(result.equals("usb_a")) titleItem.setText("USB Typ A Kabel");
        if(result.equals("klinkenkabel")) titleItem.setText("Klinkenkabel");
        if(result.equals("hdmi")) titleItem.setText("HDMI Kabel");
    }

    private void setInfo(String result) {
        if(result.equals("usb_a")) infoItem.setText(this.infoUSB);
        if(result.equals("klinkenkabel")) infoItem.setText(this.infoKlinke);
        if(result.equals("hdmi")) infoItem.setText(this.infoHDMI);
    }

    private void setImage(String result){
        if(result.equals("usb_a")) imageItem.setImageResource(R.drawable.usb_a_kabel);
        if(result.equals("klinkenkabel")) imageItem.setImageResource(R.drawable.klinkenkabel);
        if(result.equals("hdmi")) imageItem.setImageResource(R.drawable.hdmi_kabel);
    }
}
