// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::TensorHandle*,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorHandleVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorHandleVector(Pointer p) { super(p); }
    public TensorHandleVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorHandleVector put(@ByRef TensorHandleVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native TensorHandle get(@Cast("size_t") long i);
    public native TensorHandleVector put(@Cast("size_t") long i, TensorHandle value);
}
