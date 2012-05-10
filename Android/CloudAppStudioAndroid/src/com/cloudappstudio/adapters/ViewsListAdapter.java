package com.cloudappstudio.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudView;

/**
 * A plain ListAdapter with views containing single textviews
 * Implements ViewHolder pattern
 * @author mrjanek <Jesper Lindberg>
 */
public class ViewsListAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
	private List<CloudView> mItems;

	public ViewsListAdapter(Context context, List<CloudView> items) {
		mItems = items;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderForm holder;
        
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.plain_list_item, null);  
             
            holder = new ViewHolderForm();
            holder.name = (TextView)convertView.findViewById(R.id.plain_list_name);
            
            convertView.setTag(holder);
        } 
        
        else
            holder = (ViewHolderForm)convertView.getTag();

        holder.name.setText(mItems.get(position).getTitle());
        
        return convertView;
	}
	
    public int getCount() {
        return mItems.size();
    }
    
    public void setItems(List<CloudView> items) {
    	this.mItems = items;
    	notifyDataSetChanged();
    }

	public CloudView getItem(int position) {
    	return mItems.get(position);
	}

    public long getItemId(int position) {
        return position;
    }
	
    public static class ViewHolderForm {
        TextView name;
    }
}
