package com.divineventures.lautech;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {


    Toolbar toolbar;
    private int IMAGES[] = {R.drawable.fet, R.drawable.passa, R.drawable.faas, R.drawable.famassa, R.drawable.bmed,
            R.drawable.clinical, R.drawable.fessa};
    private String faculty[];
    private ListView faculty_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        faculty_list = (ListView) findViewById(R.id.dept_list);
        //Context context = getApplicationContext();
        faculty = getResources().getStringArray(R.array.faculty);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), faculty, IMAGES);
        faculty_list.setAdapter(customAdapter);

        faculty_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu = new PopupMenu(contextThemeWrapper,faculty_list);
                        popupMenu.getMenuInflater().inflate(R.menu.fet_menu, popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FET", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu.show();
                        break;
                    case 1:
                        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu2 = new PopupMenu(contextThemeWrapper2,faculty_list);
                        popupMenu2.getMenuInflater().inflate(R.menu.fpas_menu, popupMenu2.getMenu());
                        popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FPAS", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu2.show();
                        break;
                    case 2:
                        ContextThemeWrapper contextThemeWrapper3 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu3 = new PopupMenu(contextThemeWrapper3, faculty_list);
                        popupMenu3.getMenuInflater().inflate(R.menu.faas_menu, popupMenu3.getMenu());
                        popupMenu3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FAAS", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu3.show();
                        break;
                    case 3:
                        ContextThemeWrapper contextThemeWrapper4 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu4 = new PopupMenu(contextThemeWrapper4, faculty_list);
                        popupMenu4.getMenuInflater().inflate(R.menu.famassa_menu, popupMenu4.getMenu());
                        popupMenu4.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FAMASSA", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu4.show();
                        break;
                    case 4:
                        ContextThemeWrapper contextThemeWrapper5 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu5 = new PopupMenu(contextThemeWrapper5, faculty_list);
                        popupMenu5.getMenuInflater().inflate(R.menu.fabamsa_menu, popupMenu5.getMenu());
                        popupMenu5.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FABAMSA", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu5.show();
                        break;
                    case 5:
                        ContextThemeWrapper contextThemeWrapper6 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu7 = new PopupMenu(contextThemeWrapper6, faculty_list);
                        popupMenu7.getMenuInflater().inflate(R.menu.facassa_menu, popupMenu7.getMenu());
                        popupMenu7.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FET", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu7.show();
                        ;
                        break;
                    case 6:
                        ContextThemeWrapper contextThemeWrapper7 = new ContextThemeWrapper(getBaseContext(),R.style.PopupMenuOverlapAnchor);
                        PopupMenu popupMenu6 = new PopupMenu(contextThemeWrapper7, faculty_list);
                        popupMenu6.getMenuInflater().inflate(R.menu.fessa_menu, popupMenu6.getMenu());
                        popupMenu6.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                Toast.makeText(getApplicationContext(), "You clicked FET", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                        popupMenu6.show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_theme) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
