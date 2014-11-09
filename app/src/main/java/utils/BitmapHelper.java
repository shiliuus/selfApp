package utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by lshi on 10/31/2014.
 */
public class BitmapHelper {

    private Bitmap compressImage(Bitmap image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos); //100表示不压缩，把压缩后的数据存放到baos
        int options = 100;

        //循环判断压缩后图片是否大于100kb,大于则继续压缩
        while (baos.toByteArray().length / 1024 > 100) {
            baos.reset(); // reset baos
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);
            options -= 10;  //minus 10 every time
        }
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);

        return bitmap;
    }

    public static int calculateRatio (BitmapFactory.Options options, int reqWidth, int reqHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);

            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;

        }

        return inSampleSize;
    }

    public static Bitmap getDecodedImageFromResource (Resources res, int resId, int reqWidth, int reqHeight) {
        //set inJustDecodeBounds true to get the width and height of the img
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        //invoke the previous functions to calculate the value of inSampleSize
        options.inSampleSize = calculateRatio(options, reqWidth, reqHeight);
        //decode the img with the inSampleSize'
        options.inJustDecodeBounds = false;

        Bitmap bm = BitmapFactory.decodeResource(res, resId, options);
        if (bm == null) {
            return null;
        }

//        int degree = readPictureDegree(res, resId);
//        bm = rotateBitmap(bm, degree);
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            bm.compress(Bitmap.CompressFormat.PNG, 30, baos);
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bm;
    }



    
}
