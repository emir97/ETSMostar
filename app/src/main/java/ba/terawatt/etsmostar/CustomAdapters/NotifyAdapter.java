package ba.terawatt.etsmostar.CustomAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ba.terawatt.etsmostar.CustomItems.NotifyItem;
import ba.terawatt.etsmostar.R;

/**
 * Created by Emir on 28.7.2017.
 */
public class NotifyAdapter extends RecyclerView.Adapter<NotifyAdapter.ViewHolder> {

    private List<NotifyItem> notifyItems;
    public NotifyAdapter(List<NotifyItem> items){
        notifyItems = items;
    }
    @Override
    public NotifyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notify_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NotifyAdapter.ViewHolder holder, int position) {
        NotifyItem item = notifyItems.get(position);
        holder.setDateNofify(item.getNotifyDate());
        holder.setContentNofify(item.getNotifyText());
    }

    @Override
    public int getItemCount() {
        return notifyItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView content;
        private TextView date;
        public ViewHolder(View itemView) {
            super(itemView);

            content = (TextView) itemView.findViewById(R.id.contentNotify);
            date = (TextView) itemView.findViewById(R.id.dateNotify);
        }

        public void setContentNofify(String content){
            this.content.setText(content);
        }
        public void setDateNofify(String dateNofify){
            this.date.setText(dateNofify);
        }
    }
}
