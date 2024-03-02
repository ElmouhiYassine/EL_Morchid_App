package com.example.al_morchid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class VilleAdapter extends ArrayAdapter<Ville> {

    private Context mContext;
    private List<Ville> mVilles;

    public VilleAdapter(Context context, List<Ville> villes) {
        super(context, R.layout.list_item_layout, villes);
        mContext = context;
        mVilles = villes;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.list_item_layout, null);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView nomTextView = view.findViewById(R.id.nomTextView);
        TextView descriptionTextView = view.findViewById(R.id.descriptionTextView);

        Ville ville = mVilles.get(position);

        imageView.setImageResource(ville.getImageResourceId());
        nomTextView.setText(ville.getNom());
        descriptionTextView.setText(ville.getPosition());

        return view;
    }
}

