package com.example.chc_pc.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.chc_pc.myapplication.ui.TopTitle;

import java.util.ArrayList;
import java.util.List;

public class ListTestActivity extends Activity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_test);
        TopTitle fruitlisttitle = (TopTitle) findViewById(R.id.fruitlist_title);
        fruitlisttitle.setTitle("图片列表");
        fruitlisttitle.setLeftClickListener(new TopTitle.LeftClickListener() {
            @Override
            public void onLeftClick() {
                finish();
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });
        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListTestActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit pic000 = new Fruit("pic000",R.drawable.picture000);
        fruitList.add(pic000);
        Fruit pic001 = new Fruit("pic001",R.drawable.picture001);
        fruitList.add(pic001);
        Fruit pic002 = new Fruit("pic002",R.drawable.picture002);
        fruitList.add(pic002);
        Fruit pic003 = new Fruit("pic003",R.drawable.picture003);
        fruitList.add(pic003);
        Fruit pic004 = new Fruit("pic004",R.drawable.picture004);
        fruitList.add(pic004);
        Fruit pic005 = new Fruit("pic005",R.drawable.picture005);
        fruitList.add(pic005);
        Fruit pic006 = new Fruit("pic006",R.drawable.picture006);
        fruitList.add(pic006);
        Fruit pic007 = new Fruit("pic007",R.drawable.picture007);
        fruitList.add(pic007);
        Fruit pic008 = new Fruit("pic008",R.drawable.picture008);
        fruitList.add(pic008);
        Fruit pic009 = new Fruit("pic009",R.drawable.picture009);
        fruitList.add(pic009);
        Fruit pic010 = new Fruit("pic010",R.drawable.picture010);
        fruitList.add(pic010);
        Fruit pic011 = new Fruit("pic011",R.drawable.picture011);
        fruitList.add(pic011);
        Fruit pic012 = new Fruit("pic012",R.drawable.picture012);
        fruitList.add(pic012);
        Fruit pic013 = new Fruit("pic013",R.drawable.picture013);
        fruitList.add(pic013);
        Fruit pic014 = new Fruit("pic014",R.drawable.picture014);
        fruitList.add(pic014);
        Fruit pic015 = new Fruit("pic015",R.drawable.picture015);
        fruitList.add(pic015);
        Fruit pic016 = new Fruit("pic016",R.drawable.picture016);
        fruitList.add(pic016);
        Fruit pic017 = new Fruit("pic017",R.drawable.picture017);
        fruitList.add(pic017);
    }
}
