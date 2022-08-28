package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.model.Pais;
import com.example.recyclerview.util.ResourceUtil;

public class DetalhePaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
    }

    private void carregaPacoteRecebido() {
        Intent intent = getIntent();
        if (intent.hasExtra("pais")) {
            final Pais pais = (Pais) intent.getSerializableExtra("pais");
            configuraBotao(pais);
        }
    }

    private void configuraBotao(final Pais pais) {
        Button botaoVolta = findViewById(R.id.button_voltar);
        botaoVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltaActivity(pais);
            }

            private void voltaActivity(Pais pais) {
                Intent intent = new Intent(DetalhePaisActivity.this,
                        ListaPaisesActivity.class);
                intent.putExtra("pais", pais);
                startActivity(intent);
            }


            private void mostraLocal(Pais pais) {
                TextView local = findViewById(R.id.detalhe_pais_nome);
                local.setText(pais.getNome());
                mostraLocal(pais);
            }

            private void mostraImagem(Pais pais) {
                ImageView imagem = findViewById(R.id.detalhe_pais_imagem);
                Drawable drawableDoPacote = ResourceUtil
                        .devolveDrawable(this, pais.getImagem());
                imagem.setImageDrawable(drawableDoPacote);
                mostraImagem(pais);   // não entendi o erro no this.
            }
        }
    }

}