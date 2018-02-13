package poseidonteam.valentinesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Front_Page extends AppCompatActivity {

    private ImageButton heartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front__page);

        heartButton = (ImageButton) findViewById(R.id.heartButton);

        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondStep();
            }
        });
    }

    public void openSecondStep() {
        Intent intent = new Intent(this, Step2.class);
        startActivity(intent);
    }






}
