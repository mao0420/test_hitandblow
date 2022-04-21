package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RankingPanel extends Container {

    static JLabel labelRanking;
    private final JButton buttonBackToTitle;

    /**
     * ランキングパネルコンストラクタ
     * ランキング時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public RankingPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelRanking = new JLabel(Constants.DISPLAY_TEXT_RANKING);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonBackToTitle.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        //フォント設定メソッドへ
        setFontInRankingPanel();
        //配置場所設定メソッドへ
        setAlignmentInRankingPanel();
        //アクション設定メソッドへ
        setActionInRankingPanel(actionListener);

        JComponent[] jComponents = {labelRanking, buttonBackToTitle};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * ランキングパネル フォント設定メソッド
     * ランキングパネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInRankingPanel() {
        labelRanking.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_RANKING));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * ランキングパネル 配置場所設定メソッド
     * ランキングパネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInRankingPanel() {
        labelRanking.setAlignmentX(CENTER_ALIGNMENT);
        labelRanking.setHorizontalAlignment(JLabel.CENTER);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * ランキングパネル アクション設定メソッド
     * ランキングパネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInRankingPanel(ActionListener actionListener) {
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
