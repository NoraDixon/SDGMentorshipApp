package com.cg.sdg.db;

import androidx.annotation.NonNull;

import com.cg.sdg.model.Tag;
import com.cg.sdg.model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TagService {
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private static final String DB_NAME = "tags";

    public void getTags() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference(DB_NAME);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    Tag tag = ds.getValue(Tag.class);
                    System.out.println("Value: " + ds.getValue());
                    System.out.println("Tag: " + tag);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
