package forconsole.tasbeeh.android.tasbeeh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.tasbeeh.android.daavat.R;

public class ZikrActivity extends AppCompatActivity {

    LinearLayout dua_kiluu,dua_namaz,dua_tanki,dua_kariz,dua_every_day,besh_dua,tasbehter,prog_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zikr);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Зикир жана дубалар");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dua_kiluu = findViewById(R.id.dua_kiluu);
        dua_namaz = findViewById(R.id.dua_namaz);
        dua_tanki = findViewById(R.id.dua_tanki);
        dua_kariz = findViewById(R.id.dua_kariz);
        dua_every_day = findViewById(R.id.dua_every_day);
        besh_dua = findViewById(R.id.besh_dua);
        tasbehter = findViewById(R.id.tasbehter);
        prog_app = findViewById(R.id.prog_app);

        dua_kiluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,Dua_kabil_boluu_Activity.class);
                startActivity(intent);
            }
        });

        dua_namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,NamazActivity.class);
                startActivity(intent);
            }
        });
        dua_tanki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,Tanki_dua_Activity.class);
                startActivity(intent);
            }
        });

        dua_kariz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,KarizActivity.class);
                startActivity(intent);
            }
        });

        dua_every_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,Every_day_Activity.class);
                startActivity(intent);
            }
        });

        dua_kariz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,KarizActivity.class);
                startActivity(intent);
            }
        });

        besh_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,DuaActivity.class);
                startActivity(intent);
            }
        });

        tasbehter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,TasbehterActivity.class);
                startActivity(intent);
            }
        });


        prog_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZikrActivity.this,InfoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,"http://play.google.com/store/apps/details?id=forconsole.tasbeeh.android.tasbeeh");
            startActivity(Intent.createChooser(intent,"Поделиться"));
        }

        ///////////////////////////////////////////////////////////////////////////////////////
        if (item.getItemId() == android.R.id.home){
            ZikrActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}