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
		/*final TextView cause = (TextView) row.findViewById(R.id.challengeCause);
		final TextView category = (TextView) row.findViewById(R.id.challengeCategory);
		final TextView difficulty = (TextView) row.findViewById(R.id.challengeDifficulty);
		final TextView points = (TextView) row.findViewById(R.id.challengePoints);*/
		
		title.setText(currentItem.getmTitle());
		/*cause.setText(currentItem.getmCause());
		category.setText(currentItem.getmCategory());
		difficulty.setText(currentItem.getmDifficulty());
		points.setText(currentItem.getmPoints());*/
/*
		checkBox.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (checkBox.isChecked()) {
					checkBox.setEnabled(false);
					if (mContext instanceof ToDoActivity) {
						ToDoActivity activity = (ToDoActivity) mContext;
						activity.checkItem(currentItem);
					}
				}
			}
		});
*/
		return row;
	}
	

	
	
}
