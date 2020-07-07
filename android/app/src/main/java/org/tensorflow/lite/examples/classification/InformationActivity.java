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

        //set text and picture Items
        titleItem = findViewById(R.id.textTitle);
        infoItem = findViewById(R.id.textInfo);
        imageItem = findViewById(R.id.pictureOfCable);

        //set information texts
        infoUSB = "Der Universal Serial Bus basiert auf einer seriellen Architektur. Das bedeutet, dass die Daten Bit für Bit, in Serie, von einem Gerät auf das andere übertragen werden. Dies ermöglicht einen Datentransfer mit hoher Geschwindigkeit und einer geringen Fehlerquote. Darüber hinaus spart man sich ein zusätzliches Stromkabel, da die Schnittstelle auch der Energieübertragung dient. Daten werden außerdem in beide Richtungen gesendet und empfangen (I/O-Schnittstelle).";
        infoHDMI = "High Definition Multimedia Interface (kurz HDMI) ist eine seit Mitte 2002 entwickelte Schnittstelle für die digitale Bild- und Ton-Übertragung in der Unterhaltungselektronik. Sie vereinheitlicht existierende Verfahren, kann eine höhere Qualität erzeugen und hat außerdem ein zusammenhängendes Kopierschutzkonzept (DRM).\n\n" +
                "Durch HDMI kann z. B. ein DVD-Spieler, ein Blu-ray-Disc-Spieler oder eine Spielkonsole direkt an einen Fernseher angeschlossen werden, wobei über nur ein Kabel sowohl Bild als auch Ton digital übertragen werden. Besonders bei Heimkinoanlagen (z. B. für Dolby-Digital-Raumklang von DVD) vereinfacht und vereinheitlicht HDMI die Verkabelung des zentralen AV-Receivers mit unterschiedlichen Audio- und Video-Zuspielgeräten ebenso wie mit den Anzeigegeräten wie Smart-TV oder Video-Beamer. Bei früheren Verbindungsarten waren in der Regel je nach Zuspielgerät oder Anzeigegerät ganz unterschiedliche Kabel- und Steckertypen vorhanden bzw. erforderlich, wobei Bild- und Toninformation oft über getrennte Kabel geleitet wurden.";
        infoKlinke = "Der Name ist vermutlich abgeleitet von Klinke im Sinne von „Hebel, der die Weiterbewegung eines Maschinenteils hemmen soll“ und bezieht sich auf das für diesen Stecker typische Einrasten an den Kontaktfedern für das Nutzsignal. Diese Kontaktfedern sind bei den gängigen Bauformen der Buchsen und Kupplungen die einzige mechanische Sicherung der Steckverbindung.\n\n" +
                "Zum Anwendungsbereich von Klinkensteckern, -buchsen und -kupplungen gehören beispielsweise die Weiterleitung von Audiosignalen und Videosignalen oder die Verbindung zu einem Netzteil zur Stromversorgung eines Kleingerätes. Sehr häufig werden Klinkenstecker zum Anschluss eines Kopfhörers verwendet. Gelegentlich dienen sie zur Übertragung digitaler Signale zu Steuerzwecken.";
    }

    //Method to get results (resNbr = Button which was pressed)
    @Override
    protected void onResume(){
        super.onResume();
        resNbr = CameraActivity.getResultNbr();
        res1 = CameraActivity.getRes1();
        res2 = CameraActivity.getRes2();
        res3 = CameraActivity.getRes3();
        this.findMatchingInfo();
    }

    //Method to find out which button was pressed on the previous site
    private void findMatchingInfo(){
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

    //Methods to set pictures and text in the information site
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
