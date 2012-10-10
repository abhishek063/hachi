/*
<applet code="hachi" width=1250 height=650>
<param name="img0" value="house1.jpg">
<param name="img1" value="house2.jpg">
<param name="img2" value="house3.jpg">
<param name="img3" value="house4.jpg">
<param name="img4" value="house5.jpg">
<param name="img5" value="house6.jpg">
<param name="img6" value="house7.jpg">
<param name="img7" value="house8.jpg">
<param name="img8" value="post_office.jpg">
<param name="img9" value="postman.jpg">

</applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class hachi extends Applet implements Runnable,ActionListener
{
TextField s,l,c;
Button b1,b2;
Label status,location,circuit;
Font f;
Thread t=null;
int state;
boolean stopFlag;
int w,h;
int flag,flag1=0;
Image img[]=new Image[10];

public void init() 
{
b1=new Button("Calculate Path");
b2=new Button("Send Letters");
f=new Font("Dialog", Font.BOLD, 15);
setFont(f);
Label status = new Label("stack: ", Label.RIGHT);
Label location = new Label("location: ", Label.RIGHT);
Label circuit = new Label("circuit: ", Label.RIGHT);

s = new TextField(17);
l = new TextField(17);
c = new TextField(17);

add(b1);
add(status);
add(s);
add(location);
add(l);
add(circuit);
add(c);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);

img[0] = getImage(getDocumentBase(), getParameter("img0"));
img[1] = getImage(getDocumentBase(), getParameter("img1"));
img[2] = getImage(getDocumentBase(), getParameter("img2"));
img[3] = getImage(getDocumentBase(), getParameter("img3"));
img[4] = getImage(getDocumentBase(), getParameter("img4"));
img[5] = getImage(getDocumentBase(), getParameter("img5"));
img[6] = getImage(getDocumentBase(), getParameter("img6"));
img[7] = getImage(getDocumentBase(), getParameter("img7"));
img[8] = getImage(getDocumentBase(), getParameter("img8"));
img[9] = getImage(getDocumentBase(), getParameter("img9"));

}

public void actionPerformed(ActionEvent ae)
{
String str = ae.getActionCommand();
if(str.equals("Calculate Path")) 
{
t = new Thread(this);
stopFlag = false;
t.start();
}
else if(str.equals("Send Letters"))
{
flag1=1;
t = new Thread(this);
stopFlag = false;
t.start();
}
}

public void start() 
{
}

public void run() 
{
for(flag=0;flag<25;flag++) 
{
try {
repaint();
Thread.sleep(2000);
if(stopFlag)
break;
} catch(InterruptedException e) {}
}
}

public void stop()
{
stopFlag = true;
t = null;
}

public void paint(Graphics g) 
{
g.drawImage(img[0], 50, 40, this);
g.drawImage(img[1], 604, 114, this);
g.drawImage(img[2], 990, 270, this);
g.drawImage(img[3], 1050, 110, this);
g.drawImage(img[4], 215, 525, this);
g.drawImage(img[5], 81, 292, this);
g.drawImage(img[6], 645, 550, this);
g.drawImage(img[7], 925, 460, this);
g.drawImage(img[8], 451, 295, this);
g.drawImage(img[9], 475, 367, this);

g.drawString("1",490,296);
g.drawString("2",630,125);
g.drawString("4",1081,115);
g.drawString("3",1012,280);
g.drawString("8",968,460);
g.drawString("7",693,567);
g.drawString("5",268,538);
g.drawString("6",131,298);
g.drawString("9",100,50);
g.setColor(Color.green);
g.fillOval(127,105,10,10);
g.fillOval(670,180,10,10);
g.fillOval(995,300,10,10);
g.fillOval(1043,173,10,10);
g.fillOval(913,495,10,10);
g.fillOval(671,542,10,10);
g.fillOval(245,514,10,10);
g.fillOval(150,300,10,10);
g.fillOval(490,330,10,10);
if(flag1==0)
{
g.setColor(Color.black);
if(flag<8)
g.drawLine(131,113,154,302);
if(flag<15)
g.drawLine(672,548,250,521);
if(flag<16)
g.drawLine(672,548,913,500);
if(flag<3)
g.drawLine(1048,178,1000,305);
if(flag<4)
g.drawLine(1048,178,675,185);
if(flag<2)
g.drawLine(1000,305,675,185);
if(flag<5)
g.drawLine(675,185,913,500);
if(flag<14)
g.drawLine(250,520,913,500);
if(flag<9)
g.drawLine(131,113,495,337);
if(flag<7)
g.drawLine(154,302,495,337);
if(flag<1)
g.drawLine(675,185,495,337);
if(flag<6)
g.drawLine(913,500,495,337);

if(flag==0||flag==6||flag==9||flag==12||flag==24)
{
g.setColor(Color.red);
g.fillOval(490,330,10,10);//2
}

if(flag==1)
{
g.setColor(Color.red);
g.fillOval(670,180,10,10);//2
}
if(flag==2)
{
g.setColor(Color.red);
g.fillOval(995,300,10,10);//3
}
if(flag==3)
{
g.setColor(Color.red);
g.fillOval(1043,173,10,10);//4
}
if(flag==4)
{
g.setColor(Color.red);
g.fillOval(670,180,10,10);//2
}
if(flag==5)
{
g.setColor(Color.red);
g.fillOval(913,495,10,10);//8
}
if(flag==7)
{
g.setColor(Color.red);
g.fillOval(150,300,10,10);//6
}
if(flag==8)
{
g.setColor(Color.red);
g.fillOval(127,105,10,10);//9
}
if(flag==10)
{
g.setColor(Color.red);
g.fillOval(127,105,10,10);//9
}
if(flag==11)
{
g.setColor(Color.red);
g.fillOval(150,300,10,10);//6
}
if(flag==13)
{
g.setColor(Color.red);
g.fillOval(913,495,10,10);//8
}
if(flag==14)
{
g.setColor(Color.red);
g.fillOval(245,514,10,10);//5
}
if(flag==15)
{
g.setColor(Color.red);
g.fillOval(671,542,10,10);//7
}
if(flag==16)
{
g.setColor(Color.red);
g.fillOval(913,495,10,10);//8
}
if(flag==17)
{
g.setColor(Color.red);
g.fillOval(671,542,10,10);//7
}
if(flag==18)
{
g.setColor(Color.red);
g.fillOval(245,514,10,10);//5
}
if(flag==19)
{
g.setColor(Color.red);
g.fillOval(913,495,10,10);//8
}
if(flag==20)
{
g.setColor(Color.red);
g.fillOval(670,180,10,10);//2
}
if(flag==21)
{
g.setColor(Color.red);
g.fillOval(1043,173,10,10);//4
}
if(flag==22)
{
g.setColor(Color.red);
g.fillOval(995,300,10,10);//3
}
if(flag==23)
{
g.setColor(Color.red);
g.fillOval(670,180,10,10);//2
}

if(flag==0)
l.setText("1");
if(flag==1)
{
l.setText("2");
s.setText("1");
}
if(flag==2)
{
l.setText("3");
s.setText("1,2");
}
if(flag==3)
{
l.setText("4");
s.setText("1,2,3");
}
if(flag==4)
{
l.setText("2");
s.setText("1,2,3,4");
}
if(flag==5)
{
l.setText("8");
s.setText("1,2,3,4,2");
}
if(flag==6)
{
l.setText("1");
s.setText("1,2,3,4,2,8");
}
if(flag==7)
{
l.setText("6");
s.setText("1,2,3,4,2,8,1");
}
if(flag==8)
{
l.setText("9");
s.setText("1,2,3,4,2,8,1,6");
}

if(flag==9)
{
l.setText("1");
s.setText("1,2,3,4,2,8,1,6,9");
}

if(flag==10)
{
l.setText("9");
s.setText("1,2,3,4,2,8,1,6");
c.setText("1");
}

if(flag==11)
{
l.setText("6");
s.setText("1,2,3,4,2,8,1");
c.setText("1,9");
}
if(flag==12)
{
l.setText("1");
s.setText("1,2,3,4,2,8");
c.setText("1,9,6");
}
if(flag==13)
{
l.setText("8");
s.setText("1,2,3,4,2");
c.setText("1,9,6,1");
}
if(flag==14)
{
l.setText("5");
s.setText("1,2,3,4,2,8");
c.setText("1,9,6,1");
}
if(flag==15)
{
l.setText("7");
s.setText("1,2,3,4,2,8,5");
c.setText("1,9,6,1");
}
if(flag==16)
{
l.setText("8");
s.setText("1,2,3,4,2,8,5,7");
c.setText("1,9,6,1");
}
if(flag==17)
{
l.setText("7");
s.setText("1,2,3,4,2,8,5");
c.setText("1,9,6,1,8");
}
if(flag==18)
{
l.setText("5");
s.setText("1,2,3,4,2,8");
c.setText("1,9,6,1,8,7");
}
if(flag==19)
{
l.setText("8");
s.setText("1,2,3,4,2");
c.setText("1,9,6,1,8,7,5");
}
if(flag==20)
{
l.setText("2");
s.setText("1,2,3,4");
c.setText("1,9,6,1,8,7,5,8");
}
if(flag==21)
{
l.setText("4");
s.setText("1,2,3");
c.setText("1,9,6,1,8,7,5,8,2");
}

if(flag==22)
{
l.setText("3");
s.setText("1,2");
c.setText("1,9,6,1,8,7,5,8,2,4");
}

if(flag==23)
{
l.setText("2");
s.setText("1");
c.setText("1,9,6,1,8,7,5,8,2,4,3");
}

if(flag==24)
{
l.setText("1");
s.setText("");
c.setText("1,9,6,1,8,7,5,8,2,4,3,2");
}}
if(flag1==1)
{
g.setColor(Color.black);
if(flag>11)
g.drawLine(131,113,154,302);
if(flag>7)
g.drawLine(672,548,250,521);
if(flag>8)
g.drawLine(672,548,913,500);
if(flag>3)
g.drawLine(1048,178,1000,305);
if(flag>4)
g.drawLine(1048,178,675,185);
if(flag>2)
g.drawLine(1000,305,675,185);
if(flag>5)
g.drawLine(675,185,913,500);
if(flag>6)
g.drawLine(250,520,913,500);
if(flag>12)
g.drawLine(131,113,495,337);
if(flag>10)
g.drawLine(154,302,495,337);
if(flag>1)
g.drawLine(675,185,495,337);
if(flag>9)
g.drawLine(913,500,495,337);
}}}