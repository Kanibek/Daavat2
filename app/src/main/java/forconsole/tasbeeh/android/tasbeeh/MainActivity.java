package forconsole.tasbeeh.android.tasbeeh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.tasbeeh.android.daavat.R;

public class MainActivity extends AppCompatActivity {

    private Button zaati, tasbeeh, hutba, zikr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Башкы бет");

        zaati = findViewById(R.id.zaati);
        tasbeeh = findViewById(R.id.tasbeeh);
        hutba = findViewById(R.id.hutba);
        zikr = findViewById(R.id.zikr);

        zaati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ZaatiActivity.class);
                startActivity(intent);
            }
        });

        tasbeeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TasbeehActivity.class);
                startActivity(intent);
            }
        });

        hutba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HutbaActivity.class);
                startActivity(intent);
            }
        });

        zikr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ZikrActivity.class);
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
        if (item.getItemId() == R.id.share) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=forconsole.tasbeeh.android.tasbeeh");
            startActivity(Intent.createChooser(intent, "Поделиться"));
        }
        return super.onOptionsItemSelected(item);
    }
}

/*--- ApplicationInfo api = getApplicationContext().getApplicationInfo();
            String apkpath = api.sourceDir;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
            startActivity(Intent.createChooser(intent,"ShareVia"));



                     MenuItem item = menu.findItem(R.id.menu_item_share);
        (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();
        */