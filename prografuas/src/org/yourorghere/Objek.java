package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

//    static void music_box (GL gl){
//        //kotak music
//        gl.glPushMatrix();
//        gl.glTranslatef(0,0,0);
//        Objek.Box(gl);
//        gl.glPopMatrix();
//        
//        gl.glPushMatrix();
//        gl.glTranslatef(0,0,0);
//        Objek.orang(gl);
//        gl.glPopMatrix();
//    
//    }
    
    static void orang (GL gl){
          //kepala    
        gl.glPushMatrix();
       gl.glTranslatef(3f, 7f, -1f);
       Objek.kepala(gl);
        gl.glPopMatrix();
        
      //badan       
       gl.glPushMatrix();
       gl.glTranslatef(3f, 6f, -1f);
        Objek.badan(gl);
        gl.glPopMatrix();
        
//      //tangan kiri
//          gl.glPushMatrix();
//       gl.glTranslatef(2.8f, 5.5f, -1f);
//       gl.glRotatef(180, -180, -80 , 180);
//        Objek.tangan(gl);
//        gl.glPopMatrix();
//        
//        //tangan kanan
//          gl.glPushMatrix();
//       gl.glTranslatef(3.2f, 5.5f, -1f);
//       gl.glRotatef(180, 180, -80 , 180);
//      Objek.tangan(gl);
//        gl.glPopMatrix();
        
        //kaki kanan
          gl.glPushMatrix();
       gl.glTranslatef(3f, 3.8f, -1f);
       gl.glRotatef(180, 180, -290 , 350);
       Objek.kaki(gl);
        gl.glPopMatrix();
        
        //kaki kiri
           gl.glPushMatrix();
       gl.glTranslatef(3f, 3.8f, -1f);
       gl.glRotatef(180, -180, -290 , 350);
        Objek.kaki(gl);
        gl.glPopMatrix();
        
         //gear besar
           gl.glPushMatrix();
       gl.glTranslatef(-3f, 2.5f, -1f);
       gl.glRotatef(180, -180, -290 , 350);
       // Objek.Gear(gl);
        gl.glPopMatrix();
    }
    
    static void Box
        (GL gl) {
//            float amb[] = {0.11f, 0.2f, 1f, 10};
//        float diff[] = {0f, 0.93f, 1f, 10};
//        float spec[] = {0f, 0.79f, 0f, 10};
//        float shine = 76.8f;
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
//        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
            
            gl.glBegin(gl.GL_QUADS); //Belakang
            gl.glColor3f(0, 1, 1);
        gl.glVertex3f(-5.0f, 4.0f, -3.0f); //titik kiri atas
        gl.glVertex3f(5.0f, 4.0f, -3.0f); //titik kanan atas
        gl.glVertex3f(5.0f, 0.0f, -3.0f); //titik kanan bawah
        gl.glVertex3f(-5.0f, 0.0f, -3.0f); //titik kiri bawah
        gl.glEnd();
        
         gl.glBegin(gl.GL_QUADS); //Knaan
         gl.glColor3f(0, 1, 1);
        gl.glVertex3f(5f, 4.0f, -3.0f); //titik kiri atas
        gl.glVertex3f(5f, 4.0f, 3.0f); // titik kanan atas
        gl.glVertex3f(5f, 0.0f, 3.0f); // titik kanan bawah
        gl.glVertex3f(5f, 0.0f, -3.0f); // titik kiri bawah
        gl.glEnd();
        
            gl.glBegin(gl.GL_QUADS); //Kiri  
            gl.glColor3f(0, 1, 1);
        gl.glVertex3f(-5f, 4.0f, 3.0f); //titik kiri atas
        gl.glVertex3f(-5f, 4.0f, -3.0f); //titik kanan atas
        gl.glVertex3f(-5f, 0.0f, -3.0f); // titik kiri bawah
        gl.glVertex3f(-5f, 0.0f, 3.0f); // titik kanan bawah
        gl.glEnd();
        
         gl.glBegin(gl.GL_QUADS); //Bawah 
         gl.glColor3f(0, 1, 1);
        gl.glVertex3f(-5f, 0.0f, -3.0f); // titik kiri atas
        gl.glVertex3f(5f, 0.0f, -3.0f); // titik kanan atas
        gl.glVertex3f(5f, 0.0f, 3.0f);  // titik kanan bawah
        gl.glVertex3f(-5f, 0.0f, 3.0f); // titik kiri bawah
        gl.glEnd();
        
         gl.glBegin(gl.GL_QUADS);   //Depan  
         gl.glColor3f(0, 1, 1);
        gl.glVertex3f(-5f, 4.0f, 3.0f); //titik kiri atas
        gl.glVertex3f(5f, 4.0f, 3.0f); //titik kanan atas
        gl.glVertex3f(5f, 0.0f, 3.0f); //titik kanan bawah
        gl.glVertex3f(-5f, 0.0f, 3.0f); //titik kiri bawah
        gl.glEnd();
        
        
        gl.glBegin(gl.GL_QUADS); //Atas 
        gl.glColor3f(1, 0, 0);
        gl.glVertex3f(-5f, 2f, -3.0f); //titik kiri atas
        gl.glVertex3f(5f, 2f, -3.0f); //titik kanan atas
        gl.glVertex3f(5f, 2f, 3.0f); //titik kanan bawah
        gl.glVertex3f(-5f, 2f, 3.0f); //titik kiri bawah
        gl.glEnd();    
            
    }


    
    static void kepala(GL gl){
//        float amb[] = {1f, 0f, 0f, 1};
//        float diff[] = {0f, 0.78f, 0f, 1};
//        float spec[] = {0f, 0f, 0f, 1};
//        float shine = 76.8f;
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
//        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        gl.glColor3f(1,0,1);
        float BODY_RADIUS = 1f;
        int SLICES = 10;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
    static void badan(GL gl) {
        gl.glRotatef(180, 0, -180, 180);
        float BODY_LENGTH = 2.5f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup atas     
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup bawah    
        gl.glRotatef(180, 0, 0, 0);  
    
   
    }
    static void tangan(GL gl){
        
        float angle = 0.0f;
        float direction = 5.0f;
        
        float BODY_LENGTH = 2f;
        float BODY_RADIUS = 0.3f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup atas     
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup bawah    
        gl.glRotatef(angle, 0, 0, 1);
           angle += direction;
        if(angle >= 80 || angle <= -100){
            direction = -direction;
        }
        
    }
    static void kaki(GL gl){
        
        
        float BODY_LENGTH = 2f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup atas     
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS); //lingkaran untuk tutup bawah    
          
    }
    
    static void Gear (GL gl) {
        float amb[] = {1f, 0f, 0f, 1};
        float diff[] = {0f, 0f, 0f, 1};
        float spec[] = {0f, 0f, 0f, 1};
        float shine = 76.8f;
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        float angle = 0.0f;
      float direction = 3f;
        
      gl.glRotatef(180,0,-200,0);
        float sudut =8;
        float delta = 360/sudut;
//        for(int i =0;i<sudut;i++){
//            
//            if(delta <360){
//           gl.glRotatef(delta,0,0,1); 
        
            gl.glBegin(GL.GL_POLYGON);

             
        gl.glEnd();
        
        
//        gl.glBegin(GL.GL_POLYGON);
//
//        gl.glVertex3f(0.0f, 0f, 0.0f);
//        gl.glVertex3f(0.0f, 0f, 0.2f);
//        gl.glVertex3f(0.6f, 0f, 0.7f);
//        gl.glVertex3f(1.6f, 0f, 0.5f);
//        gl.glVertex3f(1.6f, 0f, 0f);
//        gl.glVertex3f(0.6f, 0f, -0.4f);
//        gl.glEnd();
        
        
        
//         }
//            delta += 45;
//                }
//        angle ++;
        
    }
    

   

    
    
}
