// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.indianvegrecipes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ImageActivity extends ImageView
{

    public ImageActivity(Context context)
    {
        super(context);
    }

    public ImageActivity(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ImageActivity(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
