//package com.sameer13.labreportnmc;
//
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MenuExample extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_menu_example);
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.optional_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()) {
//            case R.id.item1:
//                Toast.makeText(this, "item1 selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.item2:
//                Toast.makeText(this, "About selected", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//}