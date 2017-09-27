package com.icook.dev.i_cook.CurryRecipe;

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

public class CurryAdapter extends ArrayAdapter<ListCurryIngredients>{
    private Context context;

    public CurryAdapter(Context context, int resourceId, List<ListCurryIngredients> items){
        super(context,resourceId, items);
        this.context = context;
    }

    public class ViewHolder{
        public TextView curryIngredient;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = null;
        ListCurryIngredients rowItem = getItem(position);
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(getContext().LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_curry_ingredients, null);
            holder = new ViewHolder();
            holder.curryIngredient = (TextView)convertView.findViewById(R.id.curryIngredient);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.curryIngredient.setText(rowItem.getIngredient());
        return convertView;
    }
}
