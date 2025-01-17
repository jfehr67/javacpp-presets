// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// Input/Output structure for reconstructed validity bitmaps.
@Namespace("parquet::internal") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ValidityBitmapInputOutput extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ValidityBitmapInputOutput() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ValidityBitmapInputOutput(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValidityBitmapInputOutput(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ValidityBitmapInputOutput position(long position) {
        return (ValidityBitmapInputOutput)super.position(position);
    }
    @Override public ValidityBitmapInputOutput getPointer(long i) {
        return new ValidityBitmapInputOutput((Pointer)this).offsetAddress(i);
    }

  // Input only.
  // The maximum number of values_read expected (actual
  // values read must be less than or equal to this value).
  // If this number is exceeded methods will throw a
  // ParquetException. Exceeding this limit indicates
  // either a corrupt or incorrectly written file.
  public native @Cast("int64_t") long values_read_upper_bound(); public native ValidityBitmapInputOutput values_read_upper_bound(long setter);
  // Output only. The number of values added to the encountered
  // (this is logically the count of the number of elements
  // for an Arrow array).
  public native @Cast("int64_t") long values_read(); public native ValidityBitmapInputOutput values_read(long setter);
  // Input/Output. The number of nulls encountered.
  public native @Cast("int64_t") long null_count(); public native ValidityBitmapInputOutput null_count(long setter);
  // Output only. The validity bitmap to populate. May be be null only
  // for DefRepLevelsToListInfo (if all that is needed is list offsets).
  public native @Cast("uint8_t*") BytePointer valid_bits(); public native ValidityBitmapInputOutput valid_bits(BytePointer setter);
  // Input only, offset into valid_bits to start at.
  public native @Cast("int64_t") long valid_bits_offset(); public native ValidityBitmapInputOutput valid_bits_offset(long setter);
}
