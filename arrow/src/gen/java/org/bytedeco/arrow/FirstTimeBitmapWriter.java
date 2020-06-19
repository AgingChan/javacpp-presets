// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FirstTimeBitmapWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FirstTimeBitmapWriter(Pointer p) { super(p); }

  public FirstTimeBitmapWriter(@Cast("uint8_t*") BytePointer bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length) { super((Pointer)null); allocate(bitmap, start_offset, length); }
  private native void allocate(@Cast("uint8_t*") BytePointer bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length);
  public FirstTimeBitmapWriter(@Cast("uint8_t*") ByteBuffer bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length) { super((Pointer)null); allocate(bitmap, start_offset, length); }
  private native void allocate(@Cast("uint8_t*") ByteBuffer bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length);
  public FirstTimeBitmapWriter(@Cast("uint8_t*") byte[] bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length) { super((Pointer)null); allocate(bitmap, start_offset, length); }
  private native void allocate(@Cast("uint8_t*") byte[] bitmap, @Cast("int64_t") long start_offset, @Cast("int64_t") long length);

  public native void Set();

  public native void Clear();

  public native void Next();

  public native void Finish();

  public native @Cast("int64_t") @Name("position") long _position();
}