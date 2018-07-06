package com.example.kbase.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kbase.R;
import com.example.kbase.adapter.SearchAdapter;
import com.example.kbase.model.Bean;
import com.example.kbase.widget.SearchView;

import java.util.List;
/*

 */
public class KsortFragment extends Fragment {
//implements SearchView.SearchViewListener
    private ListView lvResults;

    private SearchView searchView;

    private ArrayAdapter hintAdapter;

    private ArrayAdapter<String> autoCompleteAdapter;

    /**
     * 搜索结果列表adapter
     */
    private SearchAdapter resultAdapter;

    private List<Bean> dbData;


    private List<String> hintData;

    private List<String> autoCompleteData;

    private List<Bean> resultData;

    private static int DEFAULT_HINT_SIZE = 4;

    private static int hintSize = DEFAULT_HINT_SIZE;


    public static void setHintSize(int hintSize) {
        KsortFragment.hintSize = hintSize;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        return inflater.inflate(R.layout.fragment_mbase, container, false);
        //initData();
        //initViews();
    }

    /**
     * 初始化视图
     */

//    private void initViews() {
//        lvResults = lvResults.findViewById(R.id.lv_sort);
//        searchView =  searchView.findViewById(R.id.sv_sort);
//        //设置监听
//        searchView.setSearchViewListener(this);
//        //设置adapter
//        searchView.setTipsHintAdapter(hintAdapter);
//        searchView.setAutoCompleteAdapter(autoCompleteAdapter);
//
//        lvResults.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(KsortFragment.this, position + "", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    /**
//     * 初始化数据
//     */
//    private void initData() {
//        //从数据库获取数据
//        getDbData();
//        //初始化热搜版数据
//        getHintData();
//        //初始化自动补全数据
//        getAutoCompleteData(null);
//        //初始化搜索结果数据
//        getResultData(null);
//    }
//
//    /**
//     * 获取db 数据
//     */
//    private void getDbData() {
//        int size = 100;
//        dbData = new ArrayList<>(size);
//        for (int i = 0; i < size; i++) {
//            dbData.add(new Bean(R.drawable.icon, "android开发必备技能" + (i + 1), "Android自定义view——自定义搜索view", i * 20 + 2 + ""));
//        }
//    }
//
//    /**
//     * 获取热搜版data 和adapter
//     */
//    private void getHintData() {
//        hintData = new ArrayList<>(hintSize);
//        for (int i = 1; i <= hintSize; i++) {
//            hintData.add("热搜版" + i + "：Android自定义View");
//        }
//        hintAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, hintData);
//    }
//
//    private void getAutoCompleteData(String text) {
//        if (autoCompleteData == null) {
//            //初始化
//            autoCompleteData = new ArrayList<>(hintSize);
//        } else {
//            // 根据text 获取auto data
//            autoCompleteData.clear();
//            for (int i = 0, count = 0; i < dbData.size()
//                    && count < hintSize; i++) {
//                if (dbData.get(i).getTitle().contains(text.trim())) {
//                    autoCompleteData.add(dbData.get(i).getTitle());
//                    count++;
//                }
//            }
//        }
//        if (autoCompleteAdapter == null) {
//            autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, autoCompleteData);
//        } else {
//            autoCompleteAdapter.notifyDataSetChanged();
//        }
//    }
//
//
//    private void getResultData(String text) {
//        if (resultData == null) {
//            // 初始化
//            resultData = new ArrayList<>();
//        } else {
//            resultData.clear();
//            for (int i = 0; i < dbData.size(); i++) {
//                if (dbData.get(i).getTitle().contains(text.trim())) {
//                    resultData.add(dbData.get(i));
//                }
//            }
//        }
//        if (resultAdapter == null) {
//            resultAdapter = new SearchAdapter(this, resultData, R.layout.item_bean_list);
//        } else {
//            resultAdapter.notifyDataSetChanged();
//        }
//    }
//
//
//    @Override
//    public void onRefreshAutoComplete(String text) {
//        //更新数据
//        getAutoCompleteData(text);
//    }
//
//
//    @Override
//    public void onSearch(String text) {
//        //更新result数据
//        getResultData(text);
//        lvResults.setVisibility(View.VISIBLE);
//        //第一次获取结果 还未配置适配器
//        if (lvResults.getAdapter() == null) {
//            //获取搜索数据 设置适配器
//            lvResults.setAdapter(resultAdapter);
//        } else {
//            //更新搜索数据
//            resultAdapter.notifyDataSetChanged();
//        }
//        Toast.makeText(this, "完成搜素", Toast.LENGTH_SHORT).show();
//
//
//    }
//

}
