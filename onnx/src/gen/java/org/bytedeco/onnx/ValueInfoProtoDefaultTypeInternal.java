// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ValueInfoProtoDefaultTypeInternal extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ValueInfoProtoDefaultTypeInternal() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueInfoProtoDefaultTypeInternal(Pointer p) { super(p); }
}
