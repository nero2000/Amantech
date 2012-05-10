package com.cloudappstudio.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudViewEntry;

/**
 * A plain ListAdapter with views containing single textviews
 * Implements ViewHolder pattern
 * @author mrjanek <Jesper Lindberg>
 */
public class ViewEntriesListAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
	private List<CloudViewEntry> mItems;

	public ViewEntriesListAdapter(Context context, List<CloudViewEntry> items) {
		mItems = items;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderViewEntry holder;
        
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.plain_list_item, null);  
             
            holder = new ViewHolderViewEntry();
            holder.name = (TextView)convertView.findViewById(R.id.plain_list_name);
            
            convertView.setTag(holder);
        } 
        
        else
            holder = (ViewHolderViewEntry)convertView.getTag();

        holder.name.setText(mItems.get(position).getValueByColumnName("Titel"));
        
        return convertView;
	}

    public int getCount() {
        return mItems.size();
    }
    
    public void setItems(List<CloudViewEntry> items) {
    	this.mItems = items;
    	notifyDataSetChanged();
    }

	public CloudViewEntry getItem(int position) {
    	return mItems.get(position);
	}

    public long getItemId(int position) {
        return position;
    }
	
    public static class ViewHolderViewEntry {
        TextView name;
    }
}
