package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TitleScreenPanel extends JPanel {

    static JLabel labelUserName;
    private final JButton buttonNameEntry;
    private final JLabel labelTitle;
    private final JButton buttonGameStart;
    private final JButton buttonRuleDescription;
    private final JButton buttonRanking;
    private final JButton buttonGameEnd;

    /**
     * タイトル画面パネルコンストラクタ
     * タイトル時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public TitleScreenPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        labelUserName = new JLabel(String.format(Constants.DISPLAY_TEXT_USER_NAME, Contents.userName));
        buttonNameEntry = new JButton(Constants.DISPLAY_BUTTON_NAME_ENTRY);
        labelTitle = new JLabel(Constants.DISPLAY_TEXT_TITLE);
        buttonGameStart = new JButton(Constants.DISPLAY_BUTTON_GAME_START);
        buttonRuleDescription = new JButton(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        buttonRanking = new JButton(Constants.DISPLAY_BUTTON_RANKING);
        buttonGameEnd = new JButton(Constants.DISPLAY_BUTTON_GAME_END);

        buttonNameEntry.setName(Constants.DISPLAY_BUTTON_NAME_ENTRY);
        buttonGameStart.setName(Constants.DISPLAY_BUTTON_GAME_START);
        buttonRuleDescription.setName(Constants.DISPLAY_BUTTON_RULE_DESCRIPTION);
        buttonRanking.setName(Constants.DISPLAY_BUTTON_RANKING);
        buttonGameEnd.setName(Constants.DISPLAY_BUTTON_GAME_END);

        //フォント設定メソッドへ
        setFontInTitleScreenPanel();
        //サイズ設定メソッドへ
        buttonSettingsInTitleScreenPanel();
        //配置場所設定メソッドへ
        setAlignmentInTitleScreenPanel();
        //アクション設定メソッドへ
        setActionInTitleScreenPanel(actionListener);

        JComponent[] jComponents = {labelUserName, buttonNameEntry, labelTitle, buttonGameStart, buttonRuleDescription, buttonRanking, buttonGameEnd};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * タイトル画面パネル フォント設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInTitleScreenPanel() {
        labelUserName.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, Constants.SIZE_TEXT_USER_NAME));
        buttonNameEntry.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON_NAME_ENTRY));
        labelTitle.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, Constants.SIZE_TEXT_TITLE));
        buttonGameStart.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonRuleDescription.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonRanking.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonGameEnd.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * タイトル画面パネル サイズ設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルのサイズを設定する。
     */
    private void buttonSettingsInTitleScreenPanel() {
        buttonNameEntry.setPreferredSize(new Dimension(200, 30));
        buttonGameStart.setPreferredSize(new Dimension(300, 50));
        buttonRuleDescription.setPreferredSize(new Dimension(400, 50));
        buttonRanking.setPreferredSize(new Dimension(400, 50));
        buttonGameEnd.setPreferredSize(new Dimension(400, 50));
    }

    /**
     * タイトル画面パネル 配置場所設定メソッド
     * タイトル画面パネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInTitleScreenPanel() {
        labelUserName.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonNameEntry.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRuleDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonRanking.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonGameEnd.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * タイトル画面パネル アクション設定メソッド
     * タイトル画面パネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInTitleScreenPanel(ActionListener actionListener) {
        buttonNameEntry.addActionListener(actionListener);
        buttonNameEntry.setActionCommand(Constants.CARD_NAME_ENTRY);
        buttonGameStart.addActionListener(actionListener);
        buttonGameStart.setActionCommand(Constants.CARD_GAME_SCREEN);
        buttonRuleDescription.addActionListener(actionListener);
        buttonRuleDescription.setActionCommand(Constants.CARD_RULE_DESCRIPTION);
        buttonRanking.addActionListener(actionListener);
        buttonRanking.setActionCommand(Constants.CARD_RANKING);
        buttonGameEnd.addActionListener(actionListener);
        buttonGameEnd.setActionCommand(Constants.BUTTON_GAME_END);
    }
}
