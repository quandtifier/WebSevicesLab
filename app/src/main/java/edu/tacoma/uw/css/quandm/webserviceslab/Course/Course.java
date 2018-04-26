package edu.tacoma.uw.css.quandm.webserviceslab.Course;

public class Course {
    public static final String ID = "id";
    public static final String SHORT_DESC = "shortDesc";
    public static final String LONG_DESC = "longDesc";
    public static final String PRE_REQS = "prereqs";


    private String mCourseID;
    private String mShortDescription;
    private String mLongDescription;
    private String mPrereqs;

    public Course (String theCourseID, String theShortDescription, String theLongDescription, String thePrereqs) {
        mCourseID = theCourseID;
        mShortDescription = theShortDescription;
        mLongDescription = theLongDescription;
        mPrereqs = thePrereqs;
    }

    public String getmCourseID() {
        return mCourseID;
    }

    public String getmShortDescription() {
        return mShortDescription;
    }

    public String getmLongDescription() {
        return mLongDescription;
    }

    public String getmPrereqs() {
        return mPrereqs;
    }

    public void setmCourseID(String mCourseID) {
        this.mCourseID = mCourseID;
    }

    public void setmShortDescription(String mShortDescription) {
        this.mShortDescription = mShortDescription;
    }

    public void setmLongDescription(String mLongDescription) {
        this.mLongDescription = mLongDescription;
    }

    public void setmPrereqs(String mPrereqs) {
        this.mPrereqs = mPrereqs;
    }
}
