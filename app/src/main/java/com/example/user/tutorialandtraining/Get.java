package com.example.user.tutorialandtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Get extends AppCompatActivity {
   public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);





        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference("a" );
        //databaseReference.child("a");
        databaseReference.addChildEventListener(new ChildEventListener() {


            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String filename=dataSnapshot.getKey();
                String url= (String) dataSnapshot.getValue();
                // uploadPDF pdf=dataSnapshot.getValue(uploadPDF.class);

                ((MyAdapter) recyclerView.getAdapter()).update(filename,url);
                //   Toast.makeText(Get.this, filename, Toast.LENGTH_SHORT).show();


            }



            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }






       /// recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(Get.this));
          //  MyAdapter myAdapter=new MyAdapter(recyclerView,Get.this,new ArrayList<String>(),new ArrayList <String>());
      // recyclerView.setAdapter(myAdapter);


        });

        recyclerView =findViewById(R.id.recyclerviewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(Get.this));
        MyAdapter myAdapter=new MyAdapter(recyclerView,Get.this,new ArrayList<String>(),new ArrayList <String>());
        recyclerView.setAdapter(myAdapter);


    }
}
