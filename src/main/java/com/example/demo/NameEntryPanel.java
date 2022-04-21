package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NameEntryPanel extends Container {

    static JLabel labelNameEntry;
    static JTextField textFieldNameInput;
    private final JButton buttonConfirm;
    private final JButton buttonReset;
    private final JButton buttonBackToTitle;

    /**
     * 名前変更パネルコンストラクタ
     * 名前変更画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public NameEntryPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelNameEntry = new JLabel(Constants.DISPLAY_TEXT_NAME_ENTRY);
        textFieldNameInput = new JTextField();
        buttonReset = new JButton(Constants.DISPLAY_BUTTON_RESET);
        buttonConfirm = new JButton(Constants.DISPLAY_BUTTON_CONFIRM);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonReset.setName(Constants.DISPLAY_BUTTON_NAME_ENTRY_RESET);
        buttonConfirm.setName(Constants.DISPLAY_BUTTON_NAME_ENTRY_CONFIRM);
        buttonBackToTitle.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        //フォント設定メソッドへ
        setFontInNameEntryPanel();
        //サイズ設定メソッドへ
        sizeSettingsInNameEntryPanel();
        //配置場所設定メソッドへ
        setAlignmentInNameEntryPanel();
        //アクション設定メソッドへ
        setActionInNameEntryPanel(actionListener);

        JComponent[] jComponents = {labelNameEntry, textFieldNameInput, buttonConfirm, buttonReset, buttonBackToTitle};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * 名前変更パネル フォント設定メソッド
     * 名前変更パネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInNameEntryPanel() {
        labelNameEntry.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_NAME_ENTRY));
        buttonReset.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonConfirm.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * 名前変更パネル サイズ設定メソッド
     * 名前変更パネル内で使用されるボタンやラベルのサイズを設定する。
     */
    private void sizeSettingsInNameEntryPanel() {
        textFieldNameInput.setPreferredSize(new Dimension(200, 20));
    }

    /**
     * 名前変更パネル 配置場所設定メソッド
     * 名前変更パネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInNameEntryPanel() {
        labelNameEntry.setAlignmentX(CENTER_ALIGNMENT);
        labelNameEntry.setHorizontalAlignment(JLabel.CENTER);
        textFieldNameInput.setAlignmentX(CENTER_ALIGNMENT);
        textFieldNameInput.setHorizontalAlignment(JLabel.CENTER);
        buttonReset.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonConfirm.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * 名前変更パネル アクション設定メソッド
     * 名前変更パネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInNameEntryPanel(ActionListener actionListener) {
        buttonReset.addActionListener(actionListener);
        buttonReset.setActionCommand(Constants.DISPLAY_BUTTON_NAME_ENTRY_RESET);
        buttonConfirm.addActionListener(actionListener);
        buttonConfirm.setActionCommand(Constants.DISPLAY_BUTTON_NAME_ENTRY_CONFIRM);
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
