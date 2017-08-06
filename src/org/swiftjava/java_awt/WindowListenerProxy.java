
/// interface java.awt.event.WindowListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class WindowListenerProxy implements java.awt.event.WindowListener {

    long __swiftObject;

    WindowListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.WindowListener.windowOpened(java.awt.event.WindowEvent)

    public native void __windowOpened( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowOpened( java.awt.event.WindowEvent e ) {
        __windowOpened( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowClosing(java.awt.event.WindowEvent)

    public native void __windowClosing( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowClosing( java.awt.event.WindowEvent e ) {
        __windowClosing( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowClosed(java.awt.event.WindowEvent)

    public native void __windowClosed( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowClosed( java.awt.event.WindowEvent e ) {
        __windowClosed( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowIconified(java.awt.event.WindowEvent)

    public native void __windowIconified( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowIconified( java.awt.event.WindowEvent e ) {
        __windowIconified( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowDeiconified(java.awt.event.WindowEvent)

    public native void __windowDeiconified( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowDeiconified( java.awt.event.WindowEvent e ) {
        __windowDeiconified( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowActivated(java.awt.event.WindowEvent)

    public native void __windowActivated( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowActivated( java.awt.event.WindowEvent e ) {
        __windowActivated( __swiftObject, e );
    }

    /// public abstract void java.awt.event.WindowListener.windowDeactivated(java.awt.event.WindowEvent)

    public native void __windowDeactivated( long __swiftObject, java.awt.event.WindowEvent e );

    public void windowDeactivated( java.awt.event.WindowEvent e ) {
        __windowDeactivated( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}