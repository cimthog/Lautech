package com.divineventures.lautech;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterViewFlipper;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView txtWelcome;
    Toolbar toolbar;
    private AdapterViewFlipper adapterViewFlipper;
    private static final int[] IMAGES = {R.drawable.underg_gate, R.drawable.senate_building, R.drawable.library,
                                        R.drawable.download, R.drawable.mko, R.drawable.college,R.drawable.lh};
    private static String[] imageInfo = {"UnderG Gate", "Senate Building", "Olusegun Oke Library", "LAUTECH Main Gate","MKO Lecture Hall",
            "College","Lecture Hall"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = (ListView)findViewById(R.id.explore);
        adapterViewFlipper = (AdapterViewFlipper)findViewById(R.id.idAdapterViewFlipper);

        //sets flipperAdapter to populate adapterViewFlipper
        FlipperAdapter adapter = new FlipperAdapter(this, imageInfo, IMAGES);
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setAutoStart(true);

        //makes toolbar able to be used as an action bar
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        //sets a custom font for textview
        txtWelcome = (TextView) findViewById(R.id.txt_welcome);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Roboto-Bold.ttf");
        txtWelcome.setTypeface(typeface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_explore) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
            PopupMenu popupMenu = new PopupMenu(contextThemeWrapper,listView);
            popupMenu.getMenuInflater().inflate(R.menu.explore_option, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    int option = menuItem.getItemId();
                    switch (option){
                        case R.id.faculty :
                            startActivity(new Intent(getApplicationContext(),FacultyActivity.class));
                            break;
                            default:
                                Toast.makeText(getApplicationContext(),"You clicked me",Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
            });
            popupMenu.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
