package com.example.ban.shop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

public class ScrollingActivity extends AppCompatActivity {


    RecyclerView mrecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mlayoutManager;

    private List<Itemname> mitem ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initial data set
        final ItemList itemList = new ItemList();
        itemList.initData();
        mitem = itemList.getItem();

        mrecyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
        mlayoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mlayoutManager);

        mAdapter = new Adapter(mitem);
        mrecyclerView.setAdapter(mAdapter);



        //initLayout();
        //initData();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*private void initData() {


        recyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);


        List<Itemname> item = new ArrayList<>();


        item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 남녀공용슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60999(BLACK)", R.drawable.employee01));

            //item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 남녀공용슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60999(BLACK)", R.drawable.a));
            //item.add(new Itemname("수페르가 수페르가 남성슈즈 2343 COTVACCHETTAM SEOK S00B1X0202(Green Military)", R.drawable.b));
            //item.add(new Itemname("수페르가 수페르가 여성 키높이 슈즈 2735-COTSTRPW ESOM S00BZY0354(Blue lt Sky)", R.drawable.c));
            //item.add(new Itemname("수페르가 16 S/S 수페르가 여성슈즈 2750 COTMETU S002HG0031(SILVER)", R.drawable.d));
            //item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 여성슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60V08(PINK PALE)", R.drawable.e));
            //item.add(new Itemname("수페르가 수페르가 남성슈즈 2343 COTVACCHETTAM SEOK S00B1X0912(Ecru)", R.drawable.f));
            //item.add(new Itemname("수페르가 수페르가 여성키높이슈즈 2735-COTSTRPW ESOM S00BZY0903(White-Cobalt Blue)", R.drawable.g));
            //item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 여성슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60354(BLUE IT SKY)", R.drawable.h));
            //item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 남녀공용슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60901(WHITE)", R.drawable.i));
            //item.add(new Itemname("수페르가 수페르가 여성키높이슈즈 2735-COTSTRPW ESOM S00BZY0V08(Pink Pale)", R.drawable.j));


        recyclerView.setAdapter(new Adapter(item,R.layout.cardview));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }*/

/*    private void initLayout() {
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
    }*/



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
