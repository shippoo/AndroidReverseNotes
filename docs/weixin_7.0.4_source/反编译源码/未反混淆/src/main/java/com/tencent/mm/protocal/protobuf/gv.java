package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class gv extends a {
    public int jBv;
    public LinkedList<gu> jBw = new LinkedList();

    public gv() {
        AppMethodBeat.i(28335);
        AppMethodBeat.o(28335);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28336);
        int bs;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.jBv);
            aVar.e(2, 8, this.jBw);
            AppMethodBeat.o(28336);
            return 0;
        } else if (i == 1) {
            bs = (e.a.a.b.b.a.bs(1, this.jBv) + 0) + e.a.a.a.c(2, 8, this.jBw);
            AppMethodBeat.o(28336);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.jBw.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(28336);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            gv gvVar = (gv) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    gvVar.jBv = aVar3.BTU.vd();
                    AppMethodBeat.o(28336);
                    return 0;
                case 2:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        gu guVar = new gu();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = guVar.populateBuilderWithField(aVar4, guVar, a.getNextFieldNumber(aVar4))) {
                        }
                        gvVar.jBw.add(guVar);
                    }
                    AppMethodBeat.o(28336);
                    return 0;
                default:
                    AppMethodBeat.o(28336);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28336);
            return -1;
        }
    }
}
