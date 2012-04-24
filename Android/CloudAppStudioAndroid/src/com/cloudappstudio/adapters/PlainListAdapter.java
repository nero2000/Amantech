package com.cloudappstudio.adapters;

import java.util.List;

import com.cloudappstudio.android.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * A plain ListAdapter with views containing single textviews
 * Implements ViewHolder pattern
 * @author mrjanek <Jesper Lindberg>
 */
public class PlainListAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
	private List<String> mItems;

	public PlainListAdapter(Context context, List<String> items) {
		mItems = items;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderPlain holder;
        
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.plain_list_item, null);  
             
            holder = new ViewHolderPlain();
            holder.name = (TextView)convertView.findViewById(R.id.plain_list_name);
            
            convertView.setTag(holder);
        } 
        
        else
            holder = (ViewHolderPlain)convertView.getTag();

        holder.name.setText(mItems.get(position));
        
        return convertView;
	}

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
	public String getItem(int position) {
    	return mItems.get(position);
	}

	@Override
    public long getItemId(int position) {
        return position;
    }
	
    public static class ViewHolderPlain {
        TextView name;
    }
}
