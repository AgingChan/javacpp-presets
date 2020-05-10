// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;



// Describes a oneof defined in a message type.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OneofDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OneofDescriptor(Pointer p) { super(p); }


  public native @StdString BytePointer name();       // Name of this oneof.
  public native @StdString BytePointer full_name();  // Fully-qualified name of the oneof.

  // Index of this oneof within the message's oneof array.
  public native int index();

  // The .proto file in which this oneof was defined.  Never NULL.
  public native @Const FileDescriptor file();
  // The Descriptor for the message containing this oneof.
  public native @Cast("const google::protobuf::Descriptor*") Pointer containing_type();

  // The number of (non-extension) fields which are members of this oneof.
  public native int field_count();
  // Get a member of this oneof, in the order in which they were declared in the
  // .proto file.  Does not include extensions.
  public native @Const FieldDescriptor field(int index);

  public native @Const @ByRef OneofOptions options();

  // See Descriptor::CopyTo().
  public native void CopyTo(OneofDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this oneof declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
