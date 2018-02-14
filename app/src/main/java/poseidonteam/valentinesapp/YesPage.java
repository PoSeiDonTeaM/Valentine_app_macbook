package poseidonteam.valentinesapp;

import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.ImageView;

import static poseidonteam.valentinesapp.R.id.imageView;

public class YesPage extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_page);

        viewPager = (ViewPager) findViewById(R.id.imageView);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
    }
}