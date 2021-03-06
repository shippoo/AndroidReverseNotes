package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.zi */
public final class C9175zi extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k = C5163c.m7876a(k, looper);
                k.setColor(-16726153);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(36.0f, 60.0f);
                l.cubicTo(32.61305f, 60.0f, 29.357191f, 59.52292f, 26.320362f, 58.64351f);
                l.lineTo(17.371504f, 62.934578f);
                l.cubicTo(17.116058f, 63.057068f, 16.831148f, 63.104713f, 16.54975f, 63.072006f);
                l.cubicTo(15.726863f, 62.976353f, 15.137323f, 62.231728f, 15.232977f, 61.40884f);
                l.lineTo(16.139269f, 53.6122f);
                l.cubicTo(9.920994f, 48.94f, 6.0f, 42.109215f, 6.0f, 34.5f);
                l.cubicTo(6.0f, 20.416739f, 19.431458f, 9.0f, 36.0f, 9.0f);
                l.cubicTo(52.568542f, 9.0f, 66.0f, 20.416739f, 66.0f, 34.5f);
                l.cubicTo(66.0f, 48.58326f, 52.568542f, 60.0f, 36.0f, 60.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
