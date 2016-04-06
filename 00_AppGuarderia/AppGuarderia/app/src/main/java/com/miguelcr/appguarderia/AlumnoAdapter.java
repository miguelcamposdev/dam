package com.miguelcr.appguarderia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by miguelcampos on 6/4/16.
 */
public class AlumnoAdapter extends ArrayAdapter<Alumnos> {
    private final Context context;
    private final ArrayList<Alumnos> values;


    public AlumnoAdapter(Context context, ArrayList<Alumnos> values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.list_item_alumno, parent, false);

        // Recatamos los elementos de la vista
        TextView nombreAlumno = (TextView)v.findViewById(R.id.textViewNombreAlumno);
        ImageView imagenComida = (ImageView)v.findViewById(R.id.imageViewComida);
        ImageView imagenSiesta = (ImageView)v.findViewById(R.id.imageViewSiesta);
        ImageView imagenDeposicion = (ImageView)v.findViewById(R.id.imageViewDeposicion);

        // Alumno actual
        Alumnos alumnoActual = values.get(position);

        // Cambio los valores de los componentes visuales con la información del alumno actual
        nombreAlumno.setText(alumnoActual.getNombre());

        /*
        switch (alumnoActual.getComidaManana()) {
            case AlumnosFragment.COME_BIEN: imagenComida.setImageResource(); break;
            case AlumnosFragment.COME_REGULAR: imagenComida.setImageResource(); break;
        }
        */

        imagenComida.setImageLevel(alumnoActual.getComidaManana());


        return v;


    }
}
