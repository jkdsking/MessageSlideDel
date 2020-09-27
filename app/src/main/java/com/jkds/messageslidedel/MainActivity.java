package com.jkds.messageslidedel;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvContainer;
    private MessageAdapter dataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvContainer=findViewById(R.id.rv_contont);
        dataAdapter = new MessageAdapter(getVideoBannerData());
        dataAdapter.setAnimationWithDefault(BaseQuickAdapter.AnimationType.ScaleIn);
        dataAdapter.addChildClickViewIds(R.id.tv_delete);
        dataAdapter.setOnItemChildClickListener(new OnItemChildClickListener() {
            @Override
            public void onItemChildClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                switch (view.getId()){
                    case R.id.tv_delete:
                        dataAdapter.getData().remove(position);//清空点击的内容
                        dataAdapter.notifyItemRemoved(position);
                        break;


                }

            }
        });

        rvContainer.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rvContainer.setAdapter(dataAdapter);

    }

    public static List<String> getVideoBannerData() {
        List<String> list = new ArrayList<>();
        list.add("测试1");
        list.add("测试2");
        list.add("测试3");
        list.add("测试4");
        list.add("测试5");
        list.add("测试6");
        list.add("测试7");
        list.add("测试8");
        list.add("测试9");
        list.add("测试10");
        list.add("测试11");
        return list;
    }
}