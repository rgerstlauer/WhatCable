package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class TutorialActivity extends AppCompatActivity {
    //Variables for the buttons
    private ImageButton btnApp;
    private ImageButton btnProbability;
    private ImageButton btnBackground;
    private ImageButton btnPerspective;
    private ImageButton btnLight;
    private ImageButton btnCable;
    private ImageButton btnConfidence;
    private ImageButton btnFrame;
    private ImageButton btnCrop;
    private ImageButton btnView;
    private ImageButton btnRotation;
    private ImageButton btnInference;
    private ImageButton btnThread;
    private ImageButton btnModel;
    private ImageButton btnDevice;

    //Variables for the Expandable Layout
    private ExpandableRelativeLayout infoApp;
    private ExpandableRelativeLayout infoProbability;
    private ExpandableRelativeLayout infoBackground;
    private ExpandableRelativeLayout infoPerspective;
    private ExpandableRelativeLayout infoLight;
    private ExpandableRelativeLayout infoCable;
    private ExpandableRelativeLayout infoConfidence;
    private ExpandableRelativeLayout infoFrame;
    private ExpandableRelativeLayout infoCrop;
    private ExpandableRelativeLayout infoView;
    private ExpandableRelativeLayout infoRotation;
    private ExpandableRelativeLayout infoInference;
    private ExpandableRelativeLayout infoThread;
    private ExpandableRelativeLayout infoModel;
    private ExpandableRelativeLayout infoDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        //initialize the Buttons
        btnApp = (ImageButton)findViewById(R.id.btnApp);
        btnProbability = (ImageButton)findViewById(R.id.btnProbability);
        btnBackground = (ImageButton)findViewById(R.id.btnBackground);
        btnPerspective = (ImageButton)findViewById(R.id.btnPerspective);
        btnLight = (ImageButton)findViewById(R.id.btnLight);
        btnCable = (ImageButton)findViewById(R.id.btnCabel);
        btnConfidence = (ImageButton)findViewById(R.id.btnConfidence);
        btnFrame = (ImageButton)findViewById(R.id.btnFrame);
        btnCrop = (ImageButton)findViewById(R.id.btnCrop);
        btnView = (ImageButton)findViewById(R.id.btnView);
        btnRotation = (ImageButton)findViewById(R.id.btnRotation);
        btnInference = (ImageButton)findViewById(R.id.btnInference);
        btnThread = (ImageButton)findViewById(R.id.btnThreads);
        btnModel = (ImageButton)findViewById(R.id.btnModel);
        btnDevice = (ImageButton)findViewById(R.id.btnDevice);
    }

    //Methods for expand the information
    public void showApp(android.view.View View){
        infoApp = (ExpandableRelativeLayout)findViewById(R.id.infoApp);
        infoApp.toggle();
    }

    public void showProbability(android.view.View View){
        infoProbability = (ExpandableRelativeLayout)findViewById(R.id.infoProbability);
        infoProbability.toggle();
    }

    public void showBackground(android.view.View View){
        infoBackground = (ExpandableRelativeLayout)findViewById(R.id.infoBackground);
        infoBackground.toggle();
    }

    public void showPerspective(android.view.View View){
        infoPerspective = (ExpandableRelativeLayout)findViewById(R.id.infoPerspective);
        infoPerspective.toggle();
    }

    public void showLight(android.view.View View){
        infoLight = (ExpandableRelativeLayout)findViewById(R.id.infoLight);
        infoLight.toggle();
    }

    public void showCabel(android.view.View View){
        infoCable = (ExpandableRelativeLayout)findViewById(R.id.infoCabel);
        infoCable.toggle();
    }

    public void showConfidence(android.view.View View){
        infoConfidence = (ExpandableRelativeLayout)findViewById(R.id.infoConfidence);
        infoConfidence.toggle();
    }

    public void showFrame(android.view.View View){
        infoFrame = (ExpandableRelativeLayout)findViewById(R.id.infoFrame);
        infoFrame.toggle();
    }

    public void showCrop(android.view.View View){
        infoCrop = (ExpandableRelativeLayout)findViewById(R.id.infoCrop);
        infoCrop.toggle();
    }

    public void showView(android.view.View View){
        infoView = (ExpandableRelativeLayout)findViewById(R.id.infoView);
        infoView.toggle();
    }

    public void showRotation(android.view.View View){
        infoRotation = (ExpandableRelativeLayout)findViewById(R.id.infoRotation);
        infoRotation.toggle();
    }

    public void showInference(android.view.View View){
        infoInference = (ExpandableRelativeLayout)findViewById(R.id.infoInference);
        infoInference.toggle();
    }

    public void showThreads(android.view.View View){
        infoThread = (ExpandableRelativeLayout)findViewById(R.id.infoThreads);
        infoThread.toggle();
    }

    public void showModel(android.view.View View){
        infoModel = (ExpandableRelativeLayout)findViewById(R.id.infoModel);
        infoModel.toggle();
    }

    public void showDevice(android.view.View View){
        infoDevice = (ExpandableRelativeLayout)findViewById(R.id.infoDevice);
        infoDevice.toggle();
    }
}
