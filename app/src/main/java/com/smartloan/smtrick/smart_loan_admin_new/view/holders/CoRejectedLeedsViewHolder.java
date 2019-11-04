package com.smartloan.smtrick.smart_loan_admin_new.view.holders;

import android.support.v7.widget.RecyclerView;

import com.smartloan.smtrick.smart_loan_admin_new.databinding.CoRejectedLeedsAdapterLayoutBinding;

public class CoRejectedLeedsViewHolder extends RecyclerView.ViewHolder {
    public CoRejectedLeedsAdapterLayoutBinding telecallerLeedsAdapterLayoutBinding;

    public CoRejectedLeedsViewHolder(CoRejectedLeedsAdapterLayoutBinding rejectedLeedsAdapterLayoutBinding) {
        super(rejectedLeedsAdapterLayoutBinding.getRoot());
        this.telecallerLeedsAdapterLayoutBinding = rejectedLeedsAdapterLayoutBinding;
    }
}
