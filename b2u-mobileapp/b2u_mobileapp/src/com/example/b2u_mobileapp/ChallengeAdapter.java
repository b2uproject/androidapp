package com.example.b2u_mobileapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
//import com.example.b2u.ChallengeListActivity;

/**
 * Adapter to bind a Challenge List to a view
 */
public class ChallengeAdapter extends ArrayAdapter<Challenge> {

	/**
	 * Adapter context
	 */
	Context mContext;

	/**
	 * Adapter View layout
	 */
	int mLayoutResourceId;

	public ChallengeAdapter(Context context, int layoutResourceId) {
		super(context, layoutResourceId);

		mContext = context;
		mLayoutResourceId = layoutResourceId;
	}

	/**
	 * Returns the view for a specific item on the list
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;

		final Challenge currentItem = getItem(position);

		if (row == null) {
			LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
			row = inflater.inflate(mLayoutResourceId, parent, false);
		}

		row.setTag(currentItem);
		final TextView title = (TextView) row.findViewById(R.id.challenge);
		title.setText(currentItem.getmTitle());
		
		//Listen to click events and open the clicked challenge's information
		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (mContext instanceof ChallengeListActivity) {
					ChallengeListActivity activity = (ChallengeListActivity) mContext;
					activity.displayInfo(currentItem);
				}
			}
		});
		
		return row;
	}
	
}
