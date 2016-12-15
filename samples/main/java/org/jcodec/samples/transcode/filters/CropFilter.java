package org.jcodec.samples.transcode.filters;

import org.jcodec.common.model.Picture8Bit;
import org.jcodec.samples.transcode.V2VTranscoder.Filter;
import org.jcodec.samples.transcode.V2VTranscoder.PixelStore;

public class CropFilter implements Filter {

    @Override
    public Picture8Bit filter(Picture8Bit picture, PixelStore store) {
        return picture;
    }
}