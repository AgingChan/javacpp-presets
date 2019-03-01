// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * [XSI] This structure is used as the second parameter to the fstat(),
 * lstat(), and stat() functions.
 */
// #if __DARWIN_64_BIT_INO_T

@Name("struct stat") @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class stat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public stat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public stat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public stat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public stat position(long position) {
        return (stat)super.position(position);
    }

	public native @Cast("dev_t") int st_dev(); public native stat st_dev(int st_dev);			/* [XSI] ID of device containing file */
	public native @Cast("mode_t") short st_mode(); public native stat st_mode(short st_mode);		/* [XSI] Mode of file (see below) */
	public native @Cast("nlink_t") short st_nlink(); public native stat st_nlink(short st_nlink);		/* [XSI] Number of hard links */
	public native @Cast("__darwin_ino64_t") long st_ino(); public native stat st_ino(long st_ino);		/* [XSI] File serial number */
	public native @Cast("uid_t") int st_uid(); public native stat st_uid(int st_uid);			/* [XSI] User ID of the file */
	public native @Cast("gid_t") int st_gid(); public native stat st_gid(int st_gid);			/* [XSI] Group ID of the file */
	public native @Cast("dev_t") int st_rdev(); public native stat st_rdev(int st_rdev);		/* [XSI] Device ID */
	public native @ByRef timespec st_atimespec(); public native stat st_atimespec(timespec st_atimespec);		/* time of last access */
	public native @ByRef timespec st_mtimespec(); public native stat st_mtimespec(timespec st_mtimespec);		/* time of last data modification */
	public native @ByRef timespec st_ctimespec(); public native stat st_ctimespec(timespec st_ctimespec);		/* time of last status change */
	public native @ByRef timespec st_birthtimespec(); public native stat st_birthtimespec(timespec st_birthtimespec);	/* time of file creation(birth) */
	public native @Cast("off_t") long st_size(); public native stat st_size(long st_size);		/* [XSI] file size, in bytes */
	public native @Cast("blkcnt_t") long st_blocks(); public native stat st_blocks(long st_blocks);		/* [XSI] blocks allocated for file */
	public native @Cast("blksize_t") int st_blksize(); public native stat st_blksize(int st_blksize);		/* [XSI] optimal blocksize for I/O */
	public native @Cast("__uint32_t") int st_flags(); public native stat st_flags(int st_flags);		/* user defined flags for file */
	public native @Cast("__uint32_t") int st_gen(); public native stat st_gen(int st_gen);			/* file generation number */
	public native @Cast("__int32_t") int st_lspare(); public native stat st_lspare(int st_lspare);		/* RESERVED: DO NOT USE! */
	public native @Cast("__int64_t") long st_qspare(int i); public native stat st_qspare(int i, long st_qspare);
	@MemberGetter public native @Cast("__int64_t*") LongPointer st_qspare();		/* RESERVED: DO NOT USE! */
}