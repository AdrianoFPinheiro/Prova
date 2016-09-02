package com.example.adriano.testepontotel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.exemplo.informacoes.*;


public class InformacoesActivity extends Activity {

    private TextView txtId;
    private TextView txtName;
    private TextView txtPws;
    private com.exemplo.informacoes.Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

        pessoa = (com.exemplo.informacoes.Pessoa) getIntent().getSerializableExtra("pessoa");

        txtId = (TextView) findViewById(R.id.txtId);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPws = (TextView) findViewById(R.id.txtPws);

        txtId.setText(pessoa.getId());
        txtName.setText(pessoa.getName());
        txtPws.setText(pessoa.getPws());

    }

}
