package com.exemplo.informacoes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class InformacoesActivity extends Activity {

	private TextView txtId;
	private TextView txtName;
	private TextView txtPws;
	private Pessoa pessoa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_informacoes);

		pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");
		
		txtId = (TextView) findViewById(R.id.txtId);
		txtName = (TextView) findViewById(R.id.txtName);
		txtPws = (TextView) findViewById(R.id.txtPws);
		
		txtId.setText(pessoa.getId());
		txtName.setText(pessoa.getName());
		txtPws.setText(pessoa.getPws());

	}

}
