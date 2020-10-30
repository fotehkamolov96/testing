package com.example.dt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {

    ListView listView;
        String mTitle[] = {"Забон", "English", "Русский", "Физика", "Химия", "Биология","Таърих","Хукук","География","Информатика" };
            String mDescription[] = {"Саволхо ва Чавобхо", "Questions and Answers", "«Вопросы и ответы»","Саволхо ва Чавобхо", "Саволхо ва Чавобхо", "Саволхо ва Чавобхо", "Саволхо ва Чавобхо", "Саволхо ва Чавобхо","Саволхо ва Чавобхо","Саволхо ва Чавобхо", "Саволхо ва Чавобхо"};
                int images[] = {R.drawable.zabon, R.drawable.english, R.drawable.russian, R.drawable.fizika, R.drawable.ximiya, R.drawable.biologiya,  R.drawable.tarikh, R.drawable.hukuk,R.drawable.gegrafiya,R.drawable.informatika };


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //knopkai nazad
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        listView = findViewById(R.id.listView);
            MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), Zabon.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent); }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), English.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), Russian.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), Fizika.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), Ximiya.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), Biologiya.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), Tarikh.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    // also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), Hukuk.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    // also put your position
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), Geogi.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    // also put your position
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), Informatica.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    // also put your position
                    intent.putExtra("position", ""+9);
                    startActivity(intent);
                }




            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Main2 context, String[] title, String[] description, int[] imgs) {
            super(context, R.layout.row, R.id.textView1, title);
            this.context = context;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }





        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        //this method vill inflate our menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main2menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){


        int id=item.getItemId();
        if (id==R.id.help)
        { Intent intent = new Intent(this, Help.class);
            startActivity(intent);
            return true; }
        else

        if (id==R.id.admin)
        { Intent intent = new Intent(this, Contact.class);
            startActivity(intent);
            return true; }

        return super.onOptionsItemSelected(item);
    }
}
