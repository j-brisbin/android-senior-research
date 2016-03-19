package com.example.haungsn.finalprojectapi15;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.lang.ref.WeakReference;

/**
 * Created by User on 3/11/2016.
 */
/*Code is courtesy of Android Developers:
* http://developer.android.com/training/displaying-bitmaps/process-bitmap.html
* http://developer.android.com/training/displaying-bitmaps/load-bitmap.html#decodeSampledBitmapFromResource */
public class BitmapWorkerTask extends AsyncTask<Integer, Void, Bitmap>{
    private final WeakReference<ImageSprite> imageSpriteReference;
    private int data = 0;

    public BitmapWorkerTask(ImageSprite imageSprite){
        imageSpriteReference = new WeakReference<ImageSprite>(imageSprite);
    }

    @Override
    protected Bitmap doInBackground(Integer... params) {
        data = params[0];
        return decodeSampledBitmapFromResource(Resources.getSystem(),data,100,100);
    }

    protected void onPostExecute(Bitmap bitmap, int resourceID) {
        if(isCancelled()){
            bitmap = null;
        }
        if(imageSpriteReference != null && bitmap != null){
            final ImageSprite imageSprite = imageSpriteReference.get();
            if(imageSprite != null){
                imageSprite.setImage(resourceID);
            }
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int requiredWidth,
                                            int requiredHeight){
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if(height > requiredHeight || width > requiredWidth){
            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            while((halfHeight / inSampleSize) > requiredHeight &&
                    (halfWidth/inSampleSize) > requiredWidth){
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resourceId,
                                                         int requiredWidth, int requiredHeight){
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resourceId, options);

        options.inSampleSize = calculateInSampleSize(options, requiredWidth, requiredHeight);

        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resourceId, options);
    }
}
