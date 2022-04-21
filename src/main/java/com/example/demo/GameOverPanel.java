package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameOverPanel extends Container {

    static JLabel labelResult;
    private final JButton buttonBackToTitle;

    /**
     * ゲームオーバーパネルコンストラクタ
     * ゲームオーバー時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public GameOverPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelResult = new JLabel(Constants.DISPLAY_TEXT_GAME_OVER_RESULT);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonBackToTitle.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        //フォント設定メソッドへ
        setFontInGameOverPanel();
        //配置場所設定メソッドへ
        setAlignmentInGameOverPanel();
        //アクション設定メソッドへ
        setActionInGameOverPanel(actionListener);

        JComponent[] jComponents = {labelResult, buttonBackToTitle};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * ゲームオーバーパネル フォント設定メソッド
     * ゲームオーバーパネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInGameOverPanel() {
        labelResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_GAME_COMPLETE));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * ゲームオーバーパネル 配置場所設定メソッド
     * ゲームオーバーパネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInGameOverPanel() {
        labelResult.setAlignmentX(CENTER_ALIGNMENT);
        labelResult.setHorizontalAlignment(JLabel.CENTER);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * ゲームオーバーパネル アクション設定メソッド
     * ゲームオーバーパネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInGameOverPanel(ActionListener actionListener) {
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
