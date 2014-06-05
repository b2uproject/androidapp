package com.example.b2u_mobileapp;

//import static com.microsoft.windowsazure.mobileservices.MobileServiceQueryOperations.val;

import java.net.MalformedURLException;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.MobileServiceTable;
import com.microsoft.windowsazure.mobileservices.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.TableQueryCallback;

//import static com.microsoft.windowsazure.mobileservices.MobileServiceQueryOperations.*;

public class ChallengeListActivity extends Activity
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
		setContentView(R.layout.challenge_list);
		try {
			mClient = new MobileServiceClient(
					"https://b2u.azure-mobile.net/",
					"NBhfYPSUNgUaiVNbqxetalddQtqgYP25",
					this);

			// Get the Mobile Service Table instance to use
			mChallenge = mClient.getTable(Challenge.class);
			
			// Create an adapter to bind the items with the view
			mAdapter = new ChallengeAdapter(this, R.layout.challenge_circle);
			GridView gridViewToDo = (GridView) findViewById(R.id.listChallenge);
			gridViewToDo.setAdapter(mAdapter);
			
			//Set clickListener here or in the adapter?
			/*
			gridViewToDo.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					Intent challenge_info = new Intent("com.example.b2u_mobileapp.ChallengeInfoActivity");
					Challenge challenge = (Challenge) arg0.getItemAtPosition(arg2);
					challenge_info.putExtra("title", challenge.getmTitle());
					challenge_info.putExtra("description", challenge.getmInstruction());
					challenge_info.putExtra("challenge", challenge.getm);
					startActivity(challenge_info);
				}
			});
			*/
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		listChallenges("Environmental");
	}
	
	public void displayInfo(Challenge challenge)
	{
		
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
			}
		});		
	}
	
}