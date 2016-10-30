package com.feeder.android.utils;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feeder.model.Article;

import java.util.List;

import me.zsr.feeder.R;

/**
 * @description:
 * @author: Match
 * @date: 10/28/16
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private List<Article> mArticleList;

    public ArticleAdapter(List<Article> list) {
        mArticleList = list;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.articles_item, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        holder.bind(mArticleList.get(position));
    }

    @Override
    public int getItemCount() {
        return mArticleList.size();
    }
}