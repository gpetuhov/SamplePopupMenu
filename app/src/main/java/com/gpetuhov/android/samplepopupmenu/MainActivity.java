package com.gpetuhov.android.samplepopupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.button);
    button.setOnClickListener(v -> {
      PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
      popupMenu.setOnMenuItemClickListener(item -> {
        Toast.makeText(MainActivity.this, "Click on " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
      });

      MenuInflater inflater = popupMenu.getMenuInflater();
      inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());
      popupMenu.show();
    });
  }
}
