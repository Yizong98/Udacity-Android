/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sd_tour_guide;

public class Place {


    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPlace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Place(int placeName, int imageResourceId
                 ) {
        mPlace = placeName;
        mImageResourceId = imageResourceId;
    }


    public int getPlaceId() {
        return mPlace;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}