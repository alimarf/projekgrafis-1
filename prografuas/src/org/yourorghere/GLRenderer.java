package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;


/**
 * GLRenderer.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GLRenderer implements GLEventListener, MouseListener, MouseMotionListener {
public float rotation;
    public static void main(String[] args) {
        Frame frame = new Frame("Music Box");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new GLRenderer());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
// Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    private float view_rotx = 20.0f;
    private float view_roty = 30.0f;
    private int oldMouseX;
    private int oldMouseY;

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
//        gl.glShadeModel(GL.GL_FLAT);
//        float ambient[] = {2.0f, 1.0f, 1.0f, 1.0f};
//        float difusse[] = {1.0f, 1.0f, 1.0f, 1.0f};
//        float specular[] = {0.2f, 1.0f, 0.2f, 1.0f};
//        float position[] = {20.0f, 30.0f, 20.0f, 0.0f};
//        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient, 0);
//        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, difusse, 0);
//        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular, 0);
//        float[] mambient = {0.1745f, 0.01175f, 0.01175f, 0.55f
//        };
//        float[] mdiffuse = {0.61424f, 0.04136f, 0.04136f, 0.55f};
//        float[] mspecular = {0.727811f, 0.626959f, 0.626959f, 0.55f};
//        float mshine = 76.8f;
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, mambient, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, mdiffuse, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, mspecular, 0);
//        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, mshine);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
//        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_NORMALIZE);
        drawable.addMouseListener(this);
        drawable.addMouseMotionListener(this);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        glu.gluLookAt(0,1, 15, // eye pos           
                0, 0, 0, // look at                     
                0, 1, 0);  // up 

        gl.glTranslatef(-3f, -4f, 0f);
        gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);
//        gl.glTranslatef(-0.5f, -0.5f, -1.0f);
      gl.glPushMatrix();
       Objek.Box(gl);
        gl.glPopMatrix();
        
        
        gl.glTranslatef(0.0f, 0.0f, 0.0f);
        gl.glPushMatrix();
       Objek.music_box(gl);
        gl.glPopMatrix();
        rotation += 15f;
        gl.glRotatef( rotation, 2.8f, 5.5f, -1f);  
        //tangan kiri
          gl.glPushMatrix();
       gl.glTranslatef(2.8f, 5.5f, -1f);
        Objek.tangan_kiri(gl);
        gl.glPopMatrix();
        
        //tangan kanan
        gl.glRotatef( rotation, 3.2f, 5.5f, -1f);
          gl.glPushMatrix();
       gl.glTranslatef(3.2f, 5.5f, -1f);
        Objek.tangan_kanan(gl);
        gl.glPopMatrix();
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        oldMouseX = e.getX();
        oldMouseY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Dimension size = e.getComponent().getSize();
        float thetaY = 360.0f * ((float) (x - oldMouseX) / (float) size.width);
        float thetaX = 360.0f * ((float) (oldMouseY - y) / (float) size.height);
        oldMouseX = x;
        oldMouseY = y;
        view_rotx += thetaX;
        view_roty += thetaY;
    }

    public void mouseMoved(MouseEvent e) {
    }

    void Key_Pressed(int keyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}