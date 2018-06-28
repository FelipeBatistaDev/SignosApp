package signos.cursoandroid.com.signos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
private ListView lista;
    String [] zodiaco ={
            "Áries",
            "Leão",
            "Sagitário",
            "Touro",
            "Virgem",
            "Capricórnio",
            "Gêmeos",
            "Libra",
            "Aquário",
            "Câncer",
            "Escorpião",
            "Peixes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                zodiaco
        );
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int valorClicado = position;

                switch (valorClicado){
                    case 0:
                        Intent intentAries = new Intent(MainActivity.this, AriesActivity.class);
                        startActivity(intentAries);
                        break;
                    case 1:
                        Intent intentLeao = new Intent(MainActivity.this, LeaoActivity.class);
                        startActivity(intentLeao);
                        break;
                    case 2:

                    default:

                        break;
                }



            }
        });


    }
}