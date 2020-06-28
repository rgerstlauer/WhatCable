package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class TutorialActivity extends AppCompatActivity {
    private ImageButton btnOpenOne;
    private ImageButton btnOpenTwo;
    private ExpandableRelativeLayout infoFirstEntry;
    private ExpandableRelativeLayout infoSecondEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        btnOpenOne = (ImageButton)findViewById(R.id.btnOpenOne);
        btnOpenTwo = (ImageButton)findViewById(R.id.btnOpenTwo);
    }

    public void showInformationOne(android.view.View View){
        infoFirstEntry = (ExpandableRelativeLayout)findViewById(R.id.infoFirstEntry);
        infoFirstEntry.toggle();
    }

    public void showInformationTwo(android.view.View View){
        infoSecondEntry = (ExpandableRelativeLayout)findViewById(R.id.infoSecondEntry);
        infoSecondEntry.toggle();
    }
}
