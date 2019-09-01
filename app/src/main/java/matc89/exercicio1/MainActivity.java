package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button botao;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.labelMensagem);
        editText = (EditText) findViewById(R.id.editNome);
        botao = (Button) findViewById(R.id.btnCumprimentar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto = editText.getText().toString();
                textView.setText("Alô," + " " + texto + "!");
            }
        });
    }

    protected void onSaveInstanceState(Bundle state){
        super.onSaveInstanceState(state);
        state.putString("texto", texto);

    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        textView.setText("Alô," + " " + savedInstanceState.getString("texto") + "!");
    }

}