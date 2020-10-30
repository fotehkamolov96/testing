package com.example.dt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Help extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView mTitleWindow =(TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow =(TextView) findViewById(R.id.massageWindow);
        mTitleWindow.setText("Довталаб");

        //knopkai nazad
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Довталаб");

        StringBuilder stringBuilder = new StringBuilder();

        String someMessage=" Барномаи Довталаб яке аз барномахое илми ва мактаби мебошад ки барои баланд намудани сатхи дониши шумо ва дохил шудан ба Донишгохои Олии Точикистон ердам мерасонад. Довталаб ба мисли Маркази миллии тести кор мекунад ва барнома зиеда аз 10 хазор савол аз фанхои мактаби дар бар гирифтааст. Саволхо бо забони точики ва Руси сохта шудаанд. Шумо метавонед тарики Довталаб дониши худро санченд ва аз натичахои гирифтаи худ метавонед фахмед ки дар кадом фанхо шумо заиф хастед. Довталаб ба шумо бурдборихо ва комебихо дар чодаи илматон хохон хаст. Муваффакият ба шумо!\n" + "\n" +
                " Барнома ба шумо писанд ояд, лутфан дар маркет бохугузори кунед ва ба дустони худ барномаро бифиристед, ё ин ки метавонед ба рохбари баронам бинависед  саволу дархости худро.";

        for (int i=1; i<2; i++ ) {
            stringBuilder.append(someMessage);
        }
        mMessageWindow.setText(stringBuilder.toString());

    }
}
