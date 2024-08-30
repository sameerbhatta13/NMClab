//package com.sameer13.labreportnmc;
//
//import android.os.Bundle;
//import android.view.ContextMenu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.TextView;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class ContextMenuExample extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_context_menu_example);
//
//        TextView textView = findViewById(R.id.textView);
//        registerForContextMenu(textView);
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.context_menu, menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.edit:
//                Toast.makeText(this, "Edit selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.delete:
//                Toast.makeText(this, "Delete selected", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onContextItemSelected(item);
//        }
//    }
//}