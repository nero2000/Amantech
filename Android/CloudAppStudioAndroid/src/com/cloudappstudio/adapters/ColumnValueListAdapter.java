package com.cloudappstudio.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cloudappstudio.android.R;
import com.cloudappstudio.data.ColumnValue;

/**
 * A ListAdapter that maps columns to values. Contains two textviews, column and value
 * @author mrjanek <Jesper Lindberg>
 */
public class ColumnValueListAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
	private List<ColumnValue> mItems;

	public ColumnValueListAdapter(Context context, List<ColumnValue> items) {
		mItems = items;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderColumnValue holder;
        
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.column_value_list_item, null);  
             
            holder = new ViewHolderColumnValue();
            holder.column = (TextView)convertView.findViewById(R.id.column_textView);
            holder.value = (TextView)convertView.findViewById(R.id.value_textView);
            
            convertView.setTag(holder);
        } 
        
        else
            holder = (ViewHolderColumnValue)convertView.getTag();

        holder.column.setText(mItems.get(position).getColumn().toUpperCase());
        holder.value.setText(mItems.get(position).getValue());
        
        return convertView;
	}


    public int getCount() {
        return mItems.size();
    }


	public ColumnValue getItem(int position) {
    	return mItems.get(position);
	}


    public long getItemId(int position) {
        return position;
    }
	
    public static class ViewHolderColumnValue {
    	TextView column;
        TextView value;
    }
}
