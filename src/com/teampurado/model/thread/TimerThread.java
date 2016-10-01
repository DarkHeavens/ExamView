package com.teampurado.model.thread;

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

    public TimerThread(JLabel h, JLabel m, JLabel s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public void run() {
        byte hr = Byte.parseByte(h.getText()), 
                min = Byte.parseByte(m.getText()), 
                    sec = Byte.parseByte(s.getText());

        try {
            do {
                h.setText("" + hr);
                m.setText("" + min);
                s.setText("" + sec);

                Thread.sleep(1000);

                if(sec > -1) {
                    sec--;
                } else if (min > -1){
                    sec = 59;
                    if(min > -1) {
                        min--;
                    } else {
                        min = 59;
                        if(hr > 0) {
                            hr--;
                        }
                    }
                }
            } while(h.getText().equals("0") && m.getText().equals("0") && s.getText().equals("0"));
            throw new InterruptedException();
        } catch(InterruptedException ex) {
            ReportFrame direct = new ReportFrame();
            this.interrupt();
        }
    }

}
