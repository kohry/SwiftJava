
/// class java.awt.event.MouseMotionAdapter ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class MouseMotionAdapterProxy extends java.awt.event.MouseMotionAdapter {

    long __swiftObject;

    /// public java.awt.event.MouseMotionAdapter()

    MouseMotionAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.event.MouseMotionAdapter.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( long __swiftObject, java.awt.event.MouseEvent e );

    boolean entered_mouseMoved_0;

    public void mouseMoved( java.awt.event.MouseEvent e ) {
        if ( !entered_mouseMoved_0 ) {
            entered_mouseMoved_0 = true;
            __mouseMoved( __swiftObject, e);
            entered_mouseMoved_0 = false;
        }
        else
            super.mouseMoved( e );
    }

    /// public void java.awt.event.MouseMotionAdapter.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( long __swiftObject, java.awt.event.MouseEvent e );

    boolean entered_mouseDragged_1;

    public void mouseDragged( java.awt.event.MouseEvent e ) {
        if ( !entered_mouseDragged_1 ) {
            entered_mouseDragged_1 = true;
            __mouseDragged( __swiftObject, e);
            entered_mouseDragged_1 = false;
        }
        else
            super.mouseDragged( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_2;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_2 ) {
            entered_equals_2 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_2 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_3;

    public java.lang.String toString() {
        if ( !entered_toString_3 ) {
            entered_toString_3 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_3 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_4;

    public int hashCode() {
        if ( !entered_hashCode_4 ) {
            entered_hashCode_4 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_4 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}