package com.tencent.p177mm.plugin.honey_pay.p434a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.atg;
import com.tencent.p177mm.protocal.protobuf.ath;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.wallet_core.p649c.C44428p;

/* renamed from: com.tencent.mm.plugin.honey_pay.a.f */
public final class C28288f extends C44428p {
    private final String TAG = "MicroMsg.NetSceneHoneyPayerList";
    public ath nqC;

    public C28288f() {
        AppMethodBeat.m2504i(41727);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new atg();
        c1196a.fsK = new ath();
        c1196a.fsI = 2725;
        c1196a.uri = "/cgi-bin/mmpay-bin/honeypayerlist";
        c1196a.fsL = 0;
        c1196a.fsM = 0;
        this.ehh = c1196a.acD();
        AppMethodBeat.m2505o(41727);
    }

    public final int getType() {
        return 2725;
    }

    /* renamed from: b */
    public final void mo6948b(int i, int i2, String str, C1929q c1929q) {
        AppMethodBeat.m2504i(41728);
        C4990ab.m7417i("MicroMsg.NetSceneHoneyPayerList", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.nqC = (ath) ((C7472b) c1929q).fsH.fsP;
        C4990ab.m7417i("MicroMsg.NetSceneHoneyPayerList", "retcode: %s, retmsg: %s", Integer.valueOf(this.nqC.kdT), this.nqC.kdU);
        if (this.ehi != null) {
            this.ehi.onSceneEnd(i, i2, str, this);
        }
        AppMethodBeat.m2505o(41728);
    }

    /* renamed from: f */
    public final void mo6949f(C1929q c1929q) {
        ath ath = (ath) ((C7472b) c1929q).fsH.fsP;
        this.AfC = ath.kdT;
        this.AfD = ath.kdU;
    }
}
