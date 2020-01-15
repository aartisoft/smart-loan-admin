package com.smartloan.smtrick.smart_loan_admin_new.view.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.smartloan.smtrick.smart_loan_admin_new.Listners.OnCheckedClickListener;
import com.smartloan.smtrick.smart_loan_admin_new.R;
import com.smartloan.smtrick.smart_loan_admin_new.models.FollowUp;
import com.smartloan.smtrick.smart_loan_admin_new.models.TodoList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {

    private static List<TodoList> searchArrayList;
    private Context context;
    private boolean isFromRequest;
    private OnCheckedClickListener onImageClickListener;

    public TodoAdapter(Context context, List<TodoList> userArrayList) {
        this.context = context;
        this.searchArrayList = userArrayList;
        this.onImageClickListener = onImageClickListener;

    }

    @Override
    public TodoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.todolist_adapter_layout, parent, false);
        TodoAdapter.ViewHolder viewHolder = new ViewHolder(v);
        //  context = parent.getContext();
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final TodoAdapter.ViewHolder holder, int position) {
        final TodoList item = searchArrayList.get(position);

        holder.Item.setText(item.getDescription());
        holder.DateTime.setText(item.getDate()+"  "+item.getTime());



        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date strDate = null;
        try {
            strDate = sdf.parse(item.getDate());
        } catch (ParseException e) {


        }
        if (new Date().after(strDate)) {
            holder.DateTime.setTextColor(Color.RED);

        }

    }

    @Override
    public int getItemCount() {
        return searchArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        CardView card_view;
        CheckBox Item;
        TextView DateTime;

        public ViewHolder(View itemView) {
            super(itemView);

            Item = (CheckBox) itemView.findViewById(R.id.checklistitem);
            DateTime = (TextView) itemView.findViewById(R.id.tasks_date);
            card_view = (CardView) itemView.findViewById(R.id.card_view_checklist);

        }
    }

}