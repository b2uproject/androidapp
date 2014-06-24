package com.example.b2u_mobileapp;

//import static com.microsoft.windowsazure.mobileservices.MobileServiceQueryOperations.val;

import java.net.MalformedURLException;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.MobileServiceTable;
import com.microsoft.windowsazure.mobileservices.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.TableQueryCallback;

//import static com.microsoft.windowsazure.mobileservices.MobileServiceQueryOperations.*;

public class ChallengeInfoActivity extends Activity
{
	/**
	 * Mobile Service Client reference
	 */
	private MobileServiceClient mClient;

	/**
	 * Mobile Service Table used to access data
	 */
	private MobileServiceTable<Challenge> mChallenge;

	/**
	 * Adapter to sync the items list with the view
	 */
	private ChallengeAdapter mAdapter;

	/**
	 * Initializes the activity
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			mClient = new MobileServiceClient(
					"https://b2u.azure-mobile.net/",
					"NBhfYPSUNgUaiVNbqxetalddQtqgYP25",
					this);

			// Get the Mobile Service Table instance to use
			mChallenge = mClient.getTable(Challenge.class);
			
			// Create an adapter to bind the items with the view
			mAdapter = new ChallengeAdapter(this, R.layout.row_list_to_do);
			GridView gridViewToDo = (GridView) findViewById(R.id.listChallenge);
			gridViewToDo.setAdapter(mAdapter);
			
			gridViewToDo.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		listChallenges("Environmental");
	}
	
	/**
	 * Lists all challenges in the specified category
	 */
	private void listChallenges(String category)
	{
		mChallenge.where().field("category").eq(category).execute(new TableQueryCallback<Challenge>() {

			public void onCompleted(List<Challenge> result, int count, Exception exception, ServiceFilterResponse response) {
				if (exception == null) {
					mAdapter.clear();

					for (Challenge item : result) {
						mAdapter.add(item);
}

				} else {
					exception.printStackTrace();
				}
Code to scroll down to the "Details" button:
			}
private final void focusOnView(){
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                your_scrollview.scrollTo(0, your_EditBox.getTop());
            }
		});		
	}
}
