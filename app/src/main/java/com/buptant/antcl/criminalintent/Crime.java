package com.buptant.antcl.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by antcl on 2015/8/3.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Date getmDate() {

        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Crime(){

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {

        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
