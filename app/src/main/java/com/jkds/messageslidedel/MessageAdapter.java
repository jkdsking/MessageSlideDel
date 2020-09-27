package com.jkds.messageslidedel;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
public class MessageAdapter extends BaseQuickAdapter<String, BaseViewHolder> implements LoadMoreModule {
    public MessageAdapter(@Nullable List<String> data) {
        super(R.layout.item_message, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.content, item);

    }
}
