package forconsole.tasbeeh.android.tasbeeh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.tasbeeh.android.daavat.R;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Тиркеме жонундо");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Intent shareInt = new Intent(Intent.ACTION_SEND);
                shareInt.setType("text/plain");
                shareInt.putExtra(android.content.Intent.EXTRA_TEXT,"http://play.google.com/store/apps/details?id=forconsole.tasbeeh.android.tasbeeh");
                startActivity(Intent.createChooser(shareInt,"Поделиться"));
                break;
        }

        if (item.getItemId() == android.R.id.home){
            InfoActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

