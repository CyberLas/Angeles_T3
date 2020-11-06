package com.example.angeles_t3.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import android.widget.RatingBar;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.ListItemClickListener {

    private RatingBar ratingBar;
    private static final int NUM_LIST_ITEMS = 10;
    private RecyclerAdapter mAdapter;
    private RecyclerView mNumberList;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumberList = (RecyclerView) findViewById(R.id.rv_numbers);
        mNumberList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mNumberList.setLayoutManager(linearLayoutManager);
        mNumberList.setHasFixedSize(true);
        mAdapter = new RecyclerAdapter(NUM_LIST_ITEMS,this);
        mNumberList.setAdapter(mAdapter);

    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        ImageView cargarImagen;
        cargarImagen = findViewById(R.id.MiImagen);
        Picasso.get()
                .load("https://pm1.narvii.com/6359/e81b5d2e87ca7a838b0dc0a0367fef1b1fb0fc1f_hq.jpg")
                .error(R.mipmap.ic_launcher_round)
                .into(cargarImagen);
        if(mToast!= null){
            mToast.cancel();
        }
        String toastMessage = "Item #" + clickedItemIndex + " clicked";
        mToast = Toast.makeText(this,toastMessage,Toast.LENGTH_LONG);
        mToast.show();
    }
}
