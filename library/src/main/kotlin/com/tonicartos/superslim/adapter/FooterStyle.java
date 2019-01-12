package com.tonicartos.superslim.adapter;

import com.tonicartos.superslim.SectionConfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

@IntDef({SectionConfig.FOOTER_END,
        SectionConfig.FOOTER_STICKY,
        SectionConfig.FOOTER_INLINE,
        SectionConfig.FOOTER_START})
@Retention(RetentionPolicy.SOURCE)
public @interface FooterStyle {

}
