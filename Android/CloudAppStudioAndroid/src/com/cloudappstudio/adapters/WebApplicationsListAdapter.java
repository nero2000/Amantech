package com.cloudappstudio.adapters;

import java.util.List;

import com.cloudappstudio.android.R;
import com.cloudappstudio.data.CloudWebApp;

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
public class WebApplicationsListAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
	private List<CloudWebApp> mItems;

	public WebApplicationsListAdapter(Context context, List<CloudWebApp> items) {
		mItems = items;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderWebApp holder;
        
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.plain_list_item, null);  
             
            holder = new ViewHolderWebApp();
            holder.name = (TextView)convertView.findViewById(R.id.plain_list_name);
            
            convertView.setTag(holder);
        } 
        
        else
            holder = (ViewHolderWebApp)convertView.getTag();

        holder.name.setText(mItems.get(position).getTitle());
        
        return convertView;
	}

    public int getCount() {
        return mItems.size();
    }
    
    public void setItems(List<CloudWebApp> items) {
    	this.mItems = items;
    	notifyDataSetChanged();
    }

	public CloudWebApp getItem(int position) {
    	return mItems.get(position);
	}

    public long getItemId(int position) {
        return position;
    }
	
    public static class ViewHolderWebApp {
        TextView name;
    }
}
