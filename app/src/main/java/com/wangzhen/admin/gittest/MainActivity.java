package com.wangzhen.admin.gittest;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView listView;
    private FloatingActionButton floatingActionButton;

    private List<String> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ShareDesc.Builder builder = new ShareDesc.Builder();
        ShareDesc shareDesc = builder.build();*/
        listView = findViewById(R.id.listView);
      //  floatingActionButton = findViewById(R.id.floatActionButton);

    //    final List<String> list = initArrayList();
        initArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(linearLayoutManager);
        listView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
                return new Holder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                Holder holder1 = (Holder) holder;
                holder1.textView.setText(list.get(position));
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        });
        initEvent();
    }

    //初始化点击事件
    private void initEvent() {
//        floatingActionButton.setOnClickListener(this);
    }

    private List<String> initArrayList() {
        list = new ArrayList<>();
        for(int i = 0 ; i < 100 ; i++){
            list.add("周吴郑王" + i) ;
        }
        return list;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
           /* case R.id.floatActionButton:
                Toast.makeText(this,"浮动性button",Toast.LENGTH_SHORT).show();
                break;*/
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    class Holder extends RecyclerView.ViewHolder {
        TextView textView;

        public Holder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
