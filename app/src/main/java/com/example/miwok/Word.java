package com.example.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceid;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResoureId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceid = audioResoureId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceid = audioResourceId;
    }


    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() { return mMiwokTranslation; }

    public int getmImageResourceId(){return mImageResourceId;}

    //it is for visibility
    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}

    public int getmAudioResourceid(){return mAudioResourceid;}

}
