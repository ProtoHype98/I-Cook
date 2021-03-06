package com.icook.dev.i_cook.DaingRecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.icook.dev.i_cook.R;

import java.util.List;

/**
 * Created by Win8.1 on 9/23/2017.
 */

public class DaingAdapter extends ArrayAdapter<ListDaingIngredients>{
    private Context context;

    public DaingAdapter(Context context, int resourceId, List<ListDaingIngredients> items){
        super(context,resourceId, items);
        this.context = context;
    }

    public class ViewHolder{
        public TextView daingIngredient;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = null;
        ListDaingIngredients rowItem = getItem(position);
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(getContext().LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_daing_ingredients, null);
            holder = new ViewHolder();
            holder.daingIngredient = (TextView)convertView.findViewById(R.id.daingIngredient);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.daingIngredient.setText(rowItem.getIngredient());
        return convertView;
    }
}
