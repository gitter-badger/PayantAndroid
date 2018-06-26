package com.lemubit.lemuel.androidpayant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lemubit.lemuel.androidpayant.operations.clients.PayantClientManager;
import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.PayantClientInfo;
import com.lemubit.lemuel.androidpayant.operations.clients.model.PayantClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PayantClient payantClient = new PayantClient();
        Payant.init(this);
        Payant.setPrivateKey("3c93c4f1b8b264400c39f86db1c31b8add76121a1a37f1f0c2d52b3d");

        PayantClient payantClient = new PayantClient();
        payantClient.setFirstName("Lemubit");
        payantClient.setLastName("Ogbunude");
        payantClient.setPhone("+23409094435323");
        payantClient.setEmail("charlesfree7@yahoo.com");
        int id = 169;
        PayantClientManager.editPayantClient(id, payantClient, new PayantClientManager.OnEditPayantClientListener() {
            @Override
            public void onClientEdited(PayantClientInfo payantClientInfo) {
                Log.e("PAYANT!", payantClientInfo.toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("PAYANT!",t.getMessage());
            }
        });
    }


}
