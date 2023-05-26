package xyz.devien.sem10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<anime> lst;

    public CustomAdapter(Context context, List<anime> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView ImageViewContacto;
        TextView TextViewNombre;
        TextView TextViewDescrp;
        anime c = lst.get(position);
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.listview_contacto,null);
            ImageViewContacto= convertView.findViewById(R.id.imageViewContacto);
            TextViewNombre= convertView.findViewById(R.id.textViewNombre);
            TextViewDescrp= convertView.findViewById(R.id.textViewDescrp);

            ImageViewContacto.setImageResource(c.img);
            TextViewNombre.setText(c.nombre);
            TextViewDescrp.setText(c.descrp);
        }
        return convertView;
    }
}
