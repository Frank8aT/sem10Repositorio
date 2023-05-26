package xyz.devien.sem10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView ListContacto;
    List<anime> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListContacto=findViewById(R.id.ListViewContacto);
        CustomAdapter adapter = new CustomAdapter(this, GetData());
        ListContacto.setAdapter(adapter);
        ListContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                anime c= lst.get(position);
                Toast.makeText(getBaseContext(),c.nombre,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<anime> GetData() {
        lst = new ArrayList<>();
        lst.add(new anime(1,R.drawable.xd,"anime1","+aaaaaaaaa"));
        lst.add(new anime(1,R.drawable.xd,"anime2","bbbbbbbb"));
        lst.add(new anime(1,R.drawable.xd,"anime3","cccccc"));

        return lst;
    }
}