package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class axz extends bsr {
    public int OpCode;
    public SKBuiltinBuffer_t vIl;
    public float vRp;
    public float vRq;
    public int wfG;
    public String wfH;
    public String wfI;
    public int wfJ;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(55527);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.OpCode);
            aVar.r(3, this.vRp);
            aVar.r(4, this.vRq);
            aVar.iz(5, this.wfG);
            if (this.wfH != null) {
                aVar.e(6, this.wfH);
            }
            if (this.wfI != null) {
                aVar.e(7, this.wfI);
            }
            aVar.iz(8, this.wfJ);
            if (this.vIl != null) {
                aVar.iy(9, this.vIl.computeSize());
                this.vIl.writeFields(aVar);
            }
            AppMethodBeat.o(55527);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (((ix + e.a.a.b.b.a.bs(2, this.OpCode)) + (e.a.a.b.b.a.fv(3) + 4)) + (e.a.a.b.b.a.fv(4) + 4)) + e.a.a.b.b.a.bs(5, this.wfG);
            if (this.wfH != null) {
                ix += e.a.a.b.b.a.f(6, this.wfH);
            }
            if (this.wfI != null) {
                ix += e.a.a.b.b.a.f(7, this.wfI);
            }
            ix += e.a.a.b.b.a.bs(8, this.wfJ);
            if (this.vIl != null) {
                ix += e.a.a.a.ix(9, this.vIl.computeSize());
            }
            AppMethodBeat.o(55527);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(55527);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            axz axz = (axz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        axz.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(55527);
                    return 0;
                case 2:
                    axz.OpCode = aVar3.BTU.vd();
                    AppMethodBeat.o(55527);
                    return 0;
                case 3:
                    axz.vRp = Float.intBitsToFloat(aVar3.BTU.eia());
                    AppMethodBeat.o(55527);
                    return 0;
                case 4:
                    axz.vRq = Float.intBitsToFloat(aVar3.BTU.eia());
                    AppMethodBeat.o(55527);
                    return 0;
                case 5:
                    axz.wfG = aVar3.BTU.vd();
                    AppMethodBeat.o(55527);
                    return 0;
                case 6:
                    axz.wfH = aVar3.BTU.readString();
                    AppMethodBeat.o(55527);
                    return 0;
                case 7:
                    axz.wfI = aVar3.BTU.readString();
                    AppMethodBeat.o(55527);
                    return 0;
                case 8:
                    axz.wfJ = aVar3.BTU.vd();
                    AppMethodBeat.o(55527);
                    return 0;
                case 9:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        axz.vIl = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(55527);
                    return 0;
                default:
                    AppMethodBeat.o(55527);
                    return -1;
            }
        } else {
            AppMethodBeat.o(55527);
            return -1;
        }
    }
}
