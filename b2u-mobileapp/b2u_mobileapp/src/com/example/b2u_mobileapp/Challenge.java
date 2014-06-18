package com.example.b2u_mobileapp;

/**
 * Represents an item in a ToDo list
 */
public class Challenge {

	/**
	 * Challenge title
	 */
	@com.google.gson.annotations.SerializedName("title")
	private String mTitle;

	/**
	 * Challenge ID
	 */
	@com.google.gson.annotations.SerializedName("id")
	private String mId;

	/**
	 * Challenge time unit
	 */
	@com.google.gson.annotations.SerializedName("time_unit")
	private String mTimeUnit;

	/**
	 * Challenge cause
	 */
	@com.google.gson.annotations.SerializedName("cause")
	private String mCause;

	/**
	 * Challenge instructions
	 */
	@com.google.gson.annotations.SerializedName("instruction")
	private String mInstruction;

	/**
	 * Challenge submission directions
	 */
	@com.google.gson.annotations.SerializedName("submission")
	private String mSubmission;

	/**
	 * Challenge category
	 */
	@com.google.gson.annotations.SerializedName("category")
	private String mCategory;

	/**
	 * Challenge's associated URL's
	 */
	@com.google.gson.annotations.SerializedName("urls")
	private String mURL;
	
	/**
	 * Challenge materials required
	 */
	@com.google.gson.annotations.SerializedName("materials")
	private String mMaterial;

	/**
	 * Challenge sponsor
	 */
	@com.google.gson.annotations.SerializedName("sponsor")
	private String mSponsor;

	/**
	 * Challenge difficulty
	 */
	@com.google.gson.annotations.SerializedName("difficulty")
	private String mDifficulty;

	/**
	 * Challenge time_unit
	 */
	@com.google.gson.annotations.SerializedName("time_num")
	private int mTimeNum;

	/**
	 * Challenge time_unit
	 */
	@com.google.gson.annotations.SerializedName("points")
	private int mPoints;

	/**
	 * ToDoItem constructor
	 */
	public Challenge() {

	}

	/**
	 * @return the mTitle
	 */
	public String getmTitle() {
		return mTitle;
	}

	/**
	 * @param mTitle the mTitle to set
	 */
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	/**
	 * @return the mId
	 */
	public String getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(String mId) {
		this.mId = mId;
	}

	/**
	 * @return the mTimeUnit
	 */
	public String getmTimeUnit() {
		return mTimeUnit;
	}

	/**
	 * @param mTimeUnit the mTimeUnit to set
	 */
	public void setmTimeUnit(String mTimeUnit) {
		this.mTimeUnit = mTimeUnit;
	}

	/**
	 * @return the mCause
	 */
	public String getmCause() {
		return mCause;
	}

	/**
	 * @param mCause the mCause to set
	 */
	public void setmCause(String mCause) {
		this.mCause = mCause;
	}

	/**
	 * @return the mInstruction
	 */
	public String getmInstruction() {
		return mInstruction;
	}

	/**
	 * @param mInstruction the mInstruction to set
	 */
	public void setmInstruction(String mInstruction) {
		this.mInstruction = mInstruction;
	}

	/**
	 * @return the mSubmission
	 */
	public String getmSubmission() {
		return mSubmission;
	}

	/**
	 * @param mSubmission the mSubmission to set
	 */
	public void setmSubmission(String mSubmission) {
		this.mSubmission = mSubmission;
	}

	/**
	 * @return the mCategory
	 */
	public String getmCategory() {
		return mCategory;
	}

	/**
	 * @param mCategory the mCategory to set
	 */
	public void setmCategory(String mCategory) {
		this.mCategory = mCategory;
	}

	/**
	 * @return the mURL
	 */
	public String getmURL() {
		return mURL;
	}

	/**
	 * @param mURL the mURL to set
	 */
	public void setmURL(String mURL) {
		this.mURL = mURL;
	}

	/**
	 * @return the mMaterial
	 */
	public String getmMaterial() {
		return mMaterial;
	}

	/**
	 * @param mMaterial the mMaterial to set
	 */
	public void setmMaterial(String mMaterial) {
		this.mMaterial = mMaterial;
	}

	/**
	 * @return the mSponsor
	 */
	public String getmSponsor() {
		return mSponsor;
	}

	/**
	 * @param mSponsor the mSponsor to set
	 */
	public void setmSponsor(String mSponsor) {
		this.mSponsor = mSponsor;
	}

	/**
	 * @return the mDifficulty
	 */
	public String getmDifficulty() {
		return mDifficulty;
	}

	/**
	 * @param mDifficulty the mDifficulty to set
	 */
	public void setmDifficulty(String mDifficulty) {
		this.mDifficulty = mDifficulty;
	}

	/**
	 * @return the mTimeNum
	 */
	public int getmTimeNum() {
		return mTimeNum;
	}

	/**
	 * @param mTimeNum the mTimeNum to set
	 */
	public void setmTimeNum(int mTimeNum) {
		this.mTimeNum = mTimeNum;
	}

	/**
	 * @return the mPoints
	 */
	public int getmPoints() {
		return mPoints;
	}

	/**
	 * @param mPoints the mPoints to set
	 */
	public void setmPoints(int mPoints) {
		this.mPoints = mPoints;
	}

	@Override
	public String toString() {
		return mTitle;
	}

	/**
	 * Returns the item id
	 */
	public String getId() {
		return mId;
	}

	/**
	 * Sets the item id
	 * 
	 * @param id
	 *            id to set
	 */
	public final void setId(String id) {
		mId = id;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof Challenge && ((Challenge) o).mId == mId;
	}
}