package com.teampurado.model.thread;



import com.teampurado.view.student.ExamFrame;
import com.teampurado.view.student.ReportFrame;
import javax.swing.JLabel;

/**
 *
 * @author ProfessorSci
 */
public class TimerThread extends Thread {
    
    private final JLabel h;
    private final JLabel m;
    private final JLabel s;
    private ExamFrame ef;

    public TimerThread(JLabel h, JLabel m, JLabel s, ExamFrame ef) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.ef = ef;
    }

    @Override
    public void run() {
        byte hr = Byte.parseByte(h.getText()), 
                min = Byte.parseByte(m.getText()), 
                    sec = Byte.parseByte(s.getText());

        try {
            do {
                System.out.println(""+hr+":"+min+":"+sec);
                h.setText("" + hr);
                m.setText("" + min);
                s.setText("" + sec);

                Thread.sleep(1000);

                if(sec > 0) {
                    sec--;
                } else if (min > -1){
                    sec = 59;
                    if(min > -1) {
                        min--;
                    } else {
                        
                        if(hr > 0) {
                            hr--;
                            min = 59;
                        }
                    }
                }
            } while(hr>0 || min>0 || sec>-1);
            throw new InterruptedException();
        } catch(InterruptedException ex) {
            ReportFrame direct = new ReportFrame();
            direct.setVisible(true);
            ef.dispose();
            this.interrupt();
        }
    }

}
