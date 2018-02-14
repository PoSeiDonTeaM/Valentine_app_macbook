package poseidonteam.valentinesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Step2 extends AppCompatActivity {

    private Button button, button2;
    private ImageButton button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.imageButton4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYesPage();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNoPage();
            }
        });


    }

    public void openYesPage() {
        Intent intent = new Intent(this, YesPage.class);
        startActivity(intent);

    }

    public void openNoPage() {
        Intent intent = new Intent(this, NoPage.class);
        startActivity(intent);

    }

    public void openHomePage(View view){
        Intent intent = new Intent(this,Front_Page.class);
    }
}