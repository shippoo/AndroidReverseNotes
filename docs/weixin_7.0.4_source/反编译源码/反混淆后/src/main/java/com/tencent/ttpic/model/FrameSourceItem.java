package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.C41672h;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.BenchUtil;
import java.util.List;

public abstract class FrameSourceItem {
    private static final String TAG = FrameSourceItem.class.getSimpleName();
    protected BaseFilter filter;

    public abstract void clear();

    public abstract int getOrigHeight(int i);

    public abstract int getOrigWidth(int i);

    public abstract int getTexture(CanvasItem canvasItem, long j);

    public abstract void init();

    public abstract void reset();

    public FrameSourceItem(BaseFilter baseFilter) {
        this.filter = baseFilter;
    }

    public void update(C41672h c41672h, long j, List<List<PointF>> list, List<float[]> list2, int i) {
    }

    public void draw(C41672h c41672h, CanvasItem canvasItem, long j) {
        BenchUtil.benchStart(getClass().getSimpleName() + "[draw]");
        int texture = getTexture(canvasItem, j);
        float[] calPositions = AlgoUtils.calPositions(canvasItem.itemRect, getOrigWidth(canvasItem.index), getOrigHeight(canvasItem.index), c41672h.width, c41672h.height, canvasItem.itemResizeMode);
        float[] calTexCords = AlgoUtils.calTexCords(canvasItem.itemRect, getOrigWidth(canvasItem.index), getOrigHeight(canvasItem.index), canvasItem.itemResizeMode);
        this.filter.setPositions(calPositions);
        this.filter.setTexCords(calTexCords);
        BenchUtil.benchStart(this.filter.getClass().getSimpleName() + "[draw]");
        this.filter.OnDrawFrameGLSL();
        this.filter.renderTexture(texture, c41672h.width, c41672h.height);
        BenchUtil.benchEnd(this.filter.getClass().getSimpleName() + "[draw]");
        BenchUtil.benchEnd(getClass().getSimpleName() + "[draw]");
    }
}
