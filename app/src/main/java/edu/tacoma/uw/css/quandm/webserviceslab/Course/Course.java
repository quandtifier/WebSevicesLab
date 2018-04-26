package edu.tacoma.uw.css.quandm.webserviceslab.Course;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
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

    public static List<Course> parseCourseJSON(String courseJSON) throws JSONException {
        List<Course> courseList = new ArrayList<Course>();
        if (courseJSON != null) {

            JSONArray arr = new JSONArray(courseJSON);

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                Course course = new Course(obj.getString(Course.ID), obj.getString(Course.SHORT_DESC)
                        , obj.getString(Course.LONG_DESC), obj.getString(Course.PRE_REQS));
                courseList.add(course);
            }

        }

        return courseList;
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
