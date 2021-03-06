package com.tencent.p177mm.media.p866d;

import android.annotation.SuppressLint;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.nio.ByteBuffer;
import p000a.C0220l;
import p000a.C37091y;
import p000a.p005f.p006a.C31214a;
import p000a.p005f.p006a.C31591m;
import p000a.p005f.p007b.C25052j;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00128\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0003J\"\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u001a"}, dWq = {"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoder;", "Lcom/tencent/mm/media/encoder/IAudioEncoder;", "mediaFormat", "Landroid/media/MediaFormat;", "frameEncodeCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "frameEncodeEndCallback", "Lkotlin/Function0;", "(Landroid/media/MediaFormat;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "drainEncoder", "sendDataToEncoder", "pcmData", "", "pts", "", "isLast", "", "startEncoder", "Companion", "plugin-mediaeditor_release"})
/* renamed from: com.tencent.mm.media.d.c */
public final class C41212c extends C37887a {
    public static final C37888a eVC = new C37888a();

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, dWq = {"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoder$Companion;", "", "()V", "TAG", "", "TIMEOUT", "", "plugin-mediaeditor_release"})
    /* renamed from: com.tencent.mm.media.d.c$a */
    public static final class C37888a {
        private C37888a() {
        }

        public /* synthetic */ C37888a(byte b) {
            this();
        }
    }

    static {
        AppMethodBeat.m2504i(12934);
        AppMethodBeat.m2505o(12934);
    }

    public C41212c(MediaFormat mediaFormat, C31591m<? super ByteBuffer, ? super BufferInfo, C37091y> c31591m, C31214a<C37091y> c31214a) {
        C25052j.m39376p(mediaFormat, "mediaFormat");
        C25052j.m39376p(c31591m, "frameEncodeCallback");
        C25052j.m39376p(c31214a, "frameEncodeEndCallback");
        super(mediaFormat, c31591m, c31214a);
        AppMethodBeat.m2504i(12933);
        this.eVq.start();
        AppMethodBeat.m2505o(12933);
    }

    /* JADX WARNING: Missing block: B:15:0x0021, code skipped:
            r0 = new android.media.MediaCodec.BufferInfo();
     */
    /* JADX WARNING: Missing block: B:16:0x0026, code skipped:
            r1 = r10.eVq.dequeueOutputBuffer(r0, 100);
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7411d("MicroMsg.MediaCodecAACEncoder", "encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Missing block: B:17:0x0042, code skipped:
            if (r1 != -1) goto L_0x0074;
     */
    /* JADX WARNING: Missing block: B:18:0x0044, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7410d("MicroMsg.MediaCodecAACEncoder", "no output available, break");
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12931);
     */
    /* JADX WARNING: Missing block: B:27:0x0075, code skipped:
            if (r1 != -2) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:28:0x0077, code skipped:
            r1 = r10.eVq.getOutputFormat();
            p000a.p005f.p007b.C25052j.m39375o(r1, "encoder.outputFormat");
            mo60635c(r1);
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7417i("MicroMsg.MediaCodecAACEncoder", "dstMediaFormat change: %s", r10.eVr);
     */
    /* JADX WARNING: Missing block: B:29:0x0098, code skipped:
            if (r1 >= 0) goto L_0x00af;
     */
    /* JADX WARNING: Missing block: B:30:0x009a, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7413e("MicroMsg.MediaCodecAACEncoder", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Missing block: B:32:0x00b3, code skipped:
            if ((r0.flags & 2) == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Missing block: B:33:0x00b5, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7419v("MicroMsg.MediaCodecAACEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", java.lang.Integer.valueOf(r0.size), java.lang.Boolean.TRUE);
            r0.size = 0;
     */
    /* JADX WARNING: Missing block: B:34:0x00d2, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7418v("MicroMsg.MediaCodecAACEncoder", "perform encoding");
            r2 = r10.eVq.getOutputBuffers()[r1];
     */
    /* JADX WARNING: Missing block: B:35:0x00e3, code skipped:
            if (r2 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Missing block: B:36:0x00e5, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7412e("MicroMsg.MediaCodecAACEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12931);
     */
    /* JADX WARNING: Missing block: B:38:0x00f7, code skipped:
            if (r0.size <= 0) goto L_0x00fc;
     */
    /* JADX WARNING: Missing block: B:39:0x00f9, code skipped:
            mo60636f(r2, r0);
     */
    /* JADX WARNING: Missing block: B:40:0x00fc, code skipped:
            r10.eVq.releaseOutputBuffer(r1, false);
     */
    /* JADX WARNING: Missing block: B:41:0x0106, code skipped:
            if ((r0.flags & 4) == 0) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:42:0x0108, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "receive EOS!");
            r10.eVq.stop();
            r10.eVq.release();
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12931);
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:53:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:54:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @SuppressLint({"WrongConstant"})
    /* renamed from: UR */
    private final void m71739UR() {
        AppMethodBeat.m2504i(12931);
        try {
            synchronized (this.eTu) {
                if (this.eTf) {
                    C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "drainEncoder end now");
                    AppMethodBeat.m2505o(12931);
                    return;
                }
                C37091y c37091y = C37091y.AUy;
            }
        } catch (Exception e) {
            C4990ab.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", e, "drainEncoder error: %s", e.getMessage());
            AppMethodBeat.m2505o(12931);
        } catch (Throwable th) {
            AppMethodBeat.m2505o(12931);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000e, B:6:0x0020] */
    /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x0035, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", r0, "", new java.lang.Object[0]);
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12932);
     */
    /* JADX WARNING: Missing block: B:19:0x0049, code skipped:
            r10.eVs = com.tencent.p177mm.sdk.platformtools.C5046bo.m7588yz();
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder, pcmData size:" + r11.length + ", pts:" + r12 + ", isLast:" + r14);
            r1 = r10.eVq.dequeueInputBuffer(100);
     */
    /* JADX WARNING: Missing block: B:20:0x0084, code skipped:
            if (r1 >= 0) goto L_0x0092;
     */
    /* JADX WARNING: Missing block: B:21:0x0086, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7410d("MicroMsg.MediaCodecAACEncoder", "encoder no input buffer available, drain first");
            m71739UR();
     */
    /* JADX WARNING: Missing block: B:22:0x0092, code skipped:
            if (r1 < 0) goto L_0x00cf;
     */
    /* JADX WARNING: Missing block: B:23:0x0094, code skipped:
            r0 = r10.eVq.getInputBuffers()[r1];
     */
    /* JADX WARNING: Missing block: B:24:0x009c, code skipped:
            if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Missing block: B:25:0x009e, code skipped:
            r0.clear();
     */
    /* JADX WARNING: Missing block: B:26:0x00a1, code skipped:
            if (r0 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Missing block: B:27:0x00a3, code skipped:
            r0.position(0);
     */
    /* JADX WARNING: Missing block: B:28:0x00a7, code skipped:
            if (r0 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Missing block: B:29:0x00a9, code skipped:
            r0.put(r11);
     */
    /* JADX WARNING: Missing block: B:30:0x00ac, code skipped:
            if (r14 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Missing block: B:31:0x00ae, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "last, send EOS and try delay stop encoder");
            r0 = 1;
            releaseEncoder();
     */
    /* JADX WARNING: Missing block: B:32:0x00bb, code skipped:
            if (r0 == 0) goto L_0x00df;
     */
    /* JADX WARNING: Missing block: B:33:0x00bd, code skipped:
            com.tencent.p177mm.sdk.platformtools.C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "EOS received in sendAudioToEncoder");
            r10.eVq.queueInputBuffer(r1, 0, r11.length, r12, 4);
     */
    /* JADX WARNING: Missing block: B:34:0x00cf, code skipped:
            m71739UR();
     */
    /* JADX WARNING: Missing block: B:35:0x00d2, code skipped:
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12932);
     */
    /* JADX WARNING: Missing block: B:39:0x00d9, code skipped:
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(12932);
     */
    /* JADX WARNING: Missing block: B:41:0x00df, code skipped:
            r10.eVq.queueInputBuffer(r1, 0, r11.length, r12, 0);
     */
    /* JADX WARNING: Missing block: B:42:0x00e9, code skipped:
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:44:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:45:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo44169b(byte[] bArr, long j, boolean z) {
        AppMethodBeat.m2504i(12932);
        C25052j.m39376p(bArr, "data");
        if (bArr == null) {
            C4990ab.m7412e("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder, pcmData is null");
            AppMethodBeat.m2505o(12932);
            return;
        }
        synchronized (this.eTu) {
            if (this.eTf) {
                C4990ab.m7416i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder end now");
                AppMethodBeat.m2505o(12932);
                return;
            }
            C37091y c37091y = C37091y.AUy;
        }
    }
}
