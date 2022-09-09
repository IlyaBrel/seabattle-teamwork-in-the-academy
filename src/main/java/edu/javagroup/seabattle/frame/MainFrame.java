/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javagroup.seabattle.frame;

import edu.javagroup.seabattle.controller.api.EnemyService;
import edu.javagroup.seabattle.exception.SideNotFoundException;
import edu.javagroup.seabattle.init.Initializer;
import edu.javagroup.seabattle.model.HorizontalLine;
import edu.javagroup.seabattle.model.PointElement;
import edu.javagroup.seabattle.service.GameService;
import edu.javagroup.seabattle.singleton.*;
import edu.javagroup.seabattle.util.IpAddressUtils;
import edu.javagroup.seabattle.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static edu.javagroup.seabattle.constants.Constants.*;

/**
 * @author kaa
 */
@Component
public class MainFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonEA01;
    private javax.swing.JButton jButtonEA02;
    private javax.swing.JButton jButtonEA03;
    private javax.swing.JButton jButtonEA04;
    private javax.swing.JButton jButtonEA05;
    private javax.swing.JButton jButtonEA06;
    private javax.swing.JButton jButtonEA07;
    private javax.swing.JButton jButtonEA08;
    private javax.swing.JButton jButtonEA09;
    private javax.swing.JButton jButtonEA10;
    private javax.swing.JButton jButtonEB01;
    private javax.swing.JButton jButtonEB02;
    private javax.swing.JButton jButtonEB03;
    private javax.swing.JButton jButtonEB04;
    private javax.swing.JButton jButtonEB05;
    private javax.swing.JButton jButtonEB06;
    private javax.swing.JButton jButtonEB07;
    private javax.swing.JButton jButtonEB08;
    private javax.swing.JButton jButtonEB09;
    private javax.swing.JButton jButtonEB10;
    private javax.swing.JButton jButtonEC01;
    private javax.swing.JButton jButtonEC02;
    private javax.swing.JButton jButtonEC03;
    private javax.swing.JButton jButtonEC04;
    private javax.swing.JButton jButtonEC05;
    private javax.swing.JButton jButtonEC06;
    private javax.swing.JButton jButtonEC07;
    private javax.swing.JButton jButtonEC08;
    private javax.swing.JButton jButtonEC09;
    private javax.swing.JButton jButtonEC10;
    private javax.swing.JButton jButtonED01;
    private javax.swing.JButton jButtonED02;
    private javax.swing.JButton jButtonED03;
    private javax.swing.JButton jButtonED04;
    private javax.swing.JButton jButtonED05;
    private javax.swing.JButton jButtonED06;
    private javax.swing.JButton jButtonED07;
    private javax.swing.JButton jButtonED08;
    private javax.swing.JButton jButtonED09;
    private javax.swing.JButton jButtonED10;
    private javax.swing.JButton jButtonEE01;
    private javax.swing.JButton jButtonEE02;
    private javax.swing.JButton jButtonEE03;
    private javax.swing.JButton jButtonEE04;
    private javax.swing.JButton jButtonEE05;
    private javax.swing.JButton jButtonEE06;
    private javax.swing.JButton jButtonEE07;
    private javax.swing.JButton jButtonEE08;
    private javax.swing.JButton jButtonEE09;
    private javax.swing.JButton jButtonEE10;
    private javax.swing.JButton jButtonEF01;
    private javax.swing.JButton jButtonEF02;
    private javax.swing.JButton jButtonEF03;
    private javax.swing.JButton jButtonEF04;
    private javax.swing.JButton jButtonEF05;
    private javax.swing.JButton jButtonEF06;
    private javax.swing.JButton jButtonEF07;
    private javax.swing.JButton jButtonEF08;
    private javax.swing.JButton jButtonEF09;
    private javax.swing.JButton jButtonEF10;
    private javax.swing.JButton jButtonEG01;
    private javax.swing.JButton jButtonEG02;
    private javax.swing.JButton jButtonEG03;
    private javax.swing.JButton jButtonEG04;
    private javax.swing.JButton jButtonEG05;
    private javax.swing.JButton jButtonEG06;
    private javax.swing.JButton jButtonEG07;
    private javax.swing.JButton jButtonEG08;
    private javax.swing.JButton jButtonEG09;
    private javax.swing.JButton jButtonEG10;
    private javax.swing.JButton jButtonEH01;
    private javax.swing.JButton jButtonEH02;
    private javax.swing.JButton jButtonEH03;
    private javax.swing.JButton jButtonEH04;
    private javax.swing.JButton jButtonEH05;
    private javax.swing.JButton jButtonEH06;
    private javax.swing.JButton jButtonEH07;
    private javax.swing.JButton jButtonEH08;
    private javax.swing.JButton jButtonEH09;
    private javax.swing.JButton jButtonEH10;
    private javax.swing.JButton jButtonEI01;
    private javax.swing.JButton jButtonEI02;
    private javax.swing.JButton jButtonEI03;
    private javax.swing.JButton jButtonEI04;
    private javax.swing.JButton jButtonEI05;
    private javax.swing.JButton jButtonEI06;
    private javax.swing.JButton jButtonEI07;
    private javax.swing.JButton jButtonEI08;
    private javax.swing.JButton jButtonEI09;
    private javax.swing.JButton jButtonEI10;
    private javax.swing.JButton jButtonEJ01;
    private javax.swing.JButton jButtonEJ02;
    private javax.swing.JButton jButtonEJ03;
    private javax.swing.JButton jButtonEJ04;
    private javax.swing.JButton jButtonEJ05;
    private javax.swing.JButton jButtonEJ06;
    private javax.swing.JButton jButtonEJ07;
    private javax.swing.JButton jButtonEJ08;
    private javax.swing.JButton jButtonEJ09;
    private javax.swing.JButton jButtonEJ10;
    private javax.swing.JButton jButtonMA01;
    private javax.swing.JButton jButtonMA02;
    private javax.swing.JButton jButtonMA03;
    private javax.swing.JButton jButtonMA04;
    private javax.swing.JButton jButtonMA05;
    private javax.swing.JButton jButtonMA06;
    private javax.swing.JButton jButtonMA07;
    private javax.swing.JButton jButtonMA08;
    private javax.swing.JButton jButtonMA09;
    private javax.swing.JButton jButtonMA10;
    private javax.swing.JButton jButtonMB01;
    private javax.swing.JButton jButtonMB02;
    private javax.swing.JButton jButtonMB03;
    private javax.swing.JButton jButtonMB04;
    private javax.swing.JButton jButtonMB05;
    private javax.swing.JButton jButtonMB06;
    private javax.swing.JButton jButtonMB07;
    private javax.swing.JButton jButtonMB08;
    private javax.swing.JButton jButtonMB09;
    private javax.swing.JButton jButtonMB10;
    private javax.swing.JButton jButtonMC01;
    private javax.swing.JButton jButtonMC02;
    private javax.swing.JButton jButtonMC03;
    private javax.swing.JButton jButtonMC04;
    private javax.swing.JButton jButtonMC05;
    private javax.swing.JButton jButtonMC06;
    private javax.swing.JButton jButtonMC07;
    private javax.swing.JButton jButtonMC08;
    private javax.swing.JButton jButtonMC09;
    private javax.swing.JButton jButtonMC10;
    private javax.swing.JButton jButtonMD01;
    private javax.swing.JButton jButtonMD02;
    private javax.swing.JButton jButtonMD03;
    private javax.swing.JButton jButtonMD04;
    private javax.swing.JButton jButtonMD05;
    private javax.swing.JButton jButtonMD06;
    private javax.swing.JButton jButtonMD07;
    private javax.swing.JButton jButtonMD08;
    private javax.swing.JButton jButtonMD09;
    private javax.swing.JButton jButtonMD10;
    private javax.swing.JButton jButtonME01;
    private javax.swing.JButton jButtonME02;
    private javax.swing.JButton jButtonME03;
    private javax.swing.JButton jButtonME04;
    private javax.swing.JButton jButtonME05;
    private javax.swing.JButton jButtonME06;
    private javax.swing.JButton jButtonME07;
    private javax.swing.JButton jButtonME08;
    private javax.swing.JButton jButtonME09;
    private javax.swing.JButton jButtonME10;
    private javax.swing.JButton jButtonMF01;
    private javax.swing.JButton jButtonMF02;
    private javax.swing.JButton jButtonMF03;
    private javax.swing.JButton jButtonMF04;
    private javax.swing.JButton jButtonMF05;
    private javax.swing.JButton jButtonMF06;
    private javax.swing.JButton jButtonMF07;
    private javax.swing.JButton jButtonMF08;
    private javax.swing.JButton jButtonMF09;
    private javax.swing.JButton jButtonMF10;
    private javax.swing.JButton jButtonMG01;
    private javax.swing.JButton jButtonMG02;
    private javax.swing.JButton jButtonMG03;
    private javax.swing.JButton jButtonMG04;
    private javax.swing.JButton jButtonMG05;
    private javax.swing.JButton jButtonMG06;
    private javax.swing.JButton jButtonMG07;
    private javax.swing.JButton jButtonMG08;
    private javax.swing.JButton jButtonMG09;
    private javax.swing.JButton jButtonMG10;
    private javax.swing.JButton jButtonMH01;
    private javax.swing.JButton jButtonMH02;
    private javax.swing.JButton jButtonMH03;
    private javax.swing.JButton jButtonMH04;
    private javax.swing.JButton jButtonMH05;
    private javax.swing.JButton jButtonMH06;
    private javax.swing.JButton jButtonMH07;
    private javax.swing.JButton jButtonMH08;
    private javax.swing.JButton jButtonMH09;
    private javax.swing.JButton jButtonMH10;
    private javax.swing.JButton jButtonMI01;
    private javax.swing.JButton jButtonMI02;
    private javax.swing.JButton jButtonMI03;
    private javax.swing.JButton jButtonMI04;
    private javax.swing.JButton jButtonMI05;
    private javax.swing.JButton jButtonMI06;
    private javax.swing.JButton jButtonMI07;
    private javax.swing.JButton jButtonMI08;
    private javax.swing.JButton jButtonMI09;
    private javax.swing.JButton jButtonMI10;
    private javax.swing.JButton jButtonMJ01;
    private javax.swing.JButton jButtonMJ02;
    private javax.swing.JButton jButtonMJ03;
    private javax.swing.JButton jButtonMJ04;
    private javax.swing.JButton jButtonMJ05;
    private javax.swing.JButton jButtonMJ06;
    private javax.swing.JButton jButtonMJ07;
    private javax.swing.JButton jButtonMJ08;
    private javax.swing.JButton jButtonMJ09;
    private javax.swing.JButton jButtonMJ10;
    private javax.swing.JButton jButton4Deck1;
    private javax.swing.JButton jButton3Deck1;
    private javax.swing.JButton jButton3Deck2;
    private javax.swing.JButton jButton2Deck1;
    private javax.swing.JButton jButton2Deck2;
    private javax.swing.JButton jButton2Deck3;
    private javax.swing.JButton jButton1Deck1;
    private javax.swing.JButton jButton1Deck2;
    private javax.swing.JButton jButton1Deck3;
    private javax.swing.JButton jButton1Deck4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelE01;
    private javax.swing.JLabel jLabelE02;
    private javax.swing.JLabel jLabelE03;
    private javax.swing.JLabel jLabelE04;
    private javax.swing.JLabel jLabelE05;
    private javax.swing.JLabel jLabelE06;
    private javax.swing.JLabel jLabelE07;
    private javax.swing.JLabel jLabelE08;
    private javax.swing.JLabel jLabelE09;
    private javax.swing.JLabel jLabelE10;
    private javax.swing.JLabel jLabelEA;
    private javax.swing.JLabel jLabelEB;
    private javax.swing.JLabel jLabelEC;
    private javax.swing.JLabel jLabelED;
    private javax.swing.JLabel jLabelEE;
    private javax.swing.JLabel jLabelEF;
    private javax.swing.JLabel jLabelEG;
    private javax.swing.JLabel jLabelEH;
    private javax.swing.JLabel jLabelEI;
    private javax.swing.JLabel jLabelEJ;
    private javax.swing.JLabel jLabelM01;
    private javax.swing.JLabel jLabelM02;
    private javax.swing.JLabel jLabelM03;
    private javax.swing.JLabel jLabelM04;
    private javax.swing.JLabel jLabelM05;
    private javax.swing.JLabel jLabelM06;
    private javax.swing.JLabel jLabelM07;
    private javax.swing.JLabel jLabelM08;
    private javax.swing.JLabel jLabelM09;
    private javax.swing.JLabel jLabelM10;
    private javax.swing.JLabel jLabelMA;
    private javax.swing.JLabel jLabelMB;
    private javax.swing.JLabel jLabelMC;
    private javax.swing.JLabel jLabelMD;
    private javax.swing.JLabel jLabelME;
    private javax.swing.JLabel jLabelMF;
    private javax.swing.JLabel jLabelMG;
    private javax.swing.JLabel jLabelMH;
    private javax.swing.JLabel jLabelMI;
    private javax.swing.JLabel jLabelMJ;
    private javax.swing.JPanel jPanelE01;
    private javax.swing.JPanel jPanelE02;
    private javax.swing.JPanel jPanelE03;
    private javax.swing.JPanel jPanelM;
    private javax.swing.JPanel jPanelM01;
    private javax.swing.JPanel jPanelM02;
    private javax.swing.JPanel jPanelM03;
    private javax.swing.JPanel jPanelS;
    // End of variables declaration//GEN-END:variables

    private final String METHOD_BACKGROUND = "setBackground";
    private final String METHOD_OPAQUE = "setOpaque";

    private final Color COLOR_DEFAULT = new Color(238, 238, 238);
    private final Color COLOR_BLACK = Color.BLACK;
    private final Color COLOR_BLUE = Color.BLUE;
    private final Color COLOR_RED = Color.RED;

    private final GameService gameService;
    private final EnemyService enemyService;

    /**
     * Creates new form MainFrame
     */
    public MainFrame(GameService gameService,
                     EnemyService enemyService) {
        this.gameService = gameService;
        this.enemyService = enemyService;
        initComponents();
        startThread();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelM = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelS = new javax.swing.JPanel();
        jButton1Deck1 = new javax.swing.JButton();
        jButton1Deck2 = new javax.swing.JButton();
        jButton1Deck3 = new javax.swing.JButton();
        jButton1Deck4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2Deck1 = new javax.swing.JButton();
        jButton2Deck2 = new javax.swing.JButton();
        jButton2Deck3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3Deck1 = new javax.swing.JButton();
        jButton3Deck2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4Deck1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelM01 = new javax.swing.JPanel();
        jLabelM01 = new javax.swing.JLabel();
        jLabelM02 = new javax.swing.JLabel();
        jLabelM03 = new javax.swing.JLabel();
        jLabelM04 = new javax.swing.JLabel();
        jLabelM05 = new javax.swing.JLabel();
        jLabelM06 = new javax.swing.JLabel();
        jLabelM07 = new javax.swing.JLabel();
        jLabelM08 = new javax.swing.JLabel();
        jLabelM09 = new javax.swing.JLabel();
        jLabelM10 = new javax.swing.JLabel();
        jPanelM02 = new javax.swing.JPanel();
        jLabelMA = new javax.swing.JLabel();
        jLabelMB = new javax.swing.JLabel();
        jLabelMC = new javax.swing.JLabel();
        jLabelMD = new javax.swing.JLabel();
        jLabelME = new javax.swing.JLabel();
        jLabelMF = new javax.swing.JLabel();
        jLabelMG = new javax.swing.JLabel();
        jLabelMH = new javax.swing.JLabel();
        jLabelMI = new javax.swing.JLabel();
        jLabelMJ = new javax.swing.JLabel();
        jPanelM03 = new javax.swing.JPanel();
        jButtonMA01 = new javax.swing.JButton();
        jButtonMA02 = new javax.swing.JButton();
        jButtonMA03 = new javax.swing.JButton();
        jButtonMA04 = new javax.swing.JButton();
        jButtonMA05 = new javax.swing.JButton();
        jButtonMA06 = new javax.swing.JButton();
        jButtonMA07 = new javax.swing.JButton();
        jButtonMA08 = new javax.swing.JButton();
        jButtonMA09 = new javax.swing.JButton();
        jButtonMA10 = new javax.swing.JButton();
        jButtonMB01 = new javax.swing.JButton();
        jButtonMB02 = new javax.swing.JButton();
        jButtonMB03 = new javax.swing.JButton();
        jButtonMB04 = new javax.swing.JButton();
        jButtonMB05 = new javax.swing.JButton();
        jButtonMB06 = new javax.swing.JButton();
        jButtonMB07 = new javax.swing.JButton();
        jButtonMB08 = new javax.swing.JButton();
        jButtonMB09 = new javax.swing.JButton();
        jButtonMB10 = new javax.swing.JButton();
        jButtonMC01 = new javax.swing.JButton();
        jButtonMC02 = new javax.swing.JButton();
        jButtonMC03 = new javax.swing.JButton();
        jButtonMC04 = new javax.swing.JButton();
        jButtonMC05 = new javax.swing.JButton();
        jButtonMC06 = new javax.swing.JButton();
        jButtonMC07 = new javax.swing.JButton();
        jButtonMC08 = new javax.swing.JButton();
        jButtonMC09 = new javax.swing.JButton();
        jButtonMC10 = new javax.swing.JButton();
        jButtonMD01 = new javax.swing.JButton();
        jButtonMD02 = new javax.swing.JButton();
        jButtonMD03 = new javax.swing.JButton();
        jButtonMD04 = new javax.swing.JButton();
        jButtonMD05 = new javax.swing.JButton();
        jButtonMD06 = new javax.swing.JButton();
        jButtonMD07 = new javax.swing.JButton();
        jButtonMD08 = new javax.swing.JButton();
        jButtonMD09 = new javax.swing.JButton();
        jButtonMD10 = new javax.swing.JButton();
        jButtonME01 = new javax.swing.JButton();
        jButtonME02 = new javax.swing.JButton();
        jButtonME03 = new javax.swing.JButton();
        jButtonME04 = new javax.swing.JButton();
        jButtonME05 = new javax.swing.JButton();
        jButtonME06 = new javax.swing.JButton();
        jButtonME07 = new javax.swing.JButton();
        jButtonME08 = new javax.swing.JButton();
        jButtonME09 = new javax.swing.JButton();
        jButtonME10 = new javax.swing.JButton();
        jButtonMF01 = new javax.swing.JButton();
        jButtonMF02 = new javax.swing.JButton();
        jButtonMF03 = new javax.swing.JButton();
        jButtonMF04 = new javax.swing.JButton();
        jButtonMF05 = new javax.swing.JButton();
        jButtonMF06 = new javax.swing.JButton();
        jButtonMF07 = new javax.swing.JButton();
        jButtonMF08 = new javax.swing.JButton();
        jButtonMF09 = new javax.swing.JButton();
        jButtonMF10 = new javax.swing.JButton();
        jButtonMG01 = new javax.swing.JButton();
        jButtonMG02 = new javax.swing.JButton();
        jButtonMG03 = new javax.swing.JButton();
        jButtonMG04 = new javax.swing.JButton();
        jButtonMG05 = new javax.swing.JButton();
        jButtonMG06 = new javax.swing.JButton();
        jButtonMG07 = new javax.swing.JButton();
        jButtonMG08 = new javax.swing.JButton();
        jButtonMG09 = new javax.swing.JButton();
        jButtonMG10 = new javax.swing.JButton();
        jButtonMH01 = new javax.swing.JButton();
        jButtonMH02 = new javax.swing.JButton();
        jButtonMH03 = new javax.swing.JButton();
        jButtonMH04 = new javax.swing.JButton();
        jButtonMH05 = new javax.swing.JButton();
        jButtonMH06 = new javax.swing.JButton();
        jButtonMH07 = new javax.swing.JButton();
        jButtonMH08 = new javax.swing.JButton();
        jButtonMH09 = new javax.swing.JButton();
        jButtonMH10 = new javax.swing.JButton();
        jButtonMI01 = new javax.swing.JButton();
        jButtonMI02 = new javax.swing.JButton();
        jButtonMI03 = new javax.swing.JButton();
        jButtonMI04 = new javax.swing.JButton();
        jButtonMI05 = new javax.swing.JButton();
        jButtonMI06 = new javax.swing.JButton();
        jButtonMI07 = new javax.swing.JButton();
        jButtonMI08 = new javax.swing.JButton();
        jButtonMI09 = new javax.swing.JButton();
        jButtonMI10 = new javax.swing.JButton();
        jButtonMJ01 = new javax.swing.JButton();
        jButtonMJ02 = new javax.swing.JButton();
        jButtonMJ03 = new javax.swing.JButton();
        jButtonMJ04 = new javax.swing.JButton();
        jButtonMJ05 = new javax.swing.JButton();
        jButtonMJ06 = new javax.swing.JButton();
        jButtonMJ07 = new javax.swing.JButton();
        jButtonMJ08 = new javax.swing.JButton();
        jButtonMJ09 = new javax.swing.JButton();
        jButtonMJ10 = new javax.swing.JButton();
        jPanelE01 = new javax.swing.JPanel();
        jLabelE01 = new javax.swing.JLabel();
        jLabelE02 = new javax.swing.JLabel();
        jLabelE03 = new javax.swing.JLabel();
        jLabelE04 = new javax.swing.JLabel();
        jLabelE05 = new javax.swing.JLabel();
        jLabelE06 = new javax.swing.JLabel();
        jLabelE07 = new javax.swing.JLabel();
        jLabelE08 = new javax.swing.JLabel();
        jLabelE09 = new javax.swing.JLabel();
        jLabelE10 = new javax.swing.JLabel();
        jPanelE02 = new javax.swing.JPanel();
        jLabelEA = new javax.swing.JLabel();
        jLabelEB = new javax.swing.JLabel();
        jLabelEC = new javax.swing.JLabel();
        jLabelED = new javax.swing.JLabel();
        jLabelEE = new javax.swing.JLabel();
        jLabelEF = new javax.swing.JLabel();
        jLabelEG = new javax.swing.JLabel();
        jLabelEH = new javax.swing.JLabel();
        jLabelEI = new javax.swing.JLabel();
        jLabelEJ = new javax.swing.JLabel();
        jPanelE03 = new javax.swing.JPanel();
        jButtonEA01 = new javax.swing.JButton();
        jButtonEA02 = new javax.swing.JButton();
        jButtonEA03 = new javax.swing.JButton();
        jButtonEA04 = new javax.swing.JButton();
        jButtonEA05 = new javax.swing.JButton();
        jButtonEA06 = new javax.swing.JButton();
        jButtonEA07 = new javax.swing.JButton();
        jButtonEA08 = new javax.swing.JButton();
        jButtonEA09 = new javax.swing.JButton();
        jButtonEA10 = new javax.swing.JButton();
        jButtonEB01 = new javax.swing.JButton();
        jButtonEB02 = new javax.swing.JButton();
        jButtonEB03 = new javax.swing.JButton();
        jButtonEB04 = new javax.swing.JButton();
        jButtonEB05 = new javax.swing.JButton();
        jButtonEB06 = new javax.swing.JButton();
        jButtonEB07 = new javax.swing.JButton();
        jButtonEB08 = new javax.swing.JButton();
        jButtonEB09 = new javax.swing.JButton();
        jButtonEB10 = new javax.swing.JButton();
        jButtonEC01 = new javax.swing.JButton();
        jButtonEC02 = new javax.swing.JButton();
        jButtonEC03 = new javax.swing.JButton();
        jButtonEC04 = new javax.swing.JButton();
        jButtonEC05 = new javax.swing.JButton();
        jButtonEC06 = new javax.swing.JButton();
        jButtonEC07 = new javax.swing.JButton();
        jButtonEC08 = new javax.swing.JButton();
        jButtonEC09 = new javax.swing.JButton();
        jButtonEC10 = new javax.swing.JButton();
        jButtonED01 = new javax.swing.JButton();
        jButtonED02 = new javax.swing.JButton();
        jButtonED03 = new javax.swing.JButton();
        jButtonED04 = new javax.swing.JButton();
        jButtonED05 = new javax.swing.JButton();
        jButtonED06 = new javax.swing.JButton();
        jButtonED07 = new javax.swing.JButton();
        jButtonED08 = new javax.swing.JButton();
        jButtonED09 = new javax.swing.JButton();
        jButtonED10 = new javax.swing.JButton();
        jButtonEE01 = new javax.swing.JButton();
        jButtonEE02 = new javax.swing.JButton();
        jButtonEE03 = new javax.swing.JButton();
        jButtonEE04 = new javax.swing.JButton();
        jButtonEE05 = new javax.swing.JButton();
        jButtonEE06 = new javax.swing.JButton();
        jButtonEE07 = new javax.swing.JButton();
        jButtonEE08 = new javax.swing.JButton();
        jButtonEE09 = new javax.swing.JButton();
        jButtonEE10 = new javax.swing.JButton();
        jButtonEF01 = new javax.swing.JButton();
        jButtonEF02 = new javax.swing.JButton();
        jButtonEF03 = new javax.swing.JButton();
        jButtonEF04 = new javax.swing.JButton();
        jButtonEF05 = new javax.swing.JButton();
        jButtonEF06 = new javax.swing.JButton();
        jButtonEF07 = new javax.swing.JButton();
        jButtonEF08 = new javax.swing.JButton();
        jButtonEF09 = new javax.swing.JButton();
        jButtonEF10 = new javax.swing.JButton();
        jButtonEG01 = new javax.swing.JButton();
        jButtonEG02 = new javax.swing.JButton();
        jButtonEG03 = new javax.swing.JButton();
        jButtonEG04 = new javax.swing.JButton();
        jButtonEG05 = new javax.swing.JButton();
        jButtonEG06 = new javax.swing.JButton();
        jButtonEG07 = new javax.swing.JButton();
        jButtonEG08 = new javax.swing.JButton();
        jButtonEG09 = new javax.swing.JButton();
        jButtonEG10 = new javax.swing.JButton();
        jButtonEH01 = new javax.swing.JButton();
        jButtonEH02 = new javax.swing.JButton();
        jButtonEH03 = new javax.swing.JButton();
        jButtonEH04 = new javax.swing.JButton();
        jButtonEH05 = new javax.swing.JButton();
        jButtonEH06 = new javax.swing.JButton();
        jButtonEH07 = new javax.swing.JButton();
        jButtonEH08 = new javax.swing.JButton();
        jButtonEH09 = new javax.swing.JButton();
        jButtonEH10 = new javax.swing.JButton();
        jButtonEI01 = new javax.swing.JButton();
        jButtonEI02 = new javax.swing.JButton();
        jButtonEI03 = new javax.swing.JButton();
        jButtonEI04 = new javax.swing.JButton();
        jButtonEI05 = new javax.swing.JButton();
        jButtonEI06 = new javax.swing.JButton();
        jButtonEI07 = new javax.swing.JButton();
        jButtonEI08 = new javax.swing.JButton();
        jButtonEI09 = new javax.swing.JButton();
        jButtonEI10 = new javax.swing.JButton();
        jButtonEJ01 = new javax.swing.JButton();
        jButtonEJ02 = new javax.swing.JButton();
        jButtonEJ03 = new javax.swing.JButton();
        jButtonEJ04 = new javax.swing.JButton();
        jButtonEJ05 = new javax.swing.JButton();
        jButtonEJ06 = new javax.swing.JButton();
        jButtonEJ07 = new javax.swing.JButton();
        jButtonEJ08 = new javax.swing.JButton();
        jButtonEJ09 = new javax.swing.JButton();
        jButtonEJ10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea battle");
        setResizable(false);

        jButton1.setText("Настроки игры");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Проверка сети");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Расставить корабли");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Сбросить расстановку");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Начать игру");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMLayout = new javax.swing.GroupLayout(jPanelM);
        jPanelM.setLayout(jPanelMLayout);
        jPanelMLayout.setHorizontalGroup(
                jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMLayout.setVerticalGroup(
                jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1Deck1.setBackground(COLOR_DEFAULT);
        jButton1Deck2.setBackground(COLOR_DEFAULT);
        jButton1Deck3.setBackground(COLOR_DEFAULT);
        jButton1Deck4.setBackground(COLOR_DEFAULT);
        jButton2Deck1.setBackground(COLOR_DEFAULT);
        jButton2Deck2.setBackground(COLOR_DEFAULT);
        jButton2Deck3.setBackground(COLOR_DEFAULT);
        jButton3Deck1.setBackground(COLOR_DEFAULT);
        jButton3Deck2.setBackground(COLOR_DEFAULT);
        jButton4Deck1.setBackground(COLOR_DEFAULT);

        jButton1Deck1.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton1Deck2.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton1Deck3.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton1Deck4.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton2Deck1.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton2Deck2.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton2Deck3.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton3Deck1.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton3Deck2.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButton4Deck1.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));

        shipPanelEnable(false);

        jButton1Deck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip41ActionPerformed(evt);
            }
        });

        jButton1Deck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip42ActionPerformed(evt);
            }
        });

        jButton1Deck3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip43ActionPerformed(evt);
            }
        });

        jButton1Deck4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip44ActionPerformed(evt);
            }
        });

        jLabel1.setText("x1");

        jButton2Deck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip31ActionPerformed(evt);
            }
        });

        jButton2Deck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip32ActionPerformed(evt);
            }
        });

        jButton2Deck3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip33ActionPerformed(evt);
            }
        });

        jLabel2.setText("x2");

        jButton3Deck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip21ActionPerformed(evt);
            }
        });

        jButton3Deck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip22ActionPerformed(evt);
            }
        });

        jLabel3.setText("x3");

        jButton4Deck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShip11ActionPerformed(evt);
            }
        });

        jLabel4.setText("x4");

        javax.swing.GroupLayout jPanelSLayout = new javax.swing.GroupLayout(jPanelS);
        jPanelS.setLayout(jPanelSLayout);
        jPanelSLayout.setHorizontalGroup(
                jPanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Deck3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Deck4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(jButton2Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2Deck3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(jButton3Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addComponent(jButton4Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSLayout.setVerticalGroup(
                jPanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSLayout.createSequentialGroup()
                                .addGroup(jPanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1Deck4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1Deck3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2Deck3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3Deck2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4Deck1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanelSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelM01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM01.setText("1");

        jLabelM02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM02.setText("2");

        jLabelM03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM03.setText("3");

        jLabelM04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM04.setText("4");

        jLabelM05.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM05.setText("5");

        jLabelM06.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM06.setText("6");

        jLabelM07.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM07.setText("7");

        jLabelM08.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM08.setText("8");

        jLabelM09.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM09.setText("9");

        jLabelM10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelM10.setText("10");

        javax.swing.GroupLayout jPanelM01Layout = new javax.swing.GroupLayout(jPanelM01);
        jPanelM01.setLayout(jPanelM01Layout);
        jPanelM01Layout.setHorizontalGroup(
                jPanelM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelM01Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabelM01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelM10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelM01Layout.setVerticalGroup(
                jPanelM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelM01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelM01, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM02, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM03, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM04, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM05, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM06, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM07, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM08, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM09, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelM10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelMA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMA.setText("A");

        jLabelMB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMB.setText("B");

        jLabelMC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMC.setText("C");

        jLabelMD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMD.setText("D");

        jLabelME.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelME.setText("E");

        jLabelMF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMF.setText("F");

        jLabelMG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMG.setText("G");

        jLabelMH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMH.setText("H");

        jLabelMI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMI.setText("I");

        jLabelMJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMJ.setText("J");

        javax.swing.GroupLayout jPanelM02Layout = new javax.swing.GroupLayout(jPanelM02);
        jPanelM02.setLayout(jPanelM02Layout);
        jPanelM02Layout.setHorizontalGroup(
                jPanelM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelMA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMC, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMD, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelME, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMF, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMG, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMH, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMJ, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelM02Layout.setVerticalGroup(
                jPanelM02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelM02Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelMA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jButtonMA01.setBackground(COLOR_DEFAULT);
        jButtonMA02.setBackground(COLOR_DEFAULT);
        jButtonMA03.setBackground(COLOR_DEFAULT);
        jButtonMA04.setBackground(COLOR_DEFAULT);
        jButtonMA05.setBackground(COLOR_DEFAULT);
        jButtonMA06.setBackground(COLOR_DEFAULT);
        jButtonMA07.setBackground(COLOR_DEFAULT);
        jButtonMA08.setBackground(COLOR_DEFAULT);
        jButtonMA09.setBackground(COLOR_DEFAULT);
        jButtonMA10.setBackground(COLOR_DEFAULT);
        jButtonMB01.setBackground(COLOR_DEFAULT);
        jButtonMB02.setBackground(COLOR_DEFAULT);
        jButtonMB03.setBackground(COLOR_DEFAULT);
        jButtonMB04.setBackground(COLOR_DEFAULT);
        jButtonMB05.setBackground(COLOR_DEFAULT);
        jButtonMB06.setBackground(COLOR_DEFAULT);
        jButtonMB07.setBackground(COLOR_DEFAULT);
        jButtonMB08.setBackground(COLOR_DEFAULT);
        jButtonMB09.setBackground(COLOR_DEFAULT);
        jButtonMB10.setBackground(COLOR_DEFAULT);
        jButtonMC01.setBackground(COLOR_DEFAULT);
        jButtonMC02.setBackground(COLOR_DEFAULT);
        jButtonMC03.setBackground(COLOR_DEFAULT);
        jButtonMC04.setBackground(COLOR_DEFAULT);
        jButtonMC05.setBackground(COLOR_DEFAULT);
        jButtonMC06.setBackground(COLOR_DEFAULT);
        jButtonMC07.setBackground(COLOR_DEFAULT);
        jButtonMC08.setBackground(COLOR_DEFAULT);
        jButtonMC09.setBackground(COLOR_DEFAULT);
        jButtonMC10.setBackground(COLOR_DEFAULT);
        jButtonMD01.setBackground(COLOR_DEFAULT);
        jButtonMD02.setBackground(COLOR_DEFAULT);
        jButtonMD03.setBackground(COLOR_DEFAULT);
        jButtonMD04.setBackground(COLOR_DEFAULT);
        jButtonMD05.setBackground(COLOR_DEFAULT);
        jButtonMD06.setBackground(COLOR_DEFAULT);
        jButtonMD07.setBackground(COLOR_DEFAULT);
        jButtonMD08.setBackground(COLOR_DEFAULT);
        jButtonMD09.setBackground(COLOR_DEFAULT);
        jButtonMD10.setBackground(COLOR_DEFAULT);
        jButtonME01.setBackground(COLOR_DEFAULT);
        jButtonME02.setBackground(COLOR_DEFAULT);
        jButtonME03.setBackground(COLOR_DEFAULT);
        jButtonME04.setBackground(COLOR_DEFAULT);
        jButtonME05.setBackground(COLOR_DEFAULT);
        jButtonME06.setBackground(COLOR_DEFAULT);
        jButtonME07.setBackground(COLOR_DEFAULT);
        jButtonME08.setBackground(COLOR_DEFAULT);
        jButtonME09.setBackground(COLOR_DEFAULT);
        jButtonME10.setBackground(COLOR_DEFAULT);
        jButtonMF01.setBackground(COLOR_DEFAULT);
        jButtonMF02.setBackground(COLOR_DEFAULT);
        jButtonMF03.setBackground(COLOR_DEFAULT);
        jButtonMF04.setBackground(COLOR_DEFAULT);
        jButtonMF05.setBackground(COLOR_DEFAULT);
        jButtonMF06.setBackground(COLOR_DEFAULT);
        jButtonMF07.setBackground(COLOR_DEFAULT);
        jButtonMF08.setBackground(COLOR_DEFAULT);
        jButtonMF09.setBackground(COLOR_DEFAULT);
        jButtonMF10.setBackground(COLOR_DEFAULT);
        jButtonMG01.setBackground(COLOR_DEFAULT);
        jButtonMG02.setBackground(COLOR_DEFAULT);
        jButtonMG03.setBackground(COLOR_DEFAULT);
        jButtonMG04.setBackground(COLOR_DEFAULT);
        jButtonMG05.setBackground(COLOR_DEFAULT);
        jButtonMG06.setBackground(COLOR_DEFAULT);
        jButtonMG07.setBackground(COLOR_DEFAULT);
        jButtonMG08.setBackground(COLOR_DEFAULT);
        jButtonMG09.setBackground(COLOR_DEFAULT);
        jButtonMG10.setBackground(COLOR_DEFAULT);
        jButtonMH01.setBackground(COLOR_DEFAULT);
        jButtonMH02.setBackground(COLOR_DEFAULT);
        jButtonMH03.setBackground(COLOR_DEFAULT);
        jButtonMH04.setBackground(COLOR_DEFAULT);
        jButtonMH05.setBackground(COLOR_DEFAULT);
        jButtonMH06.setBackground(COLOR_DEFAULT);
        jButtonMH07.setBackground(COLOR_DEFAULT);
        jButtonMH08.setBackground(COLOR_DEFAULT);
        jButtonMH09.setBackground(COLOR_DEFAULT);
        jButtonMH10.setBackground(COLOR_DEFAULT);
        jButtonMI01.setBackground(COLOR_DEFAULT);
        jButtonMI02.setBackground(COLOR_DEFAULT);
        jButtonMI03.setBackground(COLOR_DEFAULT);
        jButtonMI04.setBackground(COLOR_DEFAULT);
        jButtonMI05.setBackground(COLOR_DEFAULT);
        jButtonMI06.setBackground(COLOR_DEFAULT);
        jButtonMI07.setBackground(COLOR_DEFAULT);
        jButtonMI08.setBackground(COLOR_DEFAULT);
        jButtonMI09.setBackground(COLOR_DEFAULT);
        jButtonMI10.setBackground(COLOR_DEFAULT);
        jButtonMJ01.setBackground(COLOR_DEFAULT);
        jButtonMJ02.setBackground(COLOR_DEFAULT);
        jButtonMJ03.setBackground(COLOR_DEFAULT);
        jButtonMJ04.setBackground(COLOR_DEFAULT);
        jButtonMJ05.setBackground(COLOR_DEFAULT);
        jButtonMJ06.setBackground(COLOR_DEFAULT);
        jButtonMJ07.setBackground(COLOR_DEFAULT);
        jButtonMJ08.setBackground(COLOR_DEFAULT);
        jButtonMJ09.setBackground(COLOR_DEFAULT);
        jButtonMJ10.setBackground(COLOR_DEFAULT);

        jButtonMA01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMA10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMB10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMC10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMD10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonME10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMF10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMG10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMH10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMI10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonMJ10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));

        jButtonMA01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA01ActionPerformed(evt);
            }
        });

        jButtonMA02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA02ActionPerformed(evt);
            }
        });

        jButtonMA03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA03ActionPerformed(evt);
            }
        });

        jButtonMA04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA04ActionPerformed(evt);
            }
        });

        jButtonMA05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA05ActionPerformed(evt);
            }
        });

        jButtonMA06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA06ActionPerformed(evt);
            }
        });

        jButtonMA07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA07ActionPerformed(evt);
            }
        });

        jButtonMA08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA08ActionPerformed(evt);
            }
        });

        jButtonMA09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA09ActionPerformed(evt);
            }
        });

        jButtonMA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMA10ActionPerformed(evt);
            }
        });

        jButtonMB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB01ActionPerformed(evt);
            }
        });

        jButtonMB02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB02ActionPerformed(evt);
            }
        });

        jButtonMB03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB03ActionPerformed(evt);
            }
        });

        jButtonMB04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB04ActionPerformed(evt);
            }
        });

        jButtonMB05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB05ActionPerformed(evt);
            }
        });

        jButtonMB06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB06ActionPerformed(evt);
            }
        });

        jButtonMB07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB07ActionPerformed(evt);
            }
        });

        jButtonMB08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB08ActionPerformed(evt);
            }
        });

        jButtonMB09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB09ActionPerformed(evt);
            }
        });

        jButtonMB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMB10ActionPerformed(evt);
            }
        });

        jButtonMC01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC01ActionPerformed(evt);
            }
        });

        jButtonMC02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC02ActionPerformed(evt);
            }
        });

        jButtonMC03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC03ActionPerformed(evt);
            }
        });

        jButtonMC04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC04ActionPerformed(evt);
            }
        });

        jButtonMC05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC05ActionPerformed(evt);
            }
        });

        jButtonMC06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC06ActionPerformed(evt);
            }
        });

        jButtonMC07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC07ActionPerformed(evt);
            }
        });

        jButtonMC08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC08ActionPerformed(evt);
            }
        });

        jButtonMC09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC09ActionPerformed(evt);
            }
        });

        jButtonMC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMC10ActionPerformed(evt);
            }
        });

        jButtonMD01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD01ActionPerformed(evt);
            }
        });

        jButtonMD02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD02ActionPerformed(evt);
            }
        });

        jButtonMD03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD03ActionPerformed(evt);
            }
        });

        jButtonMD04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD04ActionPerformed(evt);
            }
        });

        jButtonMD05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD05ActionPerformed(evt);
            }
        });

        jButtonMD06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD06ActionPerformed(evt);
            }
        });

        jButtonMD07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD07ActionPerformed(evt);
            }
        });

        jButtonMD08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD08ActionPerformed(evt);
            }
        });

        jButtonMD09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD09ActionPerformed(evt);
            }
        });

        jButtonMD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMD10ActionPerformed(evt);
            }
        });

        jButtonME01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME01ActionPerformed(evt);
            }
        });

        jButtonME02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME02ActionPerformed(evt);
            }
        });

        jButtonME03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME03ActionPerformed(evt);
            }
        });

        jButtonME04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME04ActionPerformed(evt);
            }
        });

        jButtonME05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME05ActionPerformed(evt);
            }
        });

        jButtonME06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME06ActionPerformed(evt);
            }
        });

        jButtonME07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME07ActionPerformed(evt);
            }
        });

        jButtonME08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME08ActionPerformed(evt);
            }
        });

        jButtonME09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME09ActionPerformed(evt);
            }
        });

        jButtonME10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonME10ActionPerformed(evt);
            }
        });

        jButtonMF01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF01ActionPerformed(evt);
            }
        });

        jButtonMF02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF02ActionPerformed(evt);
            }
        });

        jButtonMF03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF03ActionPerformed(evt);
            }
        });

        jButtonMF04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF04ActionPerformed(evt);
            }
        });

        jButtonMF05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF05ActionPerformed(evt);
            }
        });

        jButtonMF06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF06ActionPerformed(evt);
            }
        });

        jButtonMF07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF07ActionPerformed(evt);
            }
        });

        jButtonMF08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF08ActionPerformed(evt);
            }
        });

        jButtonMF09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF09ActionPerformed(evt);
            }
        });

        jButtonMF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMF10ActionPerformed(evt);
            }
        });

        jButtonMG01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG01ActionPerformed(evt);
            }
        });

        jButtonMG02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG02ActionPerformed(evt);
            }
        });

        jButtonMG03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG03ActionPerformed(evt);
            }
        });

        jButtonMG04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG04ActionPerformed(evt);
            }
        });

        jButtonMG05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG05ActionPerformed(evt);
            }
        });

        jButtonMG06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG06ActionPerformed(evt);
            }
        });

        jButtonMG07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG07ActionPerformed(evt);
            }
        });

        jButtonMG08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG08ActionPerformed(evt);
            }
        });

        jButtonMG09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG09ActionPerformed(evt);
            }
        });

        jButtonMG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMG10ActionPerformed(evt);
            }
        });

        jButtonMH01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH01ActionPerformed(evt);
            }
        });

        jButtonMH02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH02ActionPerformed(evt);
            }
        });

        jButtonMH03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH03ActionPerformed(evt);
            }
        });

        jButtonMH04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH04ActionPerformed(evt);
            }
        });

        jButtonMH05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH05ActionPerformed(evt);
            }
        });

        jButtonMH06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH06ActionPerformed(evt);
            }
        });

        jButtonMH07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH07ActionPerformed(evt);
            }
        });

        jButtonMH08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH08ActionPerformed(evt);
            }
        });

        jButtonMH09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH09ActionPerformed(evt);
            }
        });

        jButtonMH10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMH10ActionPerformed(evt);
            }
        });

        jButtonMI01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI01ActionPerformed(evt);
            }
        });

        jButtonMI02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI02ActionPerformed(evt);
            }
        });

        jButtonMI03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI03ActionPerformed(evt);
            }
        });

        jButtonMI04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI04ActionPerformed(evt);
            }
        });

        jButtonMI05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI05ActionPerformed(evt);
            }
        });

        jButtonMI06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI06ActionPerformed(evt);
            }
        });

        jButtonMI07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI07ActionPerformed(evt);
            }
        });

        jButtonMI08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI08ActionPerformed(evt);
            }
        });

        jButtonMI09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI09ActionPerformed(evt);
            }
        });

        jButtonMI10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMI10ActionPerformed(evt);
            }
        });

        jButtonMJ01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ01ActionPerformed(evt);
            }
        });

        jButtonMJ02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ02ActionPerformed(evt);
            }
        });

        jButtonMJ03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ03ActionPerformed(evt);
            }
        });

        jButtonMJ04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ04ActionPerformed(evt);
            }
        });

        jButtonMJ05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ05ActionPerformed(evt);
            }
        });

        jButtonMJ06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ06ActionPerformed(evt);
            }
        });

        jButtonMJ07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ07ActionPerformed(evt);
            }
        });

        jButtonMJ08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ08ActionPerformed(evt);
            }
        });

        jButtonMJ09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ09ActionPerformed(evt);
            }
        });

        jButtonMJ10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJ10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelM03Layout = new javax.swing.GroupLayout(jPanelM03);
        jPanelM03.setLayout(jPanelM03Layout);
        jPanelM03Layout.setHorizontalGroup(
                jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMD01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMD10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonME01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonME10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMI01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMI10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                                .addComponent(jButtonMJ01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelM03Layout.setVerticalGroup(
                jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelM03Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMD10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMD01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonME10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonME01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMI10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMI01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelM03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonMJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMJ01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        jLabelE01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE01.setText("1");

        jLabelE02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE02.setText("2");

        jLabelE03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE03.setText("3");

        jLabelE04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE04.setText("4");

        jLabelE05.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE05.setText("5");

        jLabelE06.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE06.setText("6");

        jLabelE07.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE07.setText("7");

        jLabelE08.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE08.setText("8");

        jLabelE09.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE09.setText("9");

        jLabelE10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelE10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelE10.setText("10");

        javax.swing.GroupLayout jPanelE01Layout = new javax.swing.GroupLayout(jPanelE01);
        jPanelE01.setLayout(jPanelE01Layout);
        jPanelE01Layout.setHorizontalGroup(
                jPanelE01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelE01Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabelE01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelE10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelE01Layout.setVerticalGroup(
                jPanelE01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelE01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelE01, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE02, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE03, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE04, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE05, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE06, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE07, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE08, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE09, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelE10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelEA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEA.setText("A");

        jLabelEB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEB.setText("B");

        jLabelEC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEC.setText("C");

        jLabelED.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelED.setText("D");

        jLabelEE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEE.setText("E");

        jLabelEF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEF.setText("F");

        jLabelEG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEG.setText("G");

        jLabelEH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEH.setText("H");

        jLabelEI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEI.setText("I");

        jLabelEJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEJ.setText("J");

        javax.swing.GroupLayout jPanelE02Layout = new javax.swing.GroupLayout(jPanelE02);
        jPanelE02.setLayout(jPanelE02Layout);
        jPanelE02Layout.setHorizontalGroup(
                jPanelE02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelEA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEC, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelED, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEE, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEF, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEG, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEH, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEI, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEJ, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelE02Layout.setVerticalGroup(
                jPanelE02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelE02Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelEA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelED, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jButtonEA01.setBackground(COLOR_DEFAULT);
        jButtonEA02.setBackground(COLOR_DEFAULT);
        jButtonEA03.setBackground(COLOR_DEFAULT);
        jButtonEA04.setBackground(COLOR_DEFAULT);
        jButtonEA05.setBackground(COLOR_DEFAULT);
        jButtonEA06.setBackground(COLOR_DEFAULT);
        jButtonEA07.setBackground(COLOR_DEFAULT);
        jButtonEA08.setBackground(COLOR_DEFAULT);
        jButtonEA09.setBackground(COLOR_DEFAULT);
        jButtonEA10.setBackground(COLOR_DEFAULT);
        jButtonEB01.setBackground(COLOR_DEFAULT);
        jButtonEB02.setBackground(COLOR_DEFAULT);
        jButtonEB03.setBackground(COLOR_DEFAULT);
        jButtonEB04.setBackground(COLOR_DEFAULT);
        jButtonEB05.setBackground(COLOR_DEFAULT);
        jButtonEB06.setBackground(COLOR_DEFAULT);
        jButtonEB07.setBackground(COLOR_DEFAULT);
        jButtonEB08.setBackground(COLOR_DEFAULT);
        jButtonEB09.setBackground(COLOR_DEFAULT);
        jButtonEB10.setBackground(COLOR_DEFAULT);
        jButtonEC01.setBackground(COLOR_DEFAULT);
        jButtonEC02.setBackground(COLOR_DEFAULT);
        jButtonEC03.setBackground(COLOR_DEFAULT);
        jButtonEC04.setBackground(COLOR_DEFAULT);
        jButtonEC05.setBackground(COLOR_DEFAULT);
        jButtonEC06.setBackground(COLOR_DEFAULT);
        jButtonEC07.setBackground(COLOR_DEFAULT);
        jButtonEC08.setBackground(COLOR_DEFAULT);
        jButtonEC09.setBackground(COLOR_DEFAULT);
        jButtonEC10.setBackground(COLOR_DEFAULT);
        jButtonED01.setBackground(COLOR_DEFAULT);
        jButtonED02.setBackground(COLOR_DEFAULT);
        jButtonED03.setBackground(COLOR_DEFAULT);
        jButtonED04.setBackground(COLOR_DEFAULT);
        jButtonED05.setBackground(COLOR_DEFAULT);
        jButtonED06.setBackground(COLOR_DEFAULT);
        jButtonED07.setBackground(COLOR_DEFAULT);
        jButtonED08.setBackground(COLOR_DEFAULT);
        jButtonED09.setBackground(COLOR_DEFAULT);
        jButtonED10.setBackground(COLOR_DEFAULT);
        jButtonEE01.setBackground(COLOR_DEFAULT);
        jButtonEE02.setBackground(COLOR_DEFAULT);
        jButtonEE03.setBackground(COLOR_DEFAULT);
        jButtonEE04.setBackground(COLOR_DEFAULT);
        jButtonEE05.setBackground(COLOR_DEFAULT);
        jButtonEE06.setBackground(COLOR_DEFAULT);
        jButtonEE07.setBackground(COLOR_DEFAULT);
        jButtonEE08.setBackground(COLOR_DEFAULT);
        jButtonEE09.setBackground(COLOR_DEFAULT);
        jButtonEE10.setBackground(COLOR_DEFAULT);
        jButtonEF01.setBackground(COLOR_DEFAULT);
        jButtonEF02.setBackground(COLOR_DEFAULT);
        jButtonEF03.setBackground(COLOR_DEFAULT);
        jButtonEF04.setBackground(COLOR_DEFAULT);
        jButtonEF05.setBackground(COLOR_DEFAULT);
        jButtonEF06.setBackground(COLOR_DEFAULT);
        jButtonEF07.setBackground(COLOR_DEFAULT);
        jButtonEF08.setBackground(COLOR_DEFAULT);
        jButtonEF09.setBackground(COLOR_DEFAULT);
        jButtonEF10.setBackground(COLOR_DEFAULT);
        jButtonEG01.setBackground(COLOR_DEFAULT);
        jButtonEG02.setBackground(COLOR_DEFAULT);
        jButtonEG03.setBackground(COLOR_DEFAULT);
        jButtonEG04.setBackground(COLOR_DEFAULT);
        jButtonEG05.setBackground(COLOR_DEFAULT);
        jButtonEG06.setBackground(COLOR_DEFAULT);
        jButtonEG07.setBackground(COLOR_DEFAULT);
        jButtonEG08.setBackground(COLOR_DEFAULT);
        jButtonEG09.setBackground(COLOR_DEFAULT);
        jButtonEG10.setBackground(COLOR_DEFAULT);
        jButtonEH01.setBackground(COLOR_DEFAULT);
        jButtonEH02.setBackground(COLOR_DEFAULT);
        jButtonEH03.setBackground(COLOR_DEFAULT);
        jButtonEH04.setBackground(COLOR_DEFAULT);
        jButtonEH05.setBackground(COLOR_DEFAULT);
        jButtonEH06.setBackground(COLOR_DEFAULT);
        jButtonEH07.setBackground(COLOR_DEFAULT);
        jButtonEH08.setBackground(COLOR_DEFAULT);
        jButtonEH09.setBackground(COLOR_DEFAULT);
        jButtonEH10.setBackground(COLOR_DEFAULT);
        jButtonEI01.setBackground(COLOR_DEFAULT);
        jButtonEI02.setBackground(COLOR_DEFAULT);
        jButtonEI03.setBackground(COLOR_DEFAULT);
        jButtonEI04.setBackground(COLOR_DEFAULT);
        jButtonEI05.setBackground(COLOR_DEFAULT);
        jButtonEI06.setBackground(COLOR_DEFAULT);
        jButtonEI07.setBackground(COLOR_DEFAULT);
        jButtonEI08.setBackground(COLOR_DEFAULT);
        jButtonEI09.setBackground(COLOR_DEFAULT);
        jButtonEI10.setBackground(COLOR_DEFAULT);
        jButtonEJ01.setBackground(COLOR_DEFAULT);
        jButtonEJ02.setBackground(COLOR_DEFAULT);
        jButtonEJ03.setBackground(COLOR_DEFAULT);
        jButtonEJ04.setBackground(COLOR_DEFAULT);
        jButtonEJ05.setBackground(COLOR_DEFAULT);
        jButtonEJ06.setBackground(COLOR_DEFAULT);
        jButtonEJ07.setBackground(COLOR_DEFAULT);
        jButtonEJ08.setBackground(COLOR_DEFAULT);
        jButtonEJ09.setBackground(COLOR_DEFAULT);
        jButtonEJ10.setBackground(COLOR_DEFAULT);

        jButtonEA01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEA10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEB10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEC10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonED10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEE10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEF10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEG10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEH10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEI10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ01.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ02.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ03.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ04.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ05.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ06.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ07.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ08.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ09.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));
        jButtonEJ10.setBorder(javax.swing.BorderFactory.createLineBorder(COLOR_BLACK));

        jButtonEA01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA01ActionPerformed(evt);
            }
        });

        jButtonEA02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA02ActionPerformed(evt);
            }
        });

        jButtonEA03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA03ActionPerformed(evt);
            }
        });

        jButtonEA04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA04ActionPerformed(evt);
            }
        });

        jButtonEA05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA05ActionPerformed(evt);
            }
        });

        jButtonEA06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA06ActionPerformed(evt);
            }
        });

        jButtonEA07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA07ActionPerformed(evt);
            }
        });

        jButtonEA08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA08ActionPerformed(evt);
            }
        });

        jButtonEA09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA09ActionPerformed(evt);
            }
        });

        jButtonEA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEA10ActionPerformed(evt);
            }
        });

        jButtonEB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB01ActionPerformed(evt);
            }
        });

        jButtonEB02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB02ActionPerformed(evt);
            }
        });

        jButtonEB03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB03ActionPerformed(evt);
            }
        });

        jButtonEB04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB04ActionPerformed(evt);
            }
        });

        jButtonEB05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB05ActionPerformed(evt);
            }
        });

        jButtonEB06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB06ActionPerformed(evt);
            }
        });

        jButtonEB07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB07ActionPerformed(evt);
            }
        });

        jButtonEB08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB08ActionPerformed(evt);
            }
        });

        jButtonEB09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB09ActionPerformed(evt);
            }
        });

        jButtonEB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEB10ActionPerformed(evt);
            }
        });

        jButtonEC01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC01ActionPerformed(evt);
            }
        });

        jButtonEC02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC02ActionPerformed(evt);
            }
        });

        jButtonEC03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC03ActionPerformed(evt);
            }
        });

        jButtonEC04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC04ActionPerformed(evt);
            }
        });

        jButtonEC05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC05ActionPerformed(evt);
            }
        });

        jButtonEC06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC06ActionPerformed(evt);
            }
        });

        jButtonEC07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC07ActionPerformed(evt);
            }
        });

        jButtonEC08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC08ActionPerformed(evt);
            }
        });

        jButtonEC09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC09ActionPerformed(evt);
            }
        });

        jButtonEC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEC10ActionPerformed(evt);
            }
        });

        jButtonED01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED01ActionPerformed(evt);
            }
        });

        jButtonED02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED02ActionPerformed(evt);
            }
        });

        jButtonED03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED03ActionPerformed(evt);
            }
        });

        jButtonED04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED04ActionPerformed(evt);
            }
        });

        jButtonED05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED05ActionPerformed(evt);
            }
        });

        jButtonED06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED06ActionPerformed(evt);
            }
        });

        jButtonED07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED07ActionPerformed(evt);
            }
        });

        jButtonED08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED08ActionPerformed(evt);
            }
        });

        jButtonED09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED09ActionPerformed(evt);
            }
        });

        jButtonED10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonED10ActionPerformed(evt);
            }
        });

        jButtonEE01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE01ActionPerformed(evt);
            }
        });

        jButtonEE02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE02ActionPerformed(evt);
            }
        });

        jButtonEE03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE03ActionPerformed(evt);
            }
        });

        jButtonEE04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE04ActionPerformed(evt);
            }
        });

        jButtonEE05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE05ActionPerformed(evt);
            }
        });

        jButtonEE06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE06ActionPerformed(evt);
            }
        });

        jButtonEE07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE07ActionPerformed(evt);
            }
        });

        jButtonEE08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE08ActionPerformed(evt);
            }
        });

        jButtonEE09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE09ActionPerformed(evt);
            }
        });

        jButtonEE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEE10ActionPerformed(evt);
            }
        });

        jButtonEF01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF01ActionPerformed(evt);
            }
        });

        jButtonEF02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF02ActionPerformed(evt);
            }
        });

        jButtonEF03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF03ActionPerformed(evt);
            }
        });

        jButtonEF04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF04ActionPerformed(evt);
            }
        });

        jButtonEF05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF05ActionPerformed(evt);
            }
        });

        jButtonEF06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF06ActionPerformed(evt);
            }
        });

        jButtonEF07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF07ActionPerformed(evt);
            }
        });

        jButtonEF08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF08ActionPerformed(evt);
            }
        });

        jButtonEF09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF09ActionPerformed(evt);
            }
        });

        jButtonEF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEF10ActionPerformed(evt);
            }
        });

        jButtonEG01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG01ActionPerformed(evt);
            }
        });

        jButtonEG02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG02ActionPerformed(evt);
            }
        });

        jButtonEG03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG03ActionPerformed(evt);
            }
        });

        jButtonEG04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG04ActionPerformed(evt);
            }
        });

        jButtonEG05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG05ActionPerformed(evt);
            }
        });

        jButtonEG06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG06ActionPerformed(evt);
            }
        });

        jButtonEG07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG07ActionPerformed(evt);
            }
        });

        jButtonEG08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG08ActionPerformed(evt);
            }
        });

        jButtonEG09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG09ActionPerformed(evt);
            }
        });

        jButtonEG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEG10ActionPerformed(evt);
            }
        });

        jButtonEH01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH01ActionPerformed(evt);
            }
        });

        jButtonEH02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH02ActionPerformed(evt);
            }
        });

        jButtonEH03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH03ActionPerformed(evt);
            }
        });

        jButtonEH04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH04ActionPerformed(evt);
            }
        });

        jButtonEH05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH05ActionPerformed(evt);
            }
        });

        jButtonEH06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH06ActionPerformed(evt);
            }
        });

        jButtonEH07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH07ActionPerformed(evt);
            }
        });

        jButtonEH08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH08ActionPerformed(evt);
            }
        });

        jButtonEH09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH09ActionPerformed(evt);
            }
        });

        jButtonEH10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEH10ActionPerformed(evt);
            }
        });

        jButtonEI01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI01ActionPerformed(evt);
            }
        });

        jButtonEI02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI02ActionPerformed(evt);
            }
        });

        jButtonEI03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI03ActionPerformed(evt);
            }
        });

        jButtonEI04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI04ActionPerformed(evt);
            }
        });

        jButtonEI05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI05ActionPerformed(evt);
            }
        });

        jButtonEI06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI06ActionPerformed(evt);
            }
        });

        jButtonEI07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI07ActionPerformed(evt);
            }
        });

        jButtonEI08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI08ActionPerformed(evt);
            }
        });

        jButtonEI09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI09ActionPerformed(evt);
            }
        });

        jButtonEI10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEI10ActionPerformed(evt);
            }
        });

        jButtonEJ01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ01ActionPerformed(evt);
            }
        });

        jButtonEJ02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ02ActionPerformed(evt);
            }
        });

        jButtonEJ03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ03ActionPerformed(evt);
            }
        });

        jButtonEJ04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ04ActionPerformed(evt);
            }
        });

        jButtonEJ05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ05ActionPerformed(evt);
            }
        });

        jButtonEJ06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ06ActionPerformed(evt);
            }
        });

        jButtonEJ07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ07ActionPerformed(evt);
            }
        });

        jButtonEJ08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ08ActionPerformed(evt);
            }
        });

        jButtonEJ09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ09ActionPerformed(evt);
            }
        });

        jButtonEJ10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJ10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelE03Layout = new javax.swing.GroupLayout(jPanelE03);
        jPanelE03.setLayout(jPanelE03Layout);
        jPanelE03Layout.setHorizontalGroup(
                jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonED01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonED10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEE01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEE10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEI01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEI10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                                .addComponent(jButtonEJ01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelE03Layout.setVerticalGroup(
                jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelE03Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonED10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonED01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEE10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEE01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEI10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEI01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelE03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEJ01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanelM02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanelM03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jPanelM01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanelE02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanelE03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jPanelE01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelM01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelE01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelM03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelM02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelE02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelE03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private synchronized void shipPanelEnable(boolean enabled) {
        jButton1Deck1.setEnabled(enabled);
        jButton1Deck2.setEnabled(enabled);
        jButton1Deck3.setEnabled(enabled);
        jButton1Deck4.setEnabled(enabled);
        jButton2Deck1.setEnabled(enabled);
        jButton2Deck2.setEnabled(enabled);
        jButton2Deck3.setEnabled(enabled);
        jButton3Deck1.setEnabled(enabled);
        jButton3Deck2.setEnabled(enabled);
        jButton4Deck1.setEnabled(enabled);
    }

    //--- main panel ---

    // настройки игры
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new IpAddressFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // проверка сети
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Boolean lanTest = enemyService.lanTest();
        if (lanTest != null && lanTest) {
            JOptionPane.showMessageDialog(null, "Враг опрошен и он в сети, ждет когда может тебя порвать", "!!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Враг не найден в сети", "!!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // расставить корабли
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Не реализовано", "упс", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    // сбросить расстановку кораблей
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Initializer().initPanels();
        repaintPanels();
        repaintShipPanel();
    }//GEN-LAST:event_jButton4ActionPerformed

    // начать игру
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (gameService.imReady()) {
            if (enemyService.areYouReady()) {
                repaintShipPanel();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // реакция на закрытие окна
    private void formWindowClosing(WindowEvent evt) {
        //System.exit(0);
    }

    //--- ship panel ---

    private void jButtonShip41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonShip11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    //--- mine panel ---

    private void jButtonMA01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA01ActionPerformed

    private void jButtonMA02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA02ActionPerformed

    private void jButtonMA03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA03ActionPerformed

    private void jButtonMA04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA04ActionPerformed

    private void jButtonMA05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA05ActionPerformed

    private void jButtonMA06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA06ActionPerformed

    private void jButtonMA07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA07ActionPerformed

    private void jButtonMA08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA08ActionPerformed

    private void jButtonMA09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA09ActionPerformed

    private void jButtonMA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMA10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMA10ActionPerformed

    private void jButtonMB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB01ActionPerformed

    private void jButtonMB02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB02ActionPerformed

    private void jButtonMB03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB03ActionPerformed

    private void jButtonMB04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB04ActionPerformed

    private void jButtonMB05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB05ActionPerformed

    private void jButtonMB06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB06ActionPerformed

    private void jButtonMB07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB07ActionPerformed

    private void jButtonMB08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB08ActionPerformed

    private void jButtonMB09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB09ActionPerformed

    private void jButtonMB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMB10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMB10ActionPerformed

    private void jButtonMC01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC01ActionPerformed

    private void jButtonMC02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC02ActionPerformed

    private void jButtonMC03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC03ActionPerformed

    private void jButtonMC04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC04ActionPerformed

    private void jButtonMC05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC05ActionPerformed

    private void jButtonMC06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC06ActionPerformed

    private void jButtonMC07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC07ActionPerformed

    private void jButtonMC08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC08ActionPerformed

    private void jButtonMC09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC09ActionPerformed

    private void jButtonMC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMC10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMC10ActionPerformed

    private void jButtonMD01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD01ActionPerformed

    private void jButtonMD02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD02ActionPerformed

    private void jButtonMD03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD03ActionPerformed

    private void jButtonMD04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD04ActionPerformed

    private void jButtonMD05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD05ActionPerformed

    private void jButtonMD06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD06ActionPerformed

    private void jButtonMD07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD07ActionPerformed

    private void jButtonMD08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD08ActionPerformed

    private void jButtonMD09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD09ActionPerformed

    private void jButtonMD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMD10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMD10ActionPerformed

    private void jButtonME01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME01ActionPerformed

    private void jButtonME02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME02ActionPerformed

    private void jButtonME03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME03ActionPerformed

    private void jButtonME04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME04ActionPerformed

    private void jButtonME05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME05ActionPerformed

    private void jButtonME06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME06ActionPerformed

    private void jButtonME07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME07ActionPerformed

    private void jButtonME08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME08ActionPerformed

    private void jButtonME09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME09ActionPerformed

    private void jButtonME10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonME10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonME10ActionPerformed

    private void jButtonMF01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF01ActionPerformed

    private void jButtonMF02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF02ActionPerformed

    private void jButtonMF03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF03ActionPerformed

    private void jButtonMF04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF04ActionPerformed

    private void jButtonMF05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF05ActionPerformed

    private void jButtonMF06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF06ActionPerformed

    private void jButtonMF07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF07ActionPerformed

    private void jButtonMF08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF08ActionPerformed

    private void jButtonMF09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF09ActionPerformed

    private void jButtonMF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMF10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMF10ActionPerformed

    private void jButtonMG01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG01ActionPerformed

    private void jButtonMG02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG02ActionPerformed

    private void jButtonMG03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG03ActionPerformed

    private void jButtonMG04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG04ActionPerformed

    private void jButtonMG05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG05ActionPerformed

    private void jButtonMG06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG06ActionPerformed

    private void jButtonMG07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG07ActionPerformed

    private void jButtonMG08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG08ActionPerformed

    private void jButtonMG09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG09ActionPerformed

    private void jButtonMG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMG10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMG10ActionPerformed

    private void jButtonMH01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH01ActionPerformed

    private void jButtonMH02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH02ActionPerformed

    private void jButtonMH03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH03ActionPerformed

    private void jButtonMH04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH04ActionPerformed

    private void jButtonMH05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH05ActionPerformed

    private void jButtonMH06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH06ActionPerformed

    private void jButtonMH07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH07ActionPerformed

    private void jButtonMH08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH08ActionPerformed

    private void jButtonMH09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH09ActionPerformed

    private void jButtonMH10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMH10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMH10ActionPerformed

    private void jButtonMI01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI01ActionPerformed

    private void jButtonMI02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI02ActionPerformed

    private void jButtonMI03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI03ActionPerformed

    private void jButtonMI04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI04ActionPerformed

    private void jButtonMI05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI05ActionPerformed

    private void jButtonMI06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI06ActionPerformed

    private void jButtonMI07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI07ActionPerformed

    private void jButtonMI08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI08ActionPerformed

    private void jButtonMI09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI09ActionPerformed

    private void jButtonMI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMI10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMI10ActionPerformed

    private void jButtonMJ01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ01ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ01ActionPerformed

    private void jButtonMJ02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ02ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ02ActionPerformed

    private void jButtonMJ03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ03ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ03ActionPerformed

    private void jButtonMJ04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ04ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ04ActionPerformed

    private void jButtonMJ05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ05ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ05ActionPerformed

    private void jButtonMJ06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ06ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ06ActionPerformed

    private void jButtonMJ07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ07ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ07ActionPerformed

    private void jButtonMJ08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ08ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ08ActionPerformed

    private void jButtonMJ09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ09ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ09ActionPerformed

    private void jButtonMJ10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJ10ActionPerformed
        repaintMinePanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonMJ10ActionPerformed

    //--- enemy panel ---

    private void jButtonEA01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA01ActionPerformed

    private void jButtonEA02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA02ActionPerformed

    private void jButtonEA03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA03ActionPerformed

    private void jButtonEA04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA04ActionPerformed

    private void jButtonEA05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA05ActionPerformed

    private void jButtonEA06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA06ActionPerformed

    private void jButtonEA07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA07ActionPerformed

    private void jButtonEA08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA08ActionPerformed

    private void jButtonEA09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA09ActionPerformed

    private void jButtonEA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEA10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEA10ActionPerformed

    private void jButtonEB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB01ActionPerformed

    private void jButtonEB02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB02ActionPerformed

    private void jButtonEB03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB03ActionPerformed

    private void jButtonEB04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB04ActionPerformed

    private void jButtonEB05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB05ActionPerformed

    private void jButtonEB06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB06ActionPerformed

    private void jButtonEB07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB07ActionPerformed

    private void jButtonEB08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB08ActionPerformed

    private void jButtonEB09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB09ActionPerformed

    private void jButtonEB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEB10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEB10ActionPerformed

    private void jButtonEC01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC01ActionPerformed

    private void jButtonEC02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC02ActionPerformed

    private void jButtonEC03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC03ActionPerformed

    private void jButtonEC04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC04ActionPerformed

    private void jButtonEC05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC05ActionPerformed

    private void jButtonEC06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC06ActionPerformed

    private void jButtonEC07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC07ActionPerformed

    private void jButtonEC08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC08ActionPerformed

    private void jButtonEC09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC09ActionPerformed

    private void jButtonEC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEC10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEC10ActionPerformed

    private void jButtonED01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED01ActionPerformed

    private void jButtonED02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED02ActionPerformed

    private void jButtonED03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED03ActionPerformed

    private void jButtonED04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED04ActionPerformed

    private void jButtonED05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED05ActionPerformed

    private void jButtonED06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED06ActionPerformed

    private void jButtonED07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED07ActionPerformed

    private void jButtonED08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED08ActionPerformed

    private void jButtonED09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED09ActionPerformed

    private void jButtonED10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonED10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonED10ActionPerformed

    private void jButtonEE01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE01ActionPerformed

    private void jButtonEE02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE02ActionPerformed

    private void jButtonEE03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE03ActionPerformed

    private void jButtonEE04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE04ActionPerformed

    private void jButtonEE05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE05ActionPerformed

    private void jButtonEE06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE06ActionPerformed

    private void jButtonEE07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE07ActionPerformed

    private void jButtonEE08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE08ActionPerformed

    private void jButtonEE09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE09ActionPerformed

    private void jButtonEE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEE10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEE10ActionPerformed

    private void jButtonEF01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF01ActionPerformed

    private void jButtonEF02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF02ActionPerformed

    private void jButtonEF03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF03ActionPerformed

    private void jButtonEF04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF04ActionPerformed

    private void jButtonEF05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF05ActionPerformed

    private void jButtonEF06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF06ActionPerformed

    private void jButtonEF07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF07ActionPerformed

    private void jButtonEF08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF08ActionPerformed

    private void jButtonEF09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF09ActionPerformed

    private void jButtonEF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEF10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEF10ActionPerformed

    private void jButtonEG01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG01ActionPerformed

    private void jButtonEG02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG02ActionPerformed

    private void jButtonEG03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG03ActionPerformed

    private void jButtonEG04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG04ActionPerformed

    private void jButtonEG05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG05ActionPerformed

    private void jButtonEG06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG06ActionPerformed

    private void jButtonEG07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG07ActionPerformed

    private void jButtonEG08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG08ActionPerformed

    private void jButtonEG09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG09ActionPerformed

    private void jButtonEG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEG10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEG10ActionPerformed

    private void jButtonEH01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH01ActionPerformed

    private void jButtonEH02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH02ActionPerformed

    private void jButtonEH03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH03ActionPerformed

    private void jButtonEH04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH04ActionPerformed

    private void jButtonEH05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH05ActionPerformed

    private void jButtonEH06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH06ActionPerformed

    private void jButtonEH07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH07ActionPerformed

    private void jButtonEH08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH08ActionPerformed

    private void jButtonEH09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH09ActionPerformed

    private void jButtonEH10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEH10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEH10ActionPerformed

    private void jButtonEI01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI01ActionPerformed

    private void jButtonEI02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI02ActionPerformed

    private void jButtonEI03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI03ActionPerformed

    private void jButtonEI04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI04ActionPerformed

    private void jButtonEI05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI05ActionPerformed

    private void jButtonEI06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI06ActionPerformed

    private void jButtonEI07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI07ActionPerformed

    private void jButtonEI08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI08ActionPerformed

    private void jButtonEI09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI09ActionPerformed

    private void jButtonEI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEI10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEI10ActionPerformed

    private void jButtonEJ01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ01ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ01ActionPerformed

    private void jButtonEJ02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ02ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ02ActionPerformed

    private void jButtonEJ03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ03ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ03ActionPerformed

    private void jButtonEJ04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ04ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ04ActionPerformed

    private void jButtonEJ05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ05ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ05ActionPerformed

    private void jButtonEJ06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ06ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ06ActionPerformed

    private void jButtonEJ07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ07ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ07ActionPerformed

    private void jButtonEJ08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ08ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ08ActionPerformed

    private void jButtonEJ09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ09ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ09ActionPerformed

    private void jButtonEJ10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJ10ActionPerformed
        repaintEnemyPanel(Thread.currentThread().getStackTrace());
    }//GEN-LAST:event_jButtonEJ10ActionPerformed

    //------------------------------------------------------------------------------------------------------------------

    private void repaintMinePanel(StackTraceElement[] stackTraceElements) {
        if (Boolean.FALSE.equals(ImReadySingleton.instance(null).imReady())) {
            String methodName = "";
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                if (stackTraceElement.getMethodName().contains(M_BUTTON_PREFIX)) {
                    methodName = stackTraceElement.getMethodName();
                }
            }
            methodName = methodName.replace(M_BUTTON_PREFIX, "").replace(BUTTON_POSTFIX, "");
            gameService.setShipPoint(methodName.charAt(0), Integer.parseInt(methodName.substring(1)));
            repaintPanel(MINE);
        } else {
            JOptionPane.showMessageDialog(null, "Все корабли расставлены", "Внимание!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void repaintEnemyPanel(StackTraceElement[] stackTraceElements) {
        if (EnemyReadySingleton.instance(null).enemyReady()) {
            if (MyStepSingleton.instance(null).myStep()) {
                String methodName = "";
                for (StackTraceElement stackTraceElement : stackTraceElements) {
                    if (stackTraceElement.getMethodName().contains(E_BUTTON_PREFIX)) {
                        methodName = stackTraceElement.getMethodName();
                    }
                }
                methodName = methodName.replace(E_BUTTON_PREFIX, "").replace(BUTTON_POSTFIX, "");
                char row = methodName.charAt(0);
                int col = Integer.parseInt(methodName.substring(1));
                int value = enemyService.sendBomb(row, col) ? 2 : 3;
                gameService.setSidePoint(ENEMY, row, col, value);
                repaintPanel(ENEMY);
                MyStepSingleton.instance(value == 2);
                if (gameService.checkEndGame(ENEMY)) {
                    JOptionPane.showMessageDialog(null, "Ты порвал врага на лоскуты!", "Конгратулэйшн тебя!", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Сейчас не твой ход", "Внимание!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Враг (или ты) еще не готов", "Внимание!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void repaintPanels() {
        repaintPanel(MINE);
        repaintPanel(ENEMY);
    }

    private synchronized void repaintPanel(String side) {
        List<HorizontalLine> panel;
        if (side.equalsIgnoreCase(MINE)) {
            panel = new ArrayList<>(MinePanelSingleton.instance(null).getPanel());
        } else if (side.equalsIgnoreCase(ENEMY)) {
            panel = new ArrayList<>(EnemyPanelSingleton.instance(null).getPanel());
        } else {
            throw new SideNotFoundException();
        }
        List<Field> fieldMList = Arrays.stream(MainFrame.class.getDeclaredFields())
                .filter(field -> field.getName().startsWith(BUTTON_PREFIX.concat(side)))
                .sorted(Comparator.comparing(Field::getName))
                .collect(Collectors.toCollection(() -> new ArrayList<>(100)));
        for (HorizontalLine horizontalLine : panel) {
            List<PointElement> line = horizontalLine.getPointElementList();
            for (PointElement pointElement : line) {
                Field field = fieldMList
                        .stream()
                        .filter(
                                item -> item.getName().startsWith(
                                        BUTTON_PREFIX.concat(side) + horizontalLine.getRow() + (pointElement.getCol() < 10 ? "0" + pointElement.getCol() : pointElement.getCol())
                                )
                        )
                        .collect(Collectors.toList())
                        .get(0);
                field.setAccessible(true);
                try {
                    Color color = pointElement.getValue() == 0 ?
                            COLOR_DEFAULT :
                            pointElement.getValue() == 1 ?
                                    COLOR_BLUE :
                                    pointElement.getValue() == 2 ?
                                            COLOR_RED :
                                            pointElement.getValue() == 3 ?
                                                    COLOR_BLACK :
                                                    COLOR_DEFAULT;
                    Method methodBackground = JButton.class.getMethod(METHOD_BACKGROUND, Color.class);
                    Object buttonBackground = field.get(this);
                    methodBackground.invoke(buttonBackground, color);
                    Method methodOpaque = JButton.class.getMethod(METHOD_OPAQUE, boolean.class);
                    Object buttonOpaque = field.get(this);
                    methodOpaque.invoke(buttonOpaque, pointElement.getValue() == 1 || pointElement.getValue() == 2 || pointElement.getValue() == 3);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    // лень было заниматься reflection
    // первоначальная раскраска кораблей в синий после полной расстановки
    private void repaintShipPanel() {
        Map<String, Integer> shipMap = ShipStorageSingleton.instance(null).getShipMap();
        shipPanelEnable(true);
        jButton1Deck1.setBackground(shipMap.getOrDefault(4 + DECK, 0) == 1 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton1Deck2.setBackground(shipMap.getOrDefault(4 + DECK, 0) == 1 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton1Deck3.setBackground(shipMap.getOrDefault(4 + DECK, 0) == 1 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton1Deck4.setBackground(shipMap.getOrDefault(4 + DECK, 0) == 1 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton2Deck1.setBackground(shipMap.getOrDefault(3 + DECK, 0) == 2 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton2Deck2.setBackground(shipMap.getOrDefault(3 + DECK, 0) == 2 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton2Deck3.setBackground(shipMap.getOrDefault(3 + DECK, 0) == 2 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton3Deck1.setBackground(shipMap.getOrDefault(2 + DECK, 0) == 3 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton3Deck2.setBackground(shipMap.getOrDefault(2 + DECK, 0) == 3 ? COLOR_BLUE : COLOR_DEFAULT);
        jButton4Deck1.setBackground(shipMap.getOrDefault(1 + DECK, 0) == 4 ? COLOR_BLUE : COLOR_DEFAULT);
        shipPanelEnable(false);
    }

    /**
     * перекрашивает верхнюю панель кораблей
     */
    private synchronized void repaintLostShip() {
        shipPanelEnable(true);
        //IntStream.rangeClosed(1, 4).forEach(count -> repaintLostShip(BUTTON_PREFIX + count + DECK, gameService.checkShipCount(count)));
        shipPanelEnable(false);
    }

    /**
     * закрашивает количество затопленных кораблей
     * @param buttonPrefix - префикс имени кнопки
     * @param countDead - количество погибших кораблей
     */
    private synchronized void repaintLostShip(String buttonPrefix, int countDead) {
        List<Field> fieldMList = Arrays.stream(MainFrame.class.getDeclaredFields())
                .filter(field -> field.getName().toLowerCase().startsWith(buttonPrefix.toLowerCase()))
                .sorted(Comparator.comparing(Field::getName))
                .collect(Collectors.toCollection(() -> new ArrayList<>(4)));
        for (int i = 1; i <= countDead; i++) {
            int finalI = i;
            Field field = fieldMList
                    .stream()
                    .filter(item -> item.getName().equalsIgnoreCase(buttonPrefix + finalI))
                    .collect(Collectors.toList())
                    .get(0);
            field.setAccessible(true);
            try {
                Method methodBackground = JButton.class.getMethod(METHOD_BACKGROUND, Color.class);
                methodBackground.invoke(field.get(this), COLOR_RED);
                Method methodOpaque = JButton.class.getMethod(METHOD_OPAQUE, boolean.class);
                methodOpaque.invoke(field.get(this), true);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void startThread() {
        Thread repaintMinePanelThread = new Thread(new RepaintMinePanelThread());
        repaintMinePanelThread.setDaemon(true);
        repaintMinePanelThread.start();
    }

    private class RepaintMinePanelThread implements Runnable {

        private boolean game = true;

        @Override
        public void run() {
            try {
                Thread.sleep(1000 * 10);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            while (game) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                repaintPanel(MINE);
                repaintLostShip();
                if (gameService.checkEndGame(MINE)) {
                    this.game = false;
                    JOptionPane.showMessageDialog(null, "Тебя размотали, неудачник!", "Мамкин стратег!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
}
