package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class TutorialActivity extends AppCompatActivity {
    private Button btnOpenOne;
    private ExpandableRelativeLayout infoFirstEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        btnOpenOne = (Button)findViewById(R.id.btnOpenOne);
    }

    public void showInformationOne(View view){
        infoFirstEntry = (ExpandableRelativeLayout)findViewById(R.id.infoFirstEntry);
        infoFirstEntry.toggle();
    }
}
