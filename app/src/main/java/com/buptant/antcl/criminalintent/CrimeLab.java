package com.buptant.antcl.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by antcl on 2015/8/4.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return  sCrimeLab;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }
    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c : mCrimes){
            if(c.getmId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
