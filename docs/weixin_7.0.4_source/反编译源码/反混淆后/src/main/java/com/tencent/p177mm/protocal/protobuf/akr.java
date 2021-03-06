package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.akr */
public final class akr extends bsr {
    public double latitude;
    public double longitude;
    public int offset;
    public int scene;
    public int vKW;
    public int wnj;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(89095);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.offset);
            c6093a.mo13480iz(3, this.vKW);
            c6093a.mo13476f(4, this.latitude);
            c6093a.mo13476f(5, this.longitude);
            c6093a.mo13480iz(6, this.scene);
            c6093a.mo13480iz(7, this.wnj);
            AppMethodBeat.m2505o(89095);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = (((((ix + C6091a.m9572bs(2, this.offset)) + C6091a.m9572bs(3, this.vKW)) + (C6091a.m9576fv(4) + 8)) + (C6091a.m9576fv(5) + 8)) + C6091a.m9572bs(6, this.scene)) + C6091a.m9572bs(7, this.wnj);
            AppMethodBeat.m2505o(89095);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(89095);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            akr akr = (akr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        akr.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 2:
                    akr.offset = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 3:
                    akr.vKW = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 4:
                    akr.latitude = Double.longBitsToDouble(c6086a2.BTU.eib());
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 5:
                    akr.longitude = Double.longBitsToDouble(c6086a2.BTU.eib());
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 6:
                    akr.scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89095);
                    return 0;
                case 7:
                    akr.wnj = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89095);
                    return 0;
                default:
                    AppMethodBeat.m2505o(89095);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(89095);
            return -1;
        }
    }
}
