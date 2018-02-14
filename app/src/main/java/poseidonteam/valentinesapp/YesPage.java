package poseidonteam.valentinesapp;

import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

//import static poseidonteam.valentinesapp.R.id.imageView;

public class YesPage extends AppCompatActivity {

    ViewPager viewPager;
    ImageView imageView;
    private Button homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_page);


        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);




    }

}