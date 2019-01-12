package com.tonicartos.superslim.adapter;

import com.tonicartos.superslim.SectionConfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

@IntDef({SectionConfig.HEADER_END,
        SectionConfig.HEADER_STICKY,
        SectionConfig.HEADER_INLINE,
        SectionConfig.HEADER_START})
@Retention(RetentionPolicy.SOURCE)
public @interface HeaderStyle {

}
