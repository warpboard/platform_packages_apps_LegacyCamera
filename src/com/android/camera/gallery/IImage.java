/*
 * Copyright (C) 2009 The Android Open Source Project
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

package com.android.camera.gallery;

import android.graphics.Bitmap;
import android.net.Uri;

import java.io.InputStream;

/**
 * The interface of all images used in gallery.
 */
public interface IImage {

    public abstract void commitChanges();

    /**
     * Get the bitmap for the full size image.
     * @return  the bitmap for the full size image.
     */
    public abstract Bitmap fullSizeBitmap(int targetWidthOrHeight);

    /**
     *
     * @return an object which can be canceled while the bitmap is loading
     */
    public abstract ICancelable<Bitmap> fullSizeBitmapCancelable(
            int targetWidthOrHeight);

    /**
     * Gets the input stream associated with a given full size image.
     * This is used, for example, if one wants to email or upload
     * the image.
     * @return  the InputStream associated with the image.
     */
    public abstract InputStream fullSizeImageData();
    public abstract long fullSizeImageId();
    public abstract Uri fullSizeImageUri();
    public abstract IImageList getContainer();
    public abstract long getDateTaken();

    public abstract String getMimeType();
    public abstract int getHeight();

    /**
     * Gets the name of the image.
     * @return  the name of the image.
     */
    public abstract String getTitle();

    public abstract String getDisplayName();

    public abstract int getRow();

    public abstract int getWidth();

    public abstract long imageId();

    public abstract boolean isReadonly();

    public abstract boolean isDrm();

    public abstract Bitmap miniThumbBitmap();

    public abstract void onRemove();

    public abstract boolean rotateImageBy(int degrees);

    /**
     * Sets the title of the image.
     */
    public abstract void setTitle(String name);

    /**
     * Get the bitmap for the medium thumbnail.
     * @return  the bitmap for the medium thumbnail.
     */
    public abstract Bitmap thumbBitmap();

    public abstract Uri thumbUri();

    public abstract String getDataPath();
}