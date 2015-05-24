package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : morph.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Sela extends Structure {
	/**
	 * number of sel actually stored<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * size of allocated ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * sel ptr array<br>
	 * C type : Sel**
	 */
	public PointerByReference sel;
	public Sela() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("n", "nalloc", "sel");
	}
	/**
	 * @param n number of sel actually stored<br>
	 * C type : l_int32<br>
	 * @param nalloc size of allocated ptr array<br>
	 * C type : l_int32<br>
	 * @param sel sel ptr array<br>
	 * C type : Sel**
	 */
	public Sela(int n, int nalloc, PointerByReference sel) {
		super();
		this.n = n;
		this.nalloc = nalloc;
//		if ((sel.length != this.sel.length)) 
//			throw new IllegalArgumentException("Wrong array size !");
		this.sel = sel;
	}
	public Sela(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends Sela implements Structure.ByReference {
		
	};
	public static class ByValue extends Sela implements Structure.ByValue {
		
	};
}
