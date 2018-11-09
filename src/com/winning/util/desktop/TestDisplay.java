package com.winning.util.desktop;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class TestDisplay {
    public static void main(String[] args){
        Display display = new Display();
        Shell shell = new Shell(display,SWT.APPLICATION_MODAL);
        shell.open();
    }
}
