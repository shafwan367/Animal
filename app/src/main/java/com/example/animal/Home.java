package com.example.animal;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import android.view.ViewGroup;
import android.content.Intent;

public class Home extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        CardView content_cat = (CardView) v.findViewById(R.id.content_cat); content_cat.setOnClickListener(this);
        CardView content_dog = (CardView) v.findViewById(R.id.content_dog); content_dog.setOnClickListener(this);
        CardView content_cow = (CardView) v.findViewById(R.id.content_cow); content_cow.setOnClickListener(this);
        CardView content_duck = (CardView) v.findViewById(R.id.content_duck); content_duck.setOnClickListener(this);
        CardView content_kuda = (CardView) v.findViewById(R.id.content_kuda); content_kuda.setOnClickListener(this);
        CardView content_tiger = (CardView) v.findViewById(R.id.content_tiger); content_tiger.setOnClickListener(this);
        CardView content_eagle = (CardView) v.findViewById(R.id.content_eagle); content_eagle.setOnClickListener(this);
        CardView content_domba = (CardView) v.findViewById(R.id.content_domba); content_domba.setOnClickListener(this);
        CardView content_elephant = (CardView) v.findViewById(R.id.content_elephant); content_elephant.setOnClickListener(this);
        CardView content_dolphin = (CardView) v.findViewById(R.id.content_dolphin); content_dolphin.setOnClickListener(this);

        return v;


    }
    public void onClick(View v){

        Intent intent;
        switch (v.getId()){
            case R.id.content_cat:
                intent = new Intent(v.getContext(),Kucing.class); startActivityForResult(intent,0);
                break;
            case R.id.content_dog:
                intent = new Intent(v.getContext(),About.class); startActivityForResult(intent,0);
                break;
            case R.id.content_cow:
                intent = new Intent(v.getContext(),Sapi.class); startActivityForResult(intent,0);
                break;
            case R.id.content_duck:
                intent = new Intent(v.getContext(),Bebek.class); startActivityForResult(intent,0);
                break;
            case R.id.content_kuda:
                intent = new Intent(v.getContext(),Kuda.class); startActivityForResult(intent,0);
                break;
            case R.id.content_tiger:
                intent = new Intent(v.getContext(),Harimau.class); startActivityForResult(intent,0);
                break;
            case R.id.content_eagle:
                intent = new Intent(v.getContext(),Elang.class); startActivityForResult(intent,0);
                break;
            case R.id.content_domba:
                intent = new Intent(v.getContext(),Domba.class); startActivityForResult(intent,0);
                break;
            case R.id.content_elephant:
                intent = new Intent(v.getContext(),Gajah.class); startActivityForResult(intent,0);
                break;
            case R.id.content_dolphin:
                intent = new Intent(v.getContext(),Lumba.class); startActivityForResult(intent,0);
                break;
        }
    }
}