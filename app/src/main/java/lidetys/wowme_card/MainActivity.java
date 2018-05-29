package lidetys.wowme_card;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnFront;
    TextView txtRole;
    View vRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFront = (Button) findViewById(R.id.front);
        txtRole = (TextView) findViewById(R.id.role);
        vRec = (View) findViewById(R.id.rectangle);

    }

    public void ClickBtnFront(View view){
        txtRole.setText("Residential Mentor");
        vRec.setBackgroundColor(Color.RED);

    }

}










