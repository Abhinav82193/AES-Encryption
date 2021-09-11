
package com.example.aesencryption;

import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
       // import android.content.ClipData;
       // import android.content.ClipboardManager;
        import android.content.ClipData;
        import android.content.ClipboardManager;
        import android.content.Context;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.scottyab.aescrypt.AESCrypt;

        import java.nio.charset.StandardCharsets;
        import java.security.GeneralSecurityException;

public class MainActivity extends AppCompatActivity {

    EditText et_key;
    EditText et_message,message;
    ImageButton b1,b2;
    String encrpyted,pastedata;
    ClipboardManager clipboardmanager;
    ClipData clipdata;
    String inputkey,inputmessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_key = findViewById(R.id.et_key);
        et_message = findViewById(R.id.et_message);
        message = findViewById(R.id.message);
        b1=findViewById(R.id.b1);
        b1=findViewById(R.id.b2);
      ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);

      //  b2.setEnabled(false);

    }



    public void encrypt(View view) throws GeneralSecurityException {
        if(et_key.length()>0&&et_message.length()>0){
             inputkey=et_key.getText().toString();
             inputmessage=et_message.getText().toString();
     try { encrpyted = AESCrypt.encrypt(et_key.getText().toString(), et_message.getText().toString());
         et_message.setText("");
         et_key.setText("");
         message.setText(String.format("%s", encrpyted));


     }catch (GeneralSecurityException e){
         e.printStackTrace();
     } }
        else{
            Toast.makeText(this, "Please Enter Key And Message", Toast.LENGTH_SHORT).show();
        }

    }
    public void copy(View view) {
        ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("lable", encrpyted);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(this, "Your Message Was Copied to clip board", Toast.LENGTH_SHORT).show();

    }


    public void paste(View view) {

        ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);

        ClipData.Item item= clipboardManager.getPrimaryClip().getItemAt(0);
        String pastedata=item.getText().toString();
        Toast.makeText(this, "Your Message Was Pasted to clip board", Toast.LENGTH_SHORT).show();
        et_message.setText(pastedata);

    }




    public void decrypt(View view) throws GeneralSecurityException {
        if(et_key.length()>0&&et_message.length()>0){

        try {
            String encrpyted = AESCrypt.decrypt(et_key.getText().toString(), et_message.getText().toString());
            et_message.setText("");
            et_key.setText("");
            message.setText(String.format("%s", encrpyted));

        }catch (GeneralSecurityException e){
            e.printStackTrace();
        }}
        else{
            Toast.makeText(this, "Please Enter Encrypted Message And Key ", Toast.LENGTH_SHORT).show();
        }



    }


}

