package id.co.aminfaruq.mengenalbuah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    //TODO 2 menginisiasi widget recyleview

    @BindView(R.id.myRecyleView)
    RecyclerView myRecyleView;

    //TODO 3 membuat variable array untuk menampung data
    String namaBuah[] = {"alpukat", "apel", "ceri", "durian", "jambuair", "manggis", "stroberry"};

    int gambar_buah[] = {R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian, R.drawable.jambuair, R.drawable.manggis, R.drawable.strawberry};
    int suara_buah[]= {R.raw.alpukat, R.raw.apel, R.raw.ceri, R.raw.durian, R.raw.jambuair, R.raw.manggis, R.raw.strawberry};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //TODO 4 membuat object untuk adaptermagar bisa digunakan dan mengisi parameter yang di butuhkan
        Adapter adapter =new Adapter(MainActivity.this, gambar_buah, suara_buah,namaBuah);

        //TODO 5 mensetting recyleview
        myRecyleView.setHasFixedSize(true);
        myRecyleView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myRecyleView.setAdapter(adapter);

    }
}
