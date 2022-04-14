import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameClearPanel extends Container {

    static JLabel labelResult;
    private final JButton buttonBackToTitle;

    /**
     * ゲームクリアパネルコンストラクタ
     * ゲームクリア時の画面を設定する。
     *
     * @param actionListener パネル内でのアクションを判定
     */
    public GameClearPanel(ActionListener actionListener) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        labelResult = new JLabel(Constants.DISPLAY_TEXT_GAME_CLEAR_RESULT);
        buttonBackToTitle = new JButton(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        buttonBackToTitle.setName(Constants.DISPLAY_BUTTON_BACK_TO_TITLE);

        //フォント設定メソッドへ
        setFontInGameClearPanel();
        //配置場所設定メソッドへ
        setAlignmentInGameClearPanel();
        //アクション設定メソッドへ
        setActionInGameClearPanel(actionListener);

        JComponent[] jComponents = {labelResult, buttonBackToTitle};
        for (JComponent jComponent : jComponents) {
            this.add(Box.createGlue());
            this.add(jComponent);
        }
        this.add(Box.createGlue());
    }

    /**
     * ゲームクリアパネル フォント設定メソッド
     * ゲームクリアパネル内で使用されるボタンやラベルのフォントを設定する。
     */
    private void setFontInGameClearPanel() {
        labelResult.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_TEXT_GAME_COMPLETE));
        buttonBackToTitle.setFont(new Font(Constants.FONT_MS_GOTHIC, Font.BOLD, Constants.SIZE_SCREEN_TRANSITION_BUTTON));
    }

    /**
     * ゲームクリアパネル 配置場所設定メソッド
     * ゲームクリアパネル内で使用されるボタンやラベルの配置場所を設定する。
     */
    private void setAlignmentInGameClearPanel() {
        labelResult.setAlignmentX(CENTER_ALIGNMENT);
        labelResult.setHorizontalAlignment(JLabel.CENTER);
        buttonBackToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * ゲームクリアパネル アクション設定メソッド
     * ゲームクリアパネル内で使用されるボタンの押下時の判定を設定する。
     */
    private void setActionInGameClearPanel(ActionListener actionListener) {
        buttonBackToTitle.addActionListener(actionListener);
        buttonBackToTitle.setActionCommand(Constants.CARD_TITLE_SCREEN);
    }
}
