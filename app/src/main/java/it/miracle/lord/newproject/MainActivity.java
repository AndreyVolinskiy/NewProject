package it.miracle.lord.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private Button btnSave;
    private Button btnShow;
    private Button btnDelete;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(configuration);
        realm = Realm.getDefaultInstance();

        btnSave = findViewById(R.id.btnSave);
        btnShow = findViewById(R.id.btnShow);
        btnDelete = findViewById(R.id.btn_delete);
    }

    public void save(View view) {
        realm.beginTransaction();
        User user = realm.createObject(User.class);
        user.setName("Igor");
        realm.commitTransaction();
    }

    public void show(View view) {

        // main activity
        // btn todo setting - save name and time
        // btn user setting - name
        // btn show -> ShowActivity


        // todo setting activity
        // text field 2
        // btn save
        // btn back
        // btn delete

        // user setting activity
        // text field 1
        // btn save
        // btn delete
        // back


        // Show activity
        // btn show users
        // btn show todos
        // btn back -> main activity




//        RealmList<String> list = new RealmList<>();
//
//        List<String> values = new ArrayList<>();
//
//        list.addAll(values);
//
        RealmResults<User> users = realm.where(User.class).findAll();
        for (User elem : users) {
            System.out.println(elem.toString());
        }
    }

    public void delete(View view) {
        realm.beginTransaction();
        realm.where(User.class).findAll().deleteAllFromRealm();
        realm.commitTransaction();
    }
}
