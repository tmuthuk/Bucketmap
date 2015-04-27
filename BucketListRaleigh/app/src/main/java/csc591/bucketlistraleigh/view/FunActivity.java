package csc591.bucketlistraleigh.view;

import android.app.Activity;
import android.os.Bundle;

import csc591.bucketlistraleigh.fragments.FunFragment;
import csc591.bucketlistraleigh.R;

public class FunActivity extends Activity implements FunFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);


        //Load an image with all the food places highlighted
        //Bitmap region decoder that shows all the places with food.

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new FunFragment()).commit();


        }


    }
}