package org.iesch.alberto.a2_peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    ImageView movieImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageView =  (ImageView) findViewById(R.id.movie_image);

        Button buttonGravity = (Button) findViewById(R.id.gravity_button);
        Button buttonJumanji = (Button) findViewById(R.id.jumanji_button);
        Button buttonLion = (Button) findViewById(R.id.the_lion_king_button);
        Button buttonStarWars = (Button) findViewById(R.id.star_wars_button);
        Button buttonOrigen = (Button) findViewById(R.id.inception_button);
        Button buttonToyStory = (Button) findViewById(R.id.toys_story_button);

        buttonGravity.setOnClickListener(this);
        buttonJumanji.setOnClickListener(this);
        buttonLion.setOnClickListener(this);
        buttonStarWars.setOnClickListener(this);
        buttonOrigen.setOnClickListener(this);
        buttonToyStory.setOnClickListener(this);

    }

    @Override
    public void onClick(View buttonView) {
        int buttonId = buttonView.getId();
        int imageId;

        switch (buttonId){
            case R.id.gravity_button:
                imageId =  R.drawable.gravity;
                break;
            case R.id.jumanji_button:
                imageId = R.drawable.jumanju;
                break;
            case R.id.the_lion_king_button:
                imageId = R.drawable.reyleon;
                break;
            case R.id.star_wars_button:
                imageId =  R.drawable.starwars;
                break;
            case R.id.inception_button:
                imageId = R.drawable.origen;
                break;
            case R.id.toys_story_button:
                imageId = R.drawable.toystory;
                break;
            default:
                imageId = 0;
        }

        if (imageId != 0){
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this,imageId));
        }
        
    }
}