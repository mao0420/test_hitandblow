package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameScreenPanel extends JPanel {

    static JLabel labelOneDigits;
    static JLabel labelTwoDigits;
    static JLabel labelThreeDigits;
    static JLabel labelInputHistoryMessageLeft;
    static JLabel labelInputHistoryMessageRight;
    static JLabel labelInputHistoryDescriptionLeft;
    static JLabel labelInputHistoryDescriptionRight;
    static JLabel labelInputHistoryNumberOne;
    static JLabel labelInputHistoryNumberTwo;
    static JLabel labelInputHistoryNumberThree;
    static JLabel labelInputHistoryNumberFour;
    static JLabel labelInputHistoryNumberFive;
    static JLabel labelInputHistoryNumberSix;
    static JLabel labelInputHistoryNumberSeven;
    static JLabel labelInputHistoryNumberEight;
    static JLabel labelInputHistoryNumberNine;
    static JButton buttonOne;
    static JButton buttonTwo;
    static JButton buttonThree;
    static JButton buttonFour;
    static JButton buttonFive;
    static JButton buttonSix;
    static JButton buttonSeven;
    static JButton buttonEight;
    static JButton buttonNine;
    static JButton buttonZero;
    static JButton buttonReset;
    static JButton buttonConfirm;
    static JButton buttonGiveUp;
    static JLabel labelInputTimes;
    static JLabel labelErrorMessage;
    static JLabel labelInputSpaceLeft;
    static JLabel labelInputSpaceRight;
    static JLabel labelInputSpaceCenter;

    /**
     * ゲーム画面パネルコンストラクタ
     * ゲーム時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public GameScreenPanel(ActionListener actionListener) {
        GridBagLayout gbLayout = new GridBagLayout();
        this.setLayout(gbLayout);

        GridBagConstraints positionPreference = new GridBagConstraints();

        labelOneDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelTwoDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelThreeDigits = new JLabel(Constants.DISPLAY_TEXT_DISPLAY_NUMBER);
        labelInputHistoryMessageLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        labelInputHistoryMessageRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_MESSAGE);
        labelInputHistoryDescriptionLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        labelInputHistoryDescriptionRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_DESCRIPTION);
        labelInputHistoryNumberOne = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberTwo = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberThree = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberFour = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberFive = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberSix = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberSeven = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberEight = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        labelInputHistoryNumberNine = new JLabel(Constants.DISPLAY_TEXT_INPUT_HISTORY_NUMBER);
        buttonOne = new JButton(Constants.DISPLAY_BUTTON_ONE);
        buttonTwo = new JButton(Constants.DISPLAY_BUTTON_TWO);
        buttonThree = new JButton(Constants.DISPLAY_BUTTON_THREE);
        buttonFour = new JButton(Constants.DISPLAY_BUTTON_FOUR);
        buttonFive = new JButton(Constants.DISPLAY_BUTTON_FIVE);
        buttonSix = new JButton(Constants.DISPLAY_BUTTON_SIX);
        buttonSeven = new JButton(Constants.DISPLAY_BUTTON_SEVEN);
        buttonEight = new JButton(Constants.DISPLAY_BUTTON_EIGHT);
        buttonNine = new JButton(Constants.DISPLAY_BUTTON_NINE);
        buttonZero = new JButton(Constants.DISPLAY_BUTTON_ZERO);
        buttonReset = new JButton(Constants.DISPLAY_BUTTON_RESET);
        buttonConfirm = new JButton(Constants.DISPLAY_BUTTON_CONFIRM);
        buttonGiveUp = new JButton(Constants.DISPLAY_BUTTON_GIVE_UP);
        labelInputTimes = new JLabel(Constants.DISPLAY_TEXT_INPUT_TIMES);
        labelErrorMessage = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);
        labelInputSpaceLeft = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);
        labelInputSpaceRight = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);
        labelInputSpaceCenter = new JLabel(Constants.DISPLAY_TEXT_INPUT_SPACE);

        buttonOne.setName(Constants.DISPLAY_BUTTON_ONE);
        buttonTwo.setName(Constants.DISPLAY_BUTTON_TWO);
        buttonThree.setName(Constants.DISPLAY_BUTTON_THREE);
        buttonFour.setName(Constants.DISPLAY_BUTTON_FOUR);
        buttonFive.setName(Constants.DISPLAY_BUTTON_FIVE);
        buttonSix.setName(Constants.DISPLAY_BUTTON_SIX);
        buttonSeven.setName(Constants.DISPLAY_BUTTON_SEVEN);
        buttonEight.setName(Constants.DISPLAY_BUTTON_EIGHT);
        buttonNine.setName(Constants.DISPLAY_BUTTON_NINE);
        buttonZero.setName(Constants.DISPLAY_BUTTON_ZERO);
        buttonReset.setName(Constants.DISPLAY_BUTTON_RESET);
        buttonConfirm.setName(Constants.DISPLAY_BUTTON_CONFIRM);
        buttonGiveUp.setName(Constants.DISPLAY_BUTTON_GIVE_UP);

        //フォント設定メソッドへ
        setFontInGameScreenPanel();
        //サイズ設定メソッドへ
        buttonSettingsInGameScreenPanel();
        //配置場所設定メソッドへ
        setPositionInGameScreenPanel(positionPreference, gbLayout);
        //アクション設定メソッドへ
        setActionInSettingsInGameScreenPanel(actionListener);

        JComponent[] jComponents = {labelOneDigits, labelTwoDigits, labelThreeDigits, labelInputHistoryMessageLeft,
                labelInputHistoryMessageRight, labelInputHistoryDescriptionLeft, labelInputHistoryDescriptionRight,
                labelInputHistoryNumberOne, labelInputHistoryNumberTwo, labelInputHistoryNumberThree,
                labelInputHistoryNumberFour, labelInputHistoryNumberFive, labelInputHistoryNumberSix,
                labelInputHistoryNumberSeven, labelInputHistoryNumberEight, labelInputHistoryNumberNine,
                labelInputTimes, labelErrorMessage, labelInputSpaceLeft, labelInputSpaceRight, labelInputSpaceCenter,
                buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
                buttonNine, buttonZero, buttonReset, buttonConfirm, buttonGiveUp};
        for (JComponent jComponent : jComponents) {
            this.add(jComponent);
        }
    }

    /**
     * ゲーム画面パネル フォント設定メソッド
     * ゲーム画面パネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInGameScreenPanel() {
        labelOneDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelTwoDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelThreeDigits.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_DISPLAY_NUMBER));
        labelInputHistoryMessageLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelInputHistoryMessageRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_MESSAGE));
        labelInputHistoryDescriptionLeft.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelInputHistoryDescriptionRight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_DESCRIPTION));
        labelInputHistoryNumberOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        labelInputHistoryNumberNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_HISTORY_NUMBER));
        buttonOne.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonTwo.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonThree.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonFour.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonFive.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonSix.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonSeven.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonEight.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonNine.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonZero.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON));
        buttonReset.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_RESET));
        buttonConfirm.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_CONFIRM));
        buttonGiveUp.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_NUMBER_BUTTON_GIVE_UP));
        labelInputTimes.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_INPUT_TIMES));
        labelErrorMessage.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_ERROR_MESSAGE));
    }

    /**
     * ゲーム画面パネル サイズ設定メソッド
     * ゲーム画面パネル内で使用されるボタンやラベルのサイズを設定する。
     */
    private void buttonSettingsInGameScreenPanel() {
        buttonOne.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonTwo.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonThree.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonFour.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonFive.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonSix.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonSeven.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonEight.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonNine.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonZero.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonReset.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonConfirm.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
        buttonGiveUp.setPreferredSize(new Dimension(Constants.SIZE_NUMBER_BUTTON_WIDTH, Constants.SIZE_NUMBER_BUTTON_HEIGHT));
    }

    /**
     * ゲーム画面パネル 配置場所設定メソッド
     * ゲーム画面パネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setPositionInGameScreenPanel(GridBagConstraints positionPreference, GridBagLayout gbLayout) {
        JLabel[] labelDigits = {labelOneDigits, labelTwoDigits, labelThreeDigits};
        int labelDigitGridX = 3;
        int labelDigitGridY = 2;
        for (JLabel jLabel : labelDigits) {
            positionPreference.gridx = labelDigitGridX;
            positionPreference.gridy = labelDigitGridY;
            gbLayout.setConstraints(jLabel, positionPreference);
            labelDigitGridX++;
        }

        JLabel[] labelInputHistoryNumbers = {labelInputHistoryNumberOne, labelInputHistoryNumberTwo, labelInputHistoryNumberThree,
                labelInputHistoryNumberFour, labelInputHistoryNumberFive, labelInputHistoryNumberSix,
                labelInputHistoryNumberSeven, labelInputHistoryNumberEight, labelInputHistoryNumberNine,
        };
        int labelInputHistoryGridX = 1;
        int labelInputHistoryGridY = 3;
        for (JLabel jLabel : labelInputHistoryNumbers) {
            positionPreference.gridx = labelInputHistoryGridX;
            positionPreference.gridy = labelInputHistoryGridY;
            positionPreference.insets = new Insets(3, 3, 3, 3);
            gbLayout.setConstraints(jLabel, positionPreference);
            labelInputHistoryGridY++;
            if (labelInputHistoryGridY == 8) {
                labelInputHistoryGridX = 7;
                labelInputHistoryGridY = 3;
            }
        }

        JButton[] buttons = {buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
                buttonEight, buttonNine, buttonReset, buttonZero, buttonConfirm};
        int buttonNumberGridX = 3;
        int buttonNumberGridY = 9;
        for (JButton jButton : buttons) {
            positionPreference.gridx = buttonNumberGridX;
            positionPreference.gridy = buttonNumberGridY;
            gbLayout.setConstraints(jButton, positionPreference);
            buttonNumberGridX++;
            if (buttonNumberGridX == 6) {
                buttonNumberGridX = 3;
                buttonNumberGridY++;
            }
        }

        positionPreference.gridx = 1;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelInputHistoryMessageLeft, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 1;
        gbLayout.setConstraints(labelInputHistoryMessageRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 2;
        positionPreference.insets = new Insets(3, 25, 3, 3);
        gbLayout.setConstraints(labelInputHistoryDescriptionLeft, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 2;
        positionPreference.insets = new Insets(3, 3, 3, 25);
        gbLayout.setConstraints(labelInputHistoryDescriptionRight, positionPreference);

        positionPreference.gridx = 1;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(buttonGiveUp, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 12;
        gbLayout.setConstraints(labelInputTimes, positionPreference);

        positionPreference.gridx = 7;
        positionPreference.gridy = 10;
        gbLayout.setConstraints(labelErrorMessage, positionPreference);

        positionPreference.gridx = 2;
        positionPreference.gridy = 1;
        positionPreference.weightx = 0.1d;
        gbLayout.setConstraints(labelInputSpaceLeft, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 1;
        positionPreference.weightx = 0.1d;
        gbLayout.setConstraints(labelInputSpaceRight, positionPreference);

        positionPreference.gridx = 6;
        positionPreference.gridy = 8;
        positionPreference.insets = new Insets(30, 0, 30, 0);
        gbLayout.setConstraints(labelInputSpaceCenter, positionPreference);
    }

    /**
     * ゲーム画面パネル アクション設定メソッド
     * ゲーム画面パネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInSettingsInGameScreenPanel(ActionListener actionListener) {
        buttonOne.addActionListener(actionListener);
        buttonOne.setActionCommand(Constants.DISPLAY_BUTTON_ONE);
        buttonTwo.addActionListener(actionListener);
        buttonTwo.setActionCommand(Constants.DISPLAY_BUTTON_TWO);
        buttonThree.addActionListener(actionListener);
        buttonThree.setActionCommand(Constants.DISPLAY_BUTTON_THREE);
        buttonFour.addActionListener(actionListener);
        buttonFour.setActionCommand(Constants.DISPLAY_BUTTON_FOUR);
        buttonFive.addActionListener(actionListener);
        buttonFive.setActionCommand(Constants.DISPLAY_BUTTON_FIVE);
        buttonSix.addActionListener(actionListener);
        buttonSix.setActionCommand(Constants.DISPLAY_BUTTON_SIX);
        buttonSeven.addActionListener(actionListener);
        buttonSeven.setActionCommand(Constants.DISPLAY_BUTTON_SEVEN);
        buttonEight.addActionListener(actionListener);
        buttonEight.setActionCommand(Constants.DISPLAY_BUTTON_EIGHT);
        buttonNine.addActionListener(actionListener);
        buttonNine.setActionCommand(Constants.DISPLAY_BUTTON_NINE);
        buttonZero.addActionListener(actionListener);
        buttonZero.setActionCommand(Constants.DISPLAY_BUTTON_ZERO);
        buttonReset.addActionListener(actionListener);
        buttonReset.setActionCommand(Constants.DISPLAY_BUTTON_RESET);
        buttonConfirm.addActionListener(actionListener);
        buttonConfirm.setActionCommand(Constants.DISPLAY_BUTTON_CONFIRM);
        buttonGiveUp.addActionListener(actionListener);
        buttonGiveUp.setActionCommand(Constants.CARD_GAME_OVER);
    }
}
