package forconsole.tasbeeh.android.tasbeeh;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tasbeeh.android.daavat.R;
import com.google.android.material.tabs.TabLayout;

public class TasbeehActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private Button countBtn;
    private Button resetBtn;
    public int result,result2,result3,result4,result5,result6,result7,result8;
    public int result9, result10, result11, result12, result13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbeeh);

        toolbar = findViewById(R.id.toolbartext);
        toolbar.setTitle("Зикирлер");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        // Count started here
    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new Zikir1Fragment(),"Субхаан Аллах");
        pagerAdapter.addFragment(new Zikir2Fragment(),"Алхамдулиллах");
        pagerAdapter.addFragment(new Zikir3Fragment(),"Аллаху Акбар");
        pagerAdapter.addFragment(new Zikir4Fragment(),"Лаа Илааха Иллаллох");
        pagerAdapter.addFragment(new Zikir5Fragment(),"Астагфируллох");
        pagerAdapter.addFragment(new Zikir6Fragment(),"Лаа хавла ва лаа куввата илли биллаах");
        pagerAdapter.addFragment(new Zikir7Fragment(),"Лаа илааха илла анта субханака инни кунту миназзоолимиин");
        pagerAdapter.addFragment(new SalavatFragment(),"Аллохумма солли ьала Мухаммадив ва ьала али Мухаммад");
        pagerAdapter.addFragment(new Zikir8Fragment(),"Аллоохумма иннаа нажалука фи нухурихим ва наузу бика миң шурурихим");
        pagerAdapter.addFragment(new Zikir9Fragment(),"Аллоохуммастур ьавротинаа ва миң ровьатина");
        pagerAdapter.addFragment(new Zikir10Fragment(),"Аллоохуммак фиинаахум бимаа ши-та");
        pagerAdapter.addFragment(new Zikir11Fragment(),"Аллохумма иннии аьузу бика миң жахдил балаа ва даракишшикоои ва суу-ил кодоои ва шамаататил ьадааи");
        pagerAdapter.addFragment(new Zikir12Fragment(),"Хасбуналлоху ва ниьмал вакиил");
        viewPager.setAdapter(pagerAdapter);
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

        if (item.getItemId() == android.R.id.home){
            TasbeehActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    // counter started here 1 //////////////////////////////////////////////////////////
    public void Plus(View view) {
        TextView countText = findViewById(R.id.countText);
        result++;
        countText.setText(Integer.toString(result));
    }

    public void Clear(View view) {
        TextView countText = findViewById(R.id.countText);
        result = 0;
        countText.setText(Integer.toString(result));
    }
    // counter started here 2
    public void Plus2(View view) {
        TextView countText = findViewById(R.id.countText2);
        result2++;
        countText.setText(Integer.toString(result2));
    }

    public void Clear2(View view) {
        TextView countText = findViewById(R.id.countText2);
        result2 = 0;
        countText.setText(Integer.toString(result2));
    }

    // counter started here 3
    public void Plus3(View view) {
        TextView countText = findViewById(R.id.countText3);
        result3++;
        countText.setText(Integer.toString(result3));
    }

    public void Clear3(View view) {
        TextView countText = findViewById(R.id.countText3);
        result3 = 0;
        countText.setText(Integer.toString(result3));
    }

    // counter started here 4
    public void Plus4(View view) {
        TextView countText = findViewById(R.id.countText4);
        result4++;
        countText.setText(Integer.toString(result4));
    }

    public void Clear4(View view) {
        TextView countText = findViewById(R.id.countText4);
        result4 = 0;
        countText.setText(Integer.toString(result4));
    }

    // counter started here 5
    public void Plus5(View view) {
        TextView countText = findViewById(R.id.countText5);
        result5++;
        countText.setText(Integer.toString(result5));
    }

    public void Clear5(View view) {
        TextView countText = findViewById(R.id.countText5);
        result5 = 0;
        countText.setText(Integer.toString(result5));
    }

    // counter started here 6
    public void Plus6(View view) {
        TextView countText = findViewById(R.id.countText6);
        result6++;
        countText.setText(Integer.toString(result6));
    }

    public void Clear6(View view) {
        TextView countText = findViewById(R.id.countText6);
        result6 = 0;
        countText.setText(Integer.toString(result6));
    }

    // counter started here 7
    public void Plus7(View view) {
        TextView countText = findViewById(R.id.countText7);
        result7++;
        countText.setText(Integer.toString(result7));
    }

    public void Clear7(View view) {
        TextView countText = findViewById(R.id.countText7);
        result7 = 0;
        countText.setText(Integer.toString(result7));
    }

    // counter started here 8
    public void Plus8(View view) {
        TextView countText = findViewById(R.id.countText8);
        result8++;
        countText.setText(Integer.toString(result8));
    }

    public void Clear8(View view) {
        TextView countText = findViewById(R.id.countText8);
        result8 = 0;
        countText.setText(Integer.toString(result8));
    }

    // counter started here 9
    public void Plus9(View view) {
        TextView countText = findViewById(R.id.countText9);
        result9++;
        countText.setText(Integer.toString(result9));
    }

    public void Clear9(View view) {
        TextView countText = findViewById(R.id.countText9);
        result9 = 0;
        countText.setText(Integer.toString(result9));
    }

    // counter started here 10
    public void Plus10(View view) {
        TextView countText = findViewById(R.id.countText10);
        result10++;
        countText.setText(Integer.toString(result10));
    }

    public void Clear10(View view) {
        TextView countText = findViewById(R.id.countText10);
        result10 = 0;
        countText.setText(Integer.toString(result10));
    }

    // counter started here 11
    public void Plus11(View view) {
        TextView countText = findViewById(R.id.countText11);
        result11++;
        countText.setText(Integer.toString(result11));
    }

    public void Clear11(View view) {
        TextView countText = findViewById(R.id.countText11);
        result11 = 0;
        countText.setText(Integer.toString(result11));
    }

    // counter started here 12
    public void Plus12(View view) {
        TextView countText = findViewById(R.id.countText12);
        result12++;
        countText.setText(Integer.toString(result12));
    }

    public void Clear12(View view) {
        TextView countText = findViewById(R.id.countText12);
        result12 = 0;
        countText.setText(Integer.toString(result12));
    }

    // counter started here 13
    public void Plus13(View view) {
        TextView countText = findViewById(R.id.countText13);
        result13++;
        countText.setText(Integer.toString(result13));
    }

    public void Clear13(View view) {
        TextView countText = findViewById(R.id.countText13);
        result13 = 0;
        countText.setText(Integer.toString(result13));
    }
}