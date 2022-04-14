import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RuleDescriptionPanel extends Container {

    private final JLabel labelRule;
    private final JButton buttonBack;

    /**
     * ルール説明パネルコンストラクタ
     * ルール説明時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public RuleDescriptionPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelRule = new JLabel(Constants.DISPLAY_TEXT_RULE_DESCRIPTION);
        buttonBack = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonBack.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        //フォント設定メソッドへ
        setFontInRuleDescriptionPanel();
        //配置場所設定メソッドへ
        setAlignmentInRuleDescriptionPanel();
        //アクション設定メソッドへ
        setActionInRuleDescriptionPanel(actionListener);

        JComponent[] jComponents = {labelRule, buttonBack};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * ルール説明パネル フォント設定メソッド
     * ルール説明パネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInRuleDescriptionPanel() {
        labelRule.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_RULE_DESCRIPTION));
        buttonBack.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * ルール説明パネル 配置場所設定メソッド
     * ルール説明パネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInRuleDescriptionPanel() {
        labelRule.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonBack.setAlignmentX(Component.RIGHT_ALIGNMENT);
    }

    /**
     * ルール説明パネル アクション設定メソッド
     * ルール説明パネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInRuleDescriptionPanel(ActionListener actionListener) {
        buttonBack.addActionListener(actionListener);
        buttonBack.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
